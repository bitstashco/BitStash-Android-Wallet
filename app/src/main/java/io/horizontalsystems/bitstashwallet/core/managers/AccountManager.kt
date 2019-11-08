package io.horizontalsystems.bitstashwallet.core.managers

import io.horizontalsystems.bitstashwallet.core.IAccountManager
import io.horizontalsystems.bitstashwallet.core.IAccountsStorage
import io.horizontalsystems.bitstashwallet.entities.Account
import io.horizontalsystems.bitstashwallet.entities.CoinType
import io.reactivex.BackpressureStrategy
import io.reactivex.Flowable
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.PublishSubject
import java.util.concurrent.TimeUnit

class AccountManager(private val storage: IAccountsStorage, private val accountCleaner: AccountCleaner) : IAccountManager {

    private val cache = AccountsCache()
    private val accountsSubject = PublishSubject.create<List<Account>>()
    private val deleteAccountSubject = PublishSubject.create<String>()

    override val isAccountsEmpty: Boolean
        get() = storage.isAccountsEmpty

    override val accounts: List<Account>
        get() = cache.accountsSet.toList()

    override val accountsFlowable: Flowable<List<Account>>
        get() = accountsSubject.toFlowable(BackpressureStrategy.BUFFER)

    override val deleteAccountObservable: Flowable<String>
        get() = deleteAccountSubject.toFlowable(BackpressureStrategy.BUFFER)

    override fun account(coinType: CoinType): Account? {
        return accounts.find { account -> coinType.canSupport(account.type) }
    }

    override fun preloadAccounts() {
        cache.set(storage.allAccounts())
    }

    override fun create(account: Account) {
        storage.save(account)

        cache.insert(account)
        accountsSubject.onNext(accounts)
    }

    override fun update(account: Account) {
        storage.update(account)

        cache.update(account)
        accountsSubject.onNext(accounts)
    }

    override fun delete(id: String) {
        cache.delete(id)
        storage.delete(id)

        accountsSubject.onNext(accounts)
        deleteAccountSubject.onNext(id)
    }

    override fun clear() {
        cache.accountsSet.map { it.id }.forEach { accountId ->
            storage.delete(accountId)
        }
        cache.set(listOf())
        accountsSubject.onNext(listOf())
    }

    override fun clearAccounts() {
        val clearAsync = Single.fromCallable {
            accountCleaner.clearAccounts(storage.getDeletedAccountIds())
            storage.clearDeleted()
        }

        Single.timer(3, TimeUnit.SECONDS)
                .flatMap { clearAsync }
                .subscribeOn(Schedulers.io())
                .subscribe()
    }

    private class AccountsCache {
        var accountsSet = mutableSetOf<Account>()
            private set

        fun insert(account: Account) {
            accountsSet.add(account)
        }

        fun update(account: Account) {
            accountsSet.add(account)
        }

        fun set(accounts: List<Account>) {
            accountsSet = accounts.toMutableSet()
        }

        fun delete(id: String) {
            accountsSet.removeAll { it.id == id }
        }
    }
}

package io.horizontalsystems.bitstashwallet.core.managers

import io.horizontalsystems.bitstashwallet.core.IAccountManager
import io.horizontalsystems.bitstashwallet.core.IWalletFactory
import io.horizontalsystems.bitstashwallet.core.IWalletManager
import io.horizontalsystems.bitstashwallet.core.IWalletStorage
import io.horizontalsystems.bitstashwallet.entities.Coin
import io.horizontalsystems.bitstashwallet.entities.Wallet
import io.reactivex.subjects.PublishSubject

class WalletManager(private val accountManager: IAccountManager, private val walletFactory: IWalletFactory, private val storage: IWalletStorage)
    : IWalletManager {

    override val wallets get() = cache.walletsSet.toList()
    override val walletsUpdatedSignal = PublishSubject.create<Unit>()

    private val cache = WalletsCache()
    private val disposable = accountManager.accountsFlowable.subscribe {
        loadWallets()
    }

    override fun wallet(coin: Coin): Wallet? {
        val account = accountManager.account(coin.type) ?: return null

        return walletFactory.wallet(coin, account, account.defaultSyncMode)
    }

    override fun loadWallets() {
        cache.set(storage.wallets(accountManager.accounts))
        walletsUpdatedSignal.onNext(Unit)
    }

    override fun enable(wallets: List<Wallet>) {
        storage.save(wallets)
        cache.set(wallets)
        walletsUpdatedSignal.onNext(Unit)
    }

    override fun clear() {
        cache.clear()
        disposable.dispose()
    }

    private class WalletsCache {
        var walletsSet = mutableSetOf<Wallet>()
            private set

        fun set(wallets: List<Wallet>) {
            walletsSet = wallets.toMutableSet()
        }

        fun clear() {
            walletsSet.clear()
        }
    }
}

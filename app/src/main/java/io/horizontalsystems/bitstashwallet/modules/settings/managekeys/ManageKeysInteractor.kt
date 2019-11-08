package io.horizontalsystems.bitstashwallet.modules.settings.managekeys

import io.horizontalsystems.bitstashwallet.core.IAccountCreator
import io.horizontalsystems.bitstashwallet.core.IAccountManager
import io.horizontalsystems.bitstashwallet.core.IPredefinedAccountType
import io.horizontalsystems.bitstashwallet.core.IPredefinedAccountTypeManager
import io.horizontalsystems.bitstashwallet.entities.Account
import io.horizontalsystems.bitstashwallet.entities.AccountType
import io.horizontalsystems.bitstashwallet.entities.SyncMode
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class ManageKeysInteractor(
        private val accountManager: IAccountManager,
        private val accountCreator: IAccountCreator,
        private val predefinedAccountTypeManager: IPredefinedAccountTypeManager)
    : ManageKeysModule.Interactor {

    var delegate: ManageKeysModule.InteractorDelegate? = null

    private val disposables = CompositeDisposable()

    override val predefinedAccountTypes: List<IPredefinedAccountType>
        get() = predefinedAccountTypeManager.allTypes

    override fun account(predefinedAccountType: IPredefinedAccountType): Account? {
        return predefinedAccountTypeManager.account(predefinedAccountType)
    }

    override fun createAccount(predefinedAccountType: IPredefinedAccountType) {
        predefinedAccountTypeManager.createAccount(predefinedAccountType)
    }

    override fun restoreAccount(accountType: AccountType, syncMode: SyncMode?) {
        accountCreator.createRestoredAccount(accountType, syncMode, createDefaultWallets = true)
    }

    override fun loadAccounts() {
        delegate?.didLoad(mapAccounts())

        accountManager.accountsFlowable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    delegate?.didLoad(mapAccounts())
                }
                .let { disposables.add(it) }
    }

    override fun deleteAccount(id: String) {
        accountManager.delete(id)
    }

    override fun clear() {
        disposables.clear()
    }

    private fun mapAccounts(): List<ManageAccountItem> {
        return predefinedAccountTypes.map {
            ManageAccountItem(it, account = predefinedAccountTypeManager.account(it))
        }
    }
}

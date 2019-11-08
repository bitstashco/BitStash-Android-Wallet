package io.horizontalsystems.bitstashwallet.modules.settings.managekeys

import io.horizontalsystems.bitstashwallet.core.IPredefinedAccountType
import io.horizontalsystems.bitstashwallet.entities.*

class ManageKeysPresenter(private val interactor: ManageKeysModule.Interactor, private val router: ManageKeysModule.Router)
    : ManageKeysModule.ViewDelegate, ManageKeysModule.InteractorDelegate {

    var view: ManageKeysModule.View? = null

    private var currentItem: ManageAccountItem? = null

    //  ViewDelegate

    override var items = listOf<ManageAccountItem>()

    override fun viewDidLoad() {
        interactor.loadAccounts()
    }

    override fun onClickNew(accountItem: ManageAccountItem) {
        currentItem = accountItem
        view?.showCreateConfirmation(accountItem)
    }

    override fun onClickBackup(accountItem: ManageAccountItem) {
        router.startBackupModule(accountItem)
    }

    override fun onClickRestore(accountType: IPredefinedAccountType) {
        when (accountType) {
            is UnstoppableAccountType -> {
                router.startRestoreWords(12)
            }
            is BinanceAccountType -> {
                router.startRestoreWords(24)
            }
            is EosAccountType -> {
                router.startRestoreEos()
            }
        }
    }

    override fun onClickUnlink(accountItem: ManageAccountItem) {
        currentItem = accountItem

        if (accountItem.account?.isBackedUp == true) {
            view?.showUnlinkConfirmation(accountItem)
        } else {
            view?.showBackupConfirmation(accountItem)
        }
    }

    override fun onClickShow(accountItem: ManageAccountItem) {
        router.startBackupModule(accountItem)
    }

    override fun onConfirmCreate() {
        try {
            currentItem?.let { interactor.createAccount(it.predefinedAccountType) }
            view?.showSuccess()
        } catch (e: Exception) {
            view?.showError(e)
        }
    }

    override fun onConfirmBackup() {
        currentItem?.let { router.startBackupModule(it) }
    }

    override fun onConfirmUnlink(accountId: String) {
        interactor.deleteAccount(accountId)
    }

    override fun onConfirmRestore(accountType: AccountType, syncMode: SyncMode?) {
        interactor.restoreAccount(accountType, syncMode)
    }

    override fun onClear() {
        interactor.clear()
    }

    //  InteractorDelegate

    override fun didLoad(accounts: List<ManageAccountItem>) {
        items = accounts
        view?.show(items)
    }
}

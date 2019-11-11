package app.odapplications.bitstashwallet.modules.backup

import app.odapplications.bitstashwallet.entities.Account
import app.odapplications.bitstashwallet.entities.AccountType

class BackupPresenter(
        private val interactor: BackupModule.Interactor,
        private val router: BackupModule.Router,
        private val account: Account)
    : BackupModule.ViewDelegate, BackupModule.InteractorDelegate {

    //  View

    var view: BackupModule.View? = null

    //  View delegates

    override fun onClickCancel() {
        router.close()
    }

    override fun onClickBackup() {
        if (interactor.isPinSet) {
            router.startUnlockPinModule()
        } else {
            startBackup()
        }
    }

    override fun didBackup() {
        interactor.setBackedUp(account.id)
    }

    override fun didUnlock() {
        startBackup()
    }

    override fun didCancelUnlock() {

    }

    private fun startBackup() {
        when (val accountType = account.type) {
            is AccountType.Mnemonic -> {
                router.startBackupWordsModule(accountType.words)
            }
            is AccountType.Eos -> {
                router.startBackupEosModule(accountType.account, accountType.activePrivateKey)
            }
        }
    }
}


package app.odapplications.bitstashwallet.modules.backup

import app.odapplications.bitstashwallet.core.IBackupManager
import app.odapplications.bitstashwallet.core.IPinManager

class BackupInteractor(
        private val backupManager: IBackupManager,
        private val pinManager: IPinManager) : BackupModule.Interactor {

    var delegate: BackupModule.InteractorDelegate? = null

    override val isPinSet: Boolean
        get() = pinManager.isPinSet

    override fun setBackedUp(accountId: String) {
        backupManager.setIsBackedUp(accountId)
    }
}

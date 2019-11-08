package io.horizontalsystems.bitstashwallet.modules.backup

import io.horizontalsystems.bitstashwallet.core.IBackupManager
import io.horizontalsystems.bitstashwallet.core.IPinManager

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

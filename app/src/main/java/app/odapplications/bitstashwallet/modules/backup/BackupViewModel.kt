package app.odapplications.bitstashwallet.modules.backup

import androidx.lifecycle.ViewModel
import app.odapplications.bitstashwallet.SingleLiveEvent
import app.odapplications.bitstashwallet.entities.Account

class BackupViewModel : ViewModel(), BackupModule.View, BackupModule.Router {

    lateinit var delegate: BackupModule.ViewDelegate

    val startPinModule = SingleLiveEvent<Void>()
    val startBackupWordsModule = SingleLiveEvent<List<String>>()
    val startBackupEosModule = SingleLiveEvent<Pair<String, String>>()
    val closeLiveEvent = SingleLiveEvent<Void>()

    fun init(account: Account) {
        BackupModule.init(this, this, account)
    }

    // router

    override fun startUnlockPinModule() {
        startPinModule.call()
    }

    override fun startBackupWordsModule(words: List<String>) {
        startBackupWordsModule.postValue(words)
    }

    override fun startBackupEosModule(account: String, activePrivateKey: String) {
        startBackupEosModule.postValue(Pair(account, activePrivateKey))
    }

    override fun close() {
        closeLiveEvent.call()
    }
}

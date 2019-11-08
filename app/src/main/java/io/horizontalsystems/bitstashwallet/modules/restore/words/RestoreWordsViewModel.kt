package io.horizontalsystems.bitstashwallet.modules.restore.words

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.horizontalsystems.bitstashwallet.SingleLiveEvent

class RestoreWordsViewModel : ViewModel(), RestoreWordsModule.View, RestoreWordsModule.Router {

    lateinit var delegate: RestoreWordsModule.ViewDelegate

    val errorLiveData = MutableLiveData<Int>()
    val notifyRestored = SingleLiveEvent<Unit>()
    val startSyncModeModule = SingleLiveEvent<Unit>()

    fun init(wordsCount: Int) {
        RestoreWordsModule.init(this, this, wordsCount)
    }

    // View

    override fun showError(error: Int) {
        errorLiveData.value = error
    }

    // Router

    override fun notifyRestored() {
        notifyRestored.call()
    }

    override fun startSyncModeModule() {
        startSyncModeModule.call()
    }
}

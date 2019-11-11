package app.odapplications.bitstashwallet.modules.restore.options

import androidx.lifecycle.ViewModel
import app.odapplications.bitstashwallet.SingleLiveEvent
import app.odapplications.bitstashwallet.entities.AccountType.Derivation
import app.odapplications.bitstashwallet.entities.SyncMode

class RestoreOptionsViewModel : ViewModel(), RestoreOptionsModule.IView, RestoreOptionsModule.IRouter {

    lateinit var delegate: RestoreOptionsModule.IViewDelegate

    val notifyOptionsLiveEvent = SingleLiveEvent<Pair<SyncMode, Derivation>>()
    val syncModeLiveEvent = SingleLiveEvent<SyncMode>()
    val derivationLiveEvent = SingleLiveEvent<Derivation>()

    fun init() {
        RestoreOptionsModule.init(this, this)
        delegate.viewDidLoad()
    }

    // View

    override fun update(syncMode: SyncMode) {
        syncModeLiveEvent.value = syncMode
    }

    override fun update(derivation: Derivation) {
        derivationLiveEvent.postValue(derivation)
    }

    // Router

    override fun notifyOptions(syncMode: SyncMode, derivation: Derivation) {
        notifyOptionsLiveEvent.postValue(Pair(syncMode, derivation))
    }
}

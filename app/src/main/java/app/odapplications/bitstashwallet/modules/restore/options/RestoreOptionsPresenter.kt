package app.odapplications.bitstashwallet.modules.restore.options

import app.odapplications.bitstashwallet.entities.AccountType
import app.odapplications.bitstashwallet.entities.SyncMode

class RestoreOptionsPresenter(private val router: RestoreOptionsModule.IRouter)
    : RestoreOptionsModule.IViewDelegate {

    var view: RestoreOptionsModule.IView? = null

    private var syncMode = SyncMode.FAST
    private var derivation = AccountType.Derivation.bip44

    override fun viewDidLoad() {
        view?.update(syncMode)
        view?.update(derivation)
    }

    override fun onSelect(syncMode: SyncMode) {
        this.syncMode = syncMode
        view?.update(syncMode)
    }

    override fun onSelect(derivation: AccountType.Derivation) {
        this.derivation = derivation
        view?.update(derivation)
    }

    override fun onDone() {
        router.notifyOptions(syncMode, derivation)
    }
}

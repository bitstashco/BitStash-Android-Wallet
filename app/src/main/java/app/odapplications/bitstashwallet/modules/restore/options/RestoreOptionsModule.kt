package app.odapplications.bitstashwallet.modules.restore.options

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import app.odapplications.bitstashwallet.entities.AccountType.Derivation
import app.odapplications.bitstashwallet.entities.SyncMode

object RestoreOptionsModule {

    interface IView {
        fun update(syncMode: SyncMode)
        fun update(derivation: Derivation)
    }

    interface IViewDelegate {
        fun viewDidLoad()
        fun onSelect(syncMode: SyncMode)
        fun onSelect(derivation: Derivation)
        fun onDone()
    }

    interface IInteractor

    interface IRouter {
        fun notifyOptions(syncMode: SyncMode, derivation: Derivation)
    }

    fun start(context: AppCompatActivity, requestCode: Int) {
        context.startActivityForResult(Intent(context, RestoreOptionsActivity::class.java), requestCode)
    }

    fun init(view: RestoreOptionsViewModel, router: IRouter) {
        val presenter = RestoreOptionsPresenter(router)

        view.delegate = presenter
        presenter.view = view
    }
}

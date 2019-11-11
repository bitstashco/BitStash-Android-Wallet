package app.odapplications.bitstashwallet.modules.restore

import android.content.Context
import android.content.Intent
import app.odapplications.bitstashwallet.core.App
import app.odapplications.bitstashwallet.core.IPredefinedAccountType
import app.odapplications.bitstashwallet.entities.AccountType
import app.odapplications.bitstashwallet.entities.SyncMode

object RestoreModule {

    interface View {
        fun reload(items: List<IPredefinedAccountType>)
        fun showError(ex: Exception)
    }

    interface ViewDelegate {
        val items: List<IPredefinedAccountType>

        fun viewDidLoad()
        fun onSelect(accountType: IPredefinedAccountType)
        fun onRestore(accountType: AccountType, syncMode: SyncMode? = null)
    }

    interface Interactor {
        fun restore(accountType: AccountType, syncMode: SyncMode?)
    }

    interface InteractorDelegate {
        fun didRestore()
        fun didFailRestore(e: Exception)
    }

    interface Router {
        fun startRestoreWordsModule(wordsCount: Int)
        fun startRestoreEosModule()
        fun startMainModule()
        fun close()
    }

    fun start(context: Context) {
        context.startActivity(Intent(context, RestoreActivity::class.java))
    }

    fun init(view: RestoreViewModel, router: Router) {
        val interactor = RestoreInteractor(App.accountCreator)
        val presenter = RestorePresenter(router, interactor, App.predefinedAccountTypeManager)

        view.delegate = presenter
        presenter.view = view
        interactor.delegate = presenter
    }
}

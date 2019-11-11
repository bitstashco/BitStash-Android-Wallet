package app.odapplications.bitstashwallet.modules.restore.eos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import app.odapplications.bitstashwallet.viewHelpers.TextHelper

object RestoreEosModule {

    interface IView {
        fun setPrivateKey(key: String)
        fun setAccount(account: String)
        fun showError(resId: Int)
    }

    interface IViewDelegate {
        fun onClickDone(accountName: String, privateKey: String)
        fun onClickScan()
        fun onPasteAccount()
        fun onPasteKey()
        fun onQRCodeScan(key: String?)
    }

    interface IInteractor {
        val textFromClipboard: String?
        fun validate(accountName: String, privateKey: String)
    }

    interface IInteractorDelegate {
        fun onValidationSuccess(accountName: String, privateKey: String)
        fun onInvalidAccount()
        fun onInvalidKey()
    }

    interface IRouter {
        fun startQRScanner()
        fun finishWithSuccess(accountName: String, privateKey: String)
    }

    fun startForResult(context: AppCompatActivity, requestCode: Int) {
        context.startActivityForResult(Intent(context, RestoreEosActivity::class.java), requestCode)
    }

    fun init(view: RestoreEosViewModel, router: IRouter) {
        val interactor = RestoreEosInteractor(TextHelper)
        val presenter = RestoreEosPresenter(interactor, router)

        view.delegate = presenter
        presenter.view = view
        interactor.delegate = presenter
    }

}

package app.odapplications.bitstashwallet.modules.pin.edit

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import app.odapplications.bitstashwallet.core.App
import app.odapplications.bitstashwallet.modules.pin.PinInteractor
import app.odapplications.bitstashwallet.modules.pin.PinView

object EditPinModule {

    interface IRouter {
        fun dismissModuleWithSuccess()
    }

    class Factory : ViewModelProvider.Factory {

        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            val view = PinView()
            val router = EditPinRouter()

            val interactor = PinInteractor(App.pinManager)
            val presenter = EditPinPresenter(view, router, interactor)

            interactor.delegate = presenter

            return presenter as T
        }
    }

}

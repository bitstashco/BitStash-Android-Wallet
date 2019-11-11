package app.odapplications.bitstashwallet.modules.pin.set

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import app.odapplications.bitstashwallet.core.App
import app.odapplications.bitstashwallet.modules.pin.PinInteractor
import app.odapplications.bitstashwallet.modules.pin.PinView

object SetPinModule {

    interface IRouter {
        fun navigateToMain()
        fun dismissModuleWithSuccess()
    }

    class Factory : ViewModelProvider.Factory {

        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            val view = PinView()
            val router = SetPinRouter()

            val interactor = PinInteractor(App.pinManager)
            val presenter = SetPinPresenter(view, router, interactor)

            interactor.delegate = presenter

            return presenter as T
        }
    }

}

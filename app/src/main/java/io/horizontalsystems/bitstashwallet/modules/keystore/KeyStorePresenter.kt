package io.horizontalsystems.bitstashwallet.modules.keystore

import io.horizontalsystems.bitstashwallet.modules.keystore.KeyStoreModule.ModeType

class KeyStorePresenter(private val interactor: KeyStoreModule.IInteractor,
                        private val router: KeyStoreModule.IRouter,
                        private val mode: ModeType) : KeyStoreModule.IViewDelegate, KeyStoreModule.IInteractorDelegate {

    var view: KeyStoreModule.IView? = null

    override fun viewDidLoad() {
        when (mode) {
            ModeType.NoSystemLock -> {
                interactor.resetApp()
                view?.showNoSystemLockWarning()
            }
            ModeType.InvalidKey -> {
                interactor.resetApp()
                view?.showInvalidKeyWarning()
            }
            ModeType.UserAuthentication -> {
                view?.promptUserAuthentication()
            }
        }
    }

    override fun onResume() {
        if (mode != ModeType.UserAuthentication &&
                !interactor.isSystemLockOff &&
                !interactor.isKeyInvalidated) {
            interactor.removeKey()
            router.openLaunchModule()
        }
    }

    override fun onCloseInvalidKeyWarning() {
        interactor.removeKey()
        router.openLaunchModule()
    }

    override fun onAuthenticationCanceled() {
        router.closeApplication()
    }

    override fun onAuthenticationSuccess() {
        router.openLaunchModule()
    }

}

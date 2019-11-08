package io.horizontalsystems.bitstashwallet.modules.pin.unlock

import androidx.lifecycle.ViewModel
import io.horizontalsystems.bitstashwallet.R
import io.horizontalsystems.bitstashwallet.entities.LockoutState
import io.horizontalsystems.bitstashwallet.modules.pin.PinModule
import io.horizontalsystems.bitstashwallet.modules.pin.PinPage
import io.horizontalsystems.bitstashwallet.modules.pin.TopText

class UnlockPinPresenter(
        val view: PinModule.IView,
        val router: UnlockPinModule.IRouter,
        private val interactor: UnlockPinModule.IInteractor,
        private val showCancelButton: Boolean) : ViewModel(), PinModule.IViewDelegate, UnlockPinModule.IInteractorDelegate {

    private val unlockPageIndex = 0
    private var enteredPin = ""
    private var isShowingPinMismatchError = false

    override fun viewDidLoad() {
        view.addPages(listOf(PinPage(TopText.Title(R.string.Unlock_Page_EnterYourPin))))

        if (showCancelButton) {
            view.showBackButton()
        } else {
            view.hideToolbar()
        }

        interactor.updateLockoutState()

        showFingerprintUnlock()
    }

    override fun onEnter(pin: String, pageIndex: Int) {
        if (enteredPin.length < PinModule.PIN_COUNT) {
            enteredPin += pin
            removeErrorMessage()
            view.fillCircles(enteredPin.length, pageIndex)

            if (enteredPin.length == PinModule.PIN_COUNT) {
                if (interactor.unlock(enteredPin)) {
                    router.dismissModuleWithSuccess()
                } else {
                    wrongPinSubmitted()
                }
            }
        }
    }

    override fun resetPin() {
        enteredPin = ""
    }

    override fun onDelete(pageIndex: Int) {
        if (enteredPin.isNotEmpty()) {
            enteredPin = enteredPin.substring(0, enteredPin.length - 1)
            view.fillCircles(enteredPin.length, pageIndex)
        }
    }

    override fun unlock() {
        router.dismissModuleWithSuccess()
    }

    override fun wrongPinSubmitted() {
        view.showPinWrong(unlockPageIndex)
        isShowingPinMismatchError = true
        view.updateTopTextForPage(TopText.BigError(R.string.UnlockPin_Error_PinIncorrect), unlockPageIndex)
    }

    override fun showFingerprintUnlock() {
        if (interactor.isFingerprintEnabled && interactor.biometricAuthSupported) {
            interactor.cryptoObject?.let { view.showFingerprintDialog(it) }
        }
    }

    override fun onFingerprintUnlock() {
        interactor.onUnlock()
    }

    override fun updateLockoutState(state: LockoutState) {
        when (state) {
            is LockoutState.Unlocked -> view.showPinInput()
            is LockoutState.Locked -> view.showLockView(state.until)
        }
    }

    private fun removeErrorMessage() {
        if (isShowingPinMismatchError && enteredPin.isNotEmpty()) {
            view.updateTopTextForPage(TopText.Title(R.string.Unlock_Page_EnterYourPin), unlockPageIndex)
            isShowingPinMismatchError = false
        }
    }

}

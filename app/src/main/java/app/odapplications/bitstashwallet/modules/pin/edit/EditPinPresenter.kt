package app.odapplications.bitstashwallet.modules.pin.edit

import app.odapplications.bitstashwallet.R
import app.odapplications.bitstashwallet.modules.pin.ManagePinPresenter
import app.odapplications.bitstashwallet.modules.pin.PinModule
import app.odapplications.bitstashwallet.modules.pin.PinPage
import app.odapplications.bitstashwallet.modules.pin.TopText

class EditPinPresenter(
        override val view: PinModule.IView,
        val router: EditPinModule.IRouter,
        interactor: PinModule.IInteractor)
    : ManagePinPresenter(view, interactor, pages = listOf(Page.UNLOCK, Page.ENTER, Page.CONFIRM)) {

    override fun viewDidLoad() {
        view.setTitle(R.string.EditPin_Title)
        val pinPages = mutableListOf<PinPage>()

        pages.forEach { page ->
            when (page) {
                Page.UNLOCK -> pinPages.add(PinPage(TopText.Description(R.string.EditPin_UnlockInfo)))
                Page.ENTER -> pinPages.add(PinPage(TopText.Description(R.string.EditPin_NewPinInfo)))
                Page.CONFIRM -> pinPages.add(PinPage(TopText.Description(R.string.SetPin_ConfirmInfo)))
            }
        }
        view.addPages(pinPages)
        view.showBackButton()
    }

    override fun didSavePin() {
        router.dismissModuleWithSuccess()
    }

}

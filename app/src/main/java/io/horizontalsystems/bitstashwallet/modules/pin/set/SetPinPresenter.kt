package io.horizontalsystems.bitstashwallet.modules.pin.set

import io.horizontalsystems.bitstashwallet.R
import io.horizontalsystems.bitstashwallet.modules.pin.ManagePinPresenter
import io.horizontalsystems.bitstashwallet.modules.pin.PinModule
import io.horizontalsystems.bitstashwallet.modules.pin.PinPage
import io.horizontalsystems.bitstashwallet.modules.pin.TopText

class SetPinPresenter(
        override val view: PinModule.IView,
        val router: SetPinModule.IRouter,
        interactor: PinModule.IInteractor) : ManagePinPresenter(view, interactor, pages = listOf(Page.ENTER, Page.CONFIRM)) {

    override fun viewDidLoad() {
        view.setTitle(R.string.SetPin_Title)

        val pinPages = mutableListOf<PinPage>()
        pages.forEach { page ->
            when (page) {
                Page.ENTER -> pinPages.add(PinPage(TopText.Description(R.string.SetPin_Info)))
                Page.CONFIRM -> pinPages.add(PinPage(TopText.Description(R.string.SetPin_ConfirmInfo)))
            }
        }
        view.addPages(pinPages)
    }

    override fun didSavePin() {
        router.dismissModuleWithSuccess()
    }

}

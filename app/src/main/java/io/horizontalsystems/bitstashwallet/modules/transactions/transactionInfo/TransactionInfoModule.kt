package io.horizontalsystems.bitstashwallet.modules.transactions.transactionInfo

import io.horizontalsystems.bitstashwallet.entities.Wallet
import io.horizontalsystems.bitstashwallet.viewHelpers.TextHelper

object TransactionInfoModule {
    interface View {
        fun showCopied()
    }

    interface ViewDelegate {
        fun onCopy(value: String)
        fun openFullInfo(transactionHash: String, coin: Wallet)
    }

    interface Interactor {
        fun onCopy(value: String)
    }

    interface InteractorDelegate

    interface Router {
        fun openFullInfo(transactionHash: String, wallet: Wallet)
    }

    fun init(view: TransactionInfoViewModel, router: Router) {
        val interactor = TransactionInfoInteractor(TextHelper)
        val presenter = TransactionInfoPresenter(interactor, router)

        view.delegate = presenter
        presenter.view = view
        interactor.delegate = presenter
    }

}

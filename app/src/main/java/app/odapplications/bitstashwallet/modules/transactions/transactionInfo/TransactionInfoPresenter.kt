package app.odapplications.bitstashwallet.modules.transactions.transactionInfo

import app.odapplications.bitstashwallet.entities.Wallet

class TransactionInfoPresenter(
        private val interactor: TransactionInfoModule.Interactor,
        private val router: TransactionInfoModule.Router
) : TransactionInfoModule.ViewDelegate, TransactionInfoModule.InteractorDelegate {

    var view: TransactionInfoModule.View? = null

    // ViewDelegate methods

    override fun onCopy(value: String) {
        interactor.onCopy(value)
        view?.showCopied()
    }

    override fun openFullInfo(transactionHash: String, wallet: Wallet) {
        router.openFullInfo(transactionHash, wallet)
    }

}

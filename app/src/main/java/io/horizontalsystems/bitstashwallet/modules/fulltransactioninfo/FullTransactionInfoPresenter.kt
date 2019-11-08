package io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo

import io.horizontalsystems.bitstashwallet.entities.FullTransactionItem
import io.horizontalsystems.bitstashwallet.entities.FullTransactionRecord
import io.horizontalsystems.bitstashwallet.entities.FullTransactionSection

class FullTransactionInfoPresenter(val interactor: FullTransactionInfoInteractor, val router: FullTransactionInfoModule.Router, private val state: FullTransactionInfoState)
    : FullTransactionInfoModule.ViewDelegate, FullTransactionInfoModule.InteractorDelegate {

    var view: FullTransactionInfoModule.View? = null

    //
    // State
    //
    override val canShowTransactionInProviderSite: Boolean
        get() = interactor.url(state.transactionHash) != null

    override val providerName: String?
        get() = state.transactionRecord?.providerName

    override val sectionCount: Int
        get() = state.transactionRecord?.sections?.size ?: 0

    override fun getSection(row: Int): FullTransactionSection? {
        return state.transactionRecord?.sections?.get(row)
    }

    //
    // ViewDelegate
    //
    override fun viewDidLoad() {
        interactor.didLoad()
        interactor.updateProvider(state.wallet)
        if (canShowTransactionInProviderSite) {
            view?.showShareButton()
        }

        retryLoadInfo()
    }

    override fun onRetryLoad() {
        if (state.transactionRecord == null) {
            tryLoadInfo()
        }
    }

    override fun onTapItem(item: FullTransactionItem) {
        if (item.clickable) {
            if (item.url != null) {
                view?.openUrl(item.url)
            } else if (item.value != null) {
                interactor.copyToClipboard(item.value)
                view?.showCopied()
            }
        }
    }

    override fun onTapProvider() {
        view?.openProviderSettings(state.wallet.coin, state.transactionHash)
    }


    override fun onTapChangeProvider() {
        view?.openProviderSettings(state.wallet.coin, state.transactionHash)
    }

    override fun onTapResource() {
        interactor.url(state.transactionHash)?.let {
            view?.openUrl(it)
        }
    }

    override fun onShare() {
        interactor.url(state.transactionHash)?.let {
            view?.share(it)
        }
    }

    override fun onClear() {
        interactor.clear()
    }

    //
    // InteractorDelegate
    //
    override fun onProviderChange() {
        state.transactionRecord = null
        view?.reload()

        interactor.updateProvider(state.wallet)

        retryLoadInfo()
    }

    override fun onReceiveTransactionInfo(transactionRecord: FullTransactionRecord) {
        state.transactionRecord = transactionRecord
        view?.hideLoading()
        view?.reload()
    }

    override fun onError(providerName: String?) {
        view?.hideLoading()
        view?.showError(providerName)
    }

    override fun retryLoadInfo() {
        if (state.transactionRecord == null) {
            tryLoadInfo()
        }
    }

    //
    // Private
    //
    private fun tryLoadInfo() {
        view?.hideError()
        view?.showLoading()

        interactor.retrieveTransactionInfo(state.transactionHash)
    }
}

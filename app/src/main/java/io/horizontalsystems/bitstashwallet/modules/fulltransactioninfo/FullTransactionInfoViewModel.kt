package io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.horizontalsystems.bitstashwallet.SingleLiveEvent
import io.horizontalsystems.bitstashwallet.entities.Coin
import io.horizontalsystems.bitstashwallet.entities.Wallet

class FullTransactionInfoViewModel : ViewModel(), FullTransactionInfoModule.View, FullTransactionInfoModule.Router {

    lateinit var delegate: FullTransactionInfoModule.ViewDelegate

    val loadingLiveData = MutableLiveData<Boolean>()
    val reloadLiveEvent = SingleLiveEvent<Void>()
    val showCopiedLiveEvent = SingleLiveEvent<Unit>()
    val showErrorLiveEvent = SingleLiveEvent<Pair<Boolean, String?>>()
    val showShareLiveEvent = SingleLiveEvent<String>()
    val openLinkLiveEvent = SingleLiveEvent<String>()
    val openProviderSettingsEvent = SingleLiveEvent<Pair<Coin, String>>()
    val showShareButton = SingleLiveEvent<Void>()

    fun init(transactionHash: String, wallet: Wallet) {
        FullTransactionInfoModule.init(this, this, wallet, transactionHash)
        delegate.viewDidLoad()
    }

    fun retry() {
        delegate.onRetryLoad()
    }

    fun share() {
        delegate.onShare()
    }

    fun changeProvider() {
        delegate.onTapChangeProvider()
    }

    //
    // View
    //

    override fun showShareButton() {
        showShareButton.call()
    }

    override fun showLoading() {
        loadingLiveData.value = true
    }

    override fun hideLoading() {
        loadingLiveData.value = false
    }

    override fun showError(providerName: String?) {
        showErrorLiveEvent.value = Pair(true, providerName)
    }

    override fun hideError() {
        showErrorLiveEvent.value = Pair(false, null)
    }

    override fun reload() {
        reloadLiveEvent.call()
    }

    override fun showCopied() {
        showCopiedLiveEvent.call()
    }

    override fun openProviderSettings(coin: Coin, transactionHash: String) {
        openProviderSettingsEvent.value = Pair(coin, transactionHash)
    }

    override fun openUrl(url: String) {
        openLinkLiveEvent.value = url
    }

    override fun share(url: String) {
        showShareLiveEvent.value = url
    }

    override fun onCleared() {
        delegate.onClear()
    }

}

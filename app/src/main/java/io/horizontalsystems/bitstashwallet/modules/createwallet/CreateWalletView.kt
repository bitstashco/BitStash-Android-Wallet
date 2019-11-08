package io.horizontalsystems.bitstashwallet.modules.createwallet

import androidx.lifecycle.MutableLiveData
import io.horizontalsystems.bitstashwallet.SingleLiveEvent

class CreateWalletView : CreateWalletModule.IView {
    val itemsLiveData = MutableLiveData<List<CreateWalletModule.CoinViewItem>>()
    val errorLiveEvent = SingleLiveEvent<Exception>()

    override fun setItems(items: List<CreateWalletModule.CoinViewItem>) {
        itemsLiveData.postValue(items)
    }

    override fun showError(exception: Exception) {
        errorLiveEvent.postValue(exception)
    }
}

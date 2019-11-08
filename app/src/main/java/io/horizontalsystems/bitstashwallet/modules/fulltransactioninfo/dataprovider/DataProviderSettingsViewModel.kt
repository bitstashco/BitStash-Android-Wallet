package io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.dataprovider

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.horizontalsystems.bitstashwallet.SingleLiveEvent
import io.horizontalsystems.bitstashwallet.entities.Coin

class DataProviderSettingsViewModel : ViewModel(), DataProviderSettingsModule.View {

    lateinit var delegate: DataProviderSettingsModule.ViewDelegate

    val providerItems = MutableLiveData<List<DataProviderSettingsItem>>()
    val closeLiveEvent = SingleLiveEvent<Unit>()

    fun init(coin: Coin, transactionHash: String) {
        DataProviderSettingsModule.init(coin, transactionHash, this)
        delegate.viewDidLoad()
    }

    override fun show(items: List<DataProviderSettingsItem>) {
        providerItems.value = items
    }

    override fun close() {
        closeLiveEvent.call()
    }
}

package app.odapplications.bitstashwallet.modules.fulltransactioninfo.dataprovider

import android.content.Context
import android.content.Intent
import app.odapplications.bitstashwallet.core.App
import app.odapplications.bitstashwallet.entities.Coin
import app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule

object DataProviderSettingsModule {
    const val COIN_STRING = "coin"
    const val TRANSACTION_HASH = "transaction_hash"

    interface View {
        fun show(items: List<DataProviderSettingsItem>)
        fun close()
    }

    interface ViewDelegate {
        fun viewDidLoad()
        fun onSelect(item: DataProviderSettingsItem)
    }

    interface Interactor {
        fun pingProvider(name: String, url: String)
        fun providers(coin: Coin): List<FullTransactionInfoModule.Provider>
        fun baseProvider(coin: Coin): FullTransactionInfoModule.Provider
        fun setBaseProvider(name: String, coin: Coin)
    }

    interface InteractorDelegate {
        fun onPingSuccess(name: String)
        fun onPingFailure(name: String)
        fun onSetDataProvider()
    }

    fun init(coin: Coin, transactionHash: String, view: DataProviderSettingsViewModel) {
        val interactor = DataProviderSettingsInteractor(App.transactionDataProviderManager, App.networkManager)
        val presenter = DataProviderSettingsPresenter(coin, transactionHash, interactor)

        view.delegate = presenter
        presenter.view = view
        interactor.delegate = presenter
    }

    fun start(context: Context, coin: Coin, transactionHash: String) {
        val intent = Intent(context, DataProviderSettingsActivity::class.java)
        intent.putExtra(COIN_STRING, coin)
        intent.putExtra(TRANSACTION_HASH, transactionHash)
        context.startActivity(intent)
    }

}

data class DataProviderSettingsItem(val name: String, var online: Boolean, val selected: Boolean, var checking: Boolean) {

    override fun equals(other: Any?): Boolean {
        if (other is DataProviderSettingsItem) {
            return name == other.name
        }

        return super.equals(other)
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + online.hashCode()
        result = 31 * result + selected.hashCode()
        result = 31 * result + checking.hashCode()
        return result
    }
}

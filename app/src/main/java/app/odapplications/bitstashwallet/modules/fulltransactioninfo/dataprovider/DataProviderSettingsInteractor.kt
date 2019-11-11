package app.odapplications.bitstashwallet.modules.fulltransactioninfo.dataprovider

import app.odapplications.bitstashwallet.core.INetworkManager
import app.odapplications.bitstashwallet.core.ITransactionDataProviderManager
import app.odapplications.bitstashwallet.entities.Coin
import app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import java.net.URL

class DataProviderSettingsInteractor(private val dataProviderManager: ITransactionDataProviderManager, val networkManager: INetworkManager)
    : DataProviderSettingsModule.Interactor {

    val disposables = CompositeDisposable()
    var delegate: DataProviderSettingsModule.InteractorDelegate? = null

    override fun pingProvider(name: String, url: String) {
        val uri = URL(url)
        val host = "${uri.protocol}://${uri.host}"

        disposables.add(networkManager.ping(host, url)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    delegate?.onPingSuccess(name)
                }, {
                    delegate?.onPingFailure(name)
                }))
    }

    override fun providers(coin: Coin): List<FullTransactionInfoModule.Provider> {
        return dataProviderManager.providers(coin)
    }

    override fun baseProvider(coin: Coin): FullTransactionInfoModule.Provider {
        return dataProviderManager.baseProvider(coin)
    }

    override fun setBaseProvider(name: String, coin: Coin) {
        dataProviderManager.setBaseProvider(name, coin)

        delegate?.onSetDataProvider()
    }
}

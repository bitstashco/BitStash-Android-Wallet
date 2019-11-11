package app.odapplications.bitstashwallet.core.factories

import android.content.Context
import app.odapplications.bitstashwallet.core.IAdapter
import app.odapplications.bitstashwallet.core.IAppConfigProvider
import app.odapplications.bitstashwallet.core.IEosKitManager
import app.odapplications.bitstashwallet.core.IEthereumKitManager
import app.odapplications.bitstashwallet.core.adapters.*
import app.odapplications.bitstashwallet.core.managers.BinanceKitManager
import app.odapplications.bitstashwallet.entities.CoinType
import app.odapplications.bitstashwallet.entities.Wallet

class AdapterFactory(
        private val context: Context,
        private val appConfigProvider: IAppConfigProvider,
        private val ethereumKitManager: IEthereumKitManager,
        private val eosKitManager: IEosKitManager,
        private val binanceKitManager: BinanceKitManager) {

    fun adapter(wallet: Wallet): IAdapter? {
        return when (val coinType = wallet.coin.type) {
            is CoinType.Bitcoin -> BitcoinAdapter(wallet, appConfigProvider.testMode)
            is CoinType.BitcoinCash -> BitcoinCashAdapter(wallet, appConfigProvider.testMode)
            is CoinType.Dash -> DashAdapter(wallet, appConfigProvider.testMode)
            is CoinType.Eos -> EosAdapter(coinType, eosKitManager.eosKit(wallet), wallet.coin.decimal)
            is CoinType.Binance -> BinanceAdapter(binanceKitManager.binanceKit(wallet), coinType.symbol)
            is CoinType.Ethereum -> EthereumAdapter(ethereumKitManager.ethereumKit(wallet))
            is CoinType.Erc20 -> Erc20Adapter(context, ethereumKitManager.ethereumKit(wallet), wallet.coin.decimal, coinType.fee, coinType.address, coinType.gasLimit)
        }
    }

    fun unlinkAdapter(adapter: IAdapter) {
        when (adapter) {
            is EthereumBaseAdapter -> {
                ethereumKitManager.unlink()
            }
            is EosAdapter -> {
                eosKitManager.unlink()
            }
            is BinanceAdapter -> {
                binanceKitManager.unlink()
            }
        }
    }
}

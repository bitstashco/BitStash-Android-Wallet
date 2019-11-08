package io.horizontalsystems.bitstashwallet.core.factories

import android.content.Context
import io.horizontalsystems.bitstashwallet.core.IAdapter
import io.horizontalsystems.bitstashwallet.core.IAppConfigProvider
import io.horizontalsystems.bitstashwallet.core.IEosKitManager
import io.horizontalsystems.bitstashwallet.core.IEthereumKitManager
import io.horizontalsystems.bitstashwallet.core.adapters.*
import io.horizontalsystems.bitstashwallet.core.managers.BinanceKitManager
import io.horizontalsystems.bitstashwallet.entities.CoinType
import io.horizontalsystems.bitstashwallet.entities.Wallet

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

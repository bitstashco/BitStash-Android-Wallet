package app.odapplications.bitstashwallet.core.factories

import app.odapplications.bitstashwallet.core.App
import app.odapplications.bitstashwallet.core.IFeeRateProvider
import app.odapplications.bitstashwallet.core.managers.BitcoinCashFeeRateProvider
import app.odapplications.bitstashwallet.core.managers.BitcoinFeeRateProvider
import app.odapplications.bitstashwallet.core.managers.DashFeeRateProvider
import app.odapplications.bitstashwallet.core.managers.EthereumFeeRateProvider
import app.odapplications.bitstashwallet.entities.Coin
import app.odapplications.bitstashwallet.entities.CoinType

object FeeRateProviderFactory {
    private val feeRateProvider = App.feeRateProvider

    fun provider(coin: Coin): IFeeRateProvider? {
        return when (coin.type) {
            is CoinType.Bitcoin -> BitcoinFeeRateProvider(feeRateProvider)
            is CoinType.BitcoinCash -> BitcoinCashFeeRateProvider(feeRateProvider)
            is CoinType.Dash -> DashFeeRateProvider(feeRateProvider)
            is CoinType.Ethereum, is CoinType.Erc20 -> EthereumFeeRateProvider(feeRateProvider)
            else -> null
        }
    }

}

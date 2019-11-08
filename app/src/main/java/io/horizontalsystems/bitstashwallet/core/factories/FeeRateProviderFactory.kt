package io.horizontalsystems.bitstashwallet.core.factories

import io.horizontalsystems.bitstashwallet.core.App
import io.horizontalsystems.bitstashwallet.core.IFeeRateProvider
import io.horizontalsystems.bitstashwallet.core.managers.BitcoinCashFeeRateProvider
import io.horizontalsystems.bitstashwallet.core.managers.BitcoinFeeRateProvider
import io.horizontalsystems.bitstashwallet.core.managers.DashFeeRateProvider
import io.horizontalsystems.bitstashwallet.core.managers.EthereumFeeRateProvider
import io.horizontalsystems.bitstashwallet.entities.Coin
import io.horizontalsystems.bitstashwallet.entities.CoinType

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

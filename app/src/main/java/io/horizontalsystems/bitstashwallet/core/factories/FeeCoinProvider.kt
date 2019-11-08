package io.horizontalsystems.bitstashwallet.core.factories

import io.horizontalsystems.bitstashwallet.core.IAppConfigProvider
import io.horizontalsystems.bitstashwallet.entities.Coin
import io.horizontalsystems.bitstashwallet.entities.CoinType

class FeeCoinProvider(private val appConfigProvider: IAppConfigProvider) {

    fun feeCoinData(coin: Coin): Pair<Coin, String>? = when (coin.type) {
        is CoinType.Erc20 -> erc20()
        is CoinType.Binance -> binance(coin.type.symbol)
        else -> null
    }

    private fun erc20(): Pair<Coin, String>? {
        val coin = appConfigProvider.coins.firstOrNull { it.type == CoinType.Ethereum }

        return coin?.let { Pair(coin, "ERC20") }
    }

    private fun binance(symbol: String): Pair<Coin, String>? {
        if (symbol == "BNB") {
            return null
        }
        val coin = appConfigProvider.coins.firstOrNull { it.type is CoinType.Binance && it.type.symbol == "BNB" }

        return coin?.let { Pair(coin, "BEP-2") }
    }

}

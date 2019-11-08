package io.horizontalsystems.bitstashwallet.core.factories

import io.horizontalsystems.bitstashwallet.core.IAddressParser
import io.horizontalsystems.bitstashwallet.core.utils.AddressParser
import io.horizontalsystems.bitstashwallet.entities.Coin
import io.horizontalsystems.bitstashwallet.entities.CoinType

class AddressParserFactory {
    fun parser(coin: Coin): IAddressParser {
        return when (coin.type) {
            is CoinType.Bitcoin -> AddressParser("bitcoin", true)
            is CoinType.BitcoinCash -> AddressParser("bitcoincash", false)
            is CoinType.Dash -> AddressParser("dash", true)
            is CoinType.Ethereum, is CoinType.Erc20 -> AddressParser("ethereum", true)
            is CoinType.Eos -> AddressParser("eos", true)
            is CoinType.Binance -> AddressParser("binance", true)
        }
    }

}

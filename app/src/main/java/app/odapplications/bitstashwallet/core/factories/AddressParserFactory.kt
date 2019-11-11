package app.odapplications.bitstashwallet.core.factories

import app.odapplications.bitstashwallet.core.IAddressParser
import app.odapplications.bitstashwallet.core.utils.AddressParser
import app.odapplications.bitstashwallet.entities.Coin
import app.odapplications.bitstashwallet.entities.CoinType

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

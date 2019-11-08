package io.horizontalsystems.bitstashwallet.core.managers

import io.horizontalsystems.bitstashwallet.BuildConfig
import io.horizontalsystems.bitstashwallet.R
import io.horizontalsystems.bitstashwallet.core.App
import io.horizontalsystems.bitstashwallet.core.IAppConfigProvider
import io.horizontalsystems.bitstashwallet.core.IPredefinedAccountType
import io.horizontalsystems.bitstashwallet.entities.*
import java.math.BigDecimal

class AppConfigProvider : IAppConfigProvider {
    override val companyWebPageLink: String = "https://bitstash.co"
    override val appWebPageLink: String = "https://payments.bitstash.co"
    override val reportEmail = "hello@bitstash.co"
    override val reportTelegramGroup = "bitstashmarketplace"
    override val ipfsId = "QmXTJZBMMRmBbPun6HFt3tmb3tfYF2usLPxFoacL7G5uMX"
    override val ipfsMainGateway = "ipfs-ext.horizontalsystems.xyz"
    override val ipfsFallbackGateway = "ipfs.io"

    override val infuraProjectId = "4351d832c39c4b4bb159eb72548a180b"
    override val infuraProjectSecret = "816f85bed849497e87f0e083fb1f1c85"

    override val fiatDecimal: Int = 2
    override val maxDecimal: Int = 8

    override val testMode: Boolean = BuildConfig.testMode

    override val currencies: List<Currency> = listOf(
            Currency(code = "USD", symbol = "\u0024"),
            Currency(code = "EUR", symbol = "\u20AC"),
            Currency(code = "GBP", symbol = "\u00A3"),
            Currency(code = "JPY", symbol = "\u00A5"),
            Currency(code = "AUD", symbol = "\u20B3"),
            Currency(code = "CAD", symbol = "\u0024"),
            Currency(code = "CHF", symbol = "\u20A3"),
            Currency(code = "CNY", symbol = "\u00A5"),
            Currency(code = "KRW", symbol = "\u20AE"),
            Currency(code = "RUB", symbol = "\u20BD"),
            Currency(code = "TRY", symbol = "\u20BA")
    )

    override val localizations: List<String>
        get() {
            val coinsString = App.instance.getString(R.string.localizations)
            return coinsString.split(",")
        }
    override val defaultCoinCodes: List<String>
        get() = listOf("BTC", "ETH")

    override val featuredCoins: List<Coin>
        get() = listOf(
                coins[0],
                coins[1],
                coins[2],
                coins[3],
                coins[4],
                coins[5]
        )

    override val coins: List<Coin> = listOf(
            Coin("Bitcoin",                 "BTC",          8,      CoinType.Bitcoin),
            Coin("Ethereum",                "ETH",         18,      CoinType.Ethereum),
            Coin("Bitcoin Cash",            "BCH",          8,      CoinType.BitcoinCash),
            Coin("Dash",                    "DASH",         8,      CoinType.Dash),
            Coin("Binance Chain",           "BNB",          8,      CoinType.Binance("BNB")),
            Coin("EOS",                     "EOS",          4,      CoinType.Eos("eosio.token", "EOS")),
            Coin("BitStash",                "STASH",        18,      CoinType.Erc20("0x965f109d31ccb77005858defae0ebaf7b4381652")),
            Coin("0x",                      "ZRX",         18,      CoinType.Erc20("0xE41d2489571d322189246DaFA5ebDe1F4699F498")),
            Coin("Aelf",                    "ELF",         18,      CoinType.Erc20("0xbf2179859fc6D5BEE9Bf9158632Dc51678a4100e")),
            Coin("Aurora DAO",              "AURA",        18,      CoinType.Erc20("0xCdCFc0f66c522Fd086A1b725ea3c0Eeb9F9e8814")),
            Coin("Ankr Network",            "ANKR",         8,      CoinType.Binance("ANKR-E97")),
            Coin("Bancor",                  "BNT",         18,      CoinType.Erc20("0x1F573D6Fb3F13d689FF844B4cE37794d79a7FF1C")),
            Coin("Basic Attention Token",   "BAT",         18,      CoinType.Erc20("0x0D8775F648430679A709E98d2b0Cb6250d2887EF")),
            Coin("Binance Token",           "BNB-ERC20",   18,      CoinType.Erc20("0xB8c77482e45F1F44dE1745F52C74426C631bDD52")),
            Coin("Bitcoin BEP2",            "BTCB",         8,      CoinType.Binance("BTCB-1DE")),
            Coin("Cashaaa",                 "CAS",          8,      CoinType.Binance("CAS-167")),
            Coin("ChainLink",               "LINK",        18,      CoinType.Erc20("0x514910771AF9Ca656af840dff83E8264EcF986CA")),
            Coin("Crypto.com",              "MCO",          8,      CoinType.Erc20("0xB63B606Ac810a52cCa15e44bB630fd42D8d1d83d")),
            Coin("Crypto.com Chain",        "CRO",          8,      CoinType.Erc20("0xA0b73E1Ff0B80914AB6fe0444E65848C4C34450b")),
            Coin("Crypterium",              "CRPT",         8,      CoinType.Binance("CRPT-8C9")),
            Coin("Dai",                     "DAI",         18,      CoinType.Erc20("0x89d24A6b4CcB1B6fAA2625fE562bDD9a23260359")),
            Coin("Decentraland",            "MANA",        18,      CoinType.Erc20("0x0F5D2fB29fb7d3CFeE444a200298f468908cC942")),
            Coin("Digix DAO",               "DGD",          9,      CoinType.Erc20("0xE0B7927c4aF23765Cb51314A0E0521A9645F0E2A")),
            Coin("Digix Gold",              "DGX",          9,      CoinType.Erc20("0x4f3AfEC4E5a3F2A6a1A411DEF7D7dFe50eE057bF", gasLimit = 300_000)),
            Coin("EnjinCoin",               "ENJ",         18,      CoinType.Erc20("0xF629cBd94d3791C9250152BD8dfBDF380E2a3B9c")),
            Coin("EOSDT",                   "EOSDT",        9,      CoinType.Eos("eosdtsttoken", "EOSDT")),
            Coin("Everipedia",              "IQ",           3,      CoinType.Eos("everipediaiq", "IQ")),
            Coin("Gemini Dollar",           "GUSD",         2,      CoinType.Erc20("0x056Fd409E1d7A124BD7017459dFEa2F387b6d5Cd")),
            Coin("Golem",                   "GNT",         18,      CoinType.Erc20("0xa74476443119A942dE498590Fe1f2454d7D4aC0d")),
            Coin("Gifto",                   "GTO",          8,      CoinType.Binance("GTO-908")),
            Coin("Holo",                    "HOT",         18,      CoinType.Erc20("0x6c6EE5e31d828De241282B9606C8e98Ea48526E2")),
            Coin("Huobi",                   "HT",          18,      CoinType.Erc20("0x6f259637dcD74C767781E37Bc6133cd6A68aa161")),
            Coin("IDEX",                    "IDEX",        18,      CoinType.Erc20("0xB705268213D593B8FD88d3FDEFF93AFF5CbDcfAE")),
            Coin("IDEX Membership",         "IDXM",         8,      CoinType.Erc20("0xCc13Fc627EFfd6E35D2D2706Ea3C4D7396c610ea")),
            Coin("KuCoin Shares",           "KCS",          6,      CoinType.Erc20("0x039B5649A59967e3e936D7471f9c3700100Ee1ab")),
            Coin("Kyber Network",           "KNC",         18,      CoinType.Erc20("0xdd974D5C2e2928deA5F71b9825b8b646686BD200")),
            Coin("Loom",                    "LOOM",        18,      CoinType.Erc20("0xA4e8C3Ec456107eA67d3075bF9e3DF3A75823DB0")),
            Coin("Loopring",                "LRC",         18,      CoinType.Erc20("0xEF68e7C694F40c8202821eDF525dE3782458639f")),
            Coin("Maker",                   "MKR",         18,      CoinType.Erc20("0x9f8F72aA9304c8B593d555F12eF6589cC3A579A2")),
            Coin("MEET.ONE",                "MEETONE",      4,      CoinType.Eos("eosiomeetone", "MEETONE")),
            Coin("Mithril",                 "MITH",        18,      CoinType.Erc20("0x3893b9422Cd5D70a81eDeFfe3d5A1c6A978310BB")),
            Coin("Nexo",                    "NEXO",        18,      CoinType.Erc20("0xB62132e35a6c13ee1EE0f84dC5d40bad8d815206")),
            Coin("Newdex",                  "NDX",          4,      CoinType.Eos("newdexissuer", "NDX")),
            Coin("Native Utility Token",    "NUT",          9,      CoinType.Eos("eosdtnutoken", "NUT")),
            Coin("OmiseGO",                 "OMG",         18,      CoinType.Erc20("0xd26114cd6EE289AccF82350c8d8487fedB8A0C07")),
            Coin("Orbs",                    "ORBS",        18,      CoinType.Erc20("0xff56Cc6b1E6dEd347aA0B7676C85AB0B3D08B0FA")),
            Coin("Prospectors Gold",        "PGL",          4,      CoinType.Eos("prospectorsg", "PGL")),
            Coin("Paxos Standard",          "PAX",         18,      CoinType.Erc20("0x8E870D67F660D95d5be530380D0eC0bd388289E1")),
            Coin("Polymath",                "POLY",        18,      CoinType.Erc20("0x9992eC3cF6A55b00978cdDF2b27BC6882d88D1eC")),
            Coin("Populous",                "PPT",          8,      CoinType.Erc20("0xd4fa1460F537bb9085d22C7bcCB5DD450Ef28e3a")),
            Coin("Paytomat",                "PTI",          4,      CoinType.Eos("ptitokenhome", "PTI")),
            Coin("Pundi X",                 "NPXS",        18,      CoinType.Erc20("0xA15C7Ebe1f07CaF6bFF097D8a589fb8AC49Ae5B3")),
            Coin("Reputation (Augur)",      "REP",         18,      CoinType.Erc20("0x1985365e9f78359a9B6AD760e32412f4a445E862")),
            Coin("Revain",                  "R",            0,      CoinType.Erc20("0x48f775EFBE4F5EcE6e0DF2f7b5932dF56823B990")),
            Coin("STASIS EURS",             "EURS",         2,      CoinType.Erc20("0xdB25f211AB05b1c97D595516F45794528a807ad8", fee = BigDecimal(0.5))),
            Coin("Status",                  "SNT",         18,      CoinType.Erc20("0x744d70FDBE2Ba4CF95131626614a1763DF805B9E")),
            Coin("TrueUSD",                 "TUSD",        18,      CoinType.Erc20("0x0000000000085d4780B73119b644AE5ecd22b376")),
            Coin("Tether USD",              "USDT",         6,      CoinType.Erc20("0xdAC17F958D2ee523a2206206994597C13D831ec7")),
            Coin("USD Coin",                "USDC",         6,      CoinType.Erc20("0xA0b86991c6218b36c1d19D4a2e9Eb0cE3606eB48")),
            Coin("Walton",                  "WTC",         18,      CoinType.Erc20("0xb7cB1C96dB6B22b0D3d9536E0108d062BD488F74")),
            Coin("WAX",                     "WAX",          8,      CoinType.Erc20("0x39Bb259F66E1C59d5ABEF88375979b4D20D98022")),
            Coin("Zilliqa",                 "ZIL",         12,      CoinType.Erc20("0x05f4a42e251f2d52b8ed15E9FEdAacFcEF1FAD27"))
    )

    override val predefinedAccountTypes: List<IPredefinedAccountType> = listOf(
            UnstoppableAccountType(),
            EosAccountType(),
            BinanceAccountType()
    )
}

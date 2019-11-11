package app.odapplications.bitstashwallet.core.managers

import app.odapplications.bitstashwallet.core.IAppConfigProvider
import app.odapplications.bitstashwallet.core.ILocalStorage
import app.odapplications.bitstashwallet.core.ITransactionDataProviderManager
import app.odapplications.bitstashwallet.entities.Coin
import app.odapplications.bitstashwallet.entities.CoinType
import app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule
import app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.BitcoinForksProvider
import app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.EthereumForksProvider
import app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.Provider
import app.odapplications.bitstashwallet.modules.fulltransactioninfo.providers.*
import io.reactivex.subjects.PublishSubject

class TransactionDataProviderManager(appConfig: IAppConfigProvider, private val localStorage: ILocalStorage)
    : ITransactionDataProviderManager {

    private val bitcoinProviders = when {
        appConfig.testMode -> listOf(HorsysBitcoinProvider(testMode = true))
        else -> listOf(
                HorsysBitcoinProvider(testMode = false),
                BlockChairBitcoinProvider(),
                BtcComBitcoinProvider())
    }

    private val bitcoinCashProviders = when {
        appConfig.testMode -> listOf(BlockdozerBitcoinCashProvider(true))
        else -> listOf(
                BlockdozerBitcoinCashProvider(false),
                BlockChairBitcoinCashProvider(),
                BtcComBitcoinCashProvider())
    }

    private val ethereumProviders = when {
        appConfig.testMode -> listOf(
                EtherscanEthereumProvider(testMode = true))
        else -> listOf(
                EtherscanEthereumProvider(testMode = false),
                BlockChairEthereumProvider())
    }

    private val dashProviders = when {
        appConfig.testMode -> listOf(HorsysDashProvider(true))
        else -> listOf(
                HorsysDashProvider(false),
                BlockChairDashProvider(),
                InsightDashProvider()
        )
    }

    private val binanceProviders = when {
        appConfig.testMode -> listOf(BinanceChainProvider(true))
        else -> listOf(BinanceChainProvider(false))
    }

    private val eosProviders = listOf(EosInfraProvider(), EosGreymassProvider())

    override val baseProviderUpdatedSignal = PublishSubject.create<Unit>()

    override fun providers(coin: Coin): List<Provider> = when (coin.type) {
        is CoinType.Bitcoin -> bitcoinProviders
        is CoinType.BitcoinCash -> bitcoinCashProviders
        is CoinType.Ethereum, is CoinType.Erc20 -> ethereumProviders
        is CoinType.Dash -> dashProviders
        is CoinType.Binance -> binanceProviders
        is CoinType.Eos -> eosProviders
    }

    override fun baseProvider(coin: Coin) = when (coin.type) {
        is CoinType.Bitcoin, is CoinType.BitcoinCash -> {
            bitcoin(localStorage.baseBitcoinProvider ?: bitcoinProviders[0].name)
        }
        is CoinType.Ethereum, is CoinType.Erc20 -> {
            ethereum(localStorage.baseEthereumProvider ?: ethereumProviders[0].name)
        }
        is CoinType.Dash -> {
            dash(localStorage.baseDashProvider ?: dashProviders[0].name)
        }
        is CoinType.Binance -> {
            binance(localStorage.baseBinanceProvider ?: binanceProviders[0].name)
        }
        is CoinType.Eos -> {
            eos(localStorage.baseEosProvider ?: eosProviders[0].name)
        }
    }

    override fun setBaseProvider(name: String, coin: Coin) {
        when (coin.type) {
            is CoinType.Bitcoin, is CoinType.BitcoinCash -> {
                localStorage.baseBitcoinProvider = name
            }
            is CoinType.Ethereum, is CoinType.Erc20 -> {
                localStorage.baseEthereumProvider = name
            }
            is CoinType.Dash -> {
                localStorage.baseDashProvider = name
            }
            is CoinType.Eos -> {
                localStorage.baseEosProvider = name
            }
        }

        baseProviderUpdatedSignal.onNext(Unit)
    }

//
// Providers
//

    override fun bitcoin(name: String): BitcoinForksProvider {
        bitcoinProviders.let { list ->
            return list.find { it.name == name } ?: list[0]
        }
    }

    override fun bitcoinCash(name: String): BitcoinForksProvider {
        bitcoinCashProviders.let { list ->
            return list.find { it.name == name } ?: list[0]
        }
    }

    override fun dash(name: String): BitcoinForksProvider {
        dashProviders.let { list ->
            return list.find { it.name == name } ?: list[0]
        }
    }

    override fun ethereum(name: String): EthereumForksProvider {
        ethereumProviders.let { list ->
            return list.find { it.name == name } ?: list[0]
        }
    }

    override fun binance(name: String): FullTransactionInfoModule.BinanceProvider {
        binanceProviders.let { list ->
            return list.find { it.name == name } ?: list[0]
        }
    }

    override fun eos(name: String): FullTransactionInfoModule.EosProvider {
        eosProviders.let { list ->
            return list.find { it.name == name } ?: list[0]
        }
    }

}

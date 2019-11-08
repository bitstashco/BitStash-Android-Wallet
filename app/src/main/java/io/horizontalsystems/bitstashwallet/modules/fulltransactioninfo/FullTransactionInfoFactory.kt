package io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo

import io.horizontalsystems.bitstashwallet.core.App
import io.horizontalsystems.bitstashwallet.core.INetworkManager
import io.horizontalsystems.bitstashwallet.core.ITransactionDataProviderManager
import io.horizontalsystems.bitstashwallet.entities.CoinType
import io.horizontalsystems.bitstashwallet.entities.Wallet
import io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.adapters.FullTransactionBinanceAdapter
import io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.adapters.FullTransactionBitcoinAdapter
import io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.adapters.FullTransactionEosAdapter
import io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.adapters.FullTransactionEthereumAdapter

class FullTransactionInfoFactory(private val networkManager: INetworkManager, private val dataProviderManager: ITransactionDataProviderManager)
    : FullTransactionInfoModule.ProviderFactory {

    override fun providerFor(wallet: Wallet): FullTransactionInfoModule.FullProvider {
        val coin = wallet.coin
        val baseProvider = dataProviderManager.baseProvider(coin)

        val provider: FullTransactionInfoModule.Provider
        val adapter: FullTransactionInfoModule.Adapter

        when {
            // BTC, BTCt
            coin.type is CoinType.Bitcoin -> {
                val providerBTC = dataProviderManager.bitcoin(baseProvider.name)

                provider = providerBTC
                adapter = FullTransactionBitcoinAdapter(providerBTC, coin, "satoshi")
            }
            // BCH, BCHt
            coin.type is CoinType.BitcoinCash -> {
                val providerBCH = dataProviderManager.bitcoinCash(baseProvider.name)

                provider = providerBCH
                adapter = FullTransactionBitcoinAdapter(providerBCH, coin, "satoshi")
            }
            // DASH, DASHt
            coin.type is CoinType.Dash -> {
                val providerDASH = dataProviderManager.dash(baseProvider.name)

                provider = providerDASH
                adapter = FullTransactionBitcoinAdapter(providerDASH, coin, "duff")
            }
            // BNB
            coin.type is CoinType.Binance -> {
                val providerBinance = dataProviderManager.binance(baseProvider.name)

                provider = providerBinance
                adapter = FullTransactionBinanceAdapter(providerBinance, App.feeCoinProvider, coin)
            }
            //EOS
            coin.type is CoinType.Eos -> {
                val providerEos = dataProviderManager.eos(baseProvider.name)

                provider = providerEos
                adapter = FullTransactionEosAdapter(providerEos, wallet)
            }
            // ETH, ETHt
            else -> {
                val providerETH = dataProviderManager.ethereum(baseProvider.name)

                provider = providerETH
                adapter = FullTransactionEthereumAdapter(providerETH, App.feeCoinProvider, coin)
            }
        }

        return FullTransactionInfoProvider(networkManager, adapter, provider)
    }
}

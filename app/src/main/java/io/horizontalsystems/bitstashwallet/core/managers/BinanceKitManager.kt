package io.horizontalsystems.bitstashwallet.core.managers

import io.horizontalsystems.bitstashwallet.core.App
import io.horizontalsystems.bitstashwallet.core.IAppConfigProvider
import io.horizontalsystems.bitstashwallet.core.UnsupportedAccountException
import io.horizontalsystems.bitstashwallet.entities.AccountType
import io.horizontalsystems.bitstashwallet.entities.Wallet
import io.horizontalsystems.binancechainkit.BinanceChainKit

class BinanceKitManager(appConfig: IAppConfigProvider) {
    private var kit: BinanceChainKit? = null
    private var useCount = 0
    private val testMode = appConfig.testMode

    val binanceKit: BinanceChainKit?
        get() = kit

    fun binanceKit(wallet: Wallet): BinanceChainKit {
        val account = wallet.account
        if (account.type is AccountType.Mnemonic) {
            useCount += 1

            kit?.let { return it }
            val networkType = if (testMode)
                BinanceChainKit.NetworkType.TestNet else
                BinanceChainKit.NetworkType.MainNet

            kit = BinanceChainKit.instance(App.instance, account.type.words, account.id, networkType)
            kit?.refresh()

            return kit!!
        }

        throw UnsupportedAccountException()
    }

    fun unlink() {
        useCount -= 1

        if (useCount < 1) {
            kit?.stop()
            kit = null
        }
    }
}

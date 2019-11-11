package app.odapplications.bitstashwallet.core.managers

import app.odapplications.bitstashwallet.core.App
import app.odapplications.bitstashwallet.core.IAppConfigProvider
import app.odapplications.bitstashwallet.core.IEosKitManager
import app.odapplications.bitstashwallet.core.UnsupportedAccountException
import app.odapplications.bitstashwallet.entities.AccountType
import app.odapplications.bitstashwallet.entities.Wallet
import io.horizontalsystems.eoskit.EosKit

class EosKitManager(appConfig: IAppConfigProvider) : IEosKitManager {
    private var kit: EosKit? = null
    private var useCount = 0
    private val testMode = appConfig.testMode

    override val eosKit: EosKit?
        get() = kit

    override fun eosKit(wallet: Wallet): EosKit {
        val account = wallet.account
        if (account.type is AccountType.Eos) {
            useCount += 1

            kit?.let { return it }
            val networkType = if (testMode)
                EosKit.NetworkType.TestNet else
                EosKit.NetworkType.MainNet

            kit = EosKit.instance(App.instance, account.type.account, account.type.activePrivateKey, networkType, account.id)
            kit?.refresh()

            return kit!!
        }

        throw UnsupportedAccountException()
    }

    override fun unlink() {
        useCount -= 1

        if (useCount < 1) {
            kit?.stop()
            kit = null
        }
    }
}

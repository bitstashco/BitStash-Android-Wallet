package app.odapplications.bitstashwallet.core.managers

import app.odapplications.bitstashwallet.core.App
import app.odapplications.bitstashwallet.core.UnsupportedAccountException
import app.odapplications.bitstashwallet.R
import app.odapplications.bitstashwallet.core.*
import app.odapplications.bitstashwallet.entities.AccountType
import app.odapplications.bitstashwallet.entities.Wallet
import io.horizontalsystems.ethereumkit.core.EthereumKit

class EthereumKitManager(appConfig: IAppConfigProvider) : IEthereumKitManager {
    private var kit: EthereumKit? = null
    private var useCount = 0
    private val testMode = appConfig.testMode
    private val infuraProjectId = App.instance.getString(R.string.infuraProjectId)
    private val infuraSecretKey = App.instance.getString(R.string.infuraSecretKey)
    private val etherscanKey = App.instance.getString(R.string.etherscanKey)

    override val ethereumKit: EthereumKit?
        get() = kit

    override fun ethereumKit(wallet: Wallet): EthereumKit {
        val account = wallet.account
        if (account.type is AccountType.Mnemonic) {
            useCount += 1

            kit?.let { return it }
            val syncMode = EthereumKit.WordsSyncMode.ApiSyncMode()
            val infuraCredentials = EthereumKit.InfuraCredentials(infuraProjectId, infuraSecretKey)
            val networkType = if (testMode) EthereumKit.NetworkType.Ropsten else EthereumKit.NetworkType.MainNet

            kit = EthereumKit.getInstance(App.instance, account.type.words, syncMode, networkType, infuraCredentials, etherscanKey, account.id)
            kit?.start()

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

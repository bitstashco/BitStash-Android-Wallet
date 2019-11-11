package app.odapplications.bitstashwallet.core.managers

import app.odapplications.bitstashwallet.core.IAppConfigProvider
import app.odapplications.bitstashwallet.core.IEnabledWalletStorage
import app.odapplications.bitstashwallet.core.IWalletFactory
import app.odapplications.bitstashwallet.core.IWalletStorage
import app.odapplications.bitstashwallet.entities.Account
import app.odapplications.bitstashwallet.entities.Coin
import app.odapplications.bitstashwallet.entities.EnabledWallet
import app.odapplications.bitstashwallet.entities.Wallet

class WalletStorage(
        private val appConfigProvider: IAppConfigProvider,
        private val walletFactory: IWalletFactory,
        private val storage: IEnabledWalletStorage)
    : IWalletStorage {

    override fun wallets(accounts: List<Account>): List<Wallet> {
        val coins = appConfigProvider.coins

        return storage.enabledWallets.map { enabledWallet ->
            val coin = coins.find { it.code == enabledWallet.coinCode }
            val account = accounts.find { it.id == enabledWallet.accountId }

            if (coin != null && account != null) {
                walletFactory.wallet(coin, account, enabledWallet.syncMode)
            } else {
                null
            }
        }.mapNotNull { it }
    }

    override fun enabledCoins(): List<Coin> {
        val coins = appConfigProvider.coins

        return storage.enabledWallets.map {enabledWallet ->
            val coin = coins.find { it.code == enabledWallet.coinCode }
            coin
        }.mapNotNull { it }
    }

    override fun save(wallets: List<Wallet>) {
        val enabledWallets = mutableListOf<EnabledWallet>()

        wallets.forEachIndexed { index, wallet ->
            enabledWallets.add(EnabledWallet(wallet.coin.code, wallet.account.id, index, wallet.syncMode))
        }

        storage.save(enabledWallets)
    }
}

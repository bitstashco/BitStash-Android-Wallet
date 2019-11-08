package io.horizontalsystems.bitstashwallet.core.managers

import io.horizontalsystems.bitstashwallet.core.IAppConfigProvider
import io.horizontalsystems.bitstashwallet.core.IEnabledWalletStorage
import io.horizontalsystems.bitstashwallet.core.IWalletFactory
import io.horizontalsystems.bitstashwallet.core.IWalletStorage
import io.horizontalsystems.bitstashwallet.entities.Account
import io.horizontalsystems.bitstashwallet.entities.Coin
import io.horizontalsystems.bitstashwallet.entities.EnabledWallet
import io.horizontalsystems.bitstashwallet.entities.Wallet

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

package app.odapplications.bitstashwallet.core.managers

import app.odapplications.bitstashwallet.core.IAppConfigProvider
import app.odapplications.bitstashwallet.core.IWalletFactory
import app.odapplications.bitstashwallet.core.IWalletManager
import app.odapplications.bitstashwallet.entities.Account
import app.odapplications.bitstashwallet.entities.AccountType
import app.odapplications.bitstashwallet.entities.Coin
import app.odapplications.bitstashwallet.entities.Wallet
import app.odapplications.bitstashwallet.modules.transactions.CoinCode

class DefaultWalletCreator(private val walletManager: IWalletManager, private val appConfigProvider: IAppConfigProvider, private val walletFactory: IWalletFactory) {

    fun handleCreate(account: Account) {
        val wallets = walletManager.wallets.toMutableList()

        for (defaultWallet in defaultWallets(account)) {
            if (wallets.contains(defaultWallet)) {
                continue
            }

            wallets.add(defaultWallet)
        }

        walletManager.enable(wallets)
    }

    fun createWallet(account: Account, coin: Coin) {
        val wallet = walletFactory.wallet(coin, account, account.defaultSyncMode)
        walletManager.enable(listOf(wallet))
    }

    private fun defaultWallets(account: Account): List<Wallet> {
        val wallets = mutableListOf<Wallet>()

        for (coinCode in defaultCoinCodes(account.type)) {
            val coin = appConfigProvider.coins.find { it.code == coinCode } ?: continue
            val wallet = walletFactory.wallet(coin, account, account.defaultSyncMode)

            wallets.add(wallet)
        }

        return wallets
    }

    private fun defaultCoinCodes(accountType: AccountType): List<CoinCode> {
        when (accountType) {
            is AccountType.Mnemonic -> {
                if (accountType.words.size == 12) {
                    return listOf("BTC", "ETH")
                } else if (accountType.words.size == 24) {
                    return listOf("BNB")
                }
            }

            is AccountType.Eos -> {
                return listOf("EOS")
            }
        }

        return listOf()
    }
}

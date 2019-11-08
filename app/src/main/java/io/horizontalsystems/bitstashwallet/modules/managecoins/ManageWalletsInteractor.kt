package io.horizontalsystems.bitstashwallet.modules.managecoins

import io.horizontalsystems.bitstashwallet.core.*
import io.horizontalsystems.bitstashwallet.entities.AccountType
import io.horizontalsystems.bitstashwallet.entities.Coin
import io.horizontalsystems.bitstashwallet.entities.SyncMode
import io.horizontalsystems.bitstashwallet.entities.Wallet

class ManageWalletsInteractor(
        private val appConfigProvider: IAppConfigProvider,
        private val walletManager: IWalletManager,
        private val accountCreator: IAccountCreator,
        private val walletFactory: IWalletFactory,
        private val predefinedAccountTypeManager: IPredefinedAccountTypeManager)
    : ManageWalletsModule.IInteractor {

    var delegate: ManageWalletsModule.IInteractorDelegate? = null

    override val coins: List<Coin>
        get() = appConfigProvider.coins

    override val wallets: List<Wallet>
        get() = walletManager.wallets

    override val predefinedAccountTypes: List<IPredefinedAccountType>
        get() = predefinedAccountTypeManager.allTypes

    override fun wallet(coin: Coin): Wallet? {
        return walletManager.wallet(coin)
    }

    override fun saveWallets(wallets: List<Wallet>) {
        walletManager.enable(wallets)
        delegate?.didSaveChanges()
    }

    override fun createWallet(coin: Coin): Wallet {
        val account = accountCreator.createNewAccount(coin.type.defaultAccountType, createDefaultWallets = false)

        return walletFactory.wallet(coin, account, account.defaultSyncMode)
    }

    override fun restoreWallet(coin: Coin, accountType: AccountType, syncMode: SyncMode?): Wallet {
        val account = accountCreator.createRestoredAccount(accountType, syncMode, createDefaultWallets = false)

        return walletFactory.wallet(coin, account, syncMode)
    }
}

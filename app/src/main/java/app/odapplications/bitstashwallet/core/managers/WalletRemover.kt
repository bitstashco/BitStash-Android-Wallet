package app.odapplications.bitstashwallet.core.managers

import app.odapplications.bitstashwallet.core.IAccountManager
import app.odapplications.bitstashwallet.core.IWalletManager

class WalletRemover(accountManager: IAccountManager, private val walletManager: IWalletManager) {

    val disposable = accountManager.deleteAccountObservable.subscribe {
        handleDelete(it)
    }

    private fun handleDelete(accountId: String) {
        val remainingWallets = walletManager.wallets.filter { it.account.id != accountId }
        walletManager.enable(remainingWallets)
    }
}

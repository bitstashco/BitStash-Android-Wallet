package io.horizontalsystems.bitstashwallet.core.managers

import io.horizontalsystems.bitstashwallet.core.IAccountManager
import io.horizontalsystems.bitstashwallet.core.IWalletManager

class WalletRemover(accountManager: IAccountManager, private val walletManager: IWalletManager) {

    val disposable = accountManager.deleteAccountObservable.subscribe {
        handleDelete(it)
    }

    private fun handleDelete(accountId: String) {
        val remainingWallets = walletManager.wallets.filter { it.account.id != accountId }
        walletManager.enable(remainingWallets)
    }
}

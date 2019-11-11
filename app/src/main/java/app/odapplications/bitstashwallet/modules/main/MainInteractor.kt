package app.odapplications.bitstashwallet.modules.main

import app.odapplications.bitstashwallet.core.IAccountManager
import app.odapplications.bitstashwallet.core.IAdapterManager
import app.odapplications.bitstashwallet.core.IWalletManager

class MainInteractor(private val accountManager: IAccountManager, private val walletManager: IWalletManager, private val adapterManager: IAdapterManager)
    : MainModule.IInteractor {

    var delegate: MainModule.IInteractorDelegate? = null

    override fun onStart() {
        accountManager.preloadAccounts()
        walletManager.loadWallets()
        adapterManager.preloadAdapters()

        accountManager.clearAccounts()
    }
}

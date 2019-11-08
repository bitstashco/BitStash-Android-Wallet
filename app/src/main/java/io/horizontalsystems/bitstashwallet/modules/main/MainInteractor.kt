package io.horizontalsystems.bitstashwallet.modules.main

import io.horizontalsystems.bitstashwallet.core.IAccountManager
import io.horizontalsystems.bitstashwallet.core.IAdapterManager
import io.horizontalsystems.bitstashwallet.core.IWalletManager

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

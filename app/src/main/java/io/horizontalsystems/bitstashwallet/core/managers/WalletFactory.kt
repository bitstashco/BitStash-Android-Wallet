package io.horizontalsystems.bitstashwallet.core.managers

import io.horizontalsystems.bitstashwallet.core.IWalletFactory
import io.horizontalsystems.bitstashwallet.entities.Account
import io.horizontalsystems.bitstashwallet.entities.Coin
import io.horizontalsystems.bitstashwallet.entities.SyncMode
import io.horizontalsystems.bitstashwallet.entities.Wallet

class WalletFactory : IWalletFactory {

    override fun wallet(coin: Coin, account: Account, syncMode: SyncMode?): Wallet {
        return Wallet(coin, account, syncMode)
    }

}

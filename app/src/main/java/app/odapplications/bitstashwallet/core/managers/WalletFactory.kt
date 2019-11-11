package app.odapplications.bitstashwallet.core.managers

import app.odapplications.bitstashwallet.core.IWalletFactory
import app.odapplications.bitstashwallet.entities.Account
import app.odapplications.bitstashwallet.entities.Coin
import app.odapplications.bitstashwallet.entities.SyncMode
import app.odapplications.bitstashwallet.entities.Wallet

class WalletFactory : IWalletFactory {

    override fun wallet(coin: Coin, account: Account, syncMode: SyncMode?): Wallet {
        return Wallet(coin, account, syncMode)
    }

}

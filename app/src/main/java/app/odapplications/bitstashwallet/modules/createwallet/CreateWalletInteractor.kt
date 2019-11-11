package app.odapplications.bitstashwallet.modules.createwallet

import app.odapplications.bitstashwallet.core.IAccountCreator
import app.odapplications.bitstashwallet.core.IAppConfigProvider
import app.odapplications.bitstashwallet.entities.Coin

class CreateWalletInteractor(
        private val appConfigProvider: IAppConfigProvider,
        private val accountCreator: IAccountCreator
) : CreateWalletModule.IInteractor {

    override val featuredCoins: List<Coin>
        get() = appConfigProvider.featuredCoins

    override fun createWallet(coin: Coin) {
        accountCreator.createNewAccount(coin)
    }
}

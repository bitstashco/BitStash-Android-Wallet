package io.horizontalsystems.bitstashwallet.modules.createwallet

import io.horizontalsystems.bitstashwallet.core.IAccountCreator
import io.horizontalsystems.bitstashwallet.core.IAppConfigProvider
import io.horizontalsystems.bitstashwallet.entities.Coin

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

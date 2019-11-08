package io.horizontalsystems.bitstashwallet.modules.createwallet

import io.horizontalsystems.bitstashwallet.entities.Coin

class CoinViewItemFactory {
    fun createItems(coins: List<Coin>, selected: Int): List<CreateWalletModule.CoinViewItem> {
        return coins.mapIndexed { index, coin ->
            CreateWalletModule.CoinViewItem(coin.title, coin.code, index == selected)
        }
    }
}

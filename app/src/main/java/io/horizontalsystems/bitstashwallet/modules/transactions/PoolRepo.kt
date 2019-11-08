package io.horizontalsystems.bitstashwallet.modules.transactions

import io.horizontalsystems.bitstashwallet.entities.Wallet

class PoolRepo {

    val activePools: List<Pool>
        get() = activePoolWallets.mapNotNull { pools[it] }

    val allPools: List<Pool>
        get() = pools.values.toList()

    private var pools = mutableMapOf<Wallet, Pool>()
    private var activePoolWallets = listOf<Wallet>()

    fun activatePools(wallets: List<Wallet>) {
        wallets.forEach { wallet ->
            if (!pools.containsKey(wallet)) {
                pools[wallet] = Pool(Pool.State(wallet))
            }
        }

        this.activePoolWallets = wallets
    }

    fun deactivatePools(wallets: List<Wallet>) {
        wallets.forEach { pools.remove(it) }
    }

    fun getPool(wallet: Wallet): Pool? {
        return pools[wallet]
    }

    fun isPoolActiveByWallet(wallet: Wallet): Boolean {
        return activePoolWallets.contains(wallet)
    }

}

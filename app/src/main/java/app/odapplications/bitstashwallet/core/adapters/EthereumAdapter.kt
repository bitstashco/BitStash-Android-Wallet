package app.odapplications.bitstashwallet.core.adapters

import app.odapplications.bitstashwallet.core.AdapterState
import app.odapplications.bitstashwallet.core.App
import app.odapplications.bitstashwallet.entities.TransactionAddress
import app.odapplications.bitstashwallet.entities.TransactionRecord
import io.horizontalsystems.ethereumkit.core.EthereumKit
import io.horizontalsystems.ethereumkit.models.TransactionInfo
import io.reactivex.Flowable
import io.reactivex.Single
import java.math.BigDecimal

class EthereumAdapter(kit: EthereumKit)
    : EthereumBaseAdapter(kit, decimal) {

    override fun sendSingle(address: String, amount: String, gasPrice: Long): Single<Unit> {
        return ethereumKit.send(address, amount, gasPrice).map { Unit }
    }

    // IBalanceAdapter

    override val state: AdapterState
        get() = when (ethereumKit.syncState) {
            is EthereumKit.SyncState.Synced -> AdapterState.Synced
            is EthereumKit.SyncState.NotSynced -> AdapterState.NotSynced
            is EthereumKit.SyncState.Syncing -> AdapterState.Syncing(50, null)
        }

    override val stateUpdatedFlowable: Flowable<Unit>
        get() = ethereumKit.syncStateFlowable.map { Unit }

    override val balance: BigDecimal
        get() = balanceInBigDecimal(ethereumKit.balance, decimal)

    override val balanceUpdatedFlowable: Flowable<Unit>
        get() = ethereumKit.balanceFlowable.map { Unit }

    // ITransactionsAdapter

    override fun getTransactions(from: Pair<String, Int>?, limit: Int): Single<List<TransactionRecord>> {
        return ethereumKit.transactions(from?.first, limit).map {
            it.map { tx -> transactionRecord(tx) }
        }
    }

    override val transactionRecordsFlowable: Flowable<List<TransactionRecord>>
        get() = ethereumKit.transactionsFlowable.map { it.map { tx -> transactionRecord(tx) } }


    private fun transactionRecord(transaction: TransactionInfo): TransactionRecord {
        val mineAddress = ethereumKit.receiveAddress

        val fromAddressHex = transaction.from
        val from = TransactionAddress(fromAddressHex, fromAddressHex == mineAddress)

        val toAddressHex = transaction.to
        val to = TransactionAddress(toAddressHex, toAddressHex == mineAddress)

        var amount = BigDecimal.ZERO

        if (from.mine) {
            amount -= transaction.value.toBigDecimal()
        }
        if (to.mine) {
            amount += transaction.value.toBigDecimal()
        }

        val fee = transaction.gasUsed?.toBigDecimal()?.multiply(transaction.gasPrice.toBigDecimal())?.movePointLeft(decimal)

        return TransactionRecord(
                transactionHash = transaction.hash,
                transactionIndex = transaction.transactionIndex ?: 0,
                interTransactionIndex = 0,
                blockHeight = transaction.blockNumber,
                amount = amount.movePointLeft(decimal),
                fee = fee,
                timestamp = transaction.timestamp,
                from = listOf(from),
                to = listOf(to)
        )
    }

    // ISendEthereumAdapter

    override val ethereumBalance: BigDecimal
        get() = balance

    override fun availableBalance(gasPrice: Long): BigDecimal {
        return BigDecimal.ZERO.max(balance - fee(gasPrice))
    }

    override fun fee(gasPrice: Long): BigDecimal {
        return ethereumKit.fee(gasPrice).movePointLeft(decimal)
    }

    companion object {
        const val decimal = 18

        fun clear(walletId: String, testMode: Boolean) {
            val networkType = if (testMode) EthereumKit.NetworkType.Ropsten else EthereumKit.NetworkType.MainNet
            EthereumKit.clear(App.instance, networkType, walletId)
        }
    }

}

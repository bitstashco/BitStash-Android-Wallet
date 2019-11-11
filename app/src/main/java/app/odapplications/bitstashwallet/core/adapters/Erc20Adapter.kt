package app.odapplications.bitstashwallet.core.adapters

import android.content.Context
import app.odapplications.bitstashwallet.core.AdapterState
import app.odapplications.bitstashwallet.core.App
import app.odapplications.bitstashwallet.entities.TransactionAddress
import app.odapplications.bitstashwallet.entities.TransactionRecord
import io.horizontalsystems.erc20kit.core.Erc20Kit
import io.horizontalsystems.erc20kit.core.Erc20Kit.SyncState
import io.horizontalsystems.erc20kit.core.TransactionKey
import io.horizontalsystems.erc20kit.models.TransactionInfo
import io.horizontalsystems.ethereumkit.core.EthereumKit
import io.horizontalsystems.ethereumkit.core.hexStringToByteArray
import io.reactivex.Flowable
import io.reactivex.Single
import java.math.BigDecimal

class Erc20Adapter(context: Context, kit: EthereumKit, decimal: Int, private val fee: BigDecimal, contractAddress: String, gasLimit: Long)
    : EthereumBaseAdapter(kit, decimal) {

    private val erc20Kit: Erc20Kit = Erc20Kit.getInstance(context, ethereumKit, contractAddress, gasLimit)

    // IBalanceAdapter

    override val state: AdapterState
        get() = when (erc20Kit.syncState) {
            is SyncState.Synced -> AdapterState.Synced
            is SyncState.NotSynced -> AdapterState.NotSynced
            is SyncState.Syncing -> AdapterState.Syncing(50, null)
        }

    override val stateUpdatedFlowable: Flowable<Unit>
        get() = erc20Kit.syncStateFlowable.map { Unit }

    override val balance: BigDecimal
        get() = balanceInBigDecimal(erc20Kit.balance, decimal)

    override val balanceUpdatedFlowable: Flowable<Unit>
        get() = erc20Kit.balanceFlowable.map { Unit }

    // ITransactionsAdapter

    override fun getTransactions(from: Pair<String, Int>?, limit: Int): Single<List<TransactionRecord>> {
        return erc20Kit.transactions(from?.let { TransactionKey(it.first.hexStringToByteArray(), it.second) }, limit).map {
            it.map { tx -> transactionRecord(tx) }
        }
    }

    override val transactionRecordsFlowable: Flowable<List<TransactionRecord>>
        get() = erc20Kit.transactionsFlowable.map { it.map { tx -> transactionRecord(tx) } }

    // ISendEthereumAdapter

    override fun sendSingle(address: String, amount: String, gasPrice: Long): Single<Unit> {
        return erc20Kit.send(address, amount, gasPrice).map { Unit }
    }

    override fun availableBalance(gasPrice: Long): BigDecimal {
        return balance - fee
    }

    override val ethereumBalance: BigDecimal
        get() = balanceInBigDecimal(ethereumKit.balance, EthereumAdapter.decimal)

    override fun fee(gasPrice: Long): BigDecimal {
        return erc20Kit.fee(gasPrice).movePointLeft(EthereumAdapter.decimal)
    }

    private fun transactionRecord(transaction: TransactionInfo): TransactionRecord {
        val mineAddress = ethereumKit.receiveAddress

        val from = TransactionAddress(transaction.from, transaction.from == mineAddress)
        val to = TransactionAddress(transaction.to, transaction.to == mineAddress)

        var amount = BigDecimal.ZERO

        if (from.mine) {
            amount -= transaction.value.toBigDecimal()
        }
        if (to.mine) {
            amount += transaction.value.toBigDecimal()
        }

        return TransactionRecord(
                transactionHash = transaction.transactionHash,
                transactionIndex = transaction.transactionIndex ?: 0,
                interTransactionIndex = transaction.interTransactionIndex,
                blockHeight = transaction.blockNumber,
                amount = amount.movePointLeft(decimal),
                timestamp = transaction.timestamp,
                from = listOf(from),
                to = listOf(to)
        )
    }

    companion object {
        fun clear(walletId: String, testMode: Boolean) {
            val networkType = if (testMode) EthereumKit.NetworkType.Ropsten else EthereumKit.NetworkType.MainNet
            Erc20Kit.clear(App.instance, networkType, walletId)
        }
    }

}

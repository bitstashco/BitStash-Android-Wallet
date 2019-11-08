package io.horizontalsystems.bitstashwallet.modules.transactions

import androidx.recyclerview.widget.DiffUtil
import io.horizontalsystems.bitstashwallet.entities.Coin
import io.horizontalsystems.bitstashwallet.entities.TransactionItem
import io.horizontalsystems.bitstashwallet.entities.TransactionRecord
import io.horizontalsystems.bitstashwallet.entities.Wallet
import java.util.concurrent.CopyOnWriteArrayList

class TransactionItemDataSource {
    val count
        get() = items.size

    private val items = CopyOnWriteArrayList<TransactionItem>()

    fun clear() {
        items.clear()
    }

    fun add(items: List<TransactionItem>) {
        this.items.addAll(items)
    }

    fun itemForIndex(index: Int): TransactionItem = items[index]

    fun itemIndexesForTimestamp(coin: Coin, timestamp: Long): List<Int> {
        val indexes = mutableListOf<Int>()

        items.forEachIndexed { index, transactionItem ->
            if (transactionItem.wallet.coin == coin && transactionItem.record.timestamp == timestamp) {
                indexes.add(index)
            }
        }

        return indexes
    }

    fun itemIndexesForPending(wallet: Wallet, thresholdBlockHeight: Int): List<Int> {
        val indexes = mutableListOf<Int>()

        items.forEachIndexed { index, item ->
            if (item.wallet == wallet && (item.record.blockHeight == null || item.record.blockHeight >= thresholdBlockHeight)) {
                indexes.add(index)
            }
        }

        return indexes
    }

    fun handleModifiedItems(updatedItems: List<TransactionItem>, insertedItems: List<TransactionItem>): DiffUtil.DiffResult {
        val tmpList = items.toMutableList()
        tmpList.removeAll(updatedItems)
        tmpList.addAll(updatedItems)
        tmpList.addAll(insertedItems)
        tmpList.sortDescending()

        val diffCallback = TransactionDiffCallback(items.toList(), tmpList)
        val diffResult = DiffUtil.calculateDiff(diffCallback)

        items.clear()
        items.addAll(tmpList)

        return diffResult
    }

    fun shouldInsertRecord(record: TransactionRecord): Boolean {
        return items.lastOrNull()?.record?.let { it < record } ?: true
    }
}

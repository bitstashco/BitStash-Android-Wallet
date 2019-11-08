package io.horizontalsystems.bitstashwallet.modules.transactions

import androidx.recyclerview.widget.DiffUtil
import io.horizontalsystems.bitstashwallet.entities.TransactionItem

class TransactionDiffCallback(private val oldTxList: List<TransactionItem>, private val newTxList: List<TransactionItem>)
    : DiffUtil.Callback() {

    override fun getOldListSize(): Int {
        return oldTxList.size
    }

    override fun getNewListSize(): Int {
        return newTxList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldTxList[oldItemPosition] == newTxList[newItemPosition]
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val old = oldTxList[oldItemPosition].record
        val new = newTxList[newItemPosition].record

        return old.blockHeight == new.blockHeight && old.timestamp == new.timestamp && old.interTransactionIndex == new.interTransactionIndex
    }
}

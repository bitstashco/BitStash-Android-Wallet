package io.horizontalsystems.bitstashwallet.modules.transactions

import io.horizontalsystems.bitstashwallet.entities.TransactionItem
import io.horizontalsystems.bitstashwallet.entities.TransactionRecord
import io.horizontalsystems.bitstashwallet.entities.Wallet

class TransactionItemFactory {

    fun createTransactionItem(wallet: Wallet, record: TransactionRecord): TransactionItem {
        return TransactionItem(wallet, record)
    }

}

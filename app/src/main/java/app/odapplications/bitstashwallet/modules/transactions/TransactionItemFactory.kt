package app.odapplications.bitstashwallet.modules.transactions

import app.odapplications.bitstashwallet.entities.TransactionItem
import app.odapplications.bitstashwallet.entities.TransactionRecord
import app.odapplications.bitstashwallet.entities.Wallet

class TransactionItemFactory {

    fun createTransactionItem(wallet: Wallet, record: TransactionRecord): TransactionItem {
        return TransactionItem(wallet, record)
    }

}

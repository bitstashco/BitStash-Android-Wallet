package app.odapplications.bitstashwallet.modules.fulltransactioninfo

import app.odapplications.bitstashwallet.entities.FullTransactionRecord
import app.odapplications.bitstashwallet.entities.Wallet

class FullTransactionInfoState(override val wallet: Wallet, override val transactionHash: String)
    : FullTransactionInfoModule.State {

    override var transactionRecord: FullTransactionRecord? = null
}

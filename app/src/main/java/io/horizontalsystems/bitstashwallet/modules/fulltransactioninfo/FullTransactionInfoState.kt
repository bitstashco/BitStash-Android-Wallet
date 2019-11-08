package io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo

import io.horizontalsystems.bitstashwallet.entities.FullTransactionRecord
import io.horizontalsystems.bitstashwallet.entities.Wallet

class FullTransactionInfoState(override val wallet: Wallet, override val transactionHash: String)
    : FullTransactionInfoModule.State {

    override var transactionRecord: FullTransactionRecord? = null
}

package app.odapplications.bitstashwallet.modules.transactions.transactionInfo

import androidx.lifecycle.ViewModel
import app.odapplications.bitstashwallet.SingleLiveEvent
import app.odapplications.bitstashwallet.entities.Wallet
import app.odapplications.bitstashwallet.modules.transactions.TransactionViewItem

class TransactionInfoViewModel : ViewModel(), TransactionInfoModule.View, TransactionInfoModule.Router {

    lateinit var delegate: TransactionInfoModule.ViewDelegate

    val transactionLiveData = SingleLiveEvent<TransactionViewItem>()
    val showFullInfoLiveEvent = SingleLiveEvent<Pair<String, Wallet>>()
    val showCopiedLiveEvent = SingleLiveEvent<Unit>()

    fun init() {
        TransactionInfoModule.init(this, this)
    }

    override fun showCopied() {
        showCopiedLiveEvent.call()
    }

    override fun openFullInfo(transactionHash: String, wallet: Wallet) {
        showFullInfoLiveEvent.value = Pair(transactionHash, wallet)
    }

    fun setViewItem(transactionViewItem: TransactionViewItem) {
        transactionLiveData.value = transactionViewItem
    }

    fun onClickTransactionId() {
        transactionLiveData.value?.let {
            delegate.onCopy(it.transactionHash)
        }
    }

    fun onClickOpenFullInfo() {
        transactionLiveData.value?.let {
            delegate.openFullInfo(it.transactionHash, it.wallet)
        }
    }

    fun onClickFrom() {
        transactionLiveData.value?.from?.let {
            delegate.onCopy(it)
        }
    }

    fun onClickTo() {
        transactionLiveData.value?.to?.let {
            delegate.onCopy(it)
        }
    }
}

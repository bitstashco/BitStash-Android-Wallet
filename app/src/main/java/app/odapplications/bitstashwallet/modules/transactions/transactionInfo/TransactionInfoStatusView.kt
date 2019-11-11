package app.odapplications.bitstashwallet.modules.transactions.transactionInfo

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import app.odapplications.bitstashwallet.R
import app.odapplications.bitstashwallet.core.App
import app.odapplications.bitstashwallet.modules.transactions.TransactionStatus
import app.odapplications.bitstashwallet.viewHelpers.LayoutHelper
import kotlinx.android.synthetic.main.view_transaction_info_status.view.*


open class TransactionInfoStatusView : ConstraintLayout {

    constructor(context: Context) : super(context) {
        initializeViews()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        initializeViews()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        initializeViews()
    }

    private fun initializeViews() {
        inflate(context, R.layout.view_transaction_info_status, this)
    }

    fun bind(transactionStatus: TransactionStatus) {
        progressBarWrapper.visibility = View.GONE
        statusIcon.visibility = View.GONE
        statusPendingText.visibility = View.GONE

        when (transactionStatus) {
            is TransactionStatus.Completed -> {
                statusIcon.setImageDrawable(LayoutHelper.d(R.drawable.ic_checkmark_green, App.instance))
                statusIcon.visibility = View.VISIBLE
                statusPendingText.visibility = View.VISIBLE
                statusPendingText.text = context.getString(R.string.TransactionInfo_Status_Confirmed)
            }
            is TransactionStatus.Processing -> {
                progressBarWrapper.visibility = View.VISIBLE
                fillProgress(transactionStatus)
            }
            else -> {
                statusIcon.setImageDrawable(LayoutHelper.d(R.drawable.ic_pending_grey, App.instance))
                statusIcon.visibility = View.VISIBLE
                statusPendingText.visibility = View.VISIBLE
                statusPendingText.text = context.getString(R.string.TransactionInfo_Status_Pending)
            }
        }
        invalidate()
    }

    private fun fillProgress(transactionStatus: TransactionStatus.Processing) {
        val bars = listOf(progressBar1, progressBar2, progressBar3)
        val filledBars = bars.size * transactionStatus.progress

        bars.forEachIndexed { index, bar ->
            bar.setImageResource(if (filledBars > 0.0 && index < filledBars)
                R.drawable.status_progress_bar_green else
                R.drawable.status_progress_bar_grey)
        }
    }

}

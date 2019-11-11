package app.odapplications.bitstashwallet.modules.send.submodules.fee

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import app.odapplications.bitstashwallet.R
import app.odapplications.bitstashwallet.core.App
import app.odapplications.bitstashwallet.entities.FeeRateInfo
import app.odapplications.bitstashwallet.viewHelpers.DateHelper
import app.odapplications.bitstashwallet.viewHelpers.TextHelper
import kotlinx.android.synthetic.main.view_send_fee.view.*

class SendFeeView : ConstraintLayout, FeeRatePrioritySelector.Listener {

    private var delegate: SendFeeModule.IViewDelegate? = null

    init {
        inflate(context, R.layout.view_send_fee, this)
    }

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    constructor(context: Context, lifecycleOwner: LifecycleOwner, sendFeeViewModel: SendFeeViewModel, feeIsAdjustable: Boolean, fragmentManager: FragmentManager) : super(context) {
        delegate = sendFeeViewModel.delegate

        txSpeedLayout.visibility = if (feeIsAdjustable) View.VISIBLE else View.GONE
        txSpeedLayout.setOnClickListener {
            delegate?.onClickFeeRatePriority()
        }

        sendFeeViewModel.primaryFee.observe(lifecycleOwner, Observer { txFeePrimary.text = " $it" })

        sendFeeViewModel.secondaryFee.observe(lifecycleOwner, Observer { fiatFee ->
            fiatFee?.let { txFeeSecondary.text = " | $it" }
        })

        sendFeeViewModel.duration.observe(lifecycleOwner, Observer { duration ->
            val txDurationString = DateHelper.getTxDurationString(context, duration)
            txDuration.text = context.getString(R.string.Duration_Within, txDurationString)
        })

        sendFeeViewModel.feePriority.observe(lifecycleOwner, Observer { feePriority ->
            txSpeedMenu.text = TextHelper.getFeeRatePriorityString(context, feePriority)
        })

        sendFeeViewModel.showFeePriorityOptions.observe(lifecycleOwner, Observer { feeRates ->
            FeeRatePrioritySelector
                    .newInstance(this, feeRates)
                    .show(fragmentManager, "fee_rate_priority_selector")
        })

        sendFeeViewModel.insufficientFeeBalanceError.observe(lifecycleOwner, Observer { error ->
            if (error != null) {
                feeError.visibility = View.VISIBLE
                txSpeedLayout.visibility = View.GONE
                feeLayout.visibility = View.GONE

                val coinCode = error.coin.code
                val tokenProtocol = error.coinProtocol
                val feeCoinTitle = error.feeCoin.title
                val formattedFee = App.numberFormatter.format(error.fee)

                feeError.text = context.getString(R.string.Send_Token_InsufficientFeeAlert, coinCode, tokenProtocol, feeCoinTitle, formattedFee)
            } else {
                feeError.visibility = View.GONE
                txSpeedLayout.visibility = if (feeIsAdjustable) View.VISIBLE else View.GONE
                feeLayout.visibility = View.VISIBLE
            }
        })

        delegate?.onViewDidLoad()
    }

    override fun onSelectFeeRate(feeRate: FeeRateInfo) {
        delegate?.onChangeFeeRate(feeRate)
    }

}

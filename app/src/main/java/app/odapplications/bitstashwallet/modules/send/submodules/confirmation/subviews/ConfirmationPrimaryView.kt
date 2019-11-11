package app.odapplications.bitstashwallet.modules.send.submodules.confirmation.subviews

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import app.odapplications.bitstashwallet.R
import app.odapplications.bitstashwallet.modules.send.submodules.confirmation.SendConfirmationModule
import kotlinx.android.synthetic.main.view_confirmation_primary_item_view.view.*

class ConfirmationPrimaryView : ConstraintLayout {

    init {
        inflate(context, R.layout.view_confirmation_primary_item_view, this)
    }

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    fun bind(primaryItemData: SendConfirmationModule.PrimaryItemData, onReceiverClick: (() -> (Unit))) {
        primaryName.text = primaryItemData.primaryName
        primaryAmount.text = primaryItemData.primaryAmount
        secondaryName.text = primaryItemData.secondaryName
        secondaryAmount.text = primaryItemData.secondaryAmount
        receiverView.text = primaryItemData.receiver
        receiverView.setOnClickListener { onReceiverClick.invoke() }

        primaryItemData.memo?.let {
            memoLayout.visibility = View.VISIBLE
            memoValue.text = it
        }
    }

}

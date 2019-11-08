package io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.views

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import io.horizontalsystems.bitstashwallet.R
import io.horizontalsystems.bitstashwallet.core.App
import io.horizontalsystems.bitstashwallet.entities.FullTransactionIcon
import kotlinx.android.synthetic.main.view_transaction_full_info_item.view.*

class FullTransactionInfoItemView : ConstraintLayout {

    init {
        inflate(context, R.layout.view_transaction_full_info_item, this)
    }

    private var attrTitle: String? = null
    private var attrValue: String? = null
    private var attrValueIcon: String? = null

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) { loadAttributes(attrs) }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) { loadAttributes(attrs) }

    fun bind(title: String? = null, value: String? = null, icon: FullTransactionIcon?, dimmed: Boolean = false, bottomBorder: Boolean = false) {
        txtTitle.text = title

        var address = false

        when (icon) {
            FullTransactionIcon.PERSON -> value?.let {
                address = true
                addressView.text = it
            }
            FullTransactionIcon.TOKEN -> value?.let {
                address = true
                addressView.text = it
                addressView.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.token, 0, 0, 0)
            }

            FullTransactionIcon.TIME -> showTypeIcon(R.drawable.pending_grey)
            FullTransactionIcon.BLOCK -> showTypeIcon(R.drawable.blocks)
            FullTransactionIcon.CHECK -> showTypeIcon(R.drawable.checkmark_grey)
        }

        when {
            address -> {
                valueText.visibility = View.GONE
                addressView.visibility = View.VISIBLE
            }
            else -> {
                valueText.text = value
                valueText.visibility = View.VISIBLE
                addressView.visibility = View.GONE
            }
        }

        if (dimmed) {
            valueText.setTextColor(valueText.resources.getColor(R.color.grey))
        }

        border.visibility = if (bottomBorder) View.VISIBLE else View.GONE
        invalidate()
    }

    fun bindSourceProvider(title: String, value: String?) {
        txtTitle.text = title
        sourceProviderText.text = value

        sourceProviderText.visibility = View.VISIBLE
        rightArrow.visibility = View.VISIBLE
        valueText.visibility = View.GONE
        addressView.visibility = View.GONE
    }

    private fun showTypeIcon(icon: Int) {
        typeIcon.setImageDrawable(ContextCompat.getDrawable(App.instance, icon))
        typeIcon.visibility = View.VISIBLE
    }

    private fun loadAttributes(attrs: AttributeSet) {
        val ta = context.obtainStyledAttributes(attrs, R.styleable.FullTransactionInfoItemView, 0, 0)
        try {
            attrTitle = ta.getString(R.styleable.FullTransactionInfoItemView_infoTitle)
            attrValue = ta.getString(R.styleable.FullTransactionInfoItemView_infoValue)
            attrValueIcon = ta.getString(R.styleable.FullTransactionInfoItemView_infoValueIcon)
        } finally {
            ta.recycle()
        }
    }

}

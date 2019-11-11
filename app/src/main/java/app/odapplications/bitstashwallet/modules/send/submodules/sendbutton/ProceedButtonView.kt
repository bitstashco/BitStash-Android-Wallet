package app.odapplications.bitstashwallet.modules.send.submodules.sendbutton

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout
import app.odapplications.bitstashwallet.R
import kotlinx.android.synthetic.main.view_button_proceed.view.*

class ProceedButtonView : ConstraintLayout {

    init {
        inflate(context, R.layout.view_button_proceed, this)
    }

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    fun bind(onClick: (() -> (Unit))? = null) {
        btnProceed.isEnabled = false
        btnProceed.setOnClickListener { onClick?.invoke() }
    }

    fun updateState(enabled: Boolean) {
        btnProceed.isEnabled = enabled
    }

}

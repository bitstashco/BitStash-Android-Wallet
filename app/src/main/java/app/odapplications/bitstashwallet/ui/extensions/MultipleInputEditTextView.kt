package app.odapplications.bitstashwallet.ui.extensions

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import app.odapplications.bitstashwallet.R
import kotlinx.android.synthetic.main.view_multiple_input_edit_text.view.*

class MultipleInputEditTextView : ConstraintLayout {

    init {
        inflate(context, R.layout.view_multiple_input_edit_text, this)
    }

    private var attrInputFromQRCode: Boolean = false
    private var attrInputFromClipboard: Boolean = false
    private var attrInputHint: String? = null
    private var attrInputMaxLines: Int = 1

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        loadAttributes(attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        loadAttributes(attrs)
    }

    private fun loadAttributes(attrs: AttributeSet) {
        val ta = context.obtainStyledAttributes(attrs, R.styleable.MultipleInputEditTextView, 0, 0)
        try {
            attrInputFromQRCode = ta.getBoolean(R.styleable.MultipleInputEditTextView_inputFromQRCode, false)
            attrInputFromClipboard = ta.getBoolean(R.styleable.MultipleInputEditTextView_inputFromClipboard, false)
            attrInputHint = ta.getString(R.styleable.MultipleInputEditTextView_inputHint)
            attrInputMaxLines = ta.getInt(R.styleable.MultipleInputEditTextView_inputMaxLines, 1)
        } finally {
            ta.recycle()
        }
    }

    var text: String
        get() = txtInput.text.toString()
        set(value) {
            txtInput.setText(value)
        }

    fun bind(onPaste: () -> Unit, onScan: (() -> Unit)? = null) {
        btnQRCodeScan.setOnClickListener {
            onScan?.invoke()
        }

        btnPaste.setOnClickListener {
            onPaste.invoke()
        }
    }

    override fun onFinishInflate() {
        super.onFinishInflate()

        btnQRCodeScan.visibility = if (attrInputFromQRCode) View.VISIBLE else View.GONE
        btnPaste.visibility = if (attrInputFromClipboard) View.VISIBLE else View.GONE

        txtInput.hint = attrInputHint
        txtInput.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {
                val string = s.toString()
                if (string.isEmpty()) {
                    btnQRCodeScan.visibility = if (attrInputFromQRCode) View.VISIBLE else View.GONE
                    btnPaste.visibility = if (attrInputFromClipboard) View.VISIBLE else View.GONE

                    btnDeleteInput.visibility = View.GONE
                } else {
                    btnQRCodeScan.visibility = View.GONE
                    btnPaste.visibility = View.GONE

                    btnDeleteInput.visibility = View.VISIBLE
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) = Unit
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) = Unit
        })

        btnDeleteInput.setOnClickListener {
            txtInput.text = null
        }

        txtInput.maxLines = attrInputMaxLines
    }

}

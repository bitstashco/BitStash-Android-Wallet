package app.odapplications.bitstashwallet.ui.dialogs

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentActivity
import app.odapplications.bitstashwallet.R
import app.odapplications.bitstashwallet.core.IPredefinedAccountType
import app.odapplications.bitstashwallet.entities.Coin
import app.odapplications.bitstashwallet.ui.extensions.CoinIconView
import app.odapplications.bitstashwallet.viewHelpers.bottomDialog

class ManageWalletsDialog(private val listener: Listener, private val coin: Coin, private val predefinedAccountType: IPredefinedAccountType)
    : DialogFragment() {

    interface Listener {
        fun onClickCreateKey()
        fun onClickRestoreKey() {}
        fun onCancel() {}
    }

    private lateinit var rootView: View
    private lateinit var addKeyTitle: TextView
    private lateinit var addKeySubtitle: TextView
    private lateinit var addKeyInfo: TextView
    private lateinit var addCoinIcon: CoinIconView
    private lateinit var btnCreateKey: Button
    private lateinit var btnRestoreKey: Button
    private lateinit var btnClose: ImageView

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        rootView = View.inflate(context, R.layout.fragment_bottom_manage_keys, null) as ViewGroup

        addKeyTitle = rootView.findViewById(R.id.addKeyTitle)
        addKeySubtitle = rootView.findViewById(R.id.addKeySubtitle)
        addKeyInfo = rootView.findViewById(R.id.addKeyInfo)
        addCoinIcon = rootView.findViewById(R.id.addKeyIcon)
        btnCreateKey = rootView.findViewById(R.id.btnYellow)
        btnRestoreKey = rootView.findViewById(R.id.btnGrey)
        btnClose = rootView.findViewById(R.id.closeButton)

        btnClose.setOnClickListener {
            dismiss()
            listener.onCancel()
        }

        bindContent()
        bindActions()

        return bottomDialog(activity, rootView)
    }

    override fun onCancel(dialog: DialogInterface) {
        super.onCancel(dialog)
        listener.onCancel()
    }

    private fun bindContent() {
        addCoinIcon.bind(coin)

        addKeyTitle.text = getString(R.string.AddCoin_Title, coin.title)
        addKeySubtitle.text = getString(predefinedAccountType.title)
        addKeyInfo.text = getString(R.string.AddCoin_Description, "${coin.title} (${coin.code})", getString(predefinedAccountType.coinCodes), getString(predefinedAccountType.title))
    }

    private fun bindActions() {
        btnCreateKey.setOnClickListener {
            listener.onClickCreateKey()
            dismiss()
        }

        btnRestoreKey.setOnClickListener {
            listener.onClickRestoreKey()
            dismiss()
        }
    }

    companion object {
        fun show(activity: FragmentActivity, listener: Listener, coin: Coin, predefinedAccountType: IPredefinedAccountType) {
            val fragment = ManageWalletsDialog(listener, coin, predefinedAccountType)
            val transaction = activity.supportFragmentManager.beginTransaction()

            transaction.add(fragment, "bottom_manage_keys_dialog")
            transaction.commitAllowingStateLoss()
        }
    }
}

package app.odapplications.bitstashwallet.modules.backup.eos

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.odapplications.bitstashwallet.BaseActivity
import app.odapplications.bitstashwallet.R
import app.odapplications.bitstashwallet.core.utils.ModuleCode
import app.odapplications.bitstashwallet.ui.extensions.TopMenuItem
import app.odapplications.bitstashwallet.viewHelpers.HudHelper
import app.odapplications.bitstashwallet.viewHelpers.TextHelper
import kotlinx.android.synthetic.main.activity_backup_eos.*
import kotlinx.android.synthetic.main.activity_manage_keys.shadowlessToolbar

class BackupEosActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_backup_eos)
        shadowlessToolbar.bind(getString(R.string.Backup_DisplayTitle), TopMenuItem(R.drawable.back, onClick = { onBackPressed() }))

        bind(intent.getStringExtra(ACCOUNT), intent.getStringExtra(ACTIVE_PRIVATE_KEY))
    }

    private fun bind(account: String, privateKey: String) {
        eosAccount.text = account
        eosAccount.bind { onCopy(account) }

        eosActivePrivateKey.text = privateKey
        eosActivePrivateKey.bind { onCopy(privateKey) }

        btnClose.setOnClickListener {
            setResult(BackupEosModule.RESULT_SHOW)
            finish()
        }

        imgQrCode.setImageBitmap(TextHelper.getQrCodeBitmap(privateKey, 120F))
    }

    private fun onCopy(text: String) {
        TextHelper.copyText(text)
        HudHelper.showSuccessMessage(R.string.Hud_Text_Copied)
    }

    companion object {
        const val ACCOUNT = "account"
        const val ACTIVE_PRIVATE_KEY = "active_private_key"

        fun start(context: AppCompatActivity, account: String, activePrivateKey: String) {
            val intent = Intent(context, BackupEosActivity::class.java).apply {
                putExtra(ACCOUNT, account)
                putExtra(ACTIVE_PRIVATE_KEY, activePrivateKey)
            }

            context.startActivityForResult(intent, ModuleCode.BACKUP_EOS)
        }
    }
}

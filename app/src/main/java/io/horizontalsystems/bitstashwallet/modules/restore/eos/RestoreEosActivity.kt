package io.horizontalsystems.bitstashwallet.modules.restore.eos

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.google.zxing.integration.android.IntentIntegrator
import io.horizontalsystems.bitstashwallet.BaseActivity
import io.horizontalsystems.bitstashwallet.R
import io.horizontalsystems.bitstashwallet.core.utils.ModuleField
import io.horizontalsystems.bitstashwallet.entities.AccountType
import io.horizontalsystems.bitstashwallet.modules.qrscanner.QRScannerModule
import io.horizontalsystems.bitstashwallet.ui.extensions.TopMenuItem
import io.horizontalsystems.bitstashwallet.viewHelpers.HudHelper
import kotlinx.android.synthetic.main.activity_restore_eos.*
import kotlinx.android.synthetic.main.activity_restore_words.shadowlessToolbar

class RestoreEosActivity : BaseActivity() {

    private lateinit var viewModel: RestoreEosViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restore_eos)

        shadowlessToolbar.bind(
                title = getString(R.string.Restore_Title),
                leftBtnItem = TopMenuItem(R.drawable.back, onClick = { onBackPressed() }),
                rightBtnItem = TopMenuItem(R.drawable.checkmark_orange, onClick = { onClickDone() })
        )

        viewModel = ViewModelProviders.of(this).get(RestoreEosViewModel::class.java)
        viewModel.init()

        viewModel.setAccount.observe(this, Observer {
            eosAccount.text = it
        })

        viewModel.setPrivateKey.observe(this, Observer {
            eosActivePrivateKey.text = it
        })

        viewModel.startQRScanner.observe(this, Observer {
            QRScannerModule.start(this)
        })

        viewModel.finishLiveEvent.observe(this, Observer { pair ->
            setResult(RESULT_OK, Intent().apply {
                putExtra(ModuleField.ACCOUNT_TYPE, AccountType.Eos(pair.first, pair.second))
            })

            finish()
        })

        viewModel.errorLiveEvent.observe(this, Observer { resId ->
            HudHelper.showErrorMessage(resId)
        })

        bindActions()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val scanResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, data)
        if (scanResult != null && !TextUtils.isEmpty(scanResult.contents)) {
            viewModel.delegate.onQRCodeScan(scanResult.contents)
        }
    }

    private fun onClickDone() {
        viewModel.delegate.onClickDone(
                eosAccount.text.trim(),
                eosActivePrivateKey.text.trim()
        )
    }

    private fun bindActions() {
        eosAccount.bind(onPaste = { viewModel.delegate.onPasteAccount() })
        eosActivePrivateKey.bind(
                onPaste = { viewModel.delegate.onPasteKey() },
                onScan = { viewModel.delegate.onClickScan() }
        )
    }
}

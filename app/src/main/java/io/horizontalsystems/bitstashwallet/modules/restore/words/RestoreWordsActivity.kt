package io.horizontalsystems.bitstashwallet.modules.restore.words

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import io.horizontalsystems.bitstashwallet.BaseActivity
import io.horizontalsystems.bitstashwallet.R
import io.horizontalsystems.bitstashwallet.core.putParcelableExtra
import io.horizontalsystems.bitstashwallet.core.utils.ModuleCode
import io.horizontalsystems.bitstashwallet.core.utils.ModuleField
import io.horizontalsystems.bitstashwallet.core.utils.Utils
import io.horizontalsystems.bitstashwallet.entities.AccountType
import io.horizontalsystems.bitstashwallet.entities.SyncMode
import io.horizontalsystems.bitstashwallet.modules.restore.options.RestoreOptionsModule
import io.horizontalsystems.bitstashwallet.ui.extensions.TopMenuItem
import io.horizontalsystems.bitstashwallet.viewHelpers.HudHelper
import kotlinx.android.synthetic.main.activity_restore_words.*

class RestoreWordsActivity : BaseActivity(), RestoreWordsAdapter.Listener {

    private lateinit var viewModel: RestoreWordsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_restore_words)
        shadowlessToolbar.bind(
                title = getString(R.string.Restore_Title),
                leftBtnItem = TopMenuItem(R.drawable.back, onClick = { onBackPressed() }),
                rightBtnItem = TopMenuItem(R.drawable.checkmark_orange, onClick = { viewModel.delegate.onDone() })
        )

        val wordsCount = intent.getIntExtra(ModuleField.WORDS_COUNT, 12)

        viewModel = ViewModelProviders.of(this).get(RestoreWordsViewModel::class.java)
        viewModel.init(wordsCount)

        viewModel.errorLiveData.observe(this, Observer {
            HudHelper.showErrorMessage(it)
        })

        viewModel.notifyRestored.observe(this, Observer {
            setResult(RESULT_OK, Intent().apply {
                putExtra(ModuleField.ACCOUNT_TYPE, AccountType.Mnemonic(viewModel.delegate.words, AccountType.Derivation.bip44, salt = null))
            })
            finish()
        })

        viewModel.startSyncModeModule.observe(this, Observer {
            RestoreOptionsModule.start(this, ModuleCode.RESTORE_OPTIONS)
        })

        recyclerInputs.adapter = RestoreWordsAdapter(wordsCount, this)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == ModuleCode.RESTORE_OPTIONS && data != null && resultCode == RESULT_OK) {
            val syncMode = data.getParcelableExtra<SyncMode>(ModuleField.SYNCMODE)
            val derivation = data.getParcelableExtra<AccountType.Derivation>(ModuleField.DERIVATION)

            val intent = Intent().apply {
                putExtra(ModuleField.ACCOUNT_TYPE, AccountType.Mnemonic(viewModel.delegate.words, derivation, salt = null))
                putParcelableExtra(ModuleField.SYNCMODE, syncMode)
            }

            setResult(RESULT_OK, intent)
            finish()
        }
    }

    //  WordsInputAdapter Listener

    override fun onChange(position: Int, word: String) {
        if (isUsingNativeKeyboard()) {
            viewModel.delegate.onChange(position, word)
        }
    }

    override fun onDone() {
        viewModel.delegate.onDone()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    //  Private

    private fun isUsingNativeKeyboard(): Boolean {
        if (Utils.isUsingCustomKeyboard(this)) {
            showCustomKeyboardAlert()
            return false
        }

        return true
    }
}

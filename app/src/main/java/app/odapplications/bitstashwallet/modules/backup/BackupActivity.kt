package app.odapplications.bitstashwallet.modules.backup

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import app.odapplications.bitstashwallet.BaseActivity
import app.odapplications.bitstashwallet.R
import app.odapplications.bitstashwallet.core.setOnSingleClickListener
import app.odapplications.bitstashwallet.core.utils.ModuleCode
import app.odapplications.bitstashwallet.entities.Account
import app.odapplications.bitstashwallet.modules.backup.eos.BackupEosModule
import app.odapplications.bitstashwallet.modules.backup.words.BackupWordsModule
import app.odapplications.bitstashwallet.modules.pin.PinModule
import kotlinx.android.synthetic.main.activity_backup.*
import kotlinx.android.synthetic.main.activity_backup_words.buttonBack
import kotlinx.android.synthetic.main.activity_backup_words.buttonNext

class BackupActivity : BaseActivity() {

    private lateinit var viewModel: BackupViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_backup)

        val account = intent.getParcelableExtra<Account>(ACCOUNT_KEY)
        val accountCoins = intent.getStringExtra(ACCOUNT_COINS)

        viewModel = ViewModelProviders.of(this).get(BackupViewModel::class.java)
        viewModel.init(account)

        buttonBack.setOnSingleClickListener { viewModel.delegate.onClickCancel() }
        buttonNext.setOnSingleClickListener { viewModel.delegate.onClickBackup() }

        viewModel.startPinModule.observe(this, Observer {
            PinModule.startForUnlock(this, ModuleCode.UNLOCK_PIN)
        })

        viewModel.startBackupWordsModule.observe(this, Observer {
            BackupWordsModule.start(this, it, account.isBackedUp)
        })

        viewModel.startBackupEosModule.observe(this, Observer {
            BackupEosModule.start(this, it.first, it.second)
        })

        viewModel.closeLiveEvent.observe(this, Observer {
            finish()
        })

        backupIntro.text = getString(R.string.Backup_Intro_Subtitle, accountCoins)

        if (account.isBackedUp) {
            backupTitle.text = getString(R.string.Backup_Intro_TitleShow)
            buttonBack.text = getString(R.string.Button_Close)
            buttonNext.text = getString(R.string.Backup_Button_ShowKey)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        when (requestCode) {
            ModuleCode.BACKUP_WORDS -> {
                when (resultCode) {
                    BackupWordsModule.RESULT_BACKUP -> {
                        viewModel.delegate.didBackup()
                    }
                }
                finish()
            }
            ModuleCode.BACKUP_EOS -> {
                finish()
            }
            ModuleCode.UNLOCK_PIN -> {
                when (resultCode) {
                    PinModule.RESULT_OK -> viewModel.delegate.didUnlock()
                    PinModule.RESULT_CANCELLED -> viewModel.delegate.didCancelUnlock()
                }
            }
        }
    }

    override fun onBackPressed() {
        viewModel.delegate.onClickCancel()
    }

    companion object {
        const val ACCOUNT_KEY = "account_key"
        const val ACCOUNT_COINS = "account_coins"

        fun start(context: Context, account: Account, coinCodes: String) {
            val intent = Intent(context, BackupActivity::class.java).apply {
                putExtra(ACCOUNT_KEY, account)
                putExtra(ACCOUNT_COINS, coinCodes)
            }

            context.startActivity(intent)
        }
    }
}

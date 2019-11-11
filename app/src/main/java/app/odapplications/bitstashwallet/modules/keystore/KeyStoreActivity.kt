package app.odapplications.bitstashwallet.modules.keystore

import android.app.Activity
import android.app.KeyguardManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import app.odapplications.bitstashwallet.R
import app.odapplications.bitstashwallet.ui.dialogs.AlertDialogFragment
import app.odapplications.bitstashwallet.modules.launcher.LaunchModule
import kotlinx.android.synthetic.main.activity_keystore.*

class KeyStoreActivity : AppCompatActivity() {

    private lateinit var viewModel: KeyStoreViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_keystore)

        val mode = intent.getParcelableExtra<KeyStoreModule.ModeType>(KeyStoreModule.MODE)

        viewModel = ViewModelProviders.of(this).get(KeyStoreViewModel::class.java)
        viewModel.init(mode)

        viewModel.showNoSystemLockWarning.observe(this, Observer {
            noSystemLockWarning.visibility = View.VISIBLE
        })

        viewModel.showInvalidKeyWarning.observe(this, Observer {
            AlertDialogFragment.newInstance(R.string.Alert_KeysInvalidatedTitle, R.string.Alert_KeysInvalidatedDescription, R.string.Alert_Ok, false,
                    object : AlertDialogFragment.Listener {
                        override fun onButtonClick() {
                            viewModel.delegate.onCloseInvalidKeyWarning()
                        }
                    }).show(supportFragmentManager, "keys_invalidated_alert")
        })

        viewModel.promptUserAuthentication.observe(this, Observer {
            val mKeyguardManager = getSystemService(Context.KEYGUARD_SERVICE) as KeyguardManager
            val intent: Intent? = mKeyguardManager.createConfirmDeviceCredentialIntent(
                    getString(R.string.OSPin_Confirm_Title),
                    getString(R.string.OSPin_Prompt_Desciption)
            )
            startActivityForResult(intent, REQUEST_CODE_AUTHENTICATION)
        })

        viewModel.openLaunchModule.observe(this, Observer {
            LaunchModule.start(this)
        })

        viewModel.closeApplication.observe(this, Observer {
            finishAffinity()
        })
    }

    override fun onResume() {
        super.onResume()

        viewModel.delegate.onResume()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQUEST_CODE_AUTHENTICATION) {
            when (resultCode) {
                Activity.RESULT_OK -> {
                    viewModel.delegate.onAuthenticationSuccess()
                }
                Activity.RESULT_CANCELED -> {
                    viewModel.delegate.onAuthenticationCanceled()
                }
            }
        }
    }

    companion object {
        const val REQUEST_CODE_AUTHENTICATION = 1
    }

}

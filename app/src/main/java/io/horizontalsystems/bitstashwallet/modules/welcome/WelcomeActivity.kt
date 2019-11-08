package io.horizontalsystems.bitstashwallet.modules.welcome

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import io.horizontalsystems.bitstashwallet.BaseActivity
import io.horizontalsystems.bitstashwallet.BuildConfig
import io.horizontalsystems.bitstashwallet.R
import io.horizontalsystems.bitstashwallet.core.setOnSingleClickListener
import io.horizontalsystems.bitstashwallet.modules.createwallet.CreateWalletModule
import io.horizontalsystems.bitstashwallet.modules.restore.RestoreModule
import kotlinx.android.synthetic.main.activity_welcome.*


class WelcomeActivity : BaseActivity() {

    private lateinit var viewModel: WelcomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTransparentStatusBar()

        setContentView(R.layout.activity_welcome)

        viewModel = ViewModelProviders.of(this).get(WelcomeViewModel::class.java)
        viewModel.init()

        viewModel.openRestoreModule.observe(this, Observer {
            RestoreModule.start(this)
        })

        viewModel.openCreateWalletModule.observe(this, Observer {
            CreateWalletModule.start(this)
        })

        viewModel.appVersionLiveData.observe(this, Observer { appVersion ->
            appVersion?.let {
                var version = it
                if (getString(R.string.is_release) == "false") {
                    version = "$version (${BuildConfig.VERSION_CODE})"
                }
                textVersion.text = getString(R.string.Welcome_Version, version)
            }
        })

        buttonCreate.setOnSingleClickListener {
            viewModel.delegate.createWalletDidClick()
        }

        buttonRestore.setOnSingleClickListener {
            viewModel.delegate.restoreWalletDidClick()
        }
    }

}

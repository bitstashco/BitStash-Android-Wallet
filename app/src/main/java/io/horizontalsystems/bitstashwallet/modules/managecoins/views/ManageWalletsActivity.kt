package io.horizontalsystems.bitstashwallet.modules.managecoins.views

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import io.horizontalsystems.bitstashwallet.BaseActivity
import io.horizontalsystems.bitstashwallet.R
import io.horizontalsystems.bitstashwallet.core.EosUnsupportedException
import io.horizontalsystems.bitstashwallet.core.utils.ModuleCode
import io.horizontalsystems.bitstashwallet.core.utils.ModuleField
import io.horizontalsystems.bitstashwallet.entities.AccountType
import io.horizontalsystems.bitstashwallet.modules.managecoins.ManageWalletsViewModel
import io.horizontalsystems.bitstashwallet.modules.restore.eos.RestoreEosModule
import io.horizontalsystems.bitstashwallet.modules.restore.words.RestoreWordsModule
import io.horizontalsystems.bitstashwallet.ui.dialogs.AlertDialogFragment
import io.horizontalsystems.bitstashwallet.ui.dialogs.ManageWalletsDialog
import io.horizontalsystems.bitstashwallet.ui.extensions.TopMenuItem
import kotlinx.android.synthetic.main.activity_manage_coins.*

class ManageWalletsActivity : BaseActivity(), ManageWalletsDialog.Listener {

    private lateinit var viewModel: ManageWalletsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manage_coins)

        viewModel = ViewModelProviders.of(this).get(ManageWalletsViewModel::class.java)
        viewModel.init()

        val adapter = ManageWalletsAdapter(viewModel.delegate)
        recyclerView.adapter = adapter

        shadowlessToolbar.bind(
                title = getString(R.string.ManageCoins_title),
                leftBtnItem = TopMenuItem(R.drawable.back, onClick = { onBackPressed() }),
                rightBtnItem = TopMenuItem(R.drawable.checkmark_orange, onClick = { viewModel.delegate.saveChanges() })
        )

        viewModel.coinsLoadedLiveEvent.observe(this, Observer {
            adapter.notifyDataSetChanged()
        })

        viewModel.showManageKeysDialog.observe(this, Observer { (coin, predefinedAccountType) ->
            ManageWalletsDialog.show(this, this, coin, predefinedAccountType)
        })

        viewModel.openRestoreWordsModule.observe(this, Observer { wordsCount ->
            RestoreWordsModule.startForResult(this, wordsCount, ModuleCode.RESTORE_WORDS)
        })

        viewModel.openRestoreEosModule.observe(this, Observer {
            RestoreEosModule.startForResult(this, ModuleCode.RESTORE_EOS)
        })

        viewModel.showErrorEvent.observe(this, Observer {
            if (it is EosUnsupportedException) {
                AlertDialogFragment.newInstance(
                        R.string.Alert_TitleWarning,
                        R.string.ManageCoins_EOSAlert_CreateButton,
                        R.string.Alert_Ok
                ).show(supportFragmentManager, "alert_dialog")

                onCancel() // will uncheck coin
            }
        })

        viewModel.closeLiveDate.observe(this, Observer {
            finish()
        })
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (data == null || resultCode != RESULT_OK)
            return

        val accountType = data.getParcelableExtra<AccountType>(ModuleField.ACCOUNT_TYPE)

        when (requestCode) {
            ModuleCode.RESTORE_WORDS -> {
                viewModel.delegate.onRestore(accountType, data.getParcelableExtra(ModuleField.SYNCMODE))
            }
            ModuleCode.RESTORE_EOS -> {
                viewModel.delegate.onRestore(accountType)
            }
        }
    }

    //  ManageWalletsDialog listener

    override fun onClickCreateKey() {
        viewModel.delegate.onClickCreateKey()
    }

    override fun onClickRestoreKey() {
        viewModel.delegate.onClickRestoreKey()
    }

    override fun onCancel() {
        viewModel.delegate.onClickCancel()
    }
}

package io.horizontalsystems.bitstashwallet.modules.settings.managekeys.views

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
import io.horizontalsystems.bitstashwallet.modules.backup.BackupModule
import io.horizontalsystems.bitstashwallet.modules.restore.eos.RestoreEosModule
import io.horizontalsystems.bitstashwallet.modules.restore.words.RestoreWordsModule
import io.horizontalsystems.bitstashwallet.modules.settings.managekeys.ManageKeysViewModel
import io.horizontalsystems.bitstashwallet.ui.dialogs.AlertDialogFragment
import io.horizontalsystems.bitstashwallet.ui.dialogs.ManageKeysDeleteAlert
import io.horizontalsystems.bitstashwallet.ui.dialogs.ManageKeysDialog
import io.horizontalsystems.bitstashwallet.ui.dialogs.ManageKeysDialog.ManageAction
import io.horizontalsystems.bitstashwallet.ui.extensions.TopMenuItem
import kotlinx.android.synthetic.main.activity_manage_keys.*

class ManageKeysActivity : BaseActivity(), ManageKeysDialog.Listener {

    private lateinit var viewModel: ManageKeysViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(ManageKeysViewModel::class.java)
        viewModel.init()

        setContentView(R.layout.activity_manage_keys)
        shadowlessToolbar.bind(getString(R.string.ManageKeys_Title), TopMenuItem(R.drawable.back, onClick = { onBackPressed() }))

        val adapter = ManageKeysAdapter(viewModel)
        recyclerView.adapter = adapter

        viewModel.confirmUnlinkEvent.observe(this, Observer { item ->
            item.account?.let { account ->

                val confirmationList = listOf(
                        getString(R.string.ManageKeys_Delete_ConfirmationRemove, getString(item.predefinedAccountType.title)),
                        getString(R.string.ManageKeys_Delete_ConfirmationDisable, getString(item.predefinedAccountType.coinCodes)),
                        getString(R.string.ManageKeys_Delete_ConfirmationLose)
                )

                val confirmListener = object : ManageKeysDeleteAlert.Listener {
                    override fun onConfirmationSuccess() {
                        viewModel.delegate.onConfirmUnlink(account.id)
                    }
                }

                ManageKeysDeleteAlert.show(this, getString(item.predefinedAccountType.title), confirmationList, confirmListener)
            }
        })

        viewModel.confirmCreateEvent.observe(this, Observer {
            val title = getString(R.string.ManageCoins_AddCoin_Title)
            val subtitle = getString(it.predefinedAccountType.title)
            val description = getString(R.string.ManageCoins_AddCoin_Text, getString(it.predefinedAccountType.coinCodes))
            ManageKeysDialog.show(title, subtitle, description, this, this, ManageAction.CREATE)
        })

        viewModel.confirmBackupEvent.observe(this, Observer {
            val title = getString(R.string.ManageKeys_Delete_Alert_Title)
            val subtitle = getString(it.predefinedAccountType.title)
            val keyName = getString(it.predefinedAccountType.title)
            val description = getString(R.string.ManageKeys_Delete_Alert)
            ManageKeysDialog.show(title, subtitle, description, this, this, ManageAction.BACKUP)
        })

        viewModel.showErrorEvent.observe(this, Observer {
            if (it is EosUnsupportedException) {
                AlertDialogFragment.newInstance(
                        R.string.Alert_TitleWarning,
                        R.string.ManageCoins_EOSAlert_CreateButton,
                        R.string.Alert_Ok
                ).show(supportFragmentManager, "alert_dialog")
            }
        })

        viewModel.startBackupModuleLiveEvent.observe(this, Observer {
            it.account?.let { account ->
                BackupModule.start(this, account, getString(it.predefinedAccountType.coinCodes))
            }
        })

        viewModel.startRestoreWordsLiveEvent.observe(this, Observer { wordsCount ->
            RestoreWordsModule.startForResult(this, wordsCount, ModuleCode.RESTORE_WORDS)
        })

        viewModel.startRestoreEosLiveEvent.observe(this, Observer {
            RestoreEosModule.startForResult(this, ModuleCode.RESTORE_EOS)
        })

        viewModel.showItemsEvent.observe(this, Observer { list ->
            adapter.items = list
            adapter.notifyDataSetChanged()
        })

        viewModel.closeLiveEvent.observe(this, Observer {
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
                viewModel.delegate.onConfirmRestore(accountType, data.getParcelableExtra(ModuleField.SYNCMODE))
            }
            ModuleCode.RESTORE_EOS -> {
                viewModel.delegate.onConfirmRestore(accountType)
            }
        }
    }

    //  ManageKeysDialog Listener

    override fun onClickCreateKey() {
        viewModel.delegate.onConfirmCreate()
    }

    override fun onClickBackupKey() {
        viewModel.delegate.onConfirmBackup()
    }
}

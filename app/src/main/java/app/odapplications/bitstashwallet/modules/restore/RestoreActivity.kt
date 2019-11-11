package app.odapplications.bitstashwallet.modules.restore

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import app.odapplications.bitstashwallet.BaseActivity
import app.odapplications.bitstashwallet.R
import app.odapplications.bitstashwallet.core.IPredefinedAccountType
import app.odapplications.bitstashwallet.core.utils.ModuleCode
import app.odapplications.bitstashwallet.core.utils.ModuleField
import app.odapplications.bitstashwallet.entities.AccountType
import app.odapplications.bitstashwallet.modules.main.MainModule
import app.odapplications.bitstashwallet.modules.restore.eos.RestoreEosModule
import app.odapplications.bitstashwallet.modules.restore.words.RestoreWordsModule
import app.odapplications.bitstashwallet.ui.extensions.TopMenuItem
import app.odapplications.bitstashwallet.viewHelpers.HudHelper
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.activity_restore.*
import kotlinx.android.synthetic.main.view_holder_account_restore.*

class RestoreActivity : BaseActivity() {

    private lateinit var viewModel: RestoreViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_restore)
        shadowlessToolbar.bind(getString(R.string.Restore_Title), TopMenuItem(R.drawable.back, onClick = { onBackPressed() }))

        viewModel = ViewModelProviders.of(this).get(RestoreViewModel::class.java)
        viewModel.init()

        val adapter = RestoreNavigationAdapter(viewModel)
        recyclerView.adapter = adapter

        viewModel.reloadLiveEvent.observe(this, Observer {
            adapter.items = it
            adapter.notifyDataSetChanged()
        })

        viewModel.showErrorLiveEvent.observe(this, Observer {
            HudHelper.showErrorMessage(R.string.Restore_RestoreFailed)
        })

        viewModel.startRestoreWordsLiveEvent.observe(this, Observer { wordsCount ->
            RestoreWordsModule.startForResult(this, wordsCount, ModuleCode.RESTORE_WORDS)
        })

        viewModel.startRestoreEosLiveEvent.observe(this, Observer {
            RestoreEosModule.startForResult(this, ModuleCode.RESTORE_EOS)
        })

        viewModel.startMainModuleLiveEvent.observe(this, Observer {
            MainModule.startAsNewTask(this)
            finish()
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
                viewModel.delegate.onRestore(accountType, data.getParcelableExtra(ModuleField.SYNCMODE))
            }
            ModuleCode.RESTORE_EOS -> {
                viewModel.delegate.onRestore(accountType)
            }
        }
    }
}

class RestoreNavigationAdapter(private val viewModel: RestoreViewModel)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var items = listOf<IPredefinedAccountType>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return KeysViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.view_holder_account_restore, parent, false))
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val accountType = items[position]
        if (holder is KeysViewHolder) {
            holder.bind(accountType)
            holder.viewHolderRoot.setOnClickListener {
                viewModel.delegate.onSelect(accountType)
            }
        }
    }
}

class KeysViewHolder(override val containerView: View)
    : RecyclerView.ViewHolder(containerView), LayoutContainer {

    fun bind(accountType: IPredefinedAccountType) {
        val accountTypeTitle = containerView.resources.getString(accountType.title)
        accountName.text = containerView.resources.getString(R.string.Wallet, accountTypeTitle)
        accountCoin.text = containerView.resources.getString(accountType.coinCodes)
    }
}

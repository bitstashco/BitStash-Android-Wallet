package io.horizontalsystems.bitstashwallet.modules.restore

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import io.horizontalsystems.bitstashwallet.BaseActivity
import io.horizontalsystems.bitstashwallet.R
import io.horizontalsystems.bitstashwallet.core.IPredefinedAccountType
import io.horizontalsystems.bitstashwallet.core.utils.ModuleCode
import io.horizontalsystems.bitstashwallet.core.utils.ModuleField
import io.horizontalsystems.bitstashwallet.entities.AccountType
import io.horizontalsystems.bitstashwallet.modules.main.MainModule
import io.horizontalsystems.bitstashwallet.modules.restore.eos.RestoreEosModule
import io.horizontalsystems.bitstashwallet.modules.restore.words.RestoreWordsModule
import io.horizontalsystems.bitstashwallet.ui.extensions.TopMenuItem
import io.horizontalsystems.bitstashwallet.viewHelpers.HudHelper
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

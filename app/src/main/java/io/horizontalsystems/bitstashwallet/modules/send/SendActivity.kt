package io.horizontalsystems.bitstashwallet.modules.send

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.google.zxing.integration.android.IntentIntegrator
import io.horizontalsystems.bitstashwallet.BaseActivity
import io.horizontalsystems.bitstashwallet.R
import io.horizontalsystems.bitstashwallet.entities.Wallet
import io.horizontalsystems.bitstashwallet.modules.qrscanner.QRScannerModule
import io.horizontalsystems.bitstashwallet.modules.send.submodules.address.SendAddressView
import io.horizontalsystems.bitstashwallet.modules.send.submodules.address.SendAddressViewModel
import io.horizontalsystems.bitstashwallet.modules.send.submodules.amount.SendAmountView
import io.horizontalsystems.bitstashwallet.modules.send.submodules.amount.SendAmountViewModel
import io.horizontalsystems.bitstashwallet.modules.send.submodules.confirmation.ConfirmationFragment
import io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.SendFeeView
import io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.SendFeeViewModel
import io.horizontalsystems.bitstashwallet.modules.send.submodules.memo.SendMemoView
import io.horizontalsystems.bitstashwallet.modules.send.submodules.memo.SendMemoViewModel
import io.horizontalsystems.bitstashwallet.modules.send.submodules.sendbutton.ProceedButtonView
import io.horizontalsystems.bitstashwallet.ui.extensions.TopMenuItem
import io.horizontalsystems.bitstashwallet.viewHelpers.HudHelper
import io.horizontalsystems.bitstashwallet.viewHelpers.LayoutHelper
import kotlinx.android.synthetic.main.activity_send.*

class SendActivity : BaseActivity() {

    private lateinit var mainPresenter: SendModule.IViewDelegate
    private lateinit var mainViewModel: SendViewModel

    private var proceedButtonView: ProceedButtonView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send)

        val wallet: Wallet = intent.getParcelableExtra(WALLET) ?: run { finish(); return }

        val iconRes = LayoutHelper.getCoinDrawableResource(wallet.coin.code)

        shadowlessToolbar.bind(
                title = getString(R.string.Send_Title, wallet.coin.code),
                leftBtnItem = TopMenuItem(iconRes),
                rightBtnItem = TopMenuItem(R.drawable.close, onClick = { onBackPressed() })
        )

        mainViewModel = ViewModelProviders.of(this).get(SendViewModel::class.java)
        mainPresenter = mainViewModel.init(wallet)

        mainPresenter.onViewDidLoad()

        mainViewModel.inputItems.observe(this, Observer { inputItems ->
            addInputItems(wallet, inputItems)
        })

        mainViewModel.showSendConfirmation.observe(this, Observer {
            hideSoftKeyboard()

            val fragmentTransaction = supportFragmentManager
                    .beginTransaction()

            fragmentTransaction
                    .setCustomAnimations(R.anim.slide_in_from_right, R.anim.slide_out_to_right, R.anim.slide_in_from_right, R.anim.slide_out_to_right)
                    .add(R.id.rootView, ConfirmationFragment())
                    .addToBackStack("confirmFragment")
                    .commit()
        })

        mainViewModel.closeWithSuccess.observe(this, Observer {
            HudHelper.showSuccessMessage(R.string.Send_Success)
            finish()
        })

        mainViewModel.sendButtonEnabled.observe(this, Observer { enabled ->
            proceedButtonView?.updateState(enabled)
        })

        mainViewModel.scanQrCode.observe(this, Observer {
            QRScannerModule.start(this)
        })

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val scanResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, data)
        scanResult?.contents?.let {
            mainViewModel.delegate.onAddressScan(it)
        }
    }

    private fun addInputItems(wallet: Wallet, inputItems: List<SendModule.Input>) {
        inputItems.forEach { input ->
            when (input) {
                SendModule.Input.Amount -> {
                    //add amount view
                    val amountViewModel = ViewModelProviders.of(this).get(SendAmountViewModel::class.java)
                    val amountPresenter = amountViewModel.init(wallet, mainViewModel.amountModuleDelegate)

                    mainPresenter.handler.amountModule = amountPresenter

                    val amountView = SendAmountView(context = this, lifecycleOwner = this, sendAmountViewModel = amountViewModel)
                    sendLinearLayout.addView(amountView)
                    amountView.requestFocus()
                }
                SendModule.Input.Address -> {
                    //add address view
                    val addressViewModel = ViewModelProviders.of(this).get(SendAddressViewModel::class.java)
                    val addressPresenter = addressViewModel.init(wallet.coin, mainViewModel.addressModuleDelegate)

                    mainPresenter.handler.addressModule = addressPresenter

                    val sendAddressView = SendAddressView(context = this, lifecycleOwner = this, sendAddressViewModel = addressViewModel)
                    sendLinearLayout.addView(sendAddressView)
                }
                is SendModule.Input.Fee -> {
                    //add fee view
                    val feeViewModel = ViewModelProviders.of(this).get(SendFeeViewModel::class.java)
                    val feePresenter = feeViewModel.init(wallet.coin, mainViewModel.feeModuleDelegate)

                    mainPresenter.handler.feeModule = feePresenter

                    val sendFeeView = SendFeeView(context = this, lifecycleOwner = this, sendFeeViewModel = feeViewModel, feeIsAdjustable = input.isAdjustable, fragmentManager = supportFragmentManager)
                    sendLinearLayout.addView(sendFeeView)
                }
                is SendModule.Input.Memo -> {
                    //add memo view
                    val memoViewModel = ViewModelProviders.of(this).get(SendMemoViewModel::class.java)
                    val memoPresenter = memoViewModel.init(input.maxLength)

                    mainPresenter.handler.memoModule = memoPresenter

                    val sendMemoView = SendMemoView(context = this, lifecycleOwner = this, sendMemoViewModel = memoViewModel)
                    sendLinearLayout.addView(sendMemoView)
                }
                SendModule.Input.ProceedButton -> {
                    //add send button
                    proceedButtonView = ProceedButtonView(this)
                    proceedButtonView?.bind { mainPresenter.onProceedClicked() }
                    sendLinearLayout.addView(proceedButtonView)
                }
            }
        }

        mainPresenter.onModulesDidLoad()
    }

    companion object {
        const val WALLET = "wallet_key"
    }

}

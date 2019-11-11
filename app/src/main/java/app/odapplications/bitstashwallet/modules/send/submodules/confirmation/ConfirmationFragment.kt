package app.odapplications.bitstashwallet.modules.send.submodules.confirmation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import app.odapplications.bitstashwallet.R
import app.odapplications.bitstashwallet.core.WrongParameters
import app.odapplications.bitstashwallet.modules.send.SendViewModel
import app.odapplications.bitstashwallet.modules.send.submodules.confirmation.subviews.ConfirmationPrimaryView
import app.odapplications.bitstashwallet.modules.send.submodules.confirmation.subviews.ConfirmationSecondaryView
import app.odapplications.bitstashwallet.modules.send.submodules.confirmation.subviews.ConfirmationSendButtonView
import app.odapplications.bitstashwallet.ui.dialogs.AlertDialogFragment
import app.odapplications.bitstashwallet.ui.extensions.TopMenuItem
import app.odapplications.bitstashwallet.viewHelpers.HudHelper
import kotlinx.android.synthetic.main.fragment_confirmation.*
import java.net.UnknownHostException

class ConfirmationFragment : Fragment() {

    private var sendViewModel: SendViewModel? = null
    private var confirmationViewModel: SendConfirmationViewModel? = null
    private var sendButtonView: ConfirmationSendButtonView? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_confirmation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        shadowlessToolbar.bind(
                title = getString(R.string.Send_Confirmation_Title),
                leftBtnItem = TopMenuItem(R.drawable.back, onClick = { activity?.onBackPressed() }
        ))
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        activity?.let {
            sendViewModel = ViewModelProviders.of(it).get(SendViewModel::class.java)
        }

        confirmationViewModel = ViewModelProviders.of(this).get(SendConfirmationViewModel::class.java)

        sendViewModel?.confirmationViewItems?.observe(viewLifecycleOwner, Observer {
            confirmationViewModel?.init(it)
        })

        confirmationViewModel?.addPrimaryDataViewItem?.observe(viewLifecycleOwner, Observer { primaryViewItem ->
            context?.let {
                val primaryItemView = ConfirmationPrimaryView(it)
                primaryItemView.bind(primaryViewItem) { confirmationViewModel?.delegate?.onReceiverClick() }
                confirmationLinearLayout.addView(primaryItemView)
            }
        })

        confirmationViewModel?.showCopied?.observe(viewLifecycleOwner, Observer {
            HudHelper.showSuccessMessage(R.string.Hud_Text_Copied, 500)
        })

        confirmationViewModel?.addSecondaryDataViewItem?.observe(viewLifecycleOwner, Observer { secondaryData ->
            context?.let {
                val secondaryDataView = ConfirmationSecondaryView(it)
                secondaryDataView.bind(secondaryData)
                confirmationLinearLayout.addView(secondaryDataView)
            }
        })

        confirmationViewModel?.addSendButton?.observe(viewLifecycleOwner, Observer {
            context?.let {
                sendButtonView = ConfirmationSendButtonView(it)
                sendButtonView?.setOnClickListener {
                    sendButtonView?.bind(SendConfirmationModule.SendButtonState.SENDING)
                    sendViewModel?.delegate?.onSendConfirmed()
                }

                confirmationLinearLayout.addView(sendButtonView)
            }
        })

        sendViewModel?.error?.observe(viewLifecycleOwner, Observer { errorMsgTextRes ->
            errorMsgTextRes?.let { HudHelper.showErrorMessage(getErrorText(it)) }
            confirmationViewModel?.delegate?.onSendError()
        })

        sendViewModel?.errorInDialog?.observe(viewLifecycleOwner, Observer { coinThrowable ->
            fragmentManager?.let { fragManager ->
                val errorText = coinThrowable.errorTextRes?.let { getString(it) } ?: coinThrowable.nonTranslatableText
                AlertDialogFragment.newInstance(
                        descriptionString = errorText,
                        buttonText = R.string.Alert_Ok,
                        listener = object : AlertDialogFragment.Listener {
                            override fun onButtonClick() {
                                activity?.onBackPressed()
                            }
                        }).show(fragManager, "alert_dialog")
            }
        })

        confirmationViewModel?.sendButtonState?.observe(viewLifecycleOwner, Observer { state ->
            sendButtonView?.bind(state)
        })

    }

    private fun getErrorText(error: Throwable): Int {
        return when (error) {
            is WrongParameters -> R.string.Error
            is UnknownHostException -> R.string.Hud_Text_NoInternet
            else -> R.string.Hud_Network_Issue
        }
    }

}

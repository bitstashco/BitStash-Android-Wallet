package io.horizontalsystems.bitstashwallet.modules.settings.security

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import io.horizontalsystems.bitstashwallet.BaseActivity
import io.horizontalsystems.bitstashwallet.R
import io.horizontalsystems.bitstashwallet.modules.pin.PinModule
import io.horizontalsystems.bitstashwallet.modules.settings.managekeys.ManageKeysModule
import io.horizontalsystems.bitstashwallet.ui.extensions.TopMenuItem
import kotlinx.android.synthetic.main.activity_settings_security.*

class SecuritySettingsActivity : BaseActivity() {

    private lateinit var viewModel: SecuritySettingsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings_security)

        viewModel = ViewModelProviders.of(this).get(SecuritySettingsViewModel::class.java)
        viewModel.init()

        shadowlessToolbar.bind(getString(R.string.Settings_SecurityCenter), TopMenuItem(R.drawable.back, onClick = { onBackPressed() }))

        changePin.setOnClickListener { viewModel.delegate.didTapEditPin() }

        manageKeys.setOnClickListener { viewModel.delegate.didTapManageKeys() }

        fingerprint.switchOnCheckedChangeListener = CompoundButton.OnCheckedChangeListener { _, isChecked ->
            viewModel.delegate.didSwitchBiometricEnabled(isChecked)
        }

        fingerprint.setOnClickListener {
            fingerprint.switchToggle()
        }

        enablePin.switchOnCheckedChangeListener = CompoundButton.OnCheckedChangeListener { _, isChecked ->
            viewModel.delegate.didSwitchPinSet(isChecked)
        }

        enablePin.setOnClickListener {
            enablePin.switchToggle()
        }

        //  Handling view model live events

        viewModel.backupAlertVisibleLiveData.observe(this, Observer { alert ->
            manageKeys.setInfoBadgeVisibility(alert)
        })

        viewModel.openManageKeysLiveEvent.observe(this, Observer {
            ManageKeysModule.start(this)
        })

        viewModel.pinSetLiveData.observe(this, Observer { pinEnabled ->
            enablePin.switchIsChecked = pinEnabled
        })

        viewModel.editPinVisibleLiveData.observe(this, Observer { pinEnabled ->
            changePin.visibility = if (pinEnabled) View.VISIBLE else View.GONE
        })

        viewModel.openEditPinLiveEvent.observe(this, Observer {
            PinModule.startForEditPin(this)
        })

        viewModel.openSetPinLiveEvent.observe(this, Observer {
            PinModule.startForSetPin(this, REQUEST_CODE_SET_PIN)
        })

        viewModel.openUnlockPinLiveEvent.observe(this, Observer {
            PinModule.startForUnlock(this, REQUEST_CODE_UNLOCK_PIN_TO_DISABLE_PIN)
        })

        viewModel.biometricSettingsVisibleLiveData.observe(this, Observer { enabled ->
            fingerprint.visibility = if (enabled) View.VISIBLE else View.GONE
        })

        viewModel.biometricEnabledLiveData.observe(this, Observer {
            fingerprint.switchIsChecked = it
        })
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQUEST_CODE_SET_PIN) {
            when (resultCode) {
                PinModule.RESULT_OK -> viewModel.delegate.didSetPin()
                PinModule.RESULT_CANCELLED -> viewModel.delegate.didCancelSetPin()
            }
        }

        if (requestCode == REQUEST_CODE_UNLOCK_PIN_TO_DISABLE_PIN) {
            when (resultCode) {
                PinModule.RESULT_OK -> viewModel.delegate.didUnlockPinToDisablePin()
                PinModule.RESULT_CANCELLED -> viewModel.delegate.didCancelUnlockPinToDisablePin()
            }
        }
    }

    companion object {
        const val REQUEST_CODE_SET_PIN = 1
        const val REQUEST_CODE_UNLOCK_PIN_TO_DISABLE_PIN = 2
    }
}

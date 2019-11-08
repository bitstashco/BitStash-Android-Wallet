package io.horizontalsystems.bitstashwallet.modules.settings.security

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.horizontalsystems.bitstashwallet.SingleLiveEvent

class SecuritySettingsViewModel : ViewModel(), SecuritySettingsModule.ISecuritySettingsView, SecuritySettingsModule.ISecuritySettingsRouter {

    lateinit var delegate: SecuritySettingsModule.ISecuritySettingsViewDelegate

    val backupAlertVisibleLiveData = MutableLiveData<Boolean>()
    val pinSetLiveData = MutableLiveData<Boolean>()
    val editPinVisibleLiveData = MutableLiveData<Boolean>()
    val biometricSettingsVisibleLiveData = MutableLiveData<Boolean>()
    val biometricEnabledLiveData = MutableLiveData<Boolean>()

    val openManageKeysLiveEvent = SingleLiveEvent<Unit>()
    val openEditPinLiveEvent = SingleLiveEvent<Unit>()
    val openSetPinLiveEvent = SingleLiveEvent<Unit>()
    val openUnlockPinLiveEvent = SingleLiveEvent<Unit>()

    fun init() {
        SecuritySettingsModule.init(this, this)
        delegate.viewDidLoad()
    }

    //  ViewModel

    override fun onCleared() {
        delegate.onClear()
    }

    //  ISecuritySettingsView

    override fun setBackupAlertVisible(visible: Boolean) {
        backupAlertVisibleLiveData.postValue(visible)
    }

    override fun togglePinSet(pinSet: Boolean) {
        pinSetLiveData.postValue(pinSet)
    }

    override fun setEditPinVisible(visible: Boolean) {
        editPinVisibleLiveData.postValue(visible)
    }

    override fun setBiometricSettingsVisible(visible: Boolean) {
        biometricSettingsVisibleLiveData.postValue(visible)
    }

    override fun toggleBiometricEnabled(enabled: Boolean) {
        biometricEnabledLiveData.postValue(enabled)
    }

    //  ISecuritySettingsRouter

    override fun showManageKeys() {
        openManageKeysLiveEvent.call()
    }

    override fun showEditPin() {
        openEditPinLiveEvent.call()
    }

    override fun showSetPin() {
        openSetPinLiveEvent.call()
    }

    override fun showUnlockPin() {
        openUnlockPinLiveEvent.call()
    }
}

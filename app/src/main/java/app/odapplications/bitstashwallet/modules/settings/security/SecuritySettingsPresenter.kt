package app.odapplications.bitstashwallet.modules.settings.security

class SecuritySettingsPresenter(private val router: SecuritySettingsModule.ISecuritySettingsRouter, private val interactor: SecuritySettingsModule.ISecuritySettingsInteractor)
    : SecuritySettingsModule.ISecuritySettingsViewDelegate, SecuritySettingsModule.ISecuritySettingsInteractorDelegate {

    var view: SecuritySettingsModule.ISecuritySettingsView? = null

    override fun viewDidLoad() {
        view?.setBackupAlertVisible(!interactor.allBackedUp)

        syncPinSet(interactor.isPinSet)
        view?.toggleBiometricEnabled(interactor.isBiometricEnabled)
    }

    override fun didTapManageKeys() {
        router.showManageKeys()
    }

    override fun didSwitchPinSet(enable: Boolean) {
        if (enable) {
            router.showSetPin()
        } else {
            router.showUnlockPin()
        }
    }

    override fun didTapEditPin() {
        router.showEditPin()
    }

    override fun didSwitchBiometricEnabled(enable: Boolean) {
        interactor.isBiometricEnabled = enable
    }

    override fun didSetPin() {
        syncPinSet(true)
        view?.toggleBiometricEnabled(interactor.isBiometricEnabled)
    }

    override fun didCancelSetPin() {
        view?.togglePinSet(false)
    }

    override fun didUnlockPinToDisablePin() {
        interactor.disablePin()
        syncPinSet(false)
    }

    override fun didCancelUnlockPinToDisablePin() {
        view?.togglePinSet(true)
    }

    override fun onClear() {
        interactor.clear()
    }

    private fun syncPinSet(pinSet: Boolean) {
        view?.togglePinSet(pinSet)
        view?.setEditPinVisible(pinSet)
        view?.setBiometricSettingsVisible(pinSet && interactor.biometricAuthSupported)
    }

    // ISecuritySettingsInteractorDelegate

    override fun didAllBackedUp(allBackedUp: Boolean) {
        view?.setBackupAlertVisible(!allBackedUp)
    }

}

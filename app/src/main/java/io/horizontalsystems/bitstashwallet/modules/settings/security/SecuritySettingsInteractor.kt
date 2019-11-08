package io.horizontalsystems.bitstashwallet.modules.settings.security

import io.horizontalsystems.bitstashwallet.core.IBackupManager
import io.horizontalsystems.bitstashwallet.core.ILocalStorage
import io.horizontalsystems.bitstashwallet.core.IPinManager
import io.horizontalsystems.bitstashwallet.core.ISystemInfoManager
import io.reactivex.disposables.CompositeDisposable

class SecuritySettingsInteractor(
        private val backupManager: IBackupManager,
        private val localStorage: ILocalStorage,
        private val systemInfoManager: ISystemInfoManager,
        private val pinManager: IPinManager)
    : SecuritySettingsModule.ISecuritySettingsInteractor {

    var delegate: SecuritySettingsModule.ISecuritySettingsInteractorDelegate? = null
    private var disposables: CompositeDisposable = CompositeDisposable()

    init {
        backupManager.allBackedUpFlowable
                .subscribe { delegate?.didAllBackedUp(it) }
                .let { disposables.add(it) }
    }

    override val biometricAuthSupported: Boolean
        get() = systemInfoManager.biometricAuthSupported

    override val allBackedUp: Boolean
        get() = backupManager.allBackedUp

    override var isBiometricEnabled: Boolean
        get() = pinManager.isFingerprintEnabled
        set(value) {
            pinManager.isFingerprintEnabled = value
        }

    override val isPinSet: Boolean
        get() = pinManager.isPinSet

    override fun disablePin() {
        pinManager.clear()
    }

    override fun clear() {
        disposables.clear()
    }

}

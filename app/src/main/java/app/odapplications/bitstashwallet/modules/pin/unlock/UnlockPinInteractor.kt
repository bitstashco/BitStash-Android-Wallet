package app.odapplications.bitstashwallet.modules.pin.unlock

import androidx.biometric.BiometricPrompt
import app.odapplications.bitstashwallet.core.*
import app.odapplications.bitstashwallet.core.managers.OneTimeTimer
import app.odapplications.bitstashwallet.entities.LockoutState

class UnlockPinInteractor(
        private val pinManager: IPinManager,
        private val lockManager: ILockManager,
        private val lockoutManager: ILockoutManager,
        private val encryptionManager: IEncryptionManager,
        private val systemInfoManager: ISystemInfoManager,
        private val timer: OneTimeTimer) : UnlockPinModule.IInteractor, OneTimerDelegate {

    var delegate: UnlockPinModule.IInteractorDelegate? = null

    init {
        timer.delegate = this
    }

    override val isFingerprintEnabled: Boolean
        get() = pinManager.isFingerprintEnabled

    override val biometricAuthSupported: Boolean
        get() = systemInfoManager.biometricAuthSupported

    override val cryptoObject: BiometricPrompt.CryptoObject?
        get() = encryptionManager.getCryptoObject()

    override fun unlock(pin: String): Boolean {
        val valid = pinManager.validate(pin)
        if (valid) {
            lockManager.onUnlock()
            lockoutManager.dropFailedAttempts()
        } else {
            lockoutManager.didFailUnlock()
            updateLockoutState()
        }

        return valid
    }

    override fun onUnlock() {
        delegate?.unlock()
        lockManager.onUnlock()
    }

    override fun onFire() {
        updateLockoutState()
    }

    override fun updateLockoutState() {
        val state = lockoutManager.currentState
        when (state) {
            is LockoutState.Locked -> timer.schedule(state.until)
        }

        delegate?.updateLockoutState(state)
    }

}

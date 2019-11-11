package app.odapplications.bitstashwallet.core.managers

import android.security.keystore.UserNotAuthenticatedException
import app.odapplications.bitstashwallet.core.ILocalStorage
import app.odapplications.bitstashwallet.core.IPinManager
import app.odapplications.bitstashwallet.core.ISecuredStorage

class PinManager(private val securedStorage: ISecuredStorage, val localStorage: ILocalStorage) : IPinManager {

    override val isPinSet: Boolean
        get() = !securedStorage.pinIsEmpty()

    override var isFingerprintEnabled: Boolean
        get() = localStorage.isFingerprintEnabled
        set(value) {
            localStorage.isFingerprintEnabled = value
        }

    @Throws(UserNotAuthenticatedException::class)
    override fun store(pin: String) {
        securedStorage.savePin(pin)
    }

    override fun validate(pin: String): Boolean {
        return securedStorage.savedPin == pin
    }

    override fun clear() {
        securedStorage.removePin()
        localStorage.isFingerprintEnabled = false
    }

}

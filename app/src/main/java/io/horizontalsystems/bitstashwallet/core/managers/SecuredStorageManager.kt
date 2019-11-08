package io.horizontalsystems.bitstashwallet.core.managers

import android.text.TextUtils
import io.horizontalsystems.bitstashwallet.core.App
import io.horizontalsystems.bitstashwallet.core.IEncryptionManager
import io.horizontalsystems.bitstashwallet.core.ISecuredStorage
import io.horizontalsystems.bitstashwallet.entities.AuthData


class SecuredStorageManager(private val encryptionManager: IEncryptionManager) : ISecuredStorage {

    private val AUTH_DATA = "auth_data"
    private val LOCK_PIN = "lock_pin"

    override val authData: AuthData?
        get() {
            App.preferences.getString(AUTH_DATA, null)?.let { string ->
                return AuthData(encryptionManager.decrypt(string))
            }
            return null
        }

    override val savedPin: String?
        get() {
            val string = App.preferences.getString(LOCK_PIN, null)
            return if (TextUtils.isEmpty(string)) {
                null
            } else {
                encryptionManager.decrypt(string)
            }
        }

    override fun savePin(pin: String) {
        App.preferences.edit().putString(LOCK_PIN, encryptionManager.encrypt(pin)).apply()
    }

    override fun removePin() {
        App.preferences.edit().remove(LOCK_PIN).apply()
    }

    override fun pinIsEmpty(): Boolean {
        val string = App.preferences.getString(LOCK_PIN, null)
        return string.isNullOrEmpty()
    }

}

package app.odapplications.bitstashwallet.core.managers

import android.app.Activity
import app.odapplications.bitstashwallet.core.IKeyStoreManager
import app.odapplications.bitstashwallet.core.ISystemInfoManager
import app.odapplications.bitstashwallet.modules.keystore.KeyStoreModule

class KeyStoreChangeListener(private val systemInfoManager: ISystemInfoManager,
                             private val keyStoreManager: IKeyStoreManager) : BackgroundManager.Listener {

    override fun willEnterForeground(activity: Activity) {
        when {
            systemInfoManager.isSystemLockOff -> {
                KeyStoreModule.startForNoSystemLock(activity)
            }
            keyStoreManager.isKeyInvalidated -> {
                KeyStoreModule.startForInvalidKey(activity)
            }
            keyStoreManager.isUserNotAuthenticated -> {
                KeyStoreModule.startForUserAuthentication(activity)
            }
        }
    }

}

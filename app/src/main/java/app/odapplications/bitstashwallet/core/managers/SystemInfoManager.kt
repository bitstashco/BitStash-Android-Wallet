package app.odapplications.bitstashwallet.core.managers

import android.app.Activity
import android.app.KeyguardManager
import androidx.biometric.BiometricManager
import androidx.biometric.BiometricManager.BIOMETRIC_SUCCESS
import app.odapplications.bitstashwallet.BuildConfig
import app.odapplications.bitstashwallet.core.App
import app.odapplications.bitstashwallet.core.ISystemInfoManager

class SystemInfoManager : ISystemInfoManager {

    override val appVersion: String = BuildConfig.VERSION_NAME

    private val biometricManager = BiometricManager.from(App.instance)

    override val isSystemLockOff: Boolean
        get() {
            val keyguardManager = App.instance.getSystemService(Activity.KEYGUARD_SERVICE) as KeyguardManager
            return !keyguardManager.isDeviceSecure
        }

    override val biometricAuthSupported: Boolean
        get() = biometricManager.canAuthenticate() == BIOMETRIC_SUCCESS

}

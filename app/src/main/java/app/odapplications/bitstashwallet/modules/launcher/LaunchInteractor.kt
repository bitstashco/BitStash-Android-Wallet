package app.odapplications.bitstashwallet.modules.launcher

import app.odapplications.bitstashwallet.core.IAccountManager
import app.odapplications.bitstashwallet.core.IKeyStoreManager
import app.odapplications.bitstashwallet.core.IPinManager
import app.odapplications.bitstashwallet.core.ISystemInfoManager

class LaunchInteractor(private val accountManager: IAccountManager,
                       private val pinManager: IPinManager,
                       private val systemInfoManager: ISystemInfoManager,
                       private val keyStoreManager: IKeyStoreManager) : LaunchModule.IInteractor {

    var delegate: LaunchModule.IInteractorDelegate? = null

    override val isPinNotSet: Boolean
        get() = !pinManager.isPinSet

    override val isAccountsEmpty: Boolean
        get() = accountManager.isAccountsEmpty

    override val isSystemLockOff: Boolean
        get() = systemInfoManager.isSystemLockOff

    override val isKeyInvalidated: Boolean
        get() = keyStoreManager.isKeyInvalidated

    override val isUserNotAuthenticated: Boolean
        get() = keyStoreManager.isUserNotAuthenticated

}

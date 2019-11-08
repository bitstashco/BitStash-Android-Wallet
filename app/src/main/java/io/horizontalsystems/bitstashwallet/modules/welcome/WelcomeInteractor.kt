package io.horizontalsystems.bitstashwallet.modules.welcome

import io.horizontalsystems.bitstashwallet.core.ISystemInfoManager

class WelcomeInteractor(private val systemInfoManager: ISystemInfoManager) : WelcomeModule.IInteractor {

    override val appVersion: String
        get() = systemInfoManager.appVersion
}

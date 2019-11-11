package app.odapplications.bitstashwallet.modules.welcome

import app.odapplications.bitstashwallet.core.ISystemInfoManager

class WelcomeInteractor(private val systemInfoManager: ISystemInfoManager) : WelcomeModule.IInteractor {

    override val appVersion: String
        get() = systemInfoManager.appVersion
}

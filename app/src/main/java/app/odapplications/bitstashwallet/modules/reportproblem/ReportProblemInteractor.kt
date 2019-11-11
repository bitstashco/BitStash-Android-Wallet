package app.odapplications.bitstashwallet.modules.reportproblem

import app.odapplications.bitstashwallet.core.IAppConfigProvider
import app.odapplications.bitstashwallet.core.IClipboardManager

class ReportProblemInteractor(
        private val appConfigProvider: IAppConfigProvider,
        private var clipboardManager: IClipboardManager
) : ReportProblemModule.IInteractor {

    override val email get() = appConfigProvider.reportEmail
    override val telegramGroup get() = appConfigProvider.reportTelegramGroup

    override fun copyToClipboard(value: String) {
        clipboardManager.copyText(value)
    }

}

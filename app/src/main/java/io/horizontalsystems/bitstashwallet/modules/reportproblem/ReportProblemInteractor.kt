package io.horizontalsystems.bitstashwallet.modules.reportproblem

import io.horizontalsystems.bitstashwallet.core.IAppConfigProvider
import io.horizontalsystems.bitstashwallet.core.IClipboardManager

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

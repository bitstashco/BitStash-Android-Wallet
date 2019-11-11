package app.odapplications.bitstashwallet.modules.notifications

import app.odapplications.bitstashwallet.core.INotificationManager
import app.odapplications.bitstashwallet.core.managers.BackgroundManager
import app.odapplications.bitstashwallet.core.managers.PriceAlertManager
import app.odapplications.bitstashwallet.entities.PriceAlert

class NotificationsInteractor(
        private val priceAlertManager: PriceAlertManager,
        backgroundManager: BackgroundManager,
        private val notificationManager: INotificationManager
) : NotificationsModule.IInteractor, BackgroundManager.Listener {

    init {
        backgroundManager.registerListener(this)
    }

    lateinit var delegate: NotificationsModule.IInteractorDelegate

    override val priceAlertsEnabled: Boolean
        get() = notificationManager.isEnabled

    override val priceAlerts: List<PriceAlert>
        get() = priceAlertManager.getPriceAlerts()

    override fun savePriceAlerts(priceAlerts: List<PriceAlert>) {
        priceAlertManager.savePriceAlerts(priceAlerts)
    }

    override fun willEnterForeground() {
        delegate.didEnterForeground()
    }
}

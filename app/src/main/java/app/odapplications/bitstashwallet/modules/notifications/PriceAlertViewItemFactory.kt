package app.odapplications.bitstashwallet.modules.notifications

import app.odapplications.bitstashwallet.entities.PriceAlert

class PriceAlertViewItemFactory {

    fun createItems(priceAlerts: List<PriceAlert>): List<NotificationsModule.PriceAlertViewItem> {
        return priceAlerts.map { alert ->
            NotificationsModule.PriceAlertViewItem(alert.coin.title, alert.coin.code, alert.state)
        }
    }

}

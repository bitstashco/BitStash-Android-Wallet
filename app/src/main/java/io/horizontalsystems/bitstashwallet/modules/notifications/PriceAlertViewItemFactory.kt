package io.horizontalsystems.bitstashwallet.modules.notifications

import io.horizontalsystems.bitstashwallet.entities.PriceAlert

class PriceAlertViewItemFactory {

    fun createItems(priceAlerts: List<PriceAlert>): List<NotificationsModule.PriceAlertViewItem> {
        return priceAlerts.map { alert ->
            NotificationsModule.PriceAlertViewItem(alert.coin.title, alert.coin.code, alert.state)
        }
    }

}

package io.horizontalsystems.bitstashwallet.modules.notifications

import io.horizontalsystems.bitstashwallet.SingleLiveEvent

class NotificationsRouter : NotificationsModule.IRouter {
    val openNotificationSettingsLiveEvent = SingleLiveEvent<Unit>()

    override fun openNotificationSettings() {
        openNotificationSettingsLiveEvent.call()
    }
}

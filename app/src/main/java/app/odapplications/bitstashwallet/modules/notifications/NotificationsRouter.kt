package app.odapplications.bitstashwallet.modules.notifications

import app.odapplications.bitstashwallet.SingleLiveEvent

class NotificationsRouter : NotificationsModule.IRouter {
    val openNotificationSettingsLiveEvent = SingleLiveEvent<Unit>()

    override fun openNotificationSettings() {
        openNotificationSettingsLiveEvent.call()
    }
}

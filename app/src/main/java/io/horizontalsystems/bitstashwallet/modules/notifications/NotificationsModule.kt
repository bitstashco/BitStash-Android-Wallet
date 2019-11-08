package io.horizontalsystems.bitstashwallet.modules.notifications

import android.content.Context
import android.content.Intent
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import io.horizontalsystems.bitstashwallet.core.App
import io.horizontalsystems.bitstashwallet.entities.PriceAlert

object NotificationsModule {
    interface IView {
        fun setItems(items: List<PriceAlertViewItem>)
        fun showWarning()
        fun hideWarning()
        fun showStateSelector(itemPosition: Int, priceAlert: PriceAlert)
    }

    interface IRouter {
        fun openNotificationSettings()
    }

    interface IViewDelegate {
        fun viewDidLoad()
        fun didSelectState(itemPosition: Int, state: PriceAlert.State)
        fun didClickOpenSettings()
        fun didClickDeactivateAll()
        fun didTapItem(itemPosition: Int)
    }

    interface IInteractor {
        val priceAlertsEnabled: Boolean
        val priceAlerts: List<PriceAlert>

        fun savePriceAlerts(priceAlerts: List<PriceAlert>)
    }

    interface IInteractorDelegate {
        fun didEnterForeground()
    }

    fun start(context: Context) {
        val intent = Intent(context, NotificationsActivity::class.java)
        context.startActivity(intent)
    }

    data class PriceAlertViewItem(val title: String, val code: String) {
        lateinit var state: PriceAlert.State

        constructor(title: String, code: String, state: PriceAlert.State) : this(title, code) {
            this.state = state
        }
    }

    class Factory : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            val view = NotificationsView()
            val router = NotificationsRouter()
            val interactor = NotificationsInteractor(App.priceAlertManager, App.backgroundManager, App.notificationManager)
            val presenter = NotificationsPresenter(view, router, interactor, PriceAlertViewItemFactory())

            interactor.delegate = presenter

            return presenter as T
        }
    }
}


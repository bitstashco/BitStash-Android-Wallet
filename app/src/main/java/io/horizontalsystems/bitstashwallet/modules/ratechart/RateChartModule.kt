package io.horizontalsystems.bitstashwallet.modules.ratechart

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import io.horizontalsystems.bitstashwallet.core.App
import io.horizontalsystems.bitstashwallet.core.managers.StatsData
import io.horizontalsystems.bitstashwallet.entities.Coin
import io.horizontalsystems.bitstashwallet.entities.CurrencyValue
import io.horizontalsystems.bitstashwallet.entities.Rate
import io.horizontalsystems.bitstashwallet.lib.chartview.ChartView.ChartType
import io.horizontalsystems.bitstashwallet.lib.chartview.models.ChartPoint

object RateChartModule {

    interface View {
        fun showSpinner()
        fun hideSpinner()
        fun setChartType(type: ChartType)
        fun enableChartType(type: ChartType)
        fun showChart(viewItem: ChartViewItem)
        fun showSelectedPoint(data: Triple<Long, CurrencyValue, ChartType>)
        fun showError(ex: Throwable)
    }

    interface ViewDelegate {
        fun viewDidLoad()
        fun onSelect(type: ChartType)
        fun onTouchSelect(point: ChartPoint)
    }

    interface Interactor {
        var defaultChartType: ChartType

        fun subscribeToLatestRate(coinCode: String, currencyCode: String)
        fun subscribeToChartStats()
        fun syncStats(coinCode: String, currencyCode: String)
        fun clear()
    }

    interface InteractorDelegate {
        fun onReceiveStats(data: StatsData)
        fun onReceiveLatestRate(rate: Rate)
        fun onReceiveError(ex: Throwable)
    }

    interface Router

    class Factory(private val coin: Coin) : ViewModelProvider.Factory {

        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            val view = RateChartView()
            val interactor = RateChartInteractor(App.rateStatsManager, App.rateStorage, App.localStorage)
            val presenter = RateChartPresenter(view, interactor, coin.code, App.currencyManager.baseCurrency, RateChartViewFactory())

            interactor.delegate = presenter

            return presenter as T
        }
    }
}

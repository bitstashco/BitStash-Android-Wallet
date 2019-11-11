package app.odapplications.bitstashwallet.modules.ratechart

import androidx.lifecycle.ViewModel
import app.odapplications.bitstashwallet.core.managers.StatsData
import app.odapplications.bitstashwallet.entities.Currency
import app.odapplications.bitstashwallet.entities.CurrencyValue
import app.odapplications.bitstashwallet.entities.Rate
import app.odapplications.bitstashwallet.lib.chartview.ChartView.ChartType
import app.odapplications.bitstashwallet.lib.chartview.models.ChartPoint
import app.odapplications.bitstashwallet.modules.ratechart.RateChartModule.Interactor
import app.odapplications.bitstashwallet.modules.ratechart.RateChartModule.InteractorDelegate
import app.odapplications.bitstashwallet.modules.ratechart.RateChartModule.View
import app.odapplications.bitstashwallet.modules.ratechart.RateChartModule.ViewDelegate
import app.odapplications.bitstashwallet.modules.transactions.CoinCode

class RateChartPresenter(
        val view: View,
        private val interactor: Interactor,
        private val coinCode: CoinCode,
        private val currency: Currency,
        private val factory: RateChartViewFactory) : ViewModel(), ViewDelegate, InteractorDelegate {

    private var latestRate: Rate? = null
        set(value) {
            field = value
            updateChart()
        }

    private var statsData: StatsData? = null
        set(value) {
            field = value
            updateChart()
        }

    private var chartType = interactor.defaultChartType

    //  ViewDelegate

    override fun viewDidLoad() {
        view.showSpinner()
        view.setChartType(interactor.defaultChartType)

        interactor.subscribeToChartStats()
        interactor.subscribeToLatestRate(coinCode, currency.code)
        interactor.syncStats(coinCode, currency.code)
    }

    override fun onSelect(type: ChartType) {
        if (chartType == type)
            return

        chartType = type
        interactor.defaultChartType = type

        view.showSpinner()
        updateChart()
    }

    override fun onTouchSelect(point: ChartPoint) {
        val currencyValue = CurrencyValue(currency, point.value.toBigDecimal())
        view.showSelectedPoint(Triple(point.timestamp, currencyValue, chartType))
    }

    //  InteractorDelegate

    @Synchronized
    override fun onReceiveStats(data: StatsData) {
        if (data.coinCode != coinCode)
            return

        statsData = data
    }

    @Synchronized
    override fun onReceiveLatestRate(rate: Rate) {
        latestRate = rate
    }

    private fun updateChart() {
        val stats = statsData?.stats ?: return

        for (type in stats.keys) {
            val chartType = ChartType.fromString(type) ?: continue
            val chartPoints = stats[chartType.name] ?: continue
            if (chartPoints.size > 10) {
                view.enableChartType(chartType)
            }
        }

        showChart()
    }

    override fun onReceiveError(ex: Throwable) {
        view.hideSpinner()
        view.showError(ex)
    }

    private fun showChart() {
        val statsData = statsData ?: return

        view.hideSpinner()

        try {
            val viewItem = factory.createViewItem(chartType, statsData, latestRate, currency)
            view.showChart(viewItem)
        } catch (e: Exception) {
            view.showError(e)
        }
    }

    //  ViewModel

    override fun onCleared() {
        interactor.clear()
    }

}

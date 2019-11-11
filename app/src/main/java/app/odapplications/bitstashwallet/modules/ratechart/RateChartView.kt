package app.odapplications.bitstashwallet.modules.ratechart

import app.odapplications.bitstashwallet.SingleLiveEvent
import app.odapplications.bitstashwallet.entities.CurrencyValue
import app.odapplications.bitstashwallet.lib.chartview.ChartView

class RateChartView : RateChartModule.View {
    val showSpinner = SingleLiveEvent<Unit>()
    val hideSpinner = SingleLiveEvent<Unit>()
    val setDefaultMode = SingleLiveEvent<ChartView.ChartType>()
    val setSelectedPoint = SingleLiveEvent<Triple<Long, CurrencyValue, ChartView.ChartType>>()
    val enableChartType = SingleLiveEvent<ChartView.ChartType>()
    val showChart = SingleLiveEvent<ChartViewItem>()
    val showError = SingleLiveEvent<Throwable>()

    override fun showSpinner() {
        showSpinner.call()
    }

    override fun hideSpinner() {
        hideSpinner.call()
    }

    override fun setChartType(type: ChartView.ChartType) {
        setDefaultMode.postValue(type)
    }

    override fun enableChartType(type: ChartView.ChartType) {
        enableChartType.value = type
    }

    override fun showChart(viewItem: ChartViewItem) {
        showChart.postValue(viewItem)
    }

    override fun showSelectedPoint(data: Triple<Long, CurrencyValue, ChartView.ChartType>) {
        setSelectedPoint.postValue(data)
    }

    override fun showError(ex: Throwable) {
        showError.postValue(ex)
    }
}

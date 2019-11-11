package app.odapplications.bitstashwallet.modules.ratechart

import app.odapplications.bitstashwallet.core.NoRateStats
import app.odapplications.bitstashwallet.core.managers.StatsData
import app.odapplications.bitstashwallet.entities.Currency
import app.odapplications.bitstashwallet.entities.CurrencyValue
import app.odapplications.bitstashwallet.entities.Rate
import app.odapplications.bitstashwallet.lib.chartview.ChartView.ChartType
import app.odapplications.bitstashwallet.lib.chartview.models.ChartPoint
import java.math.BigDecimal

data class ChartViewItem(
        val type: ChartType,
        val rateValue: CurrencyValue?,
        val marketCap: CurrencyValue,
        val lowValue: CurrencyValue,
        val highValue: CurrencyValue,
        val diffValue: BigDecimal,
        val chartData: List<ChartPoint>,
        val lastUpdateTimestamp: Long? = null
)

class RateChartViewFactory {
    fun createViewItem(chartType: ChartType, statData: StatsData, rate: Rate?, currency: Currency): ChartViewItem {
        val diff = statData.diff[chartType.name] ?: throw NoRateStats()
        val points = statData.stats[chartType.name] ?: throw NoRateStats()

        val minValue = points.minBy { it.value }?.value ?: 0f
        val maxValue = points.maxBy { it.value }?.value ?: 0f

        val lowValue = CurrencyValue(currency, minValue.toBigDecimal())
        val highValue = CurrencyValue(currency, maxValue.toBigDecimal())
        val marketCap = CurrencyValue(currency, statData.marketCap)
        val rateValue = rate?.let { CurrencyValue(currency, it.value) }

        return ChartViewItem(
                chartType,
                rateValue,
                marketCap,
                lowValue,
                highValue,
                diff,
                points,
                rate?.timestamp?.times(1000)
        )
    }
}

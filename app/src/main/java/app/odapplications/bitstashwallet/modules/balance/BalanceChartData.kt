package app.odapplications.bitstashwallet.modules.balance

import app.odapplications.bitstashwallet.lib.chartview.models.ChartPoint
import java.math.BigDecimal

data class BalanceChartData(val points: List<ChartPoint> = listOf(),
                            val diff: BigDecimal = BigDecimal.ZERO,
                            val error: Boolean = false)

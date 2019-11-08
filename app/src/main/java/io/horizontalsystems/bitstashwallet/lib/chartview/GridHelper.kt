package io.horizontalsystems.bitstashwallet.lib.chartview

import android.graphics.RectF
import io.horizontalsystems.bitstashwallet.lib.chartview.ChartView.ChartType
import io.horizontalsystems.bitstashwallet.lib.chartview.models.ChartConfig
import io.horizontalsystems.bitstashwallet.lib.chartview.models.ChartPoint
import io.horizontalsystems.bitstashwallet.lib.chartview.models.GridColumn
import io.horizontalsystems.bitstashwallet.lib.chartview.models.GridLine
import io.horizontalsystems.bitstashwallet.viewHelpers.DateHelper
import java.util.*

class GridHelper(private val shape: RectF, private val config: ChartConfig) {

    fun setGridLines(): List<GridLine> {
        var y: Float
        var value = config.valueTop
        val gridLines = mutableListOf<GridLine>()

        repeat(4) {
            val gridSpacing = shape.bottom / 4
            y = gridSpacing * it + shape.top

            gridLines.add(GridLine(y, String.format("%.${config.valuePrecision}f", value)))
            value -= config.valueStep
        }

        return gridLines
    }

    fun setGridColumns(points: List<ChartPoint>, chartType: ChartType): List<GridColumn> {
        val startTimestamp = points.first().timestamp * 1000
        val endTimestamp = points.last().timestamp * 1000

        val date = Date(endTimestamp)
        val calendar = Calendar.getInstance().apply { time = date }
        var columnLabel = columnLabel(calendar, chartType)

        //  We need to move last vertical grid line to nearest hour/day depending on chart type
        calendar.set(Calendar.MINUTE, 0)
        calendar.set(Calendar.SECOND, 0)

        when (chartType) {
            ChartType.DAILY -> {
            }
            ChartType.WEEKLY,
            ChartType.MONTHLY -> {
                calendar.set(Calendar.HOUR_OF_DAY, 0)
            }
            ChartType.MONTHLY6,
            ChartType.MONTHLY18 -> {
                calendar.set(Calendar.HOUR_OF_DAY, 0)
                calendar.set(Calendar.DATE, 1)
            }
        }

        val delta = (endTimestamp - startTimestamp) / shape.right
        val columns = mutableListOf<GridColumn>()

        while (true) {
            val xAxis = (calendar.time.time - startTimestamp) / delta
            if (xAxis <= 0) break

            columns.add(GridColumn(xAxis, columnLabel))
            moveColumn(chartType, calendar)
            columnLabel = columnLabel(calendar, chartType)
        }

        return columns
    }

    private fun moveColumn(type: ChartType, calendar: Calendar) {
        when (type) {
            ChartType.DAILY -> calendar.add(Calendar.HOUR_OF_DAY, -6)       // 6 hour
            ChartType.WEEKLY -> calendar.add(Calendar.DAY_OF_WEEK, -2)      // 2 days
            ChartType.MONTHLY -> calendar.add(Calendar.DAY_OF_MONTH, -6)    // 6 days
            ChartType.MONTHLY6 -> calendar.add(Calendar.MONTH, -1)          // 1 month
            ChartType.MONTHLY18 -> calendar.add(Calendar.MONTH, -2)         // 2 month
        }
    }

    private fun columnLabel(calendar: Calendar, type: ChartType): String {
        return when (type) {
            ChartType.DAILY -> calendar.get(Calendar.HOUR_OF_DAY).toString()
            ChartType.WEEKLY -> DateHelper.getShortDayOfWeek(calendar.time)
            ChartType.MONTHLY -> calendar.get(Calendar.DAY_OF_MONTH).toString()
            ChartType.MONTHLY6 -> DateHelper.getShortMonth(calendar.time)
            ChartType.MONTHLY18 -> DateHelper.getShortMonth(calendar.time)
        }
    }
}

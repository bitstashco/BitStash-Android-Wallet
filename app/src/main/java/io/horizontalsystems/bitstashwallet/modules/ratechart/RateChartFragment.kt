package io.horizontalsystems.bitstashwallet.modules.ratechart

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import io.horizontalsystems.bitstashwallet.R
import io.horizontalsystems.bitstashwallet.core.App
import io.horizontalsystems.bitstashwallet.entities.Coin
import io.horizontalsystems.bitstashwallet.entities.CurrencyValue
import io.horizontalsystems.bitstashwallet.lib.chartview.ChartView
import io.horizontalsystems.bitstashwallet.lib.chartview.ChartView.ChartType
import io.horizontalsystems.bitstashwallet.lib.chartview.models.ChartPoint
import io.horizontalsystems.bitstashwallet.viewHelpers.DateHelper
import kotlinx.android.synthetic.main.view_bottom_sheet_chart.*
import java.math.BigDecimal
import java.util.*

class RateChartFragment(private val coin: Coin) : BottomSheetDialogFragment(), ChartView.Listener {

    private lateinit var presenter: RateChartPresenter
    private lateinit var presenterView: RateChartView

    private val formatter = App.numberFormatter
    private var actions = mapOf<ChartType, View>()

    override fun getTheme(): Int {
        return R.style.BottomDialog
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.view_bottom_sheet_chart, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        chartView.listener = this
        chartView.setIndicator(chartViewIndicator)
        chartTitle.text = getString(R.string.Charts_Title, coin.title)
        closeButton.setOnClickListener { dismiss() }

        presenter = ViewModelProviders.of(this, RateChartModule.Factory(coin)).get(RateChartPresenter::class.java)
        presenterView = presenter.view as RateChartView

        observeData()
        bindActions()

        dialog?.setOnShowListener {
            presenter.viewDidLoad()

            // To avoid the bottom sheet stuck in between
            dialog?.findViewById<View>(R.id.design_bottom_sheet)?.let {
                BottomSheetBehavior.from(it).apply {
                    state = BottomSheetBehavior.STATE_EXPANDED
                    isHideable = true
                    skipCollapsed = true
                }
            }
        }
    }

    private fun observeData() {
        presenterView.showSpinner.observe(viewLifecycleOwner, Observer {
            setViewVisibility(chartView, chartError, isVisible = false)
            setViewVisibility(chartViewSpinner, isVisible = true)
        })

        presenterView.hideSpinner.observe(viewLifecycleOwner, Observer {
            setViewVisibility(chartView, isVisible = true)
            setViewVisibility(chartViewSpinner, isVisible = false)
        })

        presenterView.setDefaultMode.observe(viewLifecycleOwner, Observer { type ->
            actions[type]?.let { it.isActivated = true }
        })

        presenterView.showChart.observe(viewLifecycleOwner, Observer { item ->
            chartView.visibility = View.VISIBLE
            chartView.setData(item.chartData, item.type)
            chartSubtitle.text = item.lastUpdateTimestamp?.let { DateHelper.getFullDateWithShortMonth(it) }

            val diffColor = if (item.diffValue < BigDecimal.ZERO)
                resources.getColor(R.color.red_d) else
                resources.getColor(R.color.green_d)

            coinRateDiff.setTextColor(diffColor)
            coinRateDiff.text = App.numberFormatter.format(item.diffValue.toDouble(), showSign = true, precision = 2) + "%"

            item.rateValue?.let { coinRateLast.text = formatter.format(it, canUseLessSymbol = false) }
            val shortValue = shortenValue(item.marketCap.value)
            val marketCap = CurrencyValue(item.marketCap.currency, shortValue.first)
            coinMarketCap.text = formatter.format(marketCap, canUseLessSymbol = false) + shortValue.second

            coinRateHigh.text = formatter.format(item.highValue, canUseLessSymbol = false)
            coinRateLow.text = formatter.format(item.lowValue, canUseLessSymbol = false)
            setViewVisibility(marketCapWrap, isVisible = true)
        })

        presenterView.setSelectedPoint.observe(viewLifecycleOwner, Observer { (time, value, type) ->
            val outputFormat = when (type) {
                ChartType.DAILY,
                ChartType.WEEKLY -> "MMM d, yyyy 'at' HH:mm a"
                else -> "MMM d, yyyy"
            }
            pointInfoPrice.text = formatter.format(value, canUseLessSymbol = false)
            pointInfoDate.text = DateHelper.formatDate(Date(time * 1000), outputFormat)
        })

        presenterView.enableChartType.observe(viewLifecycleOwner, Observer { type ->
            actions[type]?.let { action ->
                action.isEnabled = true
                action.setOnClickListener {
                    presenter.onSelect(type)
                    resetActions(it)
                }
            }
        })

        presenterView.showError.observe(viewLifecycleOwner, Observer {
            chartView.visibility = View.INVISIBLE
            chartError.visibility = View.VISIBLE
            chartError.text = getString(R.string.Charts_Error_NotAvailable)
        })
    }

    // ChartView Listener

    override fun onTouchDown() {
        isCancelable = false // enable swipe

        setViewVisibility(chartPointsInfo, chartViewIndicator, isVisible = true)
        setViewVisibility(chartActions, isVisible = false)
    }

    override fun onTouchUp() {
        isCancelable = true // enable swipe

        setViewVisibility(chartPointsInfo, chartViewIndicator, isVisible = false)
        setViewVisibility(chartActions, isVisible = true)
    }

    override fun onTouchSelect(point: ChartPoint) {
        presenter.onTouchSelect(point)
    }

    private fun bindActions() {
        actions = mapOf(
                Pair(ChartType.DAILY, button1D),
                Pair(ChartType.WEEKLY, button1W),
                Pair(ChartType.MONTHLY, button1M),
                Pair(ChartType.MONTHLY6, button6M),
                Pair(ChartType.MONTHLY18, button1Y))

        actions.values.forEach {
            it.isEnabled = false
        }
    }

    private fun resetActions(current: View) {
        actions.values.forEach { it.isActivated = false }
        setViewVisibility(marketCapWrap, isVisible = false)
        current.isActivated = true
    }

    private fun setViewVisibility(vararg views: View, isVisible: Boolean) {
        views.forEach {
            if (isVisible)
                it.visibility = View.VISIBLE else
                it.visibility = View.INVISIBLE
        }
    }

    // Need to move this to helpers
    private fun shortenValue(number: Number): Pair<BigDecimal, String> {
        val suffix = arrayOf(
                " ",
                getString(R.string.Charts_MarketCap_Thousand),
                getString(R.string.Charts_MarketCap_Million),
                getString(R.string.Charts_MarketCap_Billion),
                getString(R.string.Charts_MarketCap_Trillion)) // "P", "E"

        val valueLong = number.toLong()
        val value = Math.floor(Math.log10(valueLong.toDouble())).toInt()
        val base = value / 3

        var returnSuffix = ""
        var valueDecimal = valueLong.toBigDecimal()
        if (value >= 3 && base < suffix.size) {
            valueDecimal = (valueLong / Math.pow(10.0, (base * 3).toDouble())).toBigDecimal()
            returnSuffix = suffix[base]
        }

        return Pair(valueDecimal, returnSuffix)
    }
}

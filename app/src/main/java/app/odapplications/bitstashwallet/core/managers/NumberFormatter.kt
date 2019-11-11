package app.odapplications.bitstashwallet.core.managers

import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import androidx.core.content.ContextCompat
import app.odapplications.bitstashwallet.R
import app.odapplications.bitstashwallet.core.App
import app.odapplications.bitstashwallet.core.IAppNumberFormatter
import app.odapplications.bitstashwallet.core.ILanguageManager
import app.odapplications.bitstashwallet.entities.CoinValue
import app.odapplications.bitstashwallet.entities.CurrencyValue
import java.math.BigDecimal
import java.math.RoundingMode
import java.text.NumberFormat
import java.util.*
import kotlin.math.abs

class NumberFormatter(private val languageManager: ILanguageManager) : IAppNumberFormatter {

    private val COIN_BIG_NUMBER_EDGE = "0.01".toBigDecimal()
    private val FIAT_BIG_NUMBER_EDGE = "1000".toBigDecimal()
    private val FIAT_SMALL_NUMBER_EDGE = "0.01".toBigDecimal()
    private val FIAT_TEN_CENT_EDGE = "0.1".toBigDecimal()

    private var formatters: MutableMap<String, NumberFormat> = mutableMapOf()

    override fun format(coinValue: CoinValue, explicitSign: Boolean, realNumber: Boolean): String? {
        var value = coinValue.value.abs()

        val customFormatter = getFormatter(languageManager.currentLocale) ?: return null

        when {
            !realNumber && value > COIN_BIG_NUMBER_EDGE -> customFormatter.maximumFractionDigits = 4
            value.compareTo(BigDecimal.ZERO) == 0 -> customFormatter.maximumFractionDigits = 0
            else -> customFormatter.maximumFractionDigits = 8
        }
        value = value.stripTrailingZeros()
        val formatted = customFormatter.format(value)
        var result = "$formatted ${coinValue.coin.code}"

        if (explicitSign && coinValue.value.toLong() != 0L) {
            val sign = if (coinValue.value < BigDecimal.ZERO) "-" else "+"
            result = "$sign $result"
        }

        return result
    }

    override fun formatForTransactions(coinValue: CoinValue): String? {
        var formatted = format(coinValue)
        if (coinValue.value < BigDecimal.ZERO) {
            formatted = "- $formatted"
        }
        return formatted
    }

    override fun format(currencyValue: CurrencyValue, showNegativeSign: Boolean, trimmable: Boolean, canUseLessSymbol: Boolean, shorten: Boolean): String? {

        val absValue = currencyValue.value.abs()
        var value = absValue

        val customFormatter = getFormatter(languageManager.currentLocale) ?: return null

        when {
            value.compareTo(BigDecimal.ZERO) == 0 -> {
                value = BigDecimal.ZERO
                customFormatter.minimumFractionDigits = if (trimmable) 0 else 2
            }
            value < FIAT_TEN_CENT_EDGE && !canUseLessSymbol -> {
                customFormatter.maximumFractionDigits = 4
            }
            value < FIAT_SMALL_NUMBER_EDGE -> {
                value = BigDecimal("0.01")
                customFormatter.maximumFractionDigits = 2
            }
            value >= FIAT_BIG_NUMBER_EDGE && trimmable -> {
                customFormatter.maximumFractionDigits = 0
            }
            else -> {
                customFormatter.maximumFractionDigits = 2
            }
        }

        val formatted = customFormatter.format(value)

        var result = "${currencyValue.currency.symbol}$formatted"

        if (canUseLessSymbol && absValue <= FIAT_SMALL_NUMBER_EDGE && absValue > BigDecimal.ZERO) {
            result = "< $result"
        }

        if (showNegativeSign && currencyValue.value < BigDecimal.ZERO) {
            result = "- $result"
        }

        return result
    }

    override fun formatForTransactions(currencyValue: CurrencyValue, isIncoming: Boolean): SpannableString {
        val spannable = SpannableString(format(currencyValue, showNegativeSign = true, trimmable = true, canUseLessSymbol = true))

        //  set color
        val amountTextColor = if (isIncoming) R.color.green_d else R.color.yellow_d
        val color = ContextCompat.getColor(App.instance, amountTextColor)

        spannable.setSpan(ForegroundColorSpan(color), 0, spannable.length, 0)
        return spannable
    }

    override fun format(value: Double, showSign: Boolean, precision: Int): String {
        val customFormatter = getFormatter(languageManager.currentLocale)?.also {
            it.maximumFractionDigits = precision
        }

        if (value == 0.0) {
            customFormatter?.maximumFractionDigits = 0
        }

        var format = customFormatter?.format(abs(value)) ?: "0"
        if (showSign) {
            format = if (value < 0.0)
                "-$format" else {
                "+$format"
            }
        }

        return format
    }

    private fun getFormatter(locale: Locale): NumberFormat? {
        return formatters[locale.language] ?: run {
            val newFormatter = NumberFormat.getInstance(locale).apply {
                roundingMode = RoundingMode.HALF_EVEN
            }
            formatters[locale.language] = newFormatter
            return newFormatter
        }
    }
}

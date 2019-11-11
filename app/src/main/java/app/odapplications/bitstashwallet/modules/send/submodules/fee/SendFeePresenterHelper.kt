package app.odapplications.bitstashwallet.modules.send.submodules.fee

import app.odapplications.bitstashwallet.core.IAppNumberFormatter
import app.odapplications.bitstashwallet.entities.*
import app.odapplications.bitstashwallet.modules.send.SendModule
import java.math.BigDecimal

class SendFeePresenterHelper(
        private val numberFormatter: IAppNumberFormatter,
        private val coin: Coin,
        private val baseCurrency: Currency) {

    fun feeAmount(coinAmount: BigDecimal? = null, inputType: SendModule.InputType, rate: Rate?): String? {
        return when (inputType) {
            SendModule.InputType.COIN -> coinAmount?.let {
                numberFormatter.format(CoinValue(coin, it))
            }
            SendModule.InputType.CURRENCY -> {
                rate?.value?.let { rateValue ->
                    coinAmount?.times(rateValue)?.let { amount ->
                        numberFormatter.format(CurrencyValue(baseCurrency, amount))
                    }
                }
            }
        }
    }

}

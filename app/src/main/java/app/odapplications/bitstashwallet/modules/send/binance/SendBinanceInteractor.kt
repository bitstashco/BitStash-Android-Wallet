package app.odapplications.bitstashwallet.modules.send.binance

import app.odapplications.bitstashwallet.core.ISendBinanceAdapter
import app.odapplications.bitstashwallet.modules.send.SendModule
import io.reactivex.Single
import java.math.BigDecimal

class SendBinanceInteractor(private val adapter: ISendBinanceAdapter) : SendModule.ISendBinanceInteractor {

    override val availableBalance: BigDecimal
        get() = adapter.availableBalance

    override val availableBinanceBalance: BigDecimal
        get() = adapter.availableBinanceBalance

    override val fee: BigDecimal
        get() = adapter.fee

    override fun validate(address: String) {
        adapter.validate(address)
    }

    override fun send(amount: BigDecimal, address: String, memo: String?): Single<Unit> {
        return adapter.send(amount, address, memo)
    }

}

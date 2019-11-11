package app.odapplications.bitstashwallet.modules.send.eos

import app.odapplications.bitstashwallet.core.ISendEosAdapter
import app.odapplications.bitstashwallet.modules.send.SendModule
import io.reactivex.Single
import java.math.BigDecimal

class SendEosInteractor(private val adapter: ISendEosAdapter) : SendModule.ISendEosInteractor {

    override val availableBalance: BigDecimal
        get() = adapter.availableBalance

    override fun validate(account: String) {
        adapter.validate(account)
    }

    override fun send(amount: BigDecimal, account: String, memo: String?): Single<Unit> {
        return adapter.send(amount, account, memo)
    }

}

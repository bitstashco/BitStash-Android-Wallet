package io.horizontalsystems.bitstashwallet.modules.send.ethereum

import io.horizontalsystems.bitstashwallet.core.ISendEthereumAdapter
import io.horizontalsystems.bitstashwallet.modules.send.SendModule
import io.reactivex.Single
import java.math.BigDecimal

class SendEthereumInteractor(private val adapter: ISendEthereumAdapter) : SendModule.ISendEthereumInteractor {
    override val ethereumBalance: BigDecimal
        get() = adapter.ethereumBalance

    override fun availableBalance(gasPrice: Long): BigDecimal {
        return adapter.availableBalance(gasPrice)
    }

    override fun validate(address: String) {
        adapter.validate(address)
    }

    override fun fee(gasPrice: Long): BigDecimal {
        return adapter.fee(gasPrice)
    }

    override fun send(amount: BigDecimal, address: String, gasPrice: Long): Single<Unit> {
        return adapter.send(amount, address, gasPrice)
    }

}

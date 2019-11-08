package io.horizontalsystems.bitstashwallet.core.adapters

import io.horizontalsystems.bitstashwallet.core.*
import io.horizontalsystems.ethereumkit.core.EthereumKit
import io.reactivex.Flowable
import io.reactivex.Single
import java.math.BigDecimal
import java.math.BigInteger
import java.math.RoundingMode

abstract class EthereumBaseAdapter(
        protected val ethereumKit: EthereumKit,
        val decimal: Int) : IAdapter, ISendEthereumAdapter, ITransactionsAdapter, IBalanceAdapter, IReceiveAdapter {

    // IAdapter

    override fun start() {
        // started via EthereumKitManager
    }

    override fun stop() {
        // stopped via EthereumKitManager
    }

    override fun refresh() {
        // refreshed via EthereumKitManager
    }

    override val debugInfo: String = ethereumKit.debugInfo()

    // ITransactionsAdapter

    override val confirmationsThreshold: Int = 12

    override val lastBlockHeight: Int? get() = ethereumKit.lastBlockHeight?.toInt()

    override val lastBlockHeightUpdatedFlowable: Flowable<Unit>
        get() = ethereumKit.lastBlockHeightFlowable.map { Unit }

    // ISendEthereumAdapter

    override fun send(amount: BigDecimal, address: String, gasPrice: Long): Single<Unit> {
        val poweredDecimal = amount.scaleByPowerOfTen(decimal)
        val noScaleDecimal = poweredDecimal.setScale(0, RoundingMode.HALF_DOWN)

        return sendSingle(address, noScaleDecimal.toPlainString(), gasPrice)
    }

    override fun validate(address: String) {
        ethereumKit.validateAddress(address)
    }

    // IReceiveAdapter

    override val receiveAddress: String get() = ethereumKit.receiveAddress

    protected fun balanceInBigDecimal(balance: BigInteger?, decimal: Int): BigDecimal {
        balance?.toBigDecimal()?.let {
            val converted = it.movePointLeft(decimal)
            return converted.stripTrailingZeros()
        } ?: return BigDecimal.ZERO
    }

    open fun sendSingle(address: String, amount: String, gasPrice: Long): Single<Unit> {
        return Single.just(Unit)
    }

}

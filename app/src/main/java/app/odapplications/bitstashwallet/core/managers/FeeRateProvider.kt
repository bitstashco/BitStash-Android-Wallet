package app.odapplications.bitstashwallet.core.managers

import android.content.Context
import app.odapplications.bitstashwallet.core.FeeRatePriority
import app.odapplications.bitstashwallet.core.IAppConfigProvider
import app.odapplications.bitstashwallet.core.IFeeRateProvider
import app.odapplications.bitstashwallet.entities.FeeRateInfo
import io.horizontalsystems.feeratekit.FeeRate
import io.horizontalsystems.feeratekit.FeeRateKit

class FeeRateProvider(context: Context, appConfig: IAppConfigProvider) : FeeRateKit.Listener {

    private val feeRateKit = FeeRateKit(
            infuraProjectId = appConfig.infuraProjectId,
            infuraProjectSecret = appConfig.infuraProjectSecret,
            context = context,
            listener = this
    )

    override fun onRefresh(rates: List<FeeRate>) {

    }

    fun bitcoinFeeRates(): List<FeeRateInfo> {
        return feeRates(feeRateKit.bitcoin())
    }

    fun bitcoinCashFeeRates(): List<FeeRateInfo> {
        return feeRates(feeRateKit.bitcoinCash())
    }

    fun ethereumFeeRates(): List<FeeRateInfo> {
        return feeRates(feeRateKit.ethereum())
    }

    fun dashFeeRates(): List<FeeRateInfo> {
        return feeRates(feeRateKit.dash())
    }

    private fun feeRates(feeRate: FeeRate): List<FeeRateInfo> {
        val feeRatesInfoList = mutableListOf<FeeRateInfo>()
        feeRatesInfoList.add(FeeRateInfo(FeeRatePriority.LOW, feeRate.lowPriority, feeRate.lowPriorityDuration))
        feeRatesInfoList.add(FeeRateInfo(FeeRatePriority.MEDIUM, feeRate.mediumPriority, feeRate.mediumPriorityDuration))
        feeRatesInfoList.add(FeeRateInfo(FeeRatePriority.HIGH, feeRate.mediumPriority, feeRate.highPriorityDuration))

        return feeRatesInfoList
    }
}

class BitcoinFeeRateProvider(private val feeRateProvider: FeeRateProvider) : IFeeRateProvider {
    override fun feeRates(): List<FeeRateInfo> {
        return feeRateProvider.bitcoinFeeRates()
    }
}

class BitcoinCashFeeRateProvider(private val feeRateProvider: FeeRateProvider) : IFeeRateProvider {
    override fun feeRates(): List<FeeRateInfo> {
        return feeRateProvider.bitcoinCashFeeRates()
    }
}

class EthereumFeeRateProvider(private val feeRateProvider: FeeRateProvider) : IFeeRateProvider {
    override fun feeRates(): List<FeeRateInfo> {
        return feeRateProvider.ethereumFeeRates()
    }
}

class DashFeeRateProvider(private val feeRateProvider: FeeRateProvider) : IFeeRateProvider {
    override fun feeRates(): List<FeeRateInfo> {
        return feeRateProvider.dashFeeRates()
    }

}

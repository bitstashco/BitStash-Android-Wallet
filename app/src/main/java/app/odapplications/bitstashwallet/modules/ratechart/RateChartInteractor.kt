package app.odapplications.bitstashwallet.modules.ratechart

import app.odapplications.bitstashwallet.core.ILocalStorage
import app.odapplications.bitstashwallet.core.IRateStatsManager
import app.odapplications.bitstashwallet.core.IRateStorage
import app.odapplications.bitstashwallet.core.managers.StatsData
import app.odapplications.bitstashwallet.lib.chartview.ChartView.ChartType
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class RateChartInteractor(
        private val rateStatsManager: IRateStatsManager,
        private val rateStorage: IRateStorage,
        private val localStorage: ILocalStorage)
    : RateChartModule.Interactor {

    private val disposables = CompositeDisposable()
    var delegate: RateChartModule.InteractorDelegate? = null

    override var defaultChartType: ChartType
        get() = localStorage.chartMode
        set(value) {
            localStorage.chartMode = value
        }

    override fun syncStats(coinCode: String, currencyCode: String) {
        rateStatsManager.syncStats(coinCode, currencyCode)
    }

    override fun subscribeToChartStats() {
        rateStatsManager.statsFlowable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    if (it is StatsData) {
                        delegate?.onReceiveStats(it)
                    }
                }, {
                    delegate?.onReceiveError(it)
                })
                .let { disposables.add(it) }
    }

    override fun subscribeToLatestRate(coinCode: String, currencyCode: String) {
        rateStorage.latestRateObservable(coinCode, currencyCode)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    delegate?.onReceiveLatestRate(it)
                }, {
                    delegate?.onReceiveError(it)
                })
                .let { disposables.add(it) }
    }

    override fun clear() {
        disposables.clear()
    }

}

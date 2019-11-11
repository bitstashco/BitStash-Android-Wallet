package app.odapplications.bitstashwallet.modules.balance

import app.odapplications.bitstashwallet.core.AdapterState
import app.odapplications.bitstashwallet.core.IPredefinedAccountTypeManager
import app.odapplications.bitstashwallet.core.managers.StatsData
import app.odapplications.bitstashwallet.entities.Account
import app.odapplications.bitstashwallet.entities.Currency
import app.odapplications.bitstashwallet.entities.Rate
import app.odapplications.bitstashwallet.entities.Wallet
import app.odapplications.bitstashwallet.lib.chartview.ChartView.ChartType
import app.odapplications.bitstashwallet.modules.balance.BalanceModule.BalanceItem
import app.odapplications.bitstashwallet.modules.balance.BalanceModule.StatsButtonState
import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.PublishSubject
import java.math.BigDecimal
import java.util.concurrent.TimeUnit

class BalancePresenter(
        private val interactor: BalanceModule.IInteractor,
        private val router: BalanceModule.IRouter,
        private val dataSource: BalanceModule.DataSource,
        private val predefinedAccountTypeManager: IPredefinedAccountTypeManager,
        private val factory: BalanceViewItemFactory)
    : BalanceModule.IViewDelegate, BalanceModule.IInteractorDelegate {

    var view: BalanceModule.IView? = null

    private val disposables = CompositeDisposable()
    private val flushSubject = PublishSubject.create<Unit>()
    private val reloadViewSubject = PublishSubject.create<Unit>()
    private val showSortingButtonThreshold = 5
    private var accountToBackup: Account? = null

    // ViewDelegate

    override val itemsCount: Int
        get() = dataSource.count

    override fun viewDidLoad() {
        dataSource.sortType = interactor.getSortingType()
        view?.setStatsButton(dataSource.statsButtonState)

        interactor.initWallets()

        flushSubject
                .debounce(1, TimeUnit.SECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnNext { updateViewItems() }
                .subscribe()?.let { disposables.add(it) }

        reloadViewSubject
                .throttleLast(1, TimeUnit.SECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .doOnNext { view?.reload() }
                .subscribe()?.let { disposables.add(it) }

        Flowable.interval(1, TimeUnit.MINUTES)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    dataSource.items.mapNotNull { it.rate }.forEach {
                        didUpdateRate(it)
                    }
                }.let { disposables.add(it) }
    }

    override fun getViewItem(position: Int) =
            factory.createViewItem(dataSource.getItem(position), dataSource.currency)

    override fun getHeaderViewItem() =
            factory.createHeaderViewItem(dataSource.items, dataSource.statsButtonState == StatsButtonState.SELECTED, dataSource.currency)

    override fun refresh() {
        interactor.refresh()
    }

    override fun onReceive(position: Int) {
        val wallet = dataSource.getItem(position).wallet
        if (wallet.account.isBackedUp) {
            router.openReceiveDialog(wallet)
        } else {
            interactor.predefinedAccountType(wallet)?.let { predefinedAccountType ->
                accountToBackup = wallet.account
                view?.showBackupAlert(wallet.coin, predefinedAccountType)
            }
        }
    }

    override fun onPay(position: Int) {
        router.openSendDialog(dataSource.getItem(position).wallet)
    }

    override fun onClear() {
        interactor.clear()
        disposables.clear()
    }

    override fun openManageCoins() {
        router.openManageCoins()
    }

    override fun onSortClick() {
        router.openSortTypeDialog(dataSource.sortType)
    }

    override fun onChartClick() {
        dataSource.statsButtonState = if (dataSource.statsButtonState == StatsButtonState.SELECTED) StatsButtonState.NORMAL else StatsButtonState.SELECTED
        updateStats()

        view?.setStatsButton(dataSource.statsButtonState)
        view?.reload()
    }

    override fun onSortTypeChanged(sortType: BalanceSortType) {
        dataSource.sortType = sortType
        if (sortType == BalanceSortType.PercentGrowth) {
            dataSource.statsButtonState = StatsButtonState.SELECTED
            updateStats()

            view?.setStatsButton(dataSource.statsButtonState)
        } else {
            interactor.saveSortingType(sortType)
        }
        view?.reload()
    }

    // InteractorDelegate

    override fun willEnterForeground() {
        updateStats()
    }

    override fun didUpdateWallets(wallets: List<Wallet>) {
        val balanceItems = wallets.map { wallet ->
            val adapter = interactor.getBalanceAdapterForWallet(wallet)
            val adapterState = adapter?.state ?: AdapterState.NotReady

            val balanceItem = BalanceItem(wallet, adapter?.balance ?: BigDecimal.ZERO, adapterState)

            balanceItem
        }

        dataSource.set(balanceItems)
        interactor.fetchRates(dataSource.currency.code, dataSource.coinCodes)
        updateStats()

        if (dataSource.items.isEmpty()) {
            dataSource.statsButtonState = StatsButtonState.HIDDEN
        } else if (dataSource.statsButtonState == StatsButtonState.HIDDEN) {
            dataSource.statsButtonState = StatsButtonState.NORMAL
        }
        view?.setSortingOn(balanceItems.size >= showSortingButtonThreshold)
        view?.setStatsButton(dataSource.statsButtonState)
        view?.reload()
    }

    override fun didUpdateCurrency(currency: Currency) {
        dataSource.currency = currency
        dataSource.clearRates()
        interactor.fetchRates(currency.code, dataSource.coinCodes)
        updateStats()
        view?.reload()
    }

    override fun didUpdateBalance(wallet: Wallet, balance: BigDecimal) {
        val position = dataSource.getPosition(wallet)
        dataSource.setBalance(position, balance)
        updateByPosition(position)
        view?.updateHeader()
    }

    override fun didUpdateState(wallet: Wallet, state: AdapterState) {
        val position = dataSource.getPosition(wallet)
        dataSource.setState(position, state)

        postViewReload()
    }

    @Synchronized
    override fun didUpdateRate(rate: Rate) {
        val positions = dataSource.getPositionsByCoinCode(rate.coinCode)

        if (positions.isEmpty())
            return

        if (dataSource.statsButtonState == StatsButtonState.SELECTED) {
            interactor.syncStats(rate.coinCode, dataSource.currency.code)
        }

        positions.forEach { position ->
            dataSource.setRate(position, rate)
        }

        postViewReload()
    }

    override fun onReceiveRateStats(data: StatsData) {
        val positions = dataSource.getPositionsByCoinCode(data.coinCode)
        val points = data.stats[ChartType.DAILY.name] ?: return
        val diff = data.diff[ChartType.DAILY.name] ?: return

        positions.forEach { position ->
            dataSource.setChartData(position, BalanceChartData(points, diff))
        }
        postViewReload()
    }

    override fun onFailFetchChartStats(coinCode: String) {
        dataSource.getPositionsByCoinCode(coinCode).forEach { position ->
            dataSource.setChartData(position, BalanceChartData(error = true))
            view?.updateItem(position)
        }
    }

    override fun didRefresh() {
        view?.didRefresh()
    }

    override fun openBackup() {
        accountToBackup?.let { account ->
            val accountType = predefinedAccountTypeManager.allTypes.first { it.supports(account.type) }
            router.openBackup(account, accountType.coinCodes)
            accountToBackup = null
        }
    }

    override fun openChart(position: Int) {
        val item = dataSource.getItem(position)
        val chartData = item.chartData
        if (chartData == null || chartData.error)
            return
        router.openChart(item.wallet.coin)
    }

    private fun postViewReload() {
        reloadViewSubject.onNext(Unit)
    }

    private fun updateViewItems() {
        dataSource.getUpdatedPositions().forEach {
            view?.updateItem(it)
        }
        dataSource.clearUpdatedPositions()
    }

    private fun updateByPosition(position: Int) {
        dataSource.addUpdatedPosition(position)
        flushSubject.onNext(Unit)
    }

    private fun updateStats() {
        if (dataSource.statsButtonState == StatsButtonState.SELECTED) {
            dataSource.items.forEach { item ->
                interactor.syncStats(coinCode = item.wallet.coin.code, currencyCode = dataSource.currency.code)
            }
        }
    }

}

package io.horizontalsystems.bitstashwallet.core.storage

import io.horizontalsystems.bitstashwallet.core.IRateStorage
import io.horizontalsystems.bitstashwallet.entities.Rate
import io.horizontalsystems.bitstashwallet.modules.transactions.CoinCode
import io.reactivex.Flowable
import io.reactivex.Single
import java.util.concurrent.Executors

class RatesRepository(private val appDatabase: AppDatabase) : IRateStorage {

    private val executor = Executors.newSingleThreadExecutor()

    override fun latestRateObservable(coinCode: CoinCode, currencyCode: String): Flowable<Rate> {
        return appDatabase.ratesDao().getLatestRateFlowable(coinCode, currencyCode).distinctUntilChanged()
    }

    override fun latestRate(coinCode: CoinCode, currencyCode: String): Rate? {
        return appDatabase.ratesDao().getLatestRate(coinCode, currencyCode)
    }

    override fun rateSingle(coinCode: CoinCode, currencyCode: String, timestamp: Long): Single<Rate> {
        return appDatabase.ratesDao().getRate(coinCode, currencyCode, timestamp)
    }

    override fun save(rate: Rate) {
        executor.execute {
            appDatabase.ratesDao().insert(rate)
        }
    }

    override fun saveLatest(rate: Rate) {
        executor.execute {
            appDatabase.ratesDao().deleteLatest(rate.coinCode, rate.currencyCode)
            appDatabase.ratesDao().insert(rate)
        }
    }

    override fun deleteAll() {
        executor.execute {
            appDatabase.ratesDao().deleteAll()
        }
    }

}

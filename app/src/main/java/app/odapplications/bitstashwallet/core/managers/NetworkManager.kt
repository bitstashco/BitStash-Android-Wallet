package app.odapplications.bitstashwallet.core.managers

import com.google.gson.GsonBuilder
import com.google.gson.JsonObject
import app.odapplications.bitstashwallet.core.IAppConfigProvider
import app.odapplications.bitstashwallet.core.INetworkManager
import app.odapplications.bitstashwallet.core.managers.ServiceExchangeApi.HostType
import app.odapplications.bitstashwallet.core.managers.ServiceExchangeApi.IExchangeRate
import app.odapplications.bitstashwallet.entities.LatestRateData
import app.odapplications.bitstashwallet.entities.RateStatData
import app.odapplications.bitstashwallet.modules.transactions.CoinCode
import app.odapplications.bitstashwallet.viewHelpers.DateHelper.formatDateInUTC
import io.reactivex.Flowable
import io.reactivex.Single
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*
import java.math.BigDecimal
import java.util.concurrent.TimeUnit

class NetworkManager(private val appConfig: IAppConfigProvider) : INetworkManager {

    override fun getRateStats(hostType: HostType, coinCode: String, currency: String): Single<RateStatData> {
        return rateApiClient(hostType).getRateStats(currency, coinCode)
    }

    override fun getRateByDay(hostType: HostType, coinCode: String, currency: String, timestamp: Long): Single<BigDecimal> {
        return rateApiClient(hostType)
                .getRateByDay(coinCode, currency, formatDateInUTC(timestamp, "yyyy/MM/dd"))
                .map { it.toBigDecimal() }
    }

    override fun getRateByHour(hostType: HostType, coinCode: CoinCode, currency: String, timestamp: Long): Single<BigDecimal> {
        return rateApiClient(hostType)
                .getRateByHour(coinCode, currency, formatDateInUTC(timestamp, "yyyy/MM/dd/HH"))
                .flatMap { minuteRates ->
                    Single.just(minuteRates.getValue(formatDateInUTC(timestamp, "mm")).toBigDecimal())
                }
    }

    override fun getLatestRateData(hostType: HostType, currency: String): Single<LatestRateData> {
        return rateApiClient(hostType).getLatestRate(currency)
                .map { LatestRateData(it.rates, it.currency, it.timestamp / 1000) }
    }

    override fun getTransaction(host: String, path: String): Flowable<JsonObject> {
        return ServiceFullTransaction.service(host).getFullTransaction(path)
    }

    override fun getTransactionWithPost(host: String, path: String, body: Map<String, Any>): Flowable<JsonObject> {
        return ServiceFullTransaction.service(host)
                .getFullTransactionWithPost(path, body.mapValues { it.value.toString() })
    }

    override fun ping(host: String, url: String): Flowable<Any> {
        return ServicePing.service(host).ping(url)
    }

    private fun rateApiClient(hostType: HostType): IExchangeRate {
        var timeout = 60L
        var gateway = appConfig.ipfsMainGateway
        if (hostType == HostType.FALLBACK) {
            timeout = 10L
            gateway = appConfig.ipfsFallbackGateway
        }

        return APIClient.retrofit("https://$gateway/ipns/${appConfig.ipfsId}/", timeout)
                .create(IExchangeRate::class.java)
    }
}

object ServiceExchangeApi {

    enum class HostType {
        MAIN, FALLBACK
    }

    interface IExchangeRate {

        @GET("xrates/historical/{coin}/{fiat}/{datePath}/index.json")
        fun getRateByDay(
                @Path("coin") coinCode: String,
                @Path("fiat") currency: String,
                @Path("datePath") datePath: String
        ): Single<String>

        @GET("xrates/historical/{coin}/{fiat}/{datePath}/index.json")
        fun getRateByHour(
                @Path("coin") coinCode: String,
                @Path("fiat") currency: String,
                @Path("datePath") datePath: String
        ): Single<Map<String, String>>

        @GET("xrates/latest/{fiat}/index.json")
        fun getLatestRate(
                @Path("fiat") currency: String
        ): Single<LatestRateData>

        @GET("xrates/stats/{fiat}/{coin}/index.json")
        fun getRateStats(
                @Path("fiat") currency: String,
                @Path("coin") coinCode: String
        ): Single<RateStatData>
    }
}

object ServiceFullTransaction {
    fun service(apiURL: String): FullTransactionAPI {
        return APIClient.retrofit(apiURL)
                .create(FullTransactionAPI::class.java)
    }

    interface FullTransactionAPI {
        @GET
        @Headers("Content-Type: application/json")
        fun getFullTransaction(@Url path: String): Flowable<JsonObject>

        @POST
        @Headers("Content-Type: application/json")
        fun getFullTransactionWithPost(@Url path: String, @Body body: Map<String, String>): Flowable<JsonObject>
    }

}

object ServicePing {
    fun service(apiURL: String): FullTransactionAPI {
        return APIClient.retrofit(apiURL, timeout = 8).create(FullTransactionAPI::class.java)
    }

    interface FullTransactionAPI {
        @GET
        fun ping(@Url path: String): Flowable<Any>
    }
}

object APIClient {
    fun retrofit(apiURL: String, timeout: Long = 60): Retrofit {

        val logger = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BASIC
        }

        val httpClient = OkHttpClient.Builder()
        httpClient.addInterceptor(logger)
        httpClient.connectTimeout(timeout, TimeUnit.SECONDS)
        httpClient.readTimeout(timeout, TimeUnit.SECONDS)

        val gsonBuilder = GsonBuilder().setLenient()

        return Retrofit.Builder()
                .baseUrl(apiURL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gsonBuilder.create()))
                .client(httpClient.build())
                .build()
    }
}

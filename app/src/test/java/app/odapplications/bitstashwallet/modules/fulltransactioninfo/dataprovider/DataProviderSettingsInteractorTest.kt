package app.odapplications.bitstashwallet.modules.fulltransactioninfo.dataprovider

import com.google.gson.JsonObject
import com.nhaarman.mockito_kotlin.any
import com.nhaarman.mockito_kotlin.verify
import com.nhaarman.mockito_kotlin.whenever
import app.odapplications.bitstashwallet.core.INetworkManager
import app.odapplications.bitstashwallet.core.ITransactionDataProviderManager
import app.odapplications.bitstashwallet.entities.Coin
import app.odapplications.bitstashwallet.entities.CoinType
import app.odapplications.bitstashwallet.modules.RxBaseTest
import io.reactivex.Flowable
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.mock

class DataProviderSettingsInteractorTest {

    private val dataProviderManager = mock(ITransactionDataProviderManager::class.java)
    private val networkManager = mock(INetworkManager::class.java)
    private val delegate = mock(DataProviderSettingsModule.InteractorDelegate::class.java)
    private val coin = mock(Coin::class.java)

    private lateinit var interactor: DataProviderSettingsInteractor

    @Before
    fun setup() {
        RxBaseTest.setup()

        whenever(coin.type).thenReturn(mock(CoinType.Bitcoin::class.java))

        interactor = DataProviderSettingsInteractor(dataProviderManager, networkManager)
        interactor.delegate = delegate
    }

    @Test
    fun pingProvider_success() {
        whenever(networkManager.ping(any(), any()))
                .thenReturn(Flowable.just(JsonObject()))

        interactor.pingProvider("abc.com", "http://abc.com")

        verify(delegate).onPingSuccess("abc.com")
    }

    @Test
    fun pingProvider_failure() {
        whenever(networkManager.ping(any(), any()))
                .thenReturn(Flowable.error(Error("")))

        interactor.pingProvider("abc.com", "http://abc.com")

        verify(delegate).onPingFailure("abc.com")
    }

    @Test
    fun providers() {
        interactor.providers(coin)

        verify(dataProviderManager).providers(coin)
    }

    @Test
    fun baseProvider() {
        interactor.baseProvider(coin)

        verify(dataProviderManager).baseProvider(coin)
    }

    @Test
    fun setBaseProvider() {
        interactor.setBaseProvider("abc.com", coin)

        verify(dataProviderManager).setBaseProvider("abc.com", coin)
        verify(delegate).onSetDataProvider()
    }

}

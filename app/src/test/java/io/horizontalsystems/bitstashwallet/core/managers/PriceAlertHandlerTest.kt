package io.horizontalsystems.bitstashwallet.core.managers

import com.nhaarman.mockito_kotlin.*
import io.horizontalsystems.bitstashwallet.core.INotificationFactory
import io.horizontalsystems.bitstashwallet.core.INotificationManager
import io.horizontalsystems.bitstashwallet.core.IPriceAlertsStorage
import io.horizontalsystems.bitstashwallet.core.factories.PriceAlertItem
import io.horizontalsystems.bitstashwallet.entities.Coin
import io.horizontalsystems.bitstashwallet.entities.CoinType
import io.horizontalsystems.bitstashwallet.entities.LatestRateData
import io.horizontalsystems.bitstashwallet.entities.PriceAlert
import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test


class PriceAlertHandlerTest {

    private val priceAlertStorage = mock<IPriceAlertsStorage>()
    private val notificationManager = mock<INotificationManager>()
    private val notificationFactory = mock<INotificationFactory>()
    private val handler = PriceAlertHandler(priceAlertStorage, notificationManager, notificationFactory)

    private val btcCoin = Coin("Bitcoin", "BTC", 0, CoinType.Bitcoin)
    private val ethCoin = Coin("Ethereum", "ETH", 0, CoinType.Ethereum)

    private val rates = mapOf("BTC" to "8600", "ETH" to "120")
    private val ratesWithOnlyBtc = mapOf("BTC" to "8600")
    private val latestRateData = LatestRateData(rates, "USD", 123456)
    private val priceAlert1 = PriceAlert(btcCoin, PriceAlert.State.PERCENT_3, 8200.toBigDecimal())
    private val priceAlert2 = PriceAlert(ethCoin, PriceAlert.State.PERCENT_2, 100.toBigDecimal())

    private var listCaptor: KArgumentCaptor<List<PriceAlertItem>> = argumentCaptor()


    @Before
    fun setup() {
        whenever(priceAlertStorage.all()).thenReturn(listOf(priceAlert1, priceAlert2))
    }

    @Test
    fun handleAlerts_Receive2RatesFor2Alerts() {
        val expectedItem1 = PriceAlertItem(btcCoin, 3)
        val expectedItem2 = PriceAlertItem(ethCoin, 2)

        handler.handleAlerts(latestRateData)

        verify(notificationFactory).notifications(listCaptor.capture())
        assertEquals(expectedItem1.coin.code, listCaptor.firstValue[0].coin.code)
        assertEquals(expectedItem1.state, listCaptor.firstValue[0].state)
        assertEquals(expectedItem2.coin.code, listCaptor.firstValue[1].coin.code)
        assertEquals(expectedItem2.state, listCaptor.firstValue[1].state)
    }

    @Test
    fun handleAlerts_ReceivedOnlyBtcRate() {
        val expectedItem1 = PriceAlertItem(btcCoin, 3)
        val latestRateDataWithOnlyBtc = LatestRateData(ratesWithOnlyBtc, "USD", 123456)

        handler.handleAlerts(latestRateDataWithOnlyBtc)

        verify(notificationFactory).notifications(listCaptor.capture())
        assertEquals(expectedItem1.coin.code, listCaptor.firstValue[0].coin.code)
        assertEquals(expectedItem1.state, listCaptor.firstValue[0].state)
        assertEquals(1, listCaptor.firstValue.size)
    }

    @Test
    fun handleAlerts_AlertWithoutLastRate() {
        val priceAlertNoRate = PriceAlert(btcCoin, PriceAlert.State.PERCENT_3, null)

        whenever(priceAlertStorage.all()).thenReturn(listOf(priceAlertNoRate, priceAlert2))

        val expectedItem = PriceAlertItem(ethCoin, 2)

        handler.handleAlerts(latestRateData)

        verify(notificationFactory).notifications(listCaptor.capture())
        assertEquals(expectedItem.coin.code, listCaptor.firstValue[0].coin.code)
        assertEquals(expectedItem.state, listCaptor.firstValue[0].state)
        assertEquals(1, listCaptor.firstValue.size)
    }

}

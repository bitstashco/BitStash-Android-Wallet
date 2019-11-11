package app.odapplications.bitstashwallet.core.managers

import android.content.Context
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import android.net.NetworkRequest
import app.odapplications.bitstashwallet.core.App
import io.reactivex.subjects.PublishSubject


class ConnectivityManager {

    private val connectivityManager = App.instance.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

    var isConnected = connectivityManager.activeNetworkInfo?.isConnected ?: false
    val networkAvailabilitySignal = PublishSubject.create<Unit>()

    init {
        listenNetworkViaConnectivityManager()
    }

    private fun onUpdateStatus() {
        val newIsConnected = connectivityManager.activeNetworkInfo?.isConnected ?: false

        if (isConnected != newIsConnected) {
            isConnected = newIsConnected
            networkAvailabilitySignal.onNext(Unit)
        }
    }

    private fun listenNetworkViaConnectivityManager() {
        val request = NetworkRequest.Builder()
                .addCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)
                .addCapability(NetworkCapabilities.NET_CAPABILITY_NOT_RESTRICTED)
                .build()

        connectivityManager.registerNetworkCallback(request, object : ConnectivityManager.NetworkCallback() {
            override fun onAvailable(network: Network) {
                onUpdateStatus()
            }

            override fun onLost(network: Network?) {
                onUpdateStatus()
            }
        })

    }

}

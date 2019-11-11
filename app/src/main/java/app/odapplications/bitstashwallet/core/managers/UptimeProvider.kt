package app.odapplications.bitstashwallet.core.managers

import android.os.SystemClock
import app.odapplications.bitstashwallet.core.IUptimeProvider

class UptimeProvider: IUptimeProvider {

    override val uptime: Long
        get() = SystemClock.elapsedRealtime()

}

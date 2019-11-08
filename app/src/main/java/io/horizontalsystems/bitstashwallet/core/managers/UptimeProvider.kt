package io.horizontalsystems.bitstashwallet.core.managers

import android.os.SystemClock
import io.horizontalsystems.bitstashwallet.core.IUptimeProvider

class UptimeProvider: IUptimeProvider {

    override val uptime: Long
        get() = SystemClock.elapsedRealtime()

}

package io.horizontalsystems.bitstashwallet.core.managers

import io.horizontalsystems.bitstashwallet.core.ICurrentDateProvider
import java.util.*

class CurrentDateProvider: ICurrentDateProvider {

    override val currentDate: Date
        get() = Date()

}

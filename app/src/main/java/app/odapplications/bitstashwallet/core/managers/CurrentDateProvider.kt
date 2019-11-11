package app.odapplications.bitstashwallet.core.managers

import app.odapplications.bitstashwallet.core.ICurrentDateProvider
import java.util.*

class CurrentDateProvider: ICurrentDateProvider {

    override val currentDate: Date
        get() = Date()

}

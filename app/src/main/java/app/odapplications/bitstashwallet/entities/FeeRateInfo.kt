package app.odapplications.bitstashwallet.entities

import app.odapplications.bitstashwallet.core.FeeRatePriority

data class FeeRateInfo(val priority: FeeRatePriority, val feeRate: Long, val duration: Long)

package io.horizontalsystems.bitstashwallet.entities

import io.horizontalsystems.bitstashwallet.core.FeeRatePriority

data class FeeRateInfo(val priority: FeeRatePriority, val feeRate: Long, val duration: Long)

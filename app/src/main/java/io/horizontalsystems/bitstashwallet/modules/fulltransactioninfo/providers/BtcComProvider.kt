package io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers

import com.google.gson.Gson
import com.google.gson.JsonObject
import com.google.gson.annotations.SerializedName
import io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule
import io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.Request.GetRequest
import java.util.*

class BtcComBitcoinProvider : FullTransactionInfoModule.BitcoinForksProvider {
    override val name = "Btc.com"

    override fun url(hash: String): String {
        return "https://btc.com/$hash"
    }

    override fun apiRequest(hash: String): FullTransactionInfoModule.Request {
        return GetRequest("https://chain.api.btc.com/v3/tx/$hash")
    }

    override fun convert(json: JsonObject): BitcoinResponse {
        return Gson().fromJson(json["data"], BtcComResponse::class.java)
    }
}

class BtcComBitcoinCashProvider : FullTransactionInfoModule.BitcoinForksProvider {
    override val name = "Btc.com"

    override fun url(hash: String): String {
        return "https://bch.btc.com/$hash"
    }

    override fun apiRequest(hash: String): FullTransactionInfoModule.Request {
        return GetRequest("https://bch-chain.api.btc.com/v3/tx/$hash")
    }

    override fun convert(json: JsonObject): BitcoinResponse {
        return Gson().fromJson(json["data"], BtcComResponse::class.java)
    }
}

class BtcComResponse(
        @SerializedName("fee") val fees: Int,
        @SerializedName("inputs") val vin: ArrayList<Vin>,
        @SerializedName("outputs") val vout: ArrayList<Vout>,
        @SerializedName("confirmations") override val confirmations: String,
        @SerializedName("hash") override val hash: String,
        @SerializedName("block_height") override val height: Int,
        @SerializedName("block_time") val time: Long,
        @SerializedName("size") override val size: Int) : BitcoinResponse() {

    override val fee get() = fees.toDouble() / btcRate
    override val feePerByte: Double? get() = null
    override val date: Date get() = Date(time * 1000)
    override val inputs get() = vin as ArrayList<Input>
    override val outputs get() = vout as ArrayList<Output>

    class Vin(@SerializedName("prev_value") val amount: Long, @SerializedName("prev_addresses") val addresses: ArrayList<String>) : Input() {
        override val value: Double get() = amount / btcRate
        override val address: String get() = addresses.firstOrNull() ?: ""
    }

    class Vout(@SerializedName("value") val amount: Double, @SerializedName("addresses") val addresses: ArrayList<String>) : Output() {
        override val value: Double get() = amount / btcRate
        override val address: String get() = addresses.firstOrNull() ?: ""
    }
}

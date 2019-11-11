package app.odapplications.bitstashwallet.modules.fulltransactioninfo.providers

import com.google.gson.Gson
import com.google.gson.JsonObject
import app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule
import app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.Request.GetRequest

class InsightDashProvider : FullTransactionInfoModule.BitcoinForksProvider {
    override val name = "Insight.dash.org"

    override fun url(hash: String): String {
        return "https://insight.dash.org/insight/tx/$hash"
    }

    override fun apiRequest(hash: String): FullTransactionInfoModule.Request {
        return GetRequest("https://insight.dash.org/insight-api/tx/$hash")
    }

    override fun convert(json: JsonObject): BitcoinResponse {
        return Gson().fromJson(json, InsightResponse::class.java)
    }
}

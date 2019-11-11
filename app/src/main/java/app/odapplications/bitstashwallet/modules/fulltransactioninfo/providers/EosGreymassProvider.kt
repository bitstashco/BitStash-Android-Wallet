package app.odapplications.bitstashwallet.modules.fulltransactioninfo.providers

import com.google.gson.JsonObject
import app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule

class EosGreymassProvider : FullTransactionInfoModule.EosProvider {

    override val name: String
        get() = "Greymass.com"

    override fun url(hash: String): String? {
        return null
    }

    override fun apiRequest(hash: String): FullTransactionInfoModule.Request {
        return FullTransactionInfoModule.Request.PostRequest("https://eos.greymass.com/v1/history/get_transaction", hashMapOf("id" to hash))
    }

    override fun convert(json: JsonObject, eosAccount: String): EosResponse {
        return EosProviderResponse(json, eosAccount)
    }

}

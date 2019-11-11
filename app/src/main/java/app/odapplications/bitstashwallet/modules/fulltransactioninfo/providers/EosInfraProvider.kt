package app.odapplications.bitstashwallet.modules.fulltransactioninfo.providers

import com.google.gson.JsonObject
import app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule
import app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.Request.PostRequest

class EosInfraProvider : FullTransactionInfoModule.EosProvider {

    override val name: String
        get() = "Eosnode.tools"

    override fun url(hash: String): String? {
        return null
    }

    override fun apiRequest(hash: String): FullTransactionInfoModule.Request {
        return PostRequest("https://public.eosinfra.io/v1/history/get_transaction", hashMapOf("id" to hash))
    }

    override fun convert(json: JsonObject, eosAccount: String): EosResponse {
        return EosProviderResponse(json, eosAccount)
    }

}

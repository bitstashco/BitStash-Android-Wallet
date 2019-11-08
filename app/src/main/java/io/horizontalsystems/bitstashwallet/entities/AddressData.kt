package io.horizontalsystems.bitstashwallet.entities

data class AddressData(
        val address: String,
        val version: String? = null,
        val amount: Double? = null,
        val label: String? = null,
        val message: String? = null,
        val parameters: MutableMap<String, String>? = null) {

    val uriPaymentAddress: String
        get() {
            val uriAddress = address
            version?.let {
                uriAddress.plus(";version=$version")
            }
            amount?.let {
                uriAddress.plus("?amount=$it")
            }
            label?.let {
                uriAddress.plus("?label=$label")
            }
            message?.let {
                uriAddress.plus("?message=$message")
            }
            parameters?.let {
                for ((name, value) in it) {
                    uriAddress.plus("?$name=$value")
                }
            }

            return uriAddress
        }
}

package io.horizontalsystems.bitstashwallet.core

class UnsupportedAccountException : Exception()
class EosUnsupportedException : Exception()
class WrongAccountTypeForThisProvider : Exception()
class WrongParameters : Exception()
class CoinException(val errorTextRes: Int?, val nonTranslatableText: String? = null) : Exception()

// Chart
class NoRateStats: Exception()

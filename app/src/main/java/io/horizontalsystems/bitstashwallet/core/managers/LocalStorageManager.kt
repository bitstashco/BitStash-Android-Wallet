package io.horizontalsystems.bitstashwallet.core.managers

import io.horizontalsystems.bitstashwallet.core.App
import io.horizontalsystems.bitstashwallet.core.ILocalStorage
import io.horizontalsystems.bitstashwallet.entities.SyncMode
import io.horizontalsystems.bitstashwallet.lib.chartview.ChartView.ChartType
import io.horizontalsystems.bitstashwallet.modules.balance.BalanceSortType
import io.horizontalsystems.bitstashwallet.modules.send.SendModule

class LocalStorageManager : ILocalStorage {

    private val CURRENT_LANGUAGE = "current_language"
    private val LIGHT_MODE_ENABLED = "light_mode_enabled"
    private val FINGERPRINT_ENABLED = "fingerprint_enabled"
    private val SEND_INPUT_TYPE = "send_input_type"
    private val WORDLIST_BACKUP = "wordlist_backup"
    private val I_UNDERSTAND = "i_understand"
    private val BLOCK_TILL_DATE = "unblock_date"
    private val BASE_CURRENCY_CODE = "base_currency_code"
    private val FAILED_ATTEMPTS = "failed_attempts"
    private val LOCKOUT_TIMESTAMP = "lockout_timestamp"
    private val BASE_BITCOIN_PROVIDER = "base_bitcoin_provider"
    private val BASE_ETHEREUM_PROVIDER = "base_ethereum_provider"
    private val BASE_DASH_PROVIDER = "base_dash_provider"
    private val BASE_BINANCE_PROVIDER = "base_binance_provider"
    private val BASE_EOS_PROVIDER = "base_eos_provider"
    private val SYNC_MODE = "sync_mode"
    private val SORT_TYPE = "balance_sort_type"
    private val CHART_MODE = "prev_chart_mode"

    override var currentLanguage: String?
        get() = App.preferences.getString(CURRENT_LANGUAGE, null)
        set(language) {
            App.preferences.edit().putString(CURRENT_LANGUAGE, language).apply()
        }

    override var isBackedUp: Boolean
        get() = App.preferences.getBoolean(WORDLIST_BACKUP, false)
        set(backedUp) {
            App.preferences.edit().putBoolean(WORDLIST_BACKUP, backedUp).apply()
        }

    override var isFingerprintEnabled: Boolean
        get() = App.preferences.getBoolean(FINGERPRINT_ENABLED, false)
        set(enabled) {
            App.preferences.edit().putBoolean(FINGERPRINT_ENABLED, enabled).apply()
        }

    override var sendInputType: SendModule.InputType?
        get() = App.preferences.getString(SEND_INPUT_TYPE, null)?.let {
            try {
                SendModule.InputType.valueOf(it)
            } catch (e: IllegalArgumentException) {
                null
            }
        }
        set(value) {
            val editor = App.preferences.edit()
            when (value) {
                null -> editor.remove(SEND_INPUT_TYPE).apply()
                else -> editor.putString(SEND_INPUT_TYPE, value.name).apply()
            }
        }

    override var isLightModeOn: Boolean
        get() = App.preferences.getBoolean(LIGHT_MODE_ENABLED, false)
        set(enabled) {
            App.preferences.edit().putBoolean(LIGHT_MODE_ENABLED, enabled).apply()
        }

    override var iUnderstand: Boolean
        get() = App.preferences.getBoolean(I_UNDERSTAND, false)
        set(value) {
            App.preferences.edit().putBoolean(I_UNDERSTAND, value).apply()
        }

    override var baseCurrencyCode: String?
        get() = App.preferences.getString(BASE_CURRENCY_CODE, null)
        set(value) {
            App.preferences.edit().putString(BASE_CURRENCY_CODE, value).apply()
        }

    override var blockTillDate: Long?
        get() {
            val date = App.preferences.getLong(BLOCK_TILL_DATE, 0)
            return if (date > 0) date else null
        }
        set(date) {
            date?.let {
                App.preferences.edit().putLong(BLOCK_TILL_DATE, date).apply()
            } ?: run {
                App.preferences.edit().remove(BLOCK_TILL_DATE).apply()
            }
        }

    override var failedAttempts: Int?
        get() {
            val attempts = App.preferences.getInt(FAILED_ATTEMPTS, 0)
            return when (attempts) {
                0 -> null
                else -> attempts
            }
        }
        set(value) {
            value?.let {
                App.preferences.edit().putInt(FAILED_ATTEMPTS, it).apply()
            } ?: App.preferences.edit().remove(FAILED_ATTEMPTS).apply()
        }

    override var lockoutUptime: Long?
        get() {
            val timestamp = App.preferences.getLong(LOCKOUT_TIMESTAMP, 0L)
            return when (timestamp) {
                0L -> null
                else -> timestamp
            }
        }
        set(value) {
            value?.let {
                App.preferences.edit().putLong(LOCKOUT_TIMESTAMP, it).apply()
            } ?: App.preferences.edit().remove(LOCKOUT_TIMESTAMP).apply()
        }

    override var baseBitcoinProvider: String?
        get() = App.preferences.getString(BASE_BITCOIN_PROVIDER, null)
        set(value) {
            App.preferences.edit().putString(BASE_BITCOIN_PROVIDER, value).apply()
        }

    override var baseEthereumProvider: String?
        get() = App.preferences.getString(BASE_ETHEREUM_PROVIDER, null)
        set(value) {
            App.preferences.edit().putString(BASE_ETHEREUM_PROVIDER, value).apply()
        }

    override var baseDashProvider: String?
        get() = App.preferences.getString(BASE_DASH_PROVIDER, null)
        set(value) {
            App.preferences.edit().putString(BASE_DASH_PROVIDER, value).apply()
        }

    override var baseBinanceProvider: String?
        get() = App.preferences.getString(BASE_BINANCE_PROVIDER, null)
        set(value) {
            App.preferences.edit().putString(BASE_BINANCE_PROVIDER, value).apply()
        }

    override var baseEosProvider: String?
        get() = App.preferences.getString(BASE_EOS_PROVIDER, null)
        set(value) {
            App.preferences.edit().putString(BASE_EOS_PROVIDER, value).apply()
        }

    override var syncMode: SyncMode
        get() {
            val syncString = App.preferences.getString(SYNC_MODE, SyncMode.FAST.value)
            return syncString?.let { SyncMode.fromString(syncString) } ?: SyncMode.FAST
        }
        set(syncMode) {
            App.preferences.edit().putString(SYNC_MODE, syncMode.value).apply()
        }

    override var sortType: BalanceSortType
        get() {
            val sortString = App.preferences.getString(SORT_TYPE, null)
                    ?: BalanceSortType.Name.getAsString()
            return BalanceSortType.getTypeFromString(sortString)
        }
        set(sortType) {
            App.preferences.edit().putString(SORT_TYPE, sortType.getAsString()).apply()
        }

    override var chartMode: ChartType
        get() {
            val mode = App.preferences.getString(CHART_MODE, null) ?: return ChartType.DAILY
            return ChartType.valueOf(mode)
        }
        set(mode) {
            App.preferences.edit().putString(CHART_MODE, mode.name).apply()
        }

    override fun clear() {
        App.preferences.edit().clear().apply()
    }
}

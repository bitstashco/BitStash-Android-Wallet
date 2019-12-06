package app.odapplications.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\'\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010f\u001a\u00020gH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R(\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00048V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00048V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR(\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00048V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR(\u0010\"\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00048V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001bR(\u0010%\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00048V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b&\u0010\u0019\"\u0004\b\'\u0010\u001bR(\u0010(\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00048V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001bR(\u0010-\u001a\u0004\u0018\u00010,2\b\u0010+\u001a\u0004\u0018\u00010,8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00104\u001a\u0002032\u0006\u00102\u001a\u0002038V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R(\u0010:\u001a\u0004\u0018\u00010\u00042\b\u00109\u001a\u0004\u0018\u00010\u00048V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b;\u0010\u0019\"\u0004\b<\u0010\u001bR(\u0010>\u001a\u0004\u0018\u00010=2\b\u0010\u0016\u001a\u0004\u0018\u00010=8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010D\u001a\u00020C2\u0006\u0010\u0016\u001a\u00020C8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010J\u001a\u00020C2\u0006\u0010I\u001a\u00020C8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\bJ\u0010F\"\u0004\bK\u0010HR$\u0010M\u001a\u00020C2\u0006\u0010L\u001a\u00020C8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\bM\u0010F\"\u0004\bN\u0010HR$\u0010O\u001a\u00020C2\u0006\u0010L\u001a\u00020C8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\bO\u0010F\"\u0004\bP\u0010HR(\u0010Q\u001a\u0004\u0018\u00010,2\b\u0010\u0016\u001a\u0004\u0018\u00010,8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\bR\u0010/\"\u0004\bS\u00101R(\u0010U\u001a\u0004\u0018\u00010T2\b\u0010\u0016\u001a\u0004\u0018\u00010T8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR$\u0010Z\u001a\u00020[2\u0006\u0010Z\u001a\u00020[8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R$\u0010`\u001a\u00020a2\u0006\u0010`\u001a\u00020a8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\bb\u0010c\"\u0004\bd\u0010e\u00a8\u0006h"}, d2 = {"Lapp/odapplications/bitstashwallet/core/managers/LocalStorageManager;", "Lapp/odapplications/bitstashwallet/core/ILocalStorage;", "()V", "BASE_BINANCE_PROVIDER", "", "BASE_BITCOIN_PROVIDER", "BASE_CURRENCY_CODE", "BASE_DASH_PROVIDER", "BASE_EOS_PROVIDER", "BASE_ETHEREUM_PROVIDER", "BLOCK_TILL_DATE", "CHART_MODE", "CURRENT_LANGUAGE", "FAILED_ATTEMPTS", "FINGERPRINT_ENABLED", "I_UNDERSTAND", "LIGHT_MODE_ENABLED", "LOCKOUT_TIMESTAMP", "SEND_INPUT_TYPE", "SORT_TYPE", "SYNC_MODE", "WORDLIST_BACKUP", "value", "baseBinanceProvider", "getBaseBinanceProvider", "()Ljava/lang/String;", "setBaseBinanceProvider", "(Ljava/lang/String;)V", "baseBitcoinProvider", "getBaseBitcoinProvider", "setBaseBitcoinProvider", "baseCurrencyCode", "getBaseCurrencyCode", "setBaseCurrencyCode", "baseDashProvider", "getBaseDashProvider", "setBaseDashProvider", "baseEosProvider", "getBaseEosProvider", "setBaseEosProvider", "baseEthereumProvider", "getBaseEthereumProvider", "setBaseEthereumProvider", "date", "", "blockTillDate", "getBlockTillDate", "()Ljava/lang/Long;", "setBlockTillDate", "(Ljava/lang/Long;)V", "mode", "Lapp/odapplications/bitstashwallet/lib/chartview/ChartView$ChartType;", "chartMode", "getChartMode", "()Lapp/odapplications/bitstashwallet/lib/chartview/ChartView$ChartType;", "setChartMode", "(Lapp/odapplications/bitstashwallet/lib/chartview/ChartView$ChartType;)V", "language", "currentLanguage", "getCurrentLanguage", "setCurrentLanguage", "", "failedAttempts", "getFailedAttempts", "()Ljava/lang/Integer;", "setFailedAttempts", "(Ljava/lang/Integer;)V", "", "iUnderstand", "getIUnderstand", "()Z", "setIUnderstand", "(Z)V", "backedUp", "isBackedUp", "setBackedUp", "enabled", "isFingerprintEnabled", "setFingerprintEnabled", "isLightModeOn", "setLightModeOn", "lockoutUptime", "getLockoutUptime", "setLockoutUptime", "Lapp/odapplications/bitstashwallet/modules/send/SendModule$InputType;", "sendInputType", "getSendInputType", "()Lapp/odapplications/bitstashwallet/modules/send/SendModule$InputType;", "setSendInputType", "(Lapp/odapplications/bitstashwallet/modules/send/SendModule$InputType;)V", "sortType", "Lapp/odapplications/bitstashwallet/modules/balance/BalanceSortType;", "getSortType", "()Lapp/odapplications/bitstashwallet/modules/balance/BalanceSortType;", "setSortType", "(Lapp/odapplications/bitstashwallet/modules/balance/BalanceSortType;)V", "syncMode", "Lapp/odapplications/bitstashwallet/entities/SyncMode;", "getSyncMode", "()Lapp/odapplications/bitstashwallet/entities/SyncMode;", "setSyncMode", "(Lapp/odapplications/bitstashwallet/entities/SyncMode;)V", "clear", "", "app_productionMainnetRelease"})
public final class LocalStorageManager implements app.odapplications.bitstashwallet.core.ILocalStorage {
    private final java.lang.String CURRENT_LANGUAGE = "current_language";
    private final java.lang.String LIGHT_MODE_ENABLED = "light_mode_enabled";
    private final java.lang.String FINGERPRINT_ENABLED = "fingerprint_enabled";
    private final java.lang.String SEND_INPUT_TYPE = "send_input_type";
    private final java.lang.String WORDLIST_BACKUP = "wordlist_backup";
    private final java.lang.String I_UNDERSTAND = "i_understand";
    private final java.lang.String BLOCK_TILL_DATE = "unblock_date";
    private final java.lang.String BASE_CURRENCY_CODE = "base_currency_code";
    private final java.lang.String FAILED_ATTEMPTS = "failed_attempts";
    private final java.lang.String LOCKOUT_TIMESTAMP = "lockout_timestamp";
    private final java.lang.String BASE_BITCOIN_PROVIDER = "base_bitcoin_provider";
    private final java.lang.String BASE_ETHEREUM_PROVIDER = "base_ethereum_provider";
    private final java.lang.String BASE_DASH_PROVIDER = "base_dash_provider";
    private final java.lang.String BASE_BINANCE_PROVIDER = "base_binance_provider";
    private final java.lang.String BASE_EOS_PROVIDER = "base_eos_provider";
    private final java.lang.String SYNC_MODE = "sync_mode";
    private final java.lang.String SORT_TYPE = "balance_sort_type";
    private final java.lang.String CHART_MODE = "prev_chart_mode";
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getCurrentLanguage() {
        return null;
    }
    
    @java.lang.Override()
    public void setCurrentLanguage(@org.jetbrains.annotations.Nullable()
    java.lang.String language) {
    }
    
    @java.lang.Override()
    public boolean isBackedUp() {
        return false;
    }
    
    @java.lang.Override()
    public void setBackedUp(boolean backedUp) {
    }
    
    @java.lang.Override()
    public boolean isFingerprintEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public void setFingerprintEnabled(boolean enabled) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.modules.send.SendModule.InputType getSendInputType() {
        return null;
    }
    
    @java.lang.Override()
    public void setSendInputType(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.send.SendModule.InputType value) {
    }
    
    @java.lang.Override()
    public boolean isLightModeOn() {
        return false;
    }
    
    @java.lang.Override()
    public void setLightModeOn(boolean enabled) {
    }
    
    @java.lang.Override()
    public boolean getIUnderstand() {
        return false;
    }
    
    @java.lang.Override()
    public void setIUnderstand(boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getBaseCurrencyCode() {
        return null;
    }
    
    @java.lang.Override()
    public void setBaseCurrencyCode(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Long getBlockTillDate() {
        return null;
    }
    
    @java.lang.Override()
    public void setBlockTillDate(@org.jetbrains.annotations.Nullable()
    java.lang.Long date) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Integer getFailedAttempts() {
        return null;
    }
    
    @java.lang.Override()
    public void setFailedAttempts(@org.jetbrains.annotations.Nullable()
    java.lang.Integer value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Long getLockoutUptime() {
        return null;
    }
    
    @java.lang.Override()
    public void setLockoutUptime(@org.jetbrains.annotations.Nullable()
    java.lang.Long value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getBaseBitcoinProvider() {
        return null;
    }
    
    @java.lang.Override()
    public void setBaseBitcoinProvider(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getBaseEthereumProvider() {
        return null;
    }
    
    @java.lang.Override()
    public void setBaseEthereumProvider(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getBaseDashProvider() {
        return null;
    }
    
    @java.lang.Override()
    public void setBaseDashProvider(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getBaseBinanceProvider() {
        return null;
    }
    
    @java.lang.Override()
    public void setBaseBinanceProvider(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getBaseEosProvider() {
        return null;
    }
    
    @java.lang.Override()
    public void setBaseEosProvider(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.entities.SyncMode getSyncMode() {
        return null;
    }
    
    @java.lang.Override()
    public void setSyncMode(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.SyncMode syncMode) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.modules.balance.BalanceSortType getSortType() {
        return null;
    }
    
    @java.lang.Override()
    public void setSortType(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.balance.BalanceSortType sortType) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.lib.chartview.ChartView.ChartType getChartMode() {
        return null;
    }
    
    @java.lang.Override()
    public void setChartMode(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.lib.chartview.ChartView.ChartType mode) {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    public LocalStorageManager() {
        super();
    }
}
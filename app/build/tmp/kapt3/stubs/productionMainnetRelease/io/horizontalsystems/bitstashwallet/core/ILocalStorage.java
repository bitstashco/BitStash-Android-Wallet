package io.horizontalsystems.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010M\u001a\u00020NH&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\u0005\"\u0004\b\u0013\u0010\u0007R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0015\u0010\u0005\"\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u00020\u001eX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b$\u0010\u0005\"\u0004\b%\u0010\u0007R\u001a\u0010&\u001a\u0004\u0018\u00010\'X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0018\u0010,\u001a\u00020-X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0018\u00102\u001a\u00020-X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b2\u0010/\"\u0004\b3\u00101R\u0018\u00104\u001a\u00020-X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b4\u0010/\"\u0004\b5\u00101R\u0018\u00106\u001a\u00020-X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b6\u0010/\"\u0004\b7\u00101R\u001a\u00108\u001a\u0004\u0018\u00010\u0018X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b9\u0010\u001a\"\u0004\b:\u0010\u001cR\u001a\u0010;\u001a\u0004\u0018\u00010<X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0018\u0010A\u001a\u00020BX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0018\u0010G\u001a\u00020HX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L\u00a8\u0006O"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/ILocalStorage;", "", "baseBinanceProvider", "", "getBaseBinanceProvider", "()Ljava/lang/String;", "setBaseBinanceProvider", "(Ljava/lang/String;)V", "baseBitcoinProvider", "getBaseBitcoinProvider", "setBaseBitcoinProvider", "baseCurrencyCode", "getBaseCurrencyCode", "setBaseCurrencyCode", "baseDashProvider", "getBaseDashProvider", "setBaseDashProvider", "baseEosProvider", "getBaseEosProvider", "setBaseEosProvider", "baseEthereumProvider", "getBaseEthereumProvider", "setBaseEthereumProvider", "blockTillDate", "", "getBlockTillDate", "()Ljava/lang/Long;", "setBlockTillDate", "(Ljava/lang/Long;)V", "chartMode", "Lio/horizontalsystems/bitstashwallet/lib/chartview/ChartView$ChartType;", "getChartMode", "()Lio/horizontalsystems/bitstashwallet/lib/chartview/ChartView$ChartType;", "setChartMode", "(Lio/horizontalsystems/bitstashwallet/lib/chartview/ChartView$ChartType;)V", "currentLanguage", "getCurrentLanguage", "setCurrentLanguage", "failedAttempts", "", "getFailedAttempts", "()Ljava/lang/Integer;", "setFailedAttempts", "(Ljava/lang/Integer;)V", "iUnderstand", "", "getIUnderstand", "()Z", "setIUnderstand", "(Z)V", "isBackedUp", "setBackedUp", "isFingerprintEnabled", "setFingerprintEnabled", "isLightModeOn", "setLightModeOn", "lockoutUptime", "getLockoutUptime", "setLockoutUptime", "sendInputType", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$InputType;", "getSendInputType", "()Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$InputType;", "setSendInputType", "(Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$InputType;)V", "sortType", "Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceSortType;", "getSortType", "()Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceSortType;", "setSortType", "(Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceSortType;)V", "syncMode", "Lio/horizontalsystems/bitstashwallet/entities/SyncMode;", "getSyncMode", "()Lio/horizontalsystems/bitstashwallet/entities/SyncMode;", "setSyncMode", "(Lio/horizontalsystems/bitstashwallet/entities/SyncMode;)V", "clear", "", "app_productionMainnetRelease"})
public abstract interface ILocalStorage {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getCurrentLanguage();
    
    public abstract void setCurrentLanguage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0);
    
    public abstract boolean isBackedUp();
    
    public abstract void setBackedUp(boolean p0);
    
    public abstract boolean isFingerprintEnabled();
    
    public abstract void setFingerprintEnabled(boolean p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.bitstashwallet.modules.send.SendModule.InputType getSendInputType();
    
    public abstract void setSendInputType(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.modules.send.SendModule.InputType p0);
    
    public abstract boolean isLightModeOn();
    
    public abstract void setLightModeOn(boolean p0);
    
    public abstract boolean getIUnderstand();
    
    public abstract void setIUnderstand(boolean p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getBaseCurrencyCode();
    
    public abstract void setBaseCurrencyCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Long getBlockTillDate();
    
    public abstract void setBlockTillDate(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Integer getFailedAttempts();
    
    public abstract void setFailedAttempts(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Long getLockoutUptime();
    
    public abstract void setLockoutUptime(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getBaseBitcoinProvider();
    
    public abstract void setBaseBitcoinProvider(@org.jetbrains.annotations.Nullable()
    java.lang.String p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getBaseEthereumProvider();
    
    public abstract void setBaseEthereumProvider(@org.jetbrains.annotations.Nullable()
    java.lang.String p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getBaseDashProvider();
    
    public abstract void setBaseDashProvider(@org.jetbrains.annotations.Nullable()
    java.lang.String p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getBaseBinanceProvider();
    
    public abstract void setBaseBinanceProvider(@org.jetbrains.annotations.Nullable()
    java.lang.String p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getBaseEosProvider();
    
    public abstract void setBaseEosProvider(@org.jetbrains.annotations.Nullable()
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.bitstashwallet.entities.SyncMode getSyncMode();
    
    public abstract void setSyncMode(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.SyncMode p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.bitstashwallet.modules.balance.BalanceSortType getSortType();
    
    public abstract void setSortType(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.balance.BalanceSortType p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.bitstashwallet.lib.chartview.ChartView.ChartType getChartMode();
    
    public abstract void setChartMode(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.lib.chartview.ChartView.ChartType p0);
    
    public abstract void clear();
}
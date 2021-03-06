package app.odapplications.bitstashwallet.modules.balance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010!\u001a\u00020\nH\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\t\u0010#\u001a\u00020\u000eH\u00c6\u0003JU\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u00c6\u0001J\u0013\u0010%\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020(H\u00d6\u0001J\t\u0010)\u001a\u00020*H\u00d6\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006+"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/balance/BalanceViewItem;", "", "coin", "Lapp/odapplications/bitstashwallet/entities/Coin;", "coinValue", "Lapp/odapplications/bitstashwallet/entities/CoinValue;", "exchangeValue", "Lapp/odapplications/bitstashwallet/entities/CurrencyValue;", "currencyValue", "state", "Lapp/odapplications/bitstashwallet/core/AdapterState;", "chartData", "Lapp/odapplications/bitstashwallet/modules/balance/BalanceChartData;", "rateExpired", "", "(Lapp/odapplications/bitstashwallet/entities/Coin;Lapp/odapplications/bitstashwallet/entities/CoinValue;Lapp/odapplications/bitstashwallet/entities/CurrencyValue;Lapp/odapplications/bitstashwallet/entities/CurrencyValue;Lapp/odapplications/bitstashwallet/core/AdapterState;Lapp/odapplications/bitstashwallet/modules/balance/BalanceChartData;Z)V", "getChartData", "()Lapp/odapplications/bitstashwallet/modules/balance/BalanceChartData;", "getCoin", "()Lapp/odapplications/bitstashwallet/entities/Coin;", "getCoinValue", "()Lapp/odapplications/bitstashwallet/entities/CoinValue;", "getCurrencyValue", "()Lapp/odapplications/bitstashwallet/entities/CurrencyValue;", "getExchangeValue", "getRateExpired", "()Z", "getState", "()Lapp/odapplications/bitstashwallet/core/AdapterState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "app_productionMainnetRelease"})
public final class BalanceViewItem {
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.entities.Coin coin = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.entities.CoinValue coinValue = null;
    @org.jetbrains.annotations.Nullable()
    private final app.odapplications.bitstashwallet.entities.CurrencyValue exchangeValue = null;
    @org.jetbrains.annotations.Nullable()
    private final app.odapplications.bitstashwallet.entities.CurrencyValue currencyValue = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.core.AdapterState state = null;
    @org.jetbrains.annotations.Nullable()
    private final app.odapplications.bitstashwallet.modules.balance.BalanceChartData chartData = null;
    private final boolean rateExpired = false;
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.entities.Coin getCoin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.entities.CoinValue getCoinValue() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.entities.CurrencyValue getExchangeValue() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.entities.CurrencyValue getCurrencyValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.core.AdapterState getState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.balance.BalanceChartData getChartData() {
        return null;
    }
    
    public final boolean getRateExpired() {
        return false;
    }
    
    public BalanceViewItem(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Coin coin, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.CoinValue coinValue, @org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.entities.CurrencyValue exchangeValue, @org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.entities.CurrencyValue currencyValue, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.AdapterState state, @org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.balance.BalanceChartData chartData, boolean rateExpired) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.entities.Coin component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.entities.CoinValue component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.entities.CurrencyValue component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.entities.CurrencyValue component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.core.AdapterState component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.balance.BalanceChartData component6() {
        return null;
    }
    
    public final boolean component7() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.modules.balance.BalanceViewItem copy(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Coin coin, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.CoinValue coinValue, @org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.entities.CurrencyValue exchangeValue, @org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.entities.CurrencyValue currencyValue, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.AdapterState state, @org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.balance.BalanceChartData chartData, boolean rateExpired) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}
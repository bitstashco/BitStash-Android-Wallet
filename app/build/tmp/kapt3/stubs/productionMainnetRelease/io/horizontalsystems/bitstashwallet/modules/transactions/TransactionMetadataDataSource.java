package io.horizontalsystems.bitstashwallet.modules.transactions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0005J\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0011J\u0018\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\tJ\u0016\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0005J\u0016\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0005J&\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\tR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionMetadataDataSource;", "", "()V", "lastBlockHeights", "", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "", "rates", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "", "Lio/horizontalsystems/bitstashwallet/entities/CurrencyValue;", "thresholds", "clearRates", "", "getConfirmationThreshold", "wallet", "getLastBlockHeight", "(Lio/horizontalsystems/bitstashwallet/entities/Wallet;)Ljava/lang/Integer;", "getRate", "coin", "timestamp", "setConfirmationThreshold", "confirmationThreshold", "setLastBlockHeight", "lastBlockHeight", "setRate", "rateValue", "Ljava/math/BigDecimal;", "currency", "Lio/horizontalsystems/bitstashwallet/entities/Currency;", "app_productionMainnetRelease"})
public final class TransactionMetadataDataSource {
    private final java.util.Map<io.horizontalsystems.bitstashwallet.entities.Wallet, java.lang.Integer> lastBlockHeights = null;
    private final java.util.Map<io.horizontalsystems.bitstashwallet.entities.Wallet, java.lang.Integer> thresholds = null;
    private final java.util.Map<io.horizontalsystems.bitstashwallet.entities.Coin, java.util.Map<java.lang.Long, io.horizontalsystems.bitstashwallet.entities.CurrencyValue>> rates = null;
    
    public final void setLastBlockHeight(int lastBlockHeight, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Wallet wallet) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getLastBlockHeight(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Wallet wallet) {
        return null;
    }
    
    public final void setConfirmationThreshold(int confirmationThreshold, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Wallet wallet) {
    }
    
    public final int getConfirmationThreshold(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Wallet wallet) {
        return 0;
    }
    
    public final void setRate(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal rateValue, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Coin coin, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Currency currency, long timestamp) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.entities.CurrencyValue getRate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Coin coin, long timestamp) {
        return null;
    }
    
    public final void clearRates() {
    }
    
    public TransactionMetadataDataSource() {
        super();
    }
}
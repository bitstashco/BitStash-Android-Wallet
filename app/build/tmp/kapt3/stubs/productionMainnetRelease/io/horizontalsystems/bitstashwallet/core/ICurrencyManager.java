package io.horizontalsystems.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/ICurrencyManager;", "", "baseCurrency", "Lio/horizontalsystems/bitstashwallet/entities/Currency;", "getBaseCurrency", "()Lio/horizontalsystems/bitstashwallet/entities/Currency;", "setBaseCurrency", "(Lio/horizontalsystems/bitstashwallet/entities/Currency;)V", "baseCurrencyUpdatedSignal", "Lio/reactivex/Observable;", "", "getBaseCurrencyUpdatedSignal", "()Lio/reactivex/Observable;", "currencies", "", "getCurrencies", "()Ljava/util/List;", "app_productionMainnetRelease"})
public abstract interface ICurrencyManager {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.bitstashwallet.entities.Currency getBaseCurrency();
    
    public abstract void setBaseCurrency(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Currency p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<kotlin.Unit> getBaseCurrencyUpdatedSignal();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.bitstashwallet.entities.Currency> getCurrencies();
}
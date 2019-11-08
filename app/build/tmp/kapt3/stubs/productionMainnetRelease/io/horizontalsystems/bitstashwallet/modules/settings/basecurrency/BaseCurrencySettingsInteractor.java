package io.horizontalsystems.bitstashwallet.modules.settings.basecurrency;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/settings/basecurrency/BaseCurrencySettingsInteractor;", "Lio/horizontalsystems/bitstashwallet/modules/settings/basecurrency/BaseCurrencySettingsModule$IInteractor;", "currencyManager", "Lio/horizontalsystems/bitstashwallet/core/ICurrencyManager;", "(Lio/horizontalsystems/bitstashwallet/core/ICurrencyManager;)V", "value", "Lio/horizontalsystems/bitstashwallet/entities/Currency;", "baseCurrency", "getBaseCurrency", "()Lio/horizontalsystems/bitstashwallet/entities/Currency;", "setBaseCurrency", "(Lio/horizontalsystems/bitstashwallet/entities/Currency;)V", "currencies", "", "getCurrencies", "()Ljava/util/List;", "app_productionMainnetRelease"})
public final class BaseCurrencySettingsInteractor implements io.horizontalsystems.bitstashwallet.modules.settings.basecurrency.BaseCurrencySettingsModule.IInteractor {
    private final io.horizontalsystems.bitstashwallet.core.ICurrencyManager currencyManager = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bitstashwallet.entities.Currency> getCurrencies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.entities.Currency getBaseCurrency() {
        return null;
    }
    
    @java.lang.Override()
    public void setBaseCurrency(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Currency value) {
    }
    
    public BaseCurrencySettingsInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.ICurrencyManager currencyManager) {
        super();
    }
}
package io.horizontalsystems.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0005R\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\nR\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\nR\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\nR\u0012\u0010\u0014\u001a\u00020\u0015X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0005R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0005R\u0012\u0010\u001c\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u0005R\u0012\u0010\u001e\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u0005R\u0012\u0010 \u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u0005R\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b#\u0010\nR\u0012\u0010$\u001a\u00020\u0015X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010\u0017R\u0018\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b(\u0010\nR\u0012\u0010)\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b*\u0010\u0005R\u0012\u0010+\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b,\u0010\u0005R\u0012\u0010-\u001a\u00020.X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b/\u00100\u00a8\u00061"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;", "", "appWebPageLink", "", "getAppWebPageLink", "()Ljava/lang/String;", "coins", "", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "getCoins", "()Ljava/util/List;", "companyWebPageLink", "getCompanyWebPageLink", "currencies", "Lio/horizontalsystems/bitstashwallet/entities/Currency;", "getCurrencies", "defaultCoinCodes", "getDefaultCoinCodes", "featuredCoins", "getFeaturedCoins", "fiatDecimal", "", "getFiatDecimal", "()I", "infuraProjectId", "getInfuraProjectId", "infuraProjectSecret", "getInfuraProjectSecret", "ipfsFallbackGateway", "getIpfsFallbackGateway", "ipfsId", "getIpfsId", "ipfsMainGateway", "getIpfsMainGateway", "localizations", "getLocalizations", "maxDecimal", "getMaxDecimal", "predefinedAccountTypes", "Lio/horizontalsystems/bitstashwallet/core/IPredefinedAccountType;", "getPredefinedAccountTypes", "reportEmail", "getReportEmail", "reportTelegramGroup", "getReportTelegramGroup", "testMode", "", "getTestMode", "()Z", "app_productionMainnetRelease"})
public abstract interface IAppConfigProvider {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getCompanyWebPageLink();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getAppWebPageLink();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getReportEmail();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getReportTelegramGroup();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getIpfsId();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getIpfsMainGateway();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getIpfsFallbackGateway();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getInfuraProjectId();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getInfuraProjectSecret();
    
    public abstract int getFiatDecimal();
    
    public abstract int getMaxDecimal();
    
    public abstract boolean getTestMode();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getLocalizations();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.bitstashwallet.entities.Currency> getCurrencies();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getDefaultCoinCodes();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.bitstashwallet.entities.Coin> getFeaturedCoins();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.bitstashwallet.entities.Coin> getCoins();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.bitstashwallet.core.IPredefinedAccountType> getPredefinedAccountTypes();
}
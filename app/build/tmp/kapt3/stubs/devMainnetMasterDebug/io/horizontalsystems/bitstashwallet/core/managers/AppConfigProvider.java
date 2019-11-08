package io.horizontalsystems.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0006R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u000bR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0015\u001a\u00020\u0016X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b$\u0010\u000bR\u0014\u0010%\u001a\u00020\u0016X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u001a\u0010\'\u001a\b\u0012\u0004\u0012\u00020(0\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u000bR\u0014\u0010*\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0006R\u0014\u0010,\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0006R\u0014\u0010.\u001a\u00020/X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101\u00a8\u00062"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/managers/AppConfigProvider;", "Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;", "()V", "appWebPageLink", "", "getAppWebPageLink", "()Ljava/lang/String;", "coins", "", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "getCoins", "()Ljava/util/List;", "companyWebPageLink", "getCompanyWebPageLink", "currencies", "Lio/horizontalsystems/bitstashwallet/entities/Currency;", "getCurrencies", "defaultCoinCodes", "getDefaultCoinCodes", "featuredCoins", "getFeaturedCoins", "fiatDecimal", "", "getFiatDecimal", "()I", "infuraProjectId", "getInfuraProjectId", "infuraProjectSecret", "getInfuraProjectSecret", "ipfsFallbackGateway", "getIpfsFallbackGateway", "ipfsId", "getIpfsId", "ipfsMainGateway", "getIpfsMainGateway", "localizations", "getLocalizations", "maxDecimal", "getMaxDecimal", "predefinedAccountTypes", "Lio/horizontalsystems/bitstashwallet/core/IPredefinedAccountType;", "getPredefinedAccountTypes", "reportEmail", "getReportEmail", "reportTelegramGroup", "getReportTelegramGroup", "testMode", "", "getTestMode", "()Z", "app_devMainnetMasterDebug"})
public final class AppConfigProvider implements io.horizontalsystems.bitstashwallet.core.IAppConfigProvider {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String companyWebPageLink = "https://bitstash.co";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String appWebPageLink = "https://payments.bitstash.co";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String reportEmail = "hello@bitstash.co";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String reportTelegramGroup = "bitstashmarketplace";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ipfsId = "QmXTJZBMMRmBbPun6HFt3tmb3tfYF2usLPxFoacL7G5uMX";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ipfsMainGateway = "ipfs-ext.horizontalsystems.xyz";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ipfsFallbackGateway = "ipfs.io";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String infuraProjectId = "4351d832c39c4b4bb159eb72548a180b";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String infuraProjectSecret = "816f85bed849497e87f0e083fb1f1c85";
    private final int fiatDecimal = 2;
    private final int maxDecimal = 8;
    private final boolean testMode = io.horizontalsystems.bitstashwallet.BuildConfig.testMode;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.bitstashwallet.entities.Currency> currencies = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.bitstashwallet.entities.Coin> coins = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.bitstashwallet.core.IPredefinedAccountType> predefinedAccountTypes = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getCompanyWebPageLink() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getAppWebPageLink() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getReportEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getReportTelegramGroup() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getIpfsId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getIpfsMainGateway() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getIpfsFallbackGateway() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getInfuraProjectId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getInfuraProjectSecret() {
        return null;
    }
    
    @java.lang.Override()
    public int getFiatDecimal() {
        return 0;
    }
    
    @java.lang.Override()
    public int getMaxDecimal() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean getTestMode() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bitstashwallet.entities.Currency> getCurrencies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> getLocalizations() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> getDefaultCoinCodes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bitstashwallet.entities.Coin> getFeaturedCoins() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bitstashwallet.entities.Coin> getCoins() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bitstashwallet.core.IPredefinedAccountType> getPredefinedAccountTypes() {
        return null;
    }
    
    public AppConfigProvider() {
        super();
    }
}
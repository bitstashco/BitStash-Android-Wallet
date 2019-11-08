package io.horizontalsystems.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010!\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010\"\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010#\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010$\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010&\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\"\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/managers/TransactionDataProviderManager;", "Lio/horizontalsystems/bitstashwallet/core/ITransactionDataProviderManager;", "appConfig", "Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;", "localStorage", "Lio/horizontalsystems/bitstashwallet/core/ILocalStorage;", "(Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;Lio/horizontalsystems/bitstashwallet/core/ILocalStorage;)V", "baseProviderUpdatedSignal", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "getBaseProviderUpdatedSignal", "()Lio/reactivex/subjects/PublishSubject;", "binanceProviders", "", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BinanceChainProvider;", "bitcoinCashProviders", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$BitcoinForksProvider;", "bitcoinProviders", "dashProviders", "eosProviders", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$EosProvider;", "ethereumProviders", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$EthereumForksProvider;", "baseProvider", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Provider;", "coin", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "binance", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$BinanceProvider;", "name", "", "bitcoin", "bitcoinCash", "dash", "eos", "ethereum", "providers", "setBaseProvider", "app_productionMainnetRelease"})
public final class TransactionDataProviderManager implements io.horizontalsystems.bitstashwallet.core.ITransactionDataProviderManager {
    private final java.util.List<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.BitcoinForksProvider> bitcoinProviders = null;
    private final java.util.List<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.BitcoinForksProvider> bitcoinCashProviders = null;
    private final java.util.List<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.EthereumForksProvider> ethereumProviders = null;
    private final java.util.List<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.BitcoinForksProvider> dashProviders = null;
    private final java.util.List<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BinanceChainProvider> binanceProviders = null;
    private final java.util.List<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.EosProvider> eosProviders = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> baseProviderUpdatedSignal = null;
    private final io.horizontalsystems.bitstashwallet.core.ILocalStorage localStorage = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.subjects.PublishSubject<kotlin.Unit> getBaseProviderUpdatedSignal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.Provider> providers(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Coin coin) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.Provider baseProvider(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Coin coin) {
        return null;
    }
    
    @java.lang.Override()
    public void setBaseProvider(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Coin coin) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.BitcoinForksProvider bitcoin(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.BitcoinForksProvider bitcoinCash(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.BitcoinForksProvider dash(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.EthereumForksProvider ethereum(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.BinanceProvider binance(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.EosProvider eos(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    public TransactionDataProviderManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IAppConfigProvider appConfig, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.ILocalStorage localStorage) {
        super();
    }
}
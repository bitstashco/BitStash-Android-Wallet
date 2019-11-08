package io.horizontalsystems.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000eH&J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u001a"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/ITransactionDataProviderManager;", "", "baseProviderUpdatedSignal", "Lio/reactivex/Observable;", "", "getBaseProviderUpdatedSignal", "()Lio/reactivex/Observable;", "baseProvider", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Provider;", "coin", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "binance", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$BinanceProvider;", "name", "", "bitcoin", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$BitcoinForksProvider;", "bitcoinCash", "dash", "eos", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$EosProvider;", "ethereum", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$EthereumForksProvider;", "providers", "", "setBaseProvider", "app_devMainnetMasterDebug"})
public abstract interface ITransactionDataProviderManager {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<kotlin.Unit> getBaseProviderUpdatedSignal();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.Provider> providers(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Coin coin);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.Provider baseProvider(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Coin coin);
    
    public abstract void setBaseProvider(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Coin coin);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.BitcoinForksProvider bitcoin(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.BitcoinForksProvider dash(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.BitcoinForksProvider bitcoinCash(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.EthereumForksProvider ethereum(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.BinanceProvider binance(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.EosProvider eos(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
}
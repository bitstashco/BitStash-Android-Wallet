package io.horizontalsystems.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/managers/BinanceKitManager;", "", "appConfig", "Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;", "(Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;)V", "binanceKit", "Lio/horizontalsystems/binancechainkit/BinanceChainKit;", "getBinanceKit", "()Lio/horizontalsystems/binancechainkit/BinanceChainKit;", "kit", "testMode", "", "useCount", "", "wallet", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "unlink", "", "app_productionMainnetRelease"})
public final class BinanceKitManager {
    private io.horizontalsystems.binancechainkit.BinanceChainKit kit;
    private int useCount;
    private final boolean testMode = false;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.binancechainkit.BinanceChainKit getBinanceKit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.binancechainkit.BinanceChainKit binanceKit(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Wallet wallet) {
        return null;
    }
    
    public final void unlink() {
    }
    
    public BinanceKitManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IAppConfigProvider appConfig) {
        super();
    }
}
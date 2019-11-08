package io.horizontalsystems.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\f\u001a\u00020\tH&J\u0016\u0010\r\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u000e\u001a\u00020\tH&J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u0011H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/IWalletManager;", "", "wallets", "", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "getWallets", "()Ljava/util/List;", "walletsUpdatedSignal", "Lio/reactivex/Observable;", "", "getWalletsUpdatedSignal", "()Lio/reactivex/Observable;", "clear", "enable", "loadWallets", "wallet", "coin", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "app_productionMainnetRelease"})
public abstract interface IWalletManager {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.bitstashwallet.entities.Wallet> getWallets();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<kotlin.Unit> getWalletsUpdatedSignal();
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.bitstashwallet.entities.Wallet wallet(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Coin coin);
    
    public abstract void loadWallets();
    
    public abstract void enable(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.entities.Wallet> wallets);
    
    public abstract void clear();
}
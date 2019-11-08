package io.horizontalsystems.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/IEnabledWalletStorage;", "", "enabledWallets", "", "Lio/horizontalsystems/bitstashwallet/entities/EnabledWallet;", "getEnabledWallets", "()Ljava/util/List;", "deleteAll", "", "save", "coins", "app_productionMainnetRelease"})
public abstract interface IEnabledWalletStorage {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.bitstashwallet.entities.EnabledWallet> getEnabledWallets();
    
    public abstract void save(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.entities.EnabledWallet> coins);
    
    public abstract void deleteAll();
}
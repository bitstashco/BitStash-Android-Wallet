package io.horizontalsystems.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H&J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H&\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/IWalletStorage;", "", "enabledCoins", "", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "save", "", "wallets", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "accounts", "Lio/horizontalsystems/bitstashwallet/entities/Account;", "app_productionMainnetRelease"})
public abstract interface IWalletStorage {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.bitstashwallet.entities.Wallet> wallets(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.entities.Account> accounts);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.bitstashwallet.entities.Coin> enabledCoins();
    
    public abstract void save(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.entities.Wallet> wallets);
}
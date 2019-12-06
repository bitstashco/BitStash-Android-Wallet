package app.odapplications.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\"\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\u0010"}, d2 = {"Lapp/odapplications/bitstashwallet/core/IAccountCreator;", "", "createNewAccount", "Lapp/odapplications/bitstashwallet/entities/Account;", "defaultAccountType", "Lapp/odapplications/bitstashwallet/core/DefaultAccountType;", "createDefaultWallets", "", "", "coin", "Lapp/odapplications/bitstashwallet/entities/Coin;", "createRestoredAccount", "accountType", "Lapp/odapplications/bitstashwallet/entities/AccountType;", "syncMode", "Lapp/odapplications/bitstashwallet/entities/SyncMode;", "app_productionMainnetRelease"})
public abstract interface IAccountCreator {
    
    @org.jetbrains.annotations.NotNull()
    public abstract app.odapplications.bitstashwallet.entities.Account createRestoredAccount(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.AccountType accountType, @org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.entities.SyncMode syncMode, boolean createDefaultWallets);
    
    @org.jetbrains.annotations.NotNull()
    public abstract app.odapplications.bitstashwallet.entities.Account createNewAccount(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.DefaultAccountType defaultAccountType, boolean createDefaultWallets);
    
    public abstract void createNewAccount(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Coin coin);
}
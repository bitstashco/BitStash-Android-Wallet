package io.horizontalsystems.bitstashwallet.modules.createwallet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000f"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/createwallet/CreateWalletInteractor;", "Lio/horizontalsystems/bitstashwallet/modules/createwallet/CreateWalletModule$IInteractor;", "appConfigProvider", "Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;", "accountCreator", "Lio/horizontalsystems/bitstashwallet/core/IAccountCreator;", "(Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;Lio/horizontalsystems/bitstashwallet/core/IAccountCreator;)V", "featuredCoins", "", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "getFeaturedCoins", "()Ljava/util/List;", "createWallet", "", "coin", "app_devMainnetMasterDebug"})
public final class CreateWalletInteractor implements io.horizontalsystems.bitstashwallet.modules.createwallet.CreateWalletModule.IInteractor {
    private final io.horizontalsystems.bitstashwallet.core.IAppConfigProvider appConfigProvider = null;
    private final io.horizontalsystems.bitstashwallet.core.IAccountCreator accountCreator = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bitstashwallet.entities.Coin> getFeaturedCoins() {
        return null;
    }
    
    @java.lang.Override()
    public void createWallet(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Coin coin) {
    }
    
    public CreateWalletInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IAppConfigProvider appConfigProvider, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IAccountCreator accountCreator) {
        super();
    }
}
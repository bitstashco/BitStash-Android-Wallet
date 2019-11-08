package io.horizontalsystems.bitstashwallet.modules.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/main/MainInteractor;", "Lio/horizontalsystems/bitstashwallet/modules/main/MainModule$IInteractor;", "accountManager", "Lio/horizontalsystems/bitstashwallet/core/IAccountManager;", "walletManager", "Lio/horizontalsystems/bitstashwallet/core/IWalletManager;", "adapterManager", "Lio/horizontalsystems/bitstashwallet/core/IAdapterManager;", "(Lio/horizontalsystems/bitstashwallet/core/IAccountManager;Lio/horizontalsystems/bitstashwallet/core/IWalletManager;Lio/horizontalsystems/bitstashwallet/core/IAdapterManager;)V", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/main/MainModule$IInteractorDelegate;", "getDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/main/MainModule$IInteractorDelegate;", "setDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/main/MainModule$IInteractorDelegate;)V", "onStart", "", "app_devMainnetMasterDebug"})
public final class MainInteractor implements io.horizontalsystems.bitstashwallet.modules.main.MainModule.IInteractor {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.modules.main.MainModule.IInteractorDelegate delegate;
    private final io.horizontalsystems.bitstashwallet.core.IAccountManager accountManager = null;
    private final io.horizontalsystems.bitstashwallet.core.IWalletManager walletManager = null;
    private final io.horizontalsystems.bitstashwallet.core.IAdapterManager adapterManager = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.modules.main.MainModule.IInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.modules.main.MainModule.IInteractorDelegate p0) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    public MainInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IAccountManager accountManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IWalletManager walletManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IAdapterManager adapterManager) {
        super();
    }
}
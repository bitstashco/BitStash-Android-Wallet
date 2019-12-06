package app.odapplications.bitstashwallet.modules.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/main/MainInteractor;", "Lapp/odapplications/bitstashwallet/modules/main/MainModule$IInteractor;", "accountManager", "Lapp/odapplications/bitstashwallet/core/IAccountManager;", "walletManager", "Lapp/odapplications/bitstashwallet/core/IWalletManager;", "adapterManager", "Lapp/odapplications/bitstashwallet/core/IAdapterManager;", "(Lapp/odapplications/bitstashwallet/core/IAccountManager;Lapp/odapplications/bitstashwallet/core/IWalletManager;Lapp/odapplications/bitstashwallet/core/IAdapterManager;)V", "delegate", "Lapp/odapplications/bitstashwallet/modules/main/MainModule$IInteractorDelegate;", "getDelegate", "()Lapp/odapplications/bitstashwallet/modules/main/MainModule$IInteractorDelegate;", "setDelegate", "(Lapp/odapplications/bitstashwallet/modules/main/MainModule$IInteractorDelegate;)V", "onStart", "", "app_productionMainnetRelease"})
public final class MainInteractor implements app.odapplications.bitstashwallet.modules.main.MainModule.IInteractor {
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.main.MainModule.IInteractorDelegate delegate;
    private final app.odapplications.bitstashwallet.core.IAccountManager accountManager = null;
    private final app.odapplications.bitstashwallet.core.IWalletManager walletManager = null;
    private final app.odapplications.bitstashwallet.core.IAdapterManager adapterManager = null;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.main.MainModule.IInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.main.MainModule.IInteractorDelegate p0) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    public MainInteractor(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IAccountManager accountManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IWalletManager walletManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IAdapterManager adapterManager) {
        super();
    }
}
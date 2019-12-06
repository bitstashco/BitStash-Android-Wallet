package app.odapplications.bitstashwallet.modules.receive;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/receive/ReceiveInteractor;", "Lapp/odapplications/bitstashwallet/modules/receive/ReceiveModule$IInteractor;", "wallet", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "adapterManager", "Lapp/odapplications/bitstashwallet/core/IAdapterManager;", "clipboardManager", "Lapp/odapplications/bitstashwallet/core/IClipboardManager;", "(Lapp/odapplications/bitstashwallet/entities/Wallet;Lapp/odapplications/bitstashwallet/core/IAdapterManager;Lapp/odapplications/bitstashwallet/core/IClipboardManager;)V", "delegate", "Lapp/odapplications/bitstashwallet/modules/receive/ReceiveModule$IInteractorDelegate;", "getDelegate", "()Lapp/odapplications/bitstashwallet/modules/receive/ReceiveModule$IInteractorDelegate;", "setDelegate", "(Lapp/odapplications/bitstashwallet/modules/receive/ReceiveModule$IInteractorDelegate;)V", "copyToClipboard", "", "coinAddress", "", "getReceiveAddress", "app_productionMainnetRelease"})
public final class ReceiveInteractor implements app.odapplications.bitstashwallet.modules.receive.ReceiveModule.IInteractor {
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.receive.ReceiveModule.IInteractorDelegate delegate;
    private app.odapplications.bitstashwallet.entities.Wallet wallet;
    private app.odapplications.bitstashwallet.core.IAdapterManager adapterManager;
    private app.odapplications.bitstashwallet.core.IClipboardManager clipboardManager;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.receive.ReceiveModule.IInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.receive.ReceiveModule.IInteractorDelegate p0) {
    }
    
    @java.lang.Override()
    public void getReceiveAddress() {
    }
    
    @java.lang.Override()
    public void copyToClipboard(@org.jetbrains.annotations.NotNull()
    java.lang.String coinAddress) {
    }
    
    public ReceiveInteractor(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Wallet wallet, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IAdapterManager adapterManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IClipboardManager clipboardManager) {
        super();
    }
}
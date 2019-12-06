package app.odapplications.bitstashwallet.modules.send.submodules.confirmation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationInteractor;", "Lapp/odapplications/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationModule$IInteractor;", "clipboardManager", "Lapp/odapplications/bitstashwallet/core/IClipboardManager;", "(Lapp/odapplications/bitstashwallet/core/IClipboardManager;)V", "delegate", "Lapp/odapplications/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationModule$IInteractorDelegate;", "getDelegate", "()Lapp/odapplications/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationModule$IInteractorDelegate;", "setDelegate", "(Lapp/odapplications/bitstashwallet/modules/send/submodules/confirmation/SendConfirmationModule$IInteractorDelegate;)V", "copyToClipboard", "", "coinAddress", "", "app_productionMainnetRelease"})
public final class SendConfirmationInteractor implements app.odapplications.bitstashwallet.modules.send.submodules.confirmation.SendConfirmationModule.IInteractor {
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.send.submodules.confirmation.SendConfirmationModule.IInteractorDelegate delegate;
    private final app.odapplications.bitstashwallet.core.IClipboardManager clipboardManager = null;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.send.submodules.confirmation.SendConfirmationModule.IInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.send.submodules.confirmation.SendConfirmationModule.IInteractorDelegate p0) {
    }
    
    @java.lang.Override()
    public void copyToClipboard(@org.jetbrains.annotations.NotNull()
    java.lang.String coinAddress) {
    }
    
    public SendConfirmationInteractor(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IClipboardManager clipboardManager) {
        super();
    }
}
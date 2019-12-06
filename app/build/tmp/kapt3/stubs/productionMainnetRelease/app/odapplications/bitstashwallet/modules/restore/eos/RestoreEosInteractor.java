package app.odapplications.bitstashwallet.modules.restore.eos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/restore/eos/RestoreEosInteractor;", "Lapp/odapplications/bitstashwallet/modules/restore/eos/RestoreEosModule$IInteractor;", "clipboardManager", "Lapp/odapplications/bitstashwallet/core/IClipboardManager;", "(Lapp/odapplications/bitstashwallet/core/IClipboardManager;)V", "delegate", "Lapp/odapplications/bitstashwallet/modules/restore/eos/RestoreEosModule$IInteractorDelegate;", "getDelegate", "()Lapp/odapplications/bitstashwallet/modules/restore/eos/RestoreEosModule$IInteractorDelegate;", "setDelegate", "(Lapp/odapplications/bitstashwallet/modules/restore/eos/RestoreEosModule$IInteractorDelegate;)V", "textFromClipboard", "", "getTextFromClipboard", "()Ljava/lang/String;", "validate", "", "accountName", "privateKey", "app_productionMainnetRelease"})
public final class RestoreEosInteractor implements app.odapplications.bitstashwallet.modules.restore.eos.RestoreEosModule.IInteractor {
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.restore.eos.RestoreEosModule.IInteractorDelegate delegate;
    private final app.odapplications.bitstashwallet.core.IClipboardManager clipboardManager = null;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.restore.eos.RestoreEosModule.IInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.restore.eos.RestoreEosModule.IInteractorDelegate p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getTextFromClipboard() {
        return null;
    }
    
    @java.lang.Override()
    public void validate(@org.jetbrains.annotations.NotNull()
    java.lang.String accountName, @org.jetbrains.annotations.NotNull()
    java.lang.String privateKey) {
    }
    
    public RestoreEosInteractor(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IClipboardManager clipboardManager) {
        super();
    }
}
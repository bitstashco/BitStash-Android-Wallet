package app.odapplications.bitstashwallet.modules.pin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u0012\u0010\u0010\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\fH\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/pin/PinInteractor;", "Lapp/odapplications/bitstashwallet/modules/pin/PinModule$IInteractor;", "pinManager", "Lapp/odapplications/bitstashwallet/core/IPinManager;", "(Lapp/odapplications/bitstashwallet/core/IPinManager;)V", "delegate", "Lapp/odapplications/bitstashwallet/modules/pin/PinModule$IInteractorDelegate;", "getDelegate", "()Lapp/odapplications/bitstashwallet/modules/pin/PinModule$IInteractorDelegate;", "setDelegate", "(Lapp/odapplications/bitstashwallet/modules/pin/PinModule$IInteractorDelegate;)V", "storedPin", "", "save", "", "pin", "set", "unlock", "", "validate", "app_productionMainnetRelease"})
public final class PinInteractor implements app.odapplications.bitstashwallet.modules.pin.PinModule.IInteractor {
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.pin.PinModule.IInteractorDelegate delegate;
    private java.lang.String storedPin;
    private final app.odapplications.bitstashwallet.core.IPinManager pinManager = null;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.pin.PinModule.IInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.pin.PinModule.IInteractorDelegate p0) {
    }
    
    @java.lang.Override()
    public void set(@org.jetbrains.annotations.Nullable()
    java.lang.String pin) {
    }
    
    @java.lang.Override()
    public boolean validate(@org.jetbrains.annotations.NotNull()
    java.lang.String pin) {
        return false;
    }
    
    @java.lang.Override()
    public void save(@org.jetbrains.annotations.NotNull()
    java.lang.String pin) {
    }
    
    @java.lang.Override()
    public boolean unlock(@org.jetbrains.annotations.NotNull()
    java.lang.String pin) {
        return false;
    }
    
    public PinInteractor(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IPinManager pinManager) {
        super();
    }
}
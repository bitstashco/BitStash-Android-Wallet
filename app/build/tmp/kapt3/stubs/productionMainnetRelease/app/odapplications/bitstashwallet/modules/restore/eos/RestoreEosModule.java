package app.odapplications.bitstashwallet.modules.restore.eos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0005\u000e\u000f\u0010\u0011\u0012B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r\u00a8\u0006\u0013"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/restore/eos/RestoreEosModule;", "", "()V", "init", "", "view", "Lapp/odapplications/bitstashwallet/modules/restore/eos/RestoreEosViewModel;", "router", "Lapp/odapplications/bitstashwallet/modules/restore/eos/RestoreEosModule$IRouter;", "startForResult", "context", "Landroidx/appcompat/app/AppCompatActivity;", "requestCode", "", "IInteractor", "IInteractorDelegate", "IRouter", "IView", "IViewDelegate", "app_productionMainnetRelease"})
public final class RestoreEosModule {
    public static final app.odapplications.bitstashwallet.modules.restore.eos.RestoreEosModule INSTANCE = null;
    
    public final void startForResult(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity context, int requestCode) {
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.restore.eos.RestoreEosViewModel view, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.restore.eos.RestoreEosModule.IRouter router) {
    }
    
    private RestoreEosModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/restore/eos/RestoreEosModule$IView;", "", "setAccount", "", "account", "", "setPrivateKey", "key", "showError", "resId", "", "app_productionMainnetRelease"})
    public static abstract interface IView {
        
        public abstract void setPrivateKey(@org.jetbrains.annotations.NotNull()
        java.lang.String key);
        
        public abstract void setAccount(@org.jetbrains.annotations.NotNull()
        java.lang.String account);
        
        public abstract void showError(int resId);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\f"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/restore/eos/RestoreEosModule$IViewDelegate;", "", "onClickDone", "", "accountName", "", "privateKey", "onClickScan", "onPasteAccount", "onPasteKey", "onQRCodeScan", "key", "app_productionMainnetRelease"})
    public static abstract interface IViewDelegate {
        
        public abstract void onClickDone(@org.jetbrains.annotations.NotNull()
        java.lang.String accountName, @org.jetbrains.annotations.NotNull()
        java.lang.String privateKey);
        
        public abstract void onClickScan();
        
        public abstract void onPasteAccount();
        
        public abstract void onPasteKey();
        
        public abstract void onQRCodeScan(@org.jetbrains.annotations.Nullable()
        java.lang.String key);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\n"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/restore/eos/RestoreEosModule$IInteractor;", "", "textFromClipboard", "", "getTextFromClipboard", "()Ljava/lang/String;", "validate", "", "accountName", "privateKey", "app_productionMainnetRelease"})
    public static abstract interface IInteractor {
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.String getTextFromClipboard();
        
        public abstract void validate(@org.jetbrains.annotations.NotNull()
        java.lang.String accountName, @org.jetbrains.annotations.NotNull()
        java.lang.String privateKey);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/restore/eos/RestoreEosModule$IInteractorDelegate;", "", "onInvalidAccount", "", "onInvalidKey", "onValidationSuccess", "accountName", "", "privateKey", "app_productionMainnetRelease"})
    public static abstract interface IInteractorDelegate {
        
        public abstract void onValidationSuccess(@org.jetbrains.annotations.NotNull()
        java.lang.String accountName, @org.jetbrains.annotations.NotNull()
        java.lang.String privateKey);
        
        public abstract void onInvalidAccount();
        
        public abstract void onInvalidKey();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/restore/eos/RestoreEosModule$IRouter;", "", "finishWithSuccess", "", "accountName", "", "privateKey", "startQRScanner", "app_productionMainnetRelease"})
    public static abstract interface IRouter {
        
        public abstract void startQRScanner();
        
        public abstract void finishWithSuccess(@org.jetbrains.annotations.NotNull()
        java.lang.String accountName, @org.jetbrains.annotations.NotNull()
        java.lang.String privateKey);
    }
}
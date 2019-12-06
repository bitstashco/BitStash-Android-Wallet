package app.odapplications.bitstashwallet.modules.restore.eos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0013H\u0016J\u0006\u0010 \u001a\u00020\u001bJ\u0010\u0010\u0016\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u0013H\u0016J\u0010\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\rH\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015\u00a8\u0006%"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/restore/eos/RestoreEosViewModel;", "Landroidx/lifecycle/ViewModel;", "Lapp/odapplications/bitstashwallet/modules/restore/eos/RestoreEosModule$IView;", "Lapp/odapplications/bitstashwallet/modules/restore/eos/RestoreEosModule$IRouter;", "()V", "delegate", "Lapp/odapplications/bitstashwallet/modules/restore/eos/RestoreEosModule$IViewDelegate;", "getDelegate", "()Lapp/odapplications/bitstashwallet/modules/restore/eos/RestoreEosModule$IViewDelegate;", "setDelegate", "(Lapp/odapplications/bitstashwallet/modules/restore/eos/RestoreEosModule$IViewDelegate;)V", "errorLiveEvent", "Landroidx/lifecycle/MutableLiveData;", "", "getErrorLiveEvent", "()Landroidx/lifecycle/MutableLiveData;", "finishLiveEvent", "Lapp/odapplications/bitstashwallet/SingleLiveEvent;", "Lkotlin/Pair;", "", "getFinishLiveEvent", "()Lapp/odapplications/bitstashwallet/SingleLiveEvent;", "setAccount", "getSetAccount", "setPrivateKey", "getSetPrivateKey", "startQRScanner", "", "getStartQRScanner", "finishWithSuccess", "accountName", "privateKey", "init", "account", "key", "showError", "resId", "app_productionMainnetRelease"})
public final class RestoreEosViewModel extends androidx.lifecycle.ViewModel implements app.odapplications.bitstashwallet.modules.restore.eos.RestoreEosModule.IView, app.odapplications.bitstashwallet.modules.restore.eos.RestoreEosModule.IRouter {
    @org.jetbrains.annotations.NotNull()
    public app.odapplications.bitstashwallet.modules.restore.eos.RestoreEosModule.IViewDelegate delegate;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<kotlin.Unit> startQRScanner = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> setAccount = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> setPrivateKey = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> errorLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<kotlin.Pair<java.lang.String, java.lang.String>> finishLiveEvent = null;
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.modules.restore.eos.RestoreEosModule.IViewDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.restore.eos.RestoreEosModule.IViewDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<kotlin.Unit> getStartQRScanner() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSetAccount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSetPrivateKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getErrorLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<kotlin.Pair<java.lang.String, java.lang.String>> getFinishLiveEvent() {
        return null;
    }
    
    public final void init() {
    }
    
    @java.lang.Override()
    public void setPrivateKey(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    @java.lang.Override()
    public void setAccount(@org.jetbrains.annotations.NotNull()
    java.lang.String account) {
    }
    
    @java.lang.Override()
    public void showError(int resId) {
    }
    
    @java.lang.Override()
    public void startQRScanner() {
    }
    
    @java.lang.Override()
    public void finishWithSuccess(@org.jetbrains.annotations.NotNull()
    java.lang.String accountName, @org.jetbrains.annotations.NotNull()
    java.lang.String privateKey) {
    }
    
    public RestoreEosViewModel() {
        super();
    }
}
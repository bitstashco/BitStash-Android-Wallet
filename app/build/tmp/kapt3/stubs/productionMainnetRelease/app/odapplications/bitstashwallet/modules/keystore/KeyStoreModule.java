package app.odapplications.bitstashwallet.modules.keystore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0006\u0013\u0014\u0015\u0016\u0017\u0018B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/keystore/KeyStoreModule;", "", "()V", "MODE", "", "init", "", "view", "Lapp/odapplications/bitstashwallet/modules/keystore/KeyStoreViewModel;", "router", "Lapp/odapplications/bitstashwallet/modules/keystore/KeyStoreModule$IRouter;", "mode", "Lapp/odapplications/bitstashwallet/modules/keystore/KeyStoreModule$ModeType;", "start", "context", "Landroid/content/Context;", "startForInvalidKey", "startForNoSystemLock", "startForUserAuthentication", "IInteractor", "IInteractorDelegate", "IRouter", "IView", "IViewDelegate", "ModeType", "app_productionMainnetRelease"})
public final class KeyStoreModule {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MODE = "mode";
    public static final app.odapplications.bitstashwallet.modules.keystore.KeyStoreModule INSTANCE = null;
    
    public final void init(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.keystore.KeyStoreViewModel view, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.keystore.KeyStoreModule.IRouter router, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.keystore.KeyStoreModule.ModeType mode) {
    }
    
    public final void startForNoSystemLock(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void startForInvalidKey(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void startForUserAuthentication(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final void start(android.content.Context context, app.odapplications.bitstashwallet.modules.keystore.KeyStoreModule.ModeType mode) {
    }
    
    private KeyStoreModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/keystore/KeyStoreModule$IView;", "", "promptUserAuthentication", "", "showInvalidKeyWarning", "showNoSystemLockWarning", "app_productionMainnetRelease"})
    public static abstract interface IView {
        
        public abstract void showNoSystemLockWarning();
        
        public abstract void showInvalidKeyWarning();
        
        public abstract void promptUserAuthentication();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/keystore/KeyStoreModule$IViewDelegate;", "", "onAuthenticationCanceled", "", "onAuthenticationSuccess", "onCloseInvalidKeyWarning", "onResume", "viewDidLoad", "app_productionMainnetRelease"})
    public static abstract interface IViewDelegate {
        
        public abstract void viewDidLoad();
        
        public abstract void onCloseInvalidKeyWarning();
        
        public abstract void onResume();
        
        public abstract void onAuthenticationCanceled();
        
        public abstract void onAuthenticationSuccess();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\bH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\u00a8\u0006\n"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/keystore/KeyStoreModule$IInteractor;", "", "isKeyInvalidated", "", "()Z", "isSystemLockOff", "isUserNotAuthenticated", "removeKey", "", "resetApp", "app_productionMainnetRelease"})
    public static abstract interface IInteractor {
        
        public abstract boolean isSystemLockOff();
        
        public abstract boolean isKeyInvalidated();
        
        public abstract boolean isUserNotAuthenticated();
        
        public abstract void resetApp();
        
        public abstract void removeKey();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/keystore/KeyStoreModule$IInteractorDelegate;", "", "app_productionMainnetRelease"})
    public static abstract interface IInteractorDelegate {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/keystore/KeyStoreModule$IRouter;", "", "closeApplication", "", "openLaunchModule", "app_productionMainnetRelease"})
    public static abstract interface IRouter {
        
        public abstract void openLaunchModule();
        
        public abstract void closeApplication();
    }
    
    @kotlinx.android.parcel.Parcelize()
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u00d6\u0001j\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u00a8\u0006\u000e"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/keystore/KeyStoreModule$ModeType;", "", "Landroid/os/Parcelable;", "(Ljava/lang/String;I)V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "NoSystemLock", "InvalidKey", "UserAuthentication", "app_productionMainnetRelease"})
    public static enum ModeType implements android.os.Parcelable {
        /*public static final*/ NoSystemLock /* = new NoSystemLock() */,
        /*public static final*/ InvalidKey /* = new InvalidKey() */,
        /*public static final*/ UserAuthentication /* = new UserAuthentication() */;
        public static final android.os.Parcelable.Creator CREATOR = null;
        
        ModeType() {
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Object[] newArray(int size) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Object createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
        }
    }
}
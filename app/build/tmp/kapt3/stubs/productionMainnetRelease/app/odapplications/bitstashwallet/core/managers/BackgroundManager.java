package app.odapplications.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001!B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0019\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013H\u0016J\u001c\u0010\u001a\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\rJ\u000e\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\rR\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lapp/odapplications/bitstashwallet/core/managers/BackgroundManager;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "inBackground", "", "getInBackground", "()Z", "inForeground", "getInForeground", "listeners", "", "Lapp/odapplications/bitstashwallet/core/managers/BackgroundManager$Listener;", "refs", "", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "p0", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "registerListener", "listener", "unregisterListener", "Listener", "app_productionMainnetRelease"})
public final class BackgroundManager implements android.app.Application.ActivityLifecycleCallbacks {
    private int refs;
    private java.util.List<app.odapplications.bitstashwallet.core.managers.BackgroundManager.Listener> listeners;
    
    public final synchronized void registerListener(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.managers.BackgroundManager.Listener listener) {
    }
    
    public final synchronized void unregisterListener(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.managers.BackgroundManager.Listener listener) {
    }
    
    public final boolean getInForeground() {
        return false;
    }
    
    public final boolean getInBackground() {
        return false;
    }
    
    @java.lang.Override()
    public void onActivityStarted(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityStopped(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityPaused(@org.jetbrains.annotations.Nullable()
    android.app.Activity p0) {
    }
    
    @java.lang.Override()
    public void onActivityResumed(@org.jetbrains.annotations.Nullable()
    android.app.Activity p0) {
    }
    
    @java.lang.Override()
    public void onActivitySaveInstanceState(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onActivityDestroyed(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
    }
    
    public BackgroundManager(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lapp/odapplications/bitstashwallet/core/managers/BackgroundManager$Listener;", "", "didEnterBackground", "", "willEnterForeground", "activity", "Landroid/app/Activity;", "app_productionMainnetRelease"})
    public static abstract interface Listener {
        
        public abstract void willEnterForeground(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity);
        
        public abstract void willEnterForeground();
        
        public abstract void didEnterBackground();
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
            
            public static void willEnterForeground(app.odapplications.bitstashwallet.core.managers.BackgroundManager.Listener $this, @org.jetbrains.annotations.NotNull()
            android.app.Activity activity) {
            }
            
            public static void willEnterForeground(app.odapplications.bitstashwallet.core.managers.BackgroundManager.Listener $this) {
            }
            
            public static void didEnterBackground(app.odapplications.bitstashwallet.core.managers.BackgroundManager.Listener $this) {
            }
        }
    }
}
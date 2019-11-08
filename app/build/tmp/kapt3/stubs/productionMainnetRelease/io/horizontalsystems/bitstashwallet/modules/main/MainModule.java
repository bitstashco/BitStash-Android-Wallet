package io.horizontalsystems.bitstashwallet.modules.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0005\u0011\u0012\u0013\u0014\u0015B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006\u0016"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/main/MainModule;", "", "()V", "init", "", "view", "Lio/horizontalsystems/bitstashwallet/modules/main/MainViewModel;", "router", "Lio/horizontalsystems/bitstashwallet/modules/main/MainModule$IRouter;", "start", "context", "Landroid/content/Context;", "startAsNewTask", "Landroid/app/Activity;", "activeTab", "", "(Landroid/app/Activity;Ljava/lang/Integer;)V", "IInteractor", "IInteractorDelegate", "IRouter", "IView", "IViewDelegate", "app_productionMainnetRelease"})
public final class MainModule {
    public static final io.horizontalsystems.bitstashwallet.modules.main.MainModule INSTANCE = null;
    
    public final void init(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.main.MainViewModel view, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.main.MainModule.IRouter router) {
    }
    
    public final void start(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void startAsNewTask(@org.jetbrains.annotations.NotNull()
    android.app.Activity context, @org.jetbrains.annotations.Nullable()
    java.lang.Integer activeTab) {
    }
    
    private MainModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/main/MainModule$IView;", "", "app_productionMainnetRelease"})
    public static abstract interface IView {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/main/MainModule$IViewDelegate;", "", "viewDidLoad", "", "app_productionMainnetRelease"})
    public static abstract interface IViewDelegate {
        
        public abstract void viewDidLoad();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/main/MainModule$IInteractor;", "", "onStart", "", "app_productionMainnetRelease"})
    public static abstract interface IInteractor {
        
        public abstract void onStart();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/main/MainModule$IInteractorDelegate;", "", "app_productionMainnetRelease"})
    public static abstract interface IInteractorDelegate {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/main/MainModule$IRouter;", "", "app_productionMainnetRelease"})
    public static abstract interface IRouter {
    }
}
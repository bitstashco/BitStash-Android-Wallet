package io.horizontalsystems.bitstashwallet.modules.ratelist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0014J\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0013H\u0002J\b\u0010%\u001a\u00020\u0013H\u0016J\b\u0010&\u001a\u00020\u0013H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\'"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/ratelist/RateListPresenter;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bitstashwallet/modules/ratelist/RateListModule$IViewDelegate;", "Lio/horizontalsystems/bitstashwallet/modules/ratelist/RateListModule$IInteractorDelegate;", "view", "Lio/horizontalsystems/bitstashwallet/modules/ratelist/RateListView;", "interactor", "Lio/horizontalsystems/bitstashwallet/modules/ratelist/RateListModule$IInteractor;", "dataSource", "Lio/horizontalsystems/bitstashwallet/modules/ratelist/RateListModule$DataSource;", "(Lio/horizontalsystems/bitstashwallet/modules/ratelist/RateListView;Lio/horizontalsystems/bitstashwallet/modules/ratelist/RateListModule$IInteractor;Lio/horizontalsystems/bitstashwallet/modules/ratelist/RateListModule$DataSource;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "itemsCount", "", "getItemsCount", "()I", "reloadViewSubject", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "getView", "()Lio/horizontalsystems/bitstashwallet/modules/ratelist/RateListView;", "didUpdateRate", "rate", "Lio/horizontalsystems/bitstashwallet/entities/Rate;", "getViewItem", "Lio/horizontalsystems/bitstashwallet/modules/ratelist/RateViewItem;", "position", "onCleared", "onFailStats", "coinCode", "", "onReceive", "statsData", "Lio/horizontalsystems/bitstashwallet/core/managers/StatsData;", "postViewReload", "viewDidLoad", "willEnterForeground", "app_productionMainnetRelease"})
public final class RateListPresenter extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bitstashwallet.modules.ratelist.RateListModule.IViewDelegate, io.horizontalsystems.bitstashwallet.modules.ratelist.RateListModule.IInteractorDelegate {
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> reloadViewSubject = null;
    private io.reactivex.disposables.CompositeDisposable disposables;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.modules.ratelist.RateListView view = null;
    private final io.horizontalsystems.bitstashwallet.modules.ratelist.RateListModule.IInteractor interactor = null;
    private final io.horizontalsystems.bitstashwallet.modules.ratelist.RateListModule.DataSource dataSource = null;
    
    @java.lang.Override()
    public int getItemsCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void viewDidLoad() {
    }
    
    @java.lang.Override()
    public void willEnterForeground() {
    }
    
    @java.lang.Override()
    public synchronized void didUpdateRate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Rate rate) {
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.managers.StatsData statsData) {
    }
    
    @java.lang.Override()
    public void onFailStats(@org.jetbrains.annotations.NotNull()
    java.lang.String coinCode) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.modules.ratelist.RateViewItem getViewItem(int position) {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    private final void postViewReload() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.ratelist.RateListView getView() {
        return null;
    }
    
    public RateListPresenter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.ratelist.RateListView view, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.ratelist.RateListModule.IInteractor interactor, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.ratelist.RateListModule.DataSource dataSource) {
        super();
    }
}
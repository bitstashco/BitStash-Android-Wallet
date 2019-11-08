package io.horizontalsystems.bitstashwallet.modules.notifications;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001f\u001a\u00020\u0015H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006 "}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/notifications/NotificationsPresenter;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bitstashwallet/modules/notifications/NotificationsModule$IViewDelegate;", "Lio/horizontalsystems/bitstashwallet/modules/notifications/NotificationsModule$IInteractorDelegate;", "view", "Lio/horizontalsystems/bitstashwallet/modules/notifications/NotificationsModule$IView;", "router", "Lio/horizontalsystems/bitstashwallet/modules/notifications/NotificationsModule$IRouter;", "interactor", "Lio/horizontalsystems/bitstashwallet/modules/notifications/NotificationsModule$IInteractor;", "priceAlertViewItemFactory", "Lio/horizontalsystems/bitstashwallet/modules/notifications/PriceAlertViewItemFactory;", "(Lio/horizontalsystems/bitstashwallet/modules/notifications/NotificationsModule$IView;Lio/horizontalsystems/bitstashwallet/modules/notifications/NotificationsModule$IRouter;Lio/horizontalsystems/bitstashwallet/modules/notifications/NotificationsModule$IInteractor;Lio/horizontalsystems/bitstashwallet/modules/notifications/PriceAlertViewItemFactory;)V", "priceAlerts", "", "Lio/horizontalsystems/bitstashwallet/entities/PriceAlert;", "getRouter", "()Lio/horizontalsystems/bitstashwallet/modules/notifications/NotificationsModule$IRouter;", "getView", "()Lio/horizontalsystems/bitstashwallet/modules/notifications/NotificationsModule$IView;", "checkPriceAlertsEnabled", "", "didClickDeactivateAll", "didClickOpenSettings", "didEnterForeground", "didSelectState", "itemPosition", "", "state", "Lio/horizontalsystems/bitstashwallet/entities/PriceAlert$State;", "didTapItem", "viewDidLoad", "app_productionMainnetRelease"})
public final class NotificationsPresenter extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bitstashwallet.modules.notifications.NotificationsModule.IViewDelegate, io.horizontalsystems.bitstashwallet.modules.notifications.NotificationsModule.IInteractorDelegate {
    private java.util.List<io.horizontalsystems.bitstashwallet.entities.PriceAlert> priceAlerts;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.modules.notifications.NotificationsModule.IView view = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.modules.notifications.NotificationsModule.IRouter router = null;
    private final io.horizontalsystems.bitstashwallet.modules.notifications.NotificationsModule.IInteractor interactor = null;
    private final io.horizontalsystems.bitstashwallet.modules.notifications.PriceAlertViewItemFactory priceAlertViewItemFactory = null;
    
    @java.lang.Override()
    public void viewDidLoad() {
    }
    
    @java.lang.Override()
    public void didTapItem(int itemPosition) {
    }
    
    @java.lang.Override()
    public void didSelectState(int itemPosition, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.PriceAlert.State state) {
    }
    
    @java.lang.Override()
    public void didClickOpenSettings() {
    }
    
    @java.lang.Override()
    public void didClickDeactivateAll() {
    }
    
    @java.lang.Override()
    public void didEnterForeground() {
    }
    
    private final void checkPriceAlertsEnabled() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.notifications.NotificationsModule.IView getView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.notifications.NotificationsModule.IRouter getRouter() {
        return null;
    }
    
    public NotificationsPresenter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.notifications.NotificationsModule.IView view, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.notifications.NotificationsModule.IRouter router, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.notifications.NotificationsModule.IInteractor interactor, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.notifications.PriceAlertViewItemFactory priceAlertViewItemFactory) {
        super();
    }
}
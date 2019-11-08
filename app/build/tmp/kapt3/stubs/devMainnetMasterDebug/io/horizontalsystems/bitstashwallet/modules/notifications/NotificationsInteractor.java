package io.horizontalsystems.bitstashwallet.modules.notifications;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\u0019\u001a\u00020\u001a2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016R\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001c"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/notifications/NotificationsInteractor;", "Lio/horizontalsystems/bitstashwallet/modules/notifications/NotificationsModule$IInteractor;", "Lio/horizontalsystems/bitstashwallet/core/managers/BackgroundManager$Listener;", "priceAlertManager", "Lio/horizontalsystems/bitstashwallet/core/managers/PriceAlertManager;", "backgroundManager", "Lio/horizontalsystems/bitstashwallet/core/managers/BackgroundManager;", "notificationManager", "Lio/horizontalsystems/bitstashwallet/core/INotificationManager;", "(Lio/horizontalsystems/bitstashwallet/core/managers/PriceAlertManager;Lio/horizontalsystems/bitstashwallet/core/managers/BackgroundManager;Lio/horizontalsystems/bitstashwallet/core/INotificationManager;)V", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/notifications/NotificationsModule$IInteractorDelegate;", "getDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/notifications/NotificationsModule$IInteractorDelegate;", "setDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/notifications/NotificationsModule$IInteractorDelegate;)V", "priceAlerts", "", "Lio/horizontalsystems/bitstashwallet/entities/PriceAlert;", "getPriceAlerts", "()Ljava/util/List;", "priceAlertsEnabled", "", "getPriceAlertsEnabled", "()Z", "savePriceAlerts", "", "willEnterForeground", "app_devMainnetMasterDebug"})
public final class NotificationsInteractor implements io.horizontalsystems.bitstashwallet.modules.notifications.NotificationsModule.IInteractor, io.horizontalsystems.bitstashwallet.core.managers.BackgroundManager.Listener {
    @org.jetbrains.annotations.NotNull()
    public io.horizontalsystems.bitstashwallet.modules.notifications.NotificationsModule.IInteractorDelegate delegate;
    private final io.horizontalsystems.bitstashwallet.core.managers.PriceAlertManager priceAlertManager = null;
    private final io.horizontalsystems.bitstashwallet.core.INotificationManager notificationManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.notifications.NotificationsModule.IInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.notifications.NotificationsModule.IInteractorDelegate p0) {
    }
    
    @java.lang.Override()
    public boolean getPriceAlertsEnabled() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bitstashwallet.entities.PriceAlert> getPriceAlerts() {
        return null;
    }
    
    @java.lang.Override()
    public void savePriceAlerts(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.entities.PriceAlert> priceAlerts) {
    }
    
    @java.lang.Override()
    public void willEnterForeground() {
    }
    
    public NotificationsInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.managers.PriceAlertManager priceAlertManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.managers.BackgroundManager backgroundManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.INotificationManager notificationManager) {
        super();
    }
    
    public void willEnterForeground(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public void didEnterBackground() {
    }
}
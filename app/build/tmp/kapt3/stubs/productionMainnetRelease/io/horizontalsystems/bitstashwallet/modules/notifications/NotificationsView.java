package io.horizontalsystems.bitstashwallet.modules.notifications;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0016\u0010\u0015\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\rH\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0016R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR#\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\b\u00a8\u0006\u001b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/notifications/NotificationsView;", "Lio/horizontalsystems/bitstashwallet/modules/notifications/NotificationsModule$IView;", "()V", "itemsLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lio/horizontalsystems/bitstashwallet/modules/notifications/NotificationsModule$PriceAlertViewItem;", "getItemsLiveData", "()Landroidx/lifecycle/MutableLiveData;", "showStateSelectorLiveEvent", "Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "Lkotlin/Pair;", "", "Lio/horizontalsystems/bitstashwallet/entities/PriceAlert;", "getShowStateSelectorLiveEvent", "()Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "toggleWarningLiveData", "", "getToggleWarningLiveData", "hideWarning", "", "setItems", "items", "showStateSelector", "itemPosition", "priceAlert", "showWarning", "app_productionMainnetRelease"})
public final class NotificationsView implements io.horizontalsystems.bitstashwallet.modules.notifications.NotificationsModule.IView {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bitstashwallet.modules.notifications.NotificationsModule.PriceAlertViewItem>> itemsLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> toggleWarningLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Pair<java.lang.Integer, io.horizontalsystems.bitstashwallet.entities.PriceAlert>> showStateSelectorLiveEvent = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bitstashwallet.modules.notifications.NotificationsModule.PriceAlertViewItem>> getItemsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getToggleWarningLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Pair<java.lang.Integer, io.horizontalsystems.bitstashwallet.entities.PriceAlert>> getShowStateSelectorLiveEvent() {
        return null;
    }
    
    @java.lang.Override()
    public void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.modules.notifications.NotificationsModule.PriceAlertViewItem> items) {
    }
    
    @java.lang.Override()
    public void showWarning() {
    }
    
    @java.lang.Override()
    public void hideWarning() {
    }
    
    @java.lang.Override()
    public void showStateSelector(int itemPosition, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.PriceAlert priceAlert) {
    }
    
    public NotificationsView() {
        super();
    }
}
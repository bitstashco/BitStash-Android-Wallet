package io.horizontalsystems.bitstashwallet.modules.notifications;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eH\u0016R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/notifications/NotificationItemsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lio/horizontalsystems/bitstashwallet/modules/notifications/NotificationItemViewHolder;", "presenter", "Lio/horizontalsystems/bitstashwallet/modules/notifications/NotificationsPresenter;", "(Lio/horizontalsystems/bitstashwallet/modules/notifications/NotificationsPresenter;)V", "items", "", "Lio/horizontalsystems/bitstashwallet/modules/notifications/NotificationsModule$PriceAlertViewItem;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getItemCount", "", "getItemId", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_devMainnetMasterDebug"})
public final class NotificationItemsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<io.horizontalsystems.bitstashwallet.modules.notifications.NotificationItemViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<io.horizontalsystems.bitstashwallet.modules.notifications.NotificationsModule.PriceAlertViewItem> items;
    private final io.horizontalsystems.bitstashwallet.modules.notifications.NotificationsPresenter presenter = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bitstashwallet.modules.notifications.NotificationsModule.PriceAlertViewItem> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.modules.notifications.NotificationsModule.PriceAlertViewItem> p0) {
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.modules.notifications.NotificationItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.notifications.NotificationItemViewHolder holder, int position) {
    }
    
    public NotificationItemsAdapter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.notifications.NotificationsPresenter presenter) {
        super();
    }
}
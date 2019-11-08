package io.horizontalsystems.bitstashwallet.ui.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0016H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lio/horizontalsystems/bitstashwallet/ui/extensions/NumPadItemsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "listener", "Lio/horizontalsystems/bitstashwallet/ui/extensions/NumPadItemsAdapter$Listener;", "bottomLeftButtonType", "Lio/horizontalsystems/bitstashwallet/ui/extensions/NumPadItemType;", "showLetters", "", "(Lio/horizontalsystems/bitstashwallet/ui/extensions/NumPadItemsAdapter$Listener;Lio/horizontalsystems/bitstashwallet/ui/extensions/NumPadItemType;Z)V", "numPadItems", "", "Lio/horizontalsystems/bitstashwallet/ui/extensions/NumPadItem;", "getNumPadItems", "()Ljava/util/List;", "value", "showFingerPrintButton", "getShowFingerPrintButton", "()Z", "setShowFingerPrintButton", "(Z)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Listener", "app_devMainnetMasterDebug"})
public final class NumPadItemsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.bitstashwallet.ui.extensions.NumPadItem> numPadItems = null;
    private boolean showFingerPrintButton;
    private final io.horizontalsystems.bitstashwallet.ui.extensions.NumPadItemsAdapter.Listener listener = null;
    private final boolean showLetters = false;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bitstashwallet.ui.extensions.NumPadItem> getNumPadItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final boolean getShowFingerPrintButton() {
        return false;
    }
    
    public final void setShowFingerPrintButton(boolean value) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    public NumPadItemsAdapter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.ui.extensions.NumPadItemsAdapter.Listener listener, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.ui.extensions.NumPadItemType bottomLeftButtonType, boolean showLetters) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bitstashwallet/ui/extensions/NumPadItemsAdapter$Listener;", "", "onItemClick", "", "item", "Lio/horizontalsystems/bitstashwallet/ui/extensions/NumPadItem;", "app_devMainnetMasterDebug"})
    public static abstract interface Listener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.ui.extensions.NumPadItem item);
    }
}
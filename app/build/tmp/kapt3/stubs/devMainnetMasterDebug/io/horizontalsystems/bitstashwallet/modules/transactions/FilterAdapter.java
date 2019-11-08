package io.horizontalsystems.bitstashwallet.modules.transactions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001dB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0012H\u0016J\u0016\u0010\u001c\u001a\u00020\u00142\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/transactions/FilterAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lio/horizontalsystems/bitstashwallet/modules/transactions/ViewHolderFilter$ClickListener;", "listener", "Lio/horizontalsystems/bitstashwallet/modules/transactions/FilterAdapter$Listener;", "(Lio/horizontalsystems/bitstashwallet/modules/transactions/FilterAdapter$Listener;)V", "filterChangeable", "", "getFilterChangeable", "()Z", "setFilterChangeable", "(Z)V", "filters", "", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "selectedFilterId", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onClickItem", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setFilters", "Listener", "app_devMainnetMasterDebug"})
public final class FilterAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> implements io.horizontalsystems.bitstashwallet.modules.transactions.ViewHolderFilter.ClickListener {
    private boolean filterChangeable;
    private io.horizontalsystems.bitstashwallet.entities.Wallet selectedFilterId;
    private java.util.List<io.horizontalsystems.bitstashwallet.entities.Wallet> filters;
    private io.horizontalsystems.bitstashwallet.modules.transactions.FilterAdapter.Listener listener;
    
    public final boolean getFilterChangeable() {
        return false;
    }
    
    public final void setFilterChangeable(boolean p0) {
    }
    
    public final void setFilters(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.entities.Wallet> filters) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public void onClickItem(int position) {
    }
    
    public FilterAdapter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.transactions.FilterAdapter.Listener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/transactions/FilterAdapter$Listener;", "", "onFilterItemClick", "", "item", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "app_devMainnetMasterDebug"})
    public static abstract interface Listener {
        
        public abstract void onFilterItemClick(@org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bitstashwallet.entities.Wallet item);
    }
}
package io.horizontalsystems.bitstashwallet.modules.transactions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0010\u001a\u00020\bH\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lio/horizontalsystems/bitstashwallet/modules/transactions/ViewHolderTransaction$ClickListener;", "listener", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsAdapter$Listener;", "(Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsAdapter$Listener;)V", "noTransactionsView", "", "transactionView", "viewModel", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsViewModel;", "getViewModel", "()Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsViewModel;", "setViewModel", "(Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsViewModel;)V", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onClick", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Listener", "app_devMainnetMasterDebug"})
public final class TransactionsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> implements io.horizontalsystems.bitstashwallet.modules.transactions.ViewHolderTransaction.ClickListener {
    private final int noTransactionsView = 0;
    private final int transactionView = 1;
    @org.jetbrains.annotations.NotNull()
    public io.horizontalsystems.bitstashwallet.modules.transactions.TransactionsViewModel viewModel;
    private io.horizontalsystems.bitstashwallet.modules.transactions.TransactionsAdapter.Listener listener;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.transactions.TransactionsViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.transactions.TransactionsViewModel p0) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
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
    public void onClick(int position) {
    }
    
    public TransactionsAdapter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.transactions.TransactionsAdapter.Listener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsAdapter$Listener;", "", "onItemClick", "", "item", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionViewItem;", "app_devMainnetMasterDebug"})
    public static abstract interface Listener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.transactions.TransactionViewItem item);
    }
}
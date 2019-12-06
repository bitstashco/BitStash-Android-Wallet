package app.odapplications.bitstashwallet.modules.transactions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u0015\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/transactions/TransactionsFragment;", "Landroidx/fragment/app/Fragment;", "Lapp/odapplications/bitstashwallet/modules/transactions/TransactionsAdapter$Listener;", "Lapp/odapplications/bitstashwallet/modules/transactions/FilterAdapter$Listener;", "()V", "filterAdapter", "Lapp/odapplications/bitstashwallet/modules/transactions/FilterAdapter;", "transactionsAdapter", "Lapp/odapplications/bitstashwallet/modules/transactions/TransactionsAdapter;", "viewModel", "Lapp/odapplications/bitstashwallet/modules/transactions/TransactionsViewModel;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onFilterItemClick", "item", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "onItemClick", "Lapp/odapplications/bitstashwallet/modules/transactions/TransactionViewItem;", "setMenuVisibility", "menuVisible", "", "app_productionMainnetRelease"})
public final class TransactionsFragment extends androidx.fragment.app.Fragment implements app.odapplications.bitstashwallet.modules.transactions.TransactionsAdapter.Listener, app.odapplications.bitstashwallet.modules.transactions.FilterAdapter.Listener {
    private app.odapplications.bitstashwallet.modules.transactions.TransactionsViewModel viewModel;
    private final app.odapplications.bitstashwallet.modules.transactions.TransactionsAdapter transactionsAdapter = null;
    private final app.odapplications.bitstashwallet.modules.transactions.FilterAdapter filterAdapter = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void setMenuVisibility(boolean menuVisible) {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.transactions.TransactionViewItem item) {
    }
    
    @java.lang.Override()
    public void onFilterItemClick(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.entities.Wallet item) {
    }
    
    public TransactionsFragment() {
        super();
    }
}
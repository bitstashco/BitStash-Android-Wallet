package io.horizontalsystems.bitstashwallet.modules.balance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\fH\u0016J\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\bH\u0016J\u0010\u0010\"\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010#\u001a\u00020\fH\u0016J\u0010\u0010$\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\'H\u0016J\u001a\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010*\u001a\u00020\fH\u0002J\b\u0010+\u001a\u00020\fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceFragment;", "Landroidx/fragment/app/Fragment;", "Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceCoinAdapter$Listener;", "Lio/horizontalsystems/bitstashwallet/ui/dialogs/BalanceSortDialogFragment$Listener;", "()V", "coinAdapter", "Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceCoinAdapter;", "menuSort", "Landroid/view/MenuItem;", "viewModel", "Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceViewModel;", "observeLiveData", "", "onAddCoinClick", "onClickChart", "position", "", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onItemClick", "onOptionsItemSelected", "", "item", "onReceiveClicked", "onResume", "onSendClicked", "onSortItemSelect", "sortType", "Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceSortType;", "onViewCreated", "view", "reloadHeader", "setSwipeBackground", "app_devMainnetMasterDebug"})
public final class BalanceFragment extends androidx.fragment.app.Fragment implements io.horizontalsystems.bitstashwallet.modules.balance.BalanceCoinAdapter.Listener, io.horizontalsystems.bitstashwallet.ui.dialogs.BalanceSortDialogFragment.Listener {
    private io.horizontalsystems.bitstashwallet.modules.balance.BalanceViewModel viewModel;
    private io.horizontalsystems.bitstashwallet.modules.balance.BalanceCoinAdapter coinAdapter;
    private android.view.MenuItem menuSort;
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
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onSortItemSelect(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.balance.BalanceSortType sortType) {
    }
    
    private final void setSwipeBackground() {
    }
    
    @java.lang.Override()
    public void onSendClicked(int position) {
    }
    
    @java.lang.Override()
    public void onReceiveClicked(int position) {
    }
    
    @java.lang.Override()
    public void onItemClick(int position) {
    }
    
    @java.lang.Override()
    public void onAddCoinClick() {
    }
    
    @java.lang.Override()
    public void onClickChart(int position) {
    }
    
    private final void observeLiveData() {
    }
    
    private final void reloadHeader() {
    }
    
    public BalanceFragment() {
        super();
    }
}
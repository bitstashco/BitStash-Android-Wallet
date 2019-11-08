package io.horizontalsystems.bitstashwallet.ui.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0002\u0015\u0016B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0016J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lio/horizontalsystems/bitstashwallet/ui/dialogs/BalanceSortDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Lio/horizontalsystems/bitstashwallet/ui/dialogs/SortingAdapter$Listener;", "()V", "listener", "Lio/horizontalsystems/bitstashwallet/ui/dialogs/BalanceSortDialogFragment$Listener;", "selectedSortingType", "Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceSortType;", "sortTypes", "", "onClick", "", "sortType", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "Listener", "app_devMainnetMasterDebug"})
public final class BalanceSortDialogFragment extends androidx.fragment.app.DialogFragment implements io.horizontalsystems.bitstashwallet.ui.dialogs.SortingAdapter.Listener {
    private final java.util.List<io.horizontalsystems.bitstashwallet.modules.balance.BalanceSortType> sortTypes = null;
    private io.horizontalsystems.bitstashwallet.ui.dialogs.BalanceSortDialogFragment.Listener listener;
    private io.horizontalsystems.bitstashwallet.modules.balance.BalanceSortType selectedSortingType;
    public static final io.horizontalsystems.bitstashwallet.ui.dialogs.BalanceSortDialogFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.balance.BalanceSortType sortType) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public BalanceSortDialogFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bitstashwallet/ui/dialogs/BalanceSortDialogFragment$Listener;", "", "onSortItemSelect", "", "sortType", "Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceSortType;", "app_devMainnetMasterDebug"})
    public static abstract interface Listener {
        
        public abstract void onSortItemSelect(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.balance.BalanceSortType sortType);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bitstashwallet/ui/dialogs/BalanceSortDialogFragment$Companion;", "", "()V", "newInstance", "Lio/horizontalsystems/bitstashwallet/ui/dialogs/BalanceSortDialogFragment;", "listener", "Lio/horizontalsystems/bitstashwallet/ui/dialogs/BalanceSortDialogFragment$Listener;", "selectedSortType", "Lio/horizontalsystems/bitstashwallet/modules/balance/BalanceSortType;", "app_devMainnetMasterDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.ui.dialogs.BalanceSortDialogFragment newInstance(@org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bitstashwallet.ui.dialogs.BalanceSortDialogFragment.Listener listener, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.balance.BalanceSortType selectedSortType) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
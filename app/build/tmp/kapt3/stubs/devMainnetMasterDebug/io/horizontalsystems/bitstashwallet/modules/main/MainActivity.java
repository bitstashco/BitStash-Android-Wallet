package io.horizontalsystems.bitstashwallet.modules.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 02\u00020\u00012\u00020\u00022\u00020\u0003:\u00010B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0016J\u0012\u0010\u001b\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u0014H\u0014J\b\u0010\u001f\u001a\u00020\u0014H\u0014J\u0018\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u000e\u0010%\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$J\u000e\u0010&\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$J\b\u0010\'\u001a\u00020\u0014H\u0016J\u000e\u0010\'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020)J\b\u0010*\u001a\u00020\u0014H\u0002J\u0018\u0010+\u001a\u00020\u00142\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0002J\b\u0010-\u001a\u00020\u0014H\u0002J\u0010\u0010.\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\"H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/main/MainActivity;", "Lio/horizontalsystems/bitstashwallet/BaseActivity;", "Lio/horizontalsystems/bitstashwallet/modules/receive/ReceiveView$Listener;", "Lio/horizontalsystems/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoView$Listener;", "()V", "adapter", "Lio/horizontalsystems/bitstashwallet/modules/main/MainTabsAdapter;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "receiveBottomSheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/view/View;", "receiveViewModel", "Lio/horizontalsystems/bitstashwallet/modules/receive/ReceiveViewModel;", "transInfoViewModel", "Lio/horizontalsystems/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoViewModel;", "txInfoBottomSheetBehavior", "viewModel", "Lio/horizontalsystems/bitstashwallet/modules/main/MainViewModel;", "closeReceiveDialog", "", "closeTransactionInfo", "collapseBottomSheetsOnActivityRestore", "expandReceiveDialog", "hideDim", "loadViewPager", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onResume", "openFullTransactionInfo", "transactionHash", "", "wallet", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "openReceiveDialog", "openSend", "openTransactionInfo", "txInfoItem", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionViewItem;", "preloadBottomSheets", "setBottomSheet", "bottomSheetBehavior", "setBottomSheets", "shareReceiveAddress", "address", "Companion", "app_devMainnetMasterDebug"})
public final class MainActivity extends io.horizontalsystems.bitstashwallet.BaseActivity implements io.horizontalsystems.bitstashwallet.modules.receive.ReceiveView.Listener, io.horizontalsystems.bitstashwallet.modules.transactions.transactionInfo.TransactionInfoView.Listener {
    private io.horizontalsystems.bitstashwallet.modules.main.MainTabsAdapter adapter;
    private io.reactivex.disposables.CompositeDisposable disposables;
    private io.horizontalsystems.bitstashwallet.modules.receive.ReceiveViewModel receiveViewModel;
    private io.horizontalsystems.bitstashwallet.modules.transactions.transactionInfo.TransactionInfoViewModel transInfoViewModel;
    private com.google.android.material.bottomsheet.BottomSheetBehavior<android.view.View> receiveBottomSheetBehavior;
    private com.google.android.material.bottomsheet.BottomSheetBehavior<android.view.View> txInfoBottomSheetBehavior;
    private io.horizontalsystems.bitstashwallet.modules.main.MainViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTIVE_TAB_KEY = "active_tab";
    public static final int SETTINGS_TAB_POSITION = 2;
    public static final io.horizontalsystems.bitstashwallet.modules.main.MainActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    /**
     * *
     *    Receive bottomsheet
     */
    public final void openReceiveDialog(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Wallet wallet) {
    }
    
    @java.lang.Override()
    public void expandReceiveDialog() {
    }
    
    @java.lang.Override()
    public void closeReceiveDialog() {
    }
    
    @java.lang.Override()
    public void shareReceiveAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    public final void openSend(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Wallet wallet) {
    }
    
    /**
     * *
     *    TransactionInfo bottomsheet
     */
    public final void openTransactionInfo(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.transactions.TransactionViewItem txInfoItem) {
    }
    
    @java.lang.Override()
    public void openFullTransactionInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String transactionHash, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Wallet wallet) {
    }
    
    @java.lang.Override()
    public void openTransactionInfo() {
    }
    
    @java.lang.Override()
    public void closeTransactionInfo() {
    }
    
    private final void loadViewPager() {
    }
    
    private final void preloadBottomSheets() {
    }
    
    private final void setBottomSheets() {
    }
    
    private final void collapseBottomSheetsOnActivityRestore() {
    }
    
    private final void setBottomSheet(com.google.android.material.bottomsheet.BottomSheetBehavior<android.view.View> bottomSheetBehavior) {
    }
    
    private final void hideDim() {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/main/MainActivity$Companion;", "", "()V", "ACTIVE_TAB_KEY", "", "SETTINGS_TAB_POSITION", "", "app_devMainnetMasterDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
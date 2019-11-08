package io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u00012\u00020\u0002:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/views/FullTransactionInfoActivity;", "Lio/horizontalsystems/bitstashwallet/BaseActivity;", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/views/FullTransactionInfoErrorFragment$Listener;", "()V", "transactionRecordAdapter", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/views/SectionViewAdapter;", "viewModel", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoViewModel;", "onChangeProvider", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRetry", "Companion", "app_productionMainnetRelease"})
public final class FullTransactionInfoActivity extends io.horizontalsystems.bitstashwallet.BaseActivity implements io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.views.FullTransactionInfoErrorFragment.Listener {
    private final io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.views.SectionViewAdapter transactionRecordAdapter = null;
    private io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String transactionHashKey = "transaction_hash";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String walletKey = "wallet";
    public static final io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.views.FullTransactionInfoActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onRetry() {
    }
    
    @java.lang.Override()
    public void onChangeProvider() {
    }
    
    public FullTransactionInfoActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/views/FullTransactionInfoActivity$Companion;", "", "()V", "transactionHashKey", "", "walletKey", "start", "", "context", "Landroid/content/Context;", "transactionHash", "wallet", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "app_productionMainnetRelease"})
    public static final class Companion {
        
        public final void start(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String transactionHash, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.entities.Wallet wallet) {
        }
        
        private Companion() {
            super();
        }
    }
}
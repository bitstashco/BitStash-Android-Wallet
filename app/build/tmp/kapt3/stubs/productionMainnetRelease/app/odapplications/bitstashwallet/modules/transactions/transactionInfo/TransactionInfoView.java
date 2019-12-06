package app.odapplications.bitstashwallet.modules.transactions.transactionInfo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u0013\u001a\u00020\u0012H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoView;", "Lapp/odapplications/bitstashwallet/ui/extensions/ConstraintLayoutWithHeader;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "listener", "Lapp/odapplications/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoView$Listener;", "viewModel", "Lapp/odapplications/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoViewModel;", "bind", "", "setTransactionInfoDialog", "Listener", "app_productionMainnetRelease"})
public final class TransactionInfoView extends app.odapplications.bitstashwallet.ui.extensions.ConstraintLayoutWithHeader {
    private app.odapplications.bitstashwallet.modules.transactions.transactionInfo.TransactionInfoViewModel viewModel;
    private androidx.lifecycle.LifecycleOwner lifecycleOwner;
    private app.odapplications.bitstashwallet.modules.transactions.transactionInfo.TransactionInfoView.Listener listener;
    private java.util.HashMap _$_findViewCache;
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.transactions.transactionInfo.TransactionInfoViewModel viewModel, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.transactions.transactionInfo.TransactionInfoView.Listener listener) {
    }
    
    private final void setTransactionInfoDialog() {
    }
    
    public TransactionInfoView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public TransactionInfoView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public TransactionInfoView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&\u00a8\u0006\n"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoView$Listener;", "", "closeTransactionInfo", "", "openFullTransactionInfo", "transactionHash", "", "wallet", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "openTransactionInfo", "app_productionMainnetRelease"})
    public static abstract interface Listener {
        
        public abstract void openTransactionInfo();
        
        public abstract void openFullTransactionInfo(@org.jetbrains.annotations.NotNull()
        java.lang.String transactionHash, @org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Wallet wallet);
        
        public abstract void closeTransactionInfo();
    }
}
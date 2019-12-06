package app.odapplications.bitstashwallet.modules.transactions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\bH\u0016J\u0006\u0010,\u001a\u00020\u001bJ\b\u0010-\u001a\u00020\u001bH\u0014J\u0010\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\'H\u0016J\b\u00100\u001a\u00020\u001bH\u0016J\u0010\u00101\u001a\u00020\u001b2\u0006\u00102\u001a\u00020 H\u0016J\u0016\u00103\u001a\u00020\u001b2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\b0\u0015H\u0016J\b\u00105\u001a\u00020\u001bH\u0002J\u0018\u00106\u001a\u00020\u001b2\u000e\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0016R#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00150\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u001b0\u001b0\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\nR\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00150\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\nR\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\nR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\n\u00a8\u00068"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/transactions/TransactionsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lapp/odapplications/bitstashwallet/modules/transactions/TransactionsModule$IView;", "Lapp/odapplications/bitstashwallet/modules/transactions/TransactionsModule$IRouter;", "()V", "addItemsLiveEvent", "Lapp/odapplications/bitstashwallet/SingleLiveEvent;", "Lkotlin/Pair;", "", "getAddItemsLiveEvent", "()Lapp/odapplications/bitstashwallet/SingleLiveEvent;", "delegate", "Lapp/odapplications/bitstashwallet/modules/transactions/TransactionsModule$IViewDelegate;", "getDelegate", "()Lapp/odapplications/bitstashwallet/modules/transactions/TransactionsModule$IViewDelegate;", "setDelegate", "(Lapp/odapplications/bitstashwallet/modules/transactions/TransactionsModule$IViewDelegate;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "filterItems", "Landroidx/lifecycle/MutableLiveData;", "", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "getFilterItems", "()Landroidx/lifecycle/MutableLiveData;", "flushSubject", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "indexesToUpdate", "", "reloadChangeEvent", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "getReloadChangeEvent", "reloadItemsLiveEvent", "getReloadItemsLiveEvent", "reloadLiveEvent", "getReloadLiveEvent", "transactionViewItemLiveEvent", "Lapp/odapplications/bitstashwallet/modules/transactions/TransactionViewItem;", "getTransactionViewItemLiveEvent", "addItems", "fromIndex", "count", "init", "onCleared", "openTransactionInfo", "transactionViewItem", "reload", "reloadChange", "diff", "reloadItems", "updatedIndexes", "reloadWithBuffer", "showFilters", "filters", "app_productionMainnetRelease"})
public final class TransactionsViewModel extends androidx.lifecycle.ViewModel implements app.odapplications.bitstashwallet.modules.transactions.TransactionsModule.IView, app.odapplications.bitstashwallet.modules.transactions.TransactionsModule.IRouter {
    @org.jetbrains.annotations.NotNull()
    public app.odapplications.bitstashwallet.modules.transactions.TransactionsModule.IViewDelegate delegate;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<app.odapplications.bitstashwallet.entities.Wallet>> filterItems = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<app.odapplications.bitstashwallet.modules.transactions.TransactionViewItem> transactionViewItemLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<androidx.recyclerview.widget.DiffUtil.DiffResult> reloadChangeEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<kotlin.Unit> reloadLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<java.util.List<java.lang.Integer>> reloadItemsLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<kotlin.Pair<java.lang.Integer, java.lang.Integer>> addItemsLiveEvent = null;
    private io.reactivex.subjects.PublishSubject<kotlin.Unit> flushSubject;
    private java.util.List<java.lang.Integer> indexesToUpdate;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.modules.transactions.TransactionsModule.IViewDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.transactions.TransactionsModule.IViewDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<app.odapplications.bitstashwallet.entities.Wallet>> getFilterItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<app.odapplications.bitstashwallet.modules.transactions.TransactionViewItem> getTransactionViewItemLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<androidx.recyclerview.widget.DiffUtil.DiffResult> getReloadChangeEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<kotlin.Unit> getReloadLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<java.util.List<java.lang.Integer>> getReloadItemsLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<kotlin.Pair<java.lang.Integer, java.lang.Integer>> getAddItemsLiveEvent() {
        return null;
    }
    
    public final void init() {
    }
    
    @java.lang.Override()
    public void showFilters(@org.jetbrains.annotations.NotNull()
    java.util.List<app.odapplications.bitstashwallet.entities.Wallet> filters) {
    }
    
    @java.lang.Override()
    public void reload() {
    }
    
    @java.lang.Override()
    public void reloadChange(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.DiffUtil.DiffResult diff) {
    }
    
    @java.lang.Override()
    public void reloadItems(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> updatedIndexes) {
    }
    
    private final void reloadWithBuffer() {
    }
    
    @java.lang.Override()
    public void addItems(int fromIndex, int count) {
    }
    
    @java.lang.Override()
    public void openTransactionInfo(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.transactions.TransactionViewItem transactionViewItem) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public TransactionsViewModel() {
        super();
    }
}
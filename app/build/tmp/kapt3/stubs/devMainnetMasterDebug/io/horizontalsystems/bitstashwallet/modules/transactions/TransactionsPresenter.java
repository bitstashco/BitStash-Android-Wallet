package io.horizontalsystems.bitstashwallet.modules.transactions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J(\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\"\u0010$\u001a\u00020\u001a2\u0018\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\'\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0&H\u0016J\u0018\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u0010H\u0016J\u001e\u0010-\u001a\u00020\u001a2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010.\u001a\u00020\'H\u0016J\u0016\u0010/\u001a\u00020\u001a2\f\u00100\u001a\b\u0012\u0004\u0012\u0002010(H\u0016J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0010H\u0016J\b\u00105\u001a\u00020\u001aH\u0016J\u0010\u00106\u001a\u00020\u001a2\u0006\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u00020\u001aH\u0016J\b\u0010:\u001a\u00020\u001aH\u0016J\u0012\u0010;\u001a\u00020\u001a2\b\u0010.\u001a\u0004\u0018\u00010\'H\u0016J\u0010\u0010<\u001a\u00020\u001a2\u0006\u0010=\u001a\u000203H\u0016J\b\u0010>\u001a\u00020\u001aH\u0016J\u0018\u0010?\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\'2\u0006\u0010@\u001a\u00020\u0010H\u0016J\u0016\u0010A\u001a\u00020\u001a2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\'0(H\u0016J*\u0010C\u001a\u00020\u001a2 \u0010D\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00100E0(H\u0016J\b\u0010F\u001a\u00020\u001aH\u0016J\b\u0010G\u001a\u00020\u001aH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006H"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsPresenter;", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsModule$IViewDelegate;", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsModule$IInteractorDelegate;", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsLoader$Delegate;", "interactor", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsModule$IInteractor;", "router", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsModule$IRouter;", "factory", "Lio/horizontalsystems/bitstashwallet/core/factories/TransactionViewItemFactory;", "loader", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsLoader;", "metadataDataSource", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionMetadataDataSource;", "(Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsModule$IInteractor;Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsModule$IRouter;Lio/horizontalsystems/bitstashwallet/core/factories/TransactionViewItemFactory;Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsLoader;Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionMetadataDataSource;)V", "itemsCount", "", "getItemsCount", "()I", "view", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsModule$IView;", "getView", "()Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsModule$IView;", "setView", "(Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsModule$IView;)V", "didChangeData", "", "didFetchRate", "rateValue", "Ljava/math/BigDecimal;", "coin", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "currency", "Lio/horizontalsystems/bitstashwallet/entities/Currency;", "timestamp", "", "didFetchRecords", "records", "", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "", "Lio/horizontalsystems/bitstashwallet/entities/TransactionRecord;", "didInsertData", "fromIndex", "count", "didUpdateRecords", "wallet", "fetchRecords", "fetchDataList", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsModule$FetchData;", "itemForIndex", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionViewItem;", "index", "onBottomReached", "onChange", "diff", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "onClear", "onConnectionRestore", "onFilterSelect", "onTransactionItemClick", "transaction", "onUpdateBaseCurrency", "onUpdateLastBlockHeight", "lastBlockHeight", "onUpdateSelectedWallets", "selectedWallets", "onUpdateWalletsData", "allWalletsData", "Lkotlin/Triple;", "onVisible", "viewDidLoad", "app_devMainnetMasterDebug"})
public final class TransactionsPresenter implements io.horizontalsystems.bitstashwallet.modules.transactions.TransactionsModule.IViewDelegate, io.horizontalsystems.bitstashwallet.modules.transactions.TransactionsModule.IInteractorDelegate, io.horizontalsystems.bitstashwallet.modules.transactions.TransactionsLoader.Delegate {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.modules.transactions.TransactionsModule.IView view;
    private final io.horizontalsystems.bitstashwallet.modules.transactions.TransactionsModule.IInteractor interactor = null;
    private final io.horizontalsystems.bitstashwallet.modules.transactions.TransactionsModule.IRouter router = null;
    private final io.horizontalsystems.bitstashwallet.core.factories.TransactionViewItemFactory factory = null;
    private final io.horizontalsystems.bitstashwallet.modules.transactions.TransactionsLoader loader = null;
    private final io.horizontalsystems.bitstashwallet.modules.transactions.TransactionMetadataDataSource metadataDataSource = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.modules.transactions.TransactionsModule.IView getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.modules.transactions.TransactionsModule.IView p0) {
    }
    
    @java.lang.Override()
    public void viewDidLoad() {
    }
    
    @java.lang.Override()
    public void onVisible() {
    }
    
    @java.lang.Override()
    public void onTransactionItemClick(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.transactions.TransactionViewItem transaction) {
    }
    
    @java.lang.Override()
    public void onFilterSelect(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.entities.Wallet wallet) {
    }
    
    @java.lang.Override()
    public void onClear() {
    }
    
    @java.lang.Override()
    public int getItemsCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.modules.transactions.TransactionViewItem itemForIndex(int index) {
        return null;
    }
    
    @java.lang.Override()
    public void onBottomReached() {
    }
    
    @java.lang.Override()
    public void onUpdateWalletsData(@org.jetbrains.annotations.NotNull()
    java.util.List<kotlin.Triple<io.horizontalsystems.bitstashwallet.entities.Wallet, java.lang.Integer, java.lang.Integer>> allWalletsData) {
    }
    
    @java.lang.Override()
    public void onUpdateSelectedWallets(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.entities.Wallet> selectedWallets) {
    }
    
    @java.lang.Override()
    public void didFetchRecords(@org.jetbrains.annotations.NotNull()
    java.util.Map<io.horizontalsystems.bitstashwallet.entities.Wallet, ? extends java.util.List<io.horizontalsystems.bitstashwallet.entities.TransactionRecord>> records) {
    }
    
    @java.lang.Override()
    public void onUpdateLastBlockHeight(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Wallet wallet, int lastBlockHeight) {
    }
    
    @java.lang.Override()
    public void onUpdateBaseCurrency() {
    }
    
    @java.lang.Override()
    public void didFetchRate(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal rateValue, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Coin coin, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Currency currency, long timestamp) {
    }
    
    @java.lang.Override()
    public void didUpdateRecords(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.entities.TransactionRecord> records, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Wallet wallet) {
    }
    
    @java.lang.Override()
    public void onConnectionRestore() {
    }
    
    @java.lang.Override()
    public void onChange(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.DiffUtil.DiffResult diff) {
    }
    
    @java.lang.Override()
    public void didChangeData() {
    }
    
    @java.lang.Override()
    public void didInsertData(int fromIndex, int count) {
    }
    
    @java.lang.Override()
    public void fetchRecords(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.modules.transactions.TransactionsModule.FetchData> fetchDataList) {
    }
    
    public TransactionsPresenter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.transactions.TransactionsModule.IInteractor interactor, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.transactions.TransactionsModule.IRouter router, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.factories.TransactionViewItemFactory factory, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.transactions.TransactionsLoader loader, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.transactions.TransactionMetadataDataSource metadataDataSource) {
        super();
    }
}
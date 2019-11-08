package io.horizontalsystems.bitstashwallet.modules.transactions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0006\t\n\u000b\f\r\u000eB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\u000f"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsModule;", "", "()V", "initModule", "", "view", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsViewModel;", "router", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsModule$IRouter;", "FetchData", "IInteractor", "IInteractorDelegate", "IRouter", "IView", "IViewDelegate", "app_devMainnetMasterDebug"})
public final class TransactionsModule {
    public static final io.horizontalsystems.bitstashwallet.modules.transactions.TransactionsModule INSTANCE = null;
    
    public final void initModule(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.transactions.TransactionsViewModel view, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.transactions.TransactionsModule.IRouter router) {
    }
    
    private TransactionsModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u0017\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0006H\u00d6\u0001R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsModule$FetchData;", "", "wallet", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "from", "Lkotlin/Pair;", "", "", "limit", "(Lio/horizontalsystems/bitstashwallet/entities/Wallet;Lkotlin/Pair;I)V", "getFrom", "()Lkotlin/Pair;", "getLimit", "()I", "getWallet", "()Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_devMainnetMasterDebug"})
    public static final class FetchData {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bitstashwallet.entities.Wallet wallet = null;
        @org.jetbrains.annotations.Nullable()
        private final kotlin.Pair<java.lang.String, java.lang.Integer> from = null;
        private final int limit = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.entities.Wallet getWallet() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlin.Pair<java.lang.String, java.lang.Integer> getFrom() {
            return null;
        }
        
        public final int getLimit() {
            return 0;
        }
        
        public FetchData(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.entities.Wallet wallet, @org.jetbrains.annotations.Nullable()
        kotlin.Pair<java.lang.String, java.lang.Integer> from, int limit) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.entities.Wallet component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlin.Pair<java.lang.String, java.lang.Integer> component2() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.modules.transactions.TransactionsModule.FetchData copy(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.entities.Wallet wallet, @org.jetbrains.annotations.Nullable()
        kotlin.Pair<java.lang.String, java.lang.Integer> from, int limit) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rH&J\u0018\u0010\u000e\u001a\u00020\u00032\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\rH&\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsModule$IView;", "", "addItems", "", "fromIndex", "", "count", "reload", "reloadChange", "diff", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "reloadItems", "updatedIndexes", "", "showFilters", "filters", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "app_devMainnetMasterDebug"})
    public static abstract interface IView {
        
        public abstract void showFilters(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bitstashwallet.entities.Wallet> filters);
        
        public abstract void reload();
        
        public abstract void reloadChange(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.DiffUtil.DiffResult diff);
        
        public abstract void reloadItems(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Integer> updatedIndexes);
        
        public abstract void addItems(int fromIndex, int count);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\nH&J\u0012\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0007H&J\b\u0010\u0011\u001a\u00020\nH&J\b\u0010\u0012\u001a\u00020\nH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0013"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsModule$IViewDelegate;", "", "itemsCount", "", "getItemsCount", "()I", "itemForIndex", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionViewItem;", "index", "onBottomReached", "", "onClear", "onFilterSelect", "wallet", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "onTransactionItemClick", "transaction", "onVisible", "viewDidLoad", "app_devMainnetMasterDebug"})
    public static abstract interface IViewDelegate {
        
        public abstract void viewDidLoad();
        
        public abstract void onTransactionItemClick(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.transactions.TransactionViewItem transaction);
        
        public abstract void onFilterSelect(@org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bitstashwallet.entities.Wallet wallet);
        
        public abstract void onClear();
        
        public abstract int getItemsCount();
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.bitstashwallet.modules.transactions.TransactionViewItem itemForIndex(int index);
        
        public abstract void onBottomReached();
        
        public abstract void onVisible();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0016\u0010\u000f\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\fH&\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsModule$IInteractor;", "", "clear", "", "fetchLastBlockHeights", "fetchRate", "coin", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "timestamp", "", "fetchRecords", "fetchDataList", "", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsModule$FetchData;", "initialFetch", "setSelectedWallets", "selectedWallets", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "app_devMainnetMasterDebug"})
    public static abstract interface IInteractor {
        
        public abstract void initialFetch();
        
        public abstract void clear();
        
        public abstract void fetchRecords(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bitstashwallet.modules.transactions.TransactionsModule.FetchData> fetchDataList);
        
        public abstract void setSelectedWallets(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bitstashwallet.entities.Wallet> selectedWallets);
        
        public abstract void fetchLastBlockHeights();
        
        public abstract void fetchRate(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.entities.Coin coin, long timestamp);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\"\u0010\f\u001a\u00020\u00032\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000eH&J\u001e\u0010\u0012\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u000fH&J\b\u0010\u0014\u001a\u00020\u0003H&J\b\u0010\u0015\u001a\u00020\u0003H&J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H&J\u0016\u0010\u0019\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0010H&J*\u0010\u001b\u001a\u00020\u00032 \u0010\u001c\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u001d0\u0010H&\u00a8\u0006\u001e"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsModule$IInteractorDelegate;", "", "didFetchRate", "", "rateValue", "Ljava/math/BigDecimal;", "coin", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "currency", "Lio/horizontalsystems/bitstashwallet/entities/Currency;", "timestamp", "", "didFetchRecords", "records", "", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "", "Lio/horizontalsystems/bitstashwallet/entities/TransactionRecord;", "didUpdateRecords", "wallet", "onConnectionRestore", "onUpdateBaseCurrency", "onUpdateLastBlockHeight", "lastBlockHeight", "", "onUpdateSelectedWallets", "selectedWallets", "onUpdateWalletsData", "allWalletsData", "Lkotlin/Triple;", "app_devMainnetMasterDebug"})
    public static abstract interface IInteractorDelegate {
        
        public abstract void onUpdateWalletsData(@org.jetbrains.annotations.NotNull()
        java.util.List<kotlin.Triple<io.horizontalsystems.bitstashwallet.entities.Wallet, java.lang.Integer, java.lang.Integer>> allWalletsData);
        
        public abstract void onUpdateSelectedWallets(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bitstashwallet.entities.Wallet> selectedWallets);
        
        public abstract void didFetchRecords(@org.jetbrains.annotations.NotNull()
        java.util.Map<io.horizontalsystems.bitstashwallet.entities.Wallet, ? extends java.util.List<io.horizontalsystems.bitstashwallet.entities.TransactionRecord>> records);
        
        public abstract void onUpdateLastBlockHeight(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.entities.Wallet wallet, int lastBlockHeight);
        
        public abstract void onUpdateBaseCurrency();
        
        public abstract void didFetchRate(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal rateValue, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.entities.Coin coin, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.entities.Currency currency, long timestamp);
        
        public abstract void didUpdateRecords(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bitstashwallet.entities.TransactionRecord> records, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.entities.Wallet wallet);
        
        public abstract void onConnectionRestore();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsModule$IRouter;", "", "openTransactionInfo", "", "transactionViewItem", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionViewItem;", "app_devMainnetMasterDebug"})
    public static abstract interface IRouter {
        
        public abstract void openTransactionInfo(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.transactions.TransactionViewItem transactionViewItem);
    }
}
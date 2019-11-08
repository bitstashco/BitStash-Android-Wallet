package io.horizontalsystems.bitstashwallet.modules.transactions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u00011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u001c\u001a\u00020\u001d2\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006J\u001c\u0010\u001f\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010 \u001a\u00020\u0007J\u0014\u0010!\u001a\u00020\u001d2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\bJ\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0013J\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010\'\u001a\u00020\u0013J\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,J\u0010\u0010-\u001a\u00020\u001d2\b\b\u0002\u0010.\u001a\u00020\u0017J\u0014\u0010/\u001a\u00020\u001d2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00070\bR#\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u00062"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsLoader;", "", "dataSource", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionRecordDataSource;", "(Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionRecordDataSource;)V", "allRecords", "", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "", "Lio/horizontalsystems/bitstashwallet/entities/TransactionRecord;", "getAllRecords", "()Ljava/util/Map;", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsLoader$Delegate;", "getDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsLoader$Delegate;", "setDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsLoader$Delegate;)V", "itemsCount", "", "getItemsCount", "()I", "loading", "", "getLoading", "()Z", "setLoading", "(Z)V", "didFetchRecords", "", "records", "didUpdateRecords", "wallet", "handleUpdate", "wallets", "itemForIndex", "Lio/horizontalsystems/bitstashwallet/entities/TransactionItem;", "index", "itemIndexesForPending", "thresholdBlockHeight", "itemIndexesForTimestamp", "coin", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "timestamp", "", "loadNext", "initial", "setWallets", "coins", "Delegate", "app_productionMainnetRelease"})
public final class TransactionsLoader {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.modules.transactions.TransactionsLoader.Delegate delegate;
    private boolean loading;
    private final io.horizontalsystems.bitstashwallet.modules.transactions.TransactionRecordDataSource dataSource = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.modules.transactions.TransactionsLoader.Delegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.modules.transactions.TransactionsLoader.Delegate p0) {
    }
    
    public final int getItemsCount() {
        return 0;
    }
    
    public final boolean getLoading() {
        return false;
    }
    
    public final void setLoading(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<io.horizontalsystems.bitstashwallet.entities.Wallet, java.util.List<io.horizontalsystems.bitstashwallet.entities.TransactionRecord>> getAllRecords() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.entities.TransactionItem itemForIndex(int index) {
        return null;
    }
    
    public final void setWallets(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.entities.Wallet> coins) {
    }
    
    public final void handleUpdate(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.entities.Wallet> wallets) {
    }
    
    public final void loadNext(boolean initial) {
    }
    
    public final void didFetchRecords(@org.jetbrains.annotations.NotNull()
    java.util.Map<io.horizontalsystems.bitstashwallet.entities.Wallet, ? extends java.util.List<io.horizontalsystems.bitstashwallet.entities.TransactionRecord>> records) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> itemIndexesForTimestamp(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Coin coin, long timestamp) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> itemIndexesForPending(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Wallet wallet, int thresholdBlockHeight) {
        return null;
    }
    
    public final void didUpdateRecords(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.entities.TransactionRecord> records, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Wallet wallet) {
    }
    
    public TransactionsLoader(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.transactions.TransactionRecordDataSource dataSource) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&\u00a8\u0006\u000f"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsLoader$Delegate;", "", "didChangeData", "", "didInsertData", "fromIndex", "", "count", "fetchRecords", "fetchDataList", "", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionsModule$FetchData;", "onChange", "diff", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "app_productionMainnetRelease"})
    public static abstract interface Delegate {
        
        public abstract void onChange(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.DiffUtil.DiffResult diff);
        
        public abstract void didChangeData();
        
        public abstract void didInsertData(int fromIndex, int count);
        
        public abstract void fetchRecords(@org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bitstashwallet.modules.transactions.TransactionsModule.FetchData> fetchDataList);
    }
}
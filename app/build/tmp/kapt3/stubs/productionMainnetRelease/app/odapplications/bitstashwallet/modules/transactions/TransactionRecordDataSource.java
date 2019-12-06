package app.odapplications.bitstashwallet.modules.transactions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000eJ \u0010\u001b\u001a\u00020\u001c2\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\fJ\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010 \u001a\u00020\rJ\u0014\u0010!\u001a\u00020\u001c2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u000eJ\u0006\u0010#\u001a\u00020\tJ\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\tJ\u001c\u0010\'\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010 \u001a\u00020\r2\u0006\u0010(\u001a\u00020\tJ\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-J\u0014\u0010.\u001a\u00020\u001c2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u000eR#\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/transactions/TransactionRecordDataSource;", "", "poolRepo", "Lapp/odapplications/bitstashwallet/modules/transactions/PoolRepo;", "itemsDataSource", "Lapp/odapplications/bitstashwallet/modules/transactions/TransactionItemDataSource;", "factory", "Lapp/odapplications/bitstashwallet/modules/transactions/TransactionItemFactory;", "limit", "", "(Lapp/odapplications/bitstashwallet/modules/transactions/PoolRepo;Lapp/odapplications/bitstashwallet/modules/transactions/TransactionItemDataSource;Lapp/odapplications/bitstashwallet/modules/transactions/TransactionItemFactory;I)V", "allRecords", "", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "", "Lapp/odapplications/bitstashwallet/entities/TransactionRecord;", "getAllRecords", "()Ljava/util/Map;", "allShown", "", "getAllShown", "()Z", "itemsCount", "getItemsCount", "()I", "getFetchDataList", "Lapp/odapplications/bitstashwallet/modules/transactions/TransactionsModule$FetchData;", "handleNextRecords", "", "records", "handleUpdatedRecords", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "wallet", "handleUpdatedWallets", "wallets", "increasePage", "itemForIndex", "Lapp/odapplications/bitstashwallet/entities/TransactionItem;", "index", "itemIndexesForPending", "thresholdBlockHeight", "itemIndexesForTimestamp", "coin", "Lapp/odapplications/bitstashwallet/entities/Coin;", "timestamp", "", "setWallets", "app_productionMainnetRelease"})
public final class TransactionRecordDataSource {
    private final app.odapplications.bitstashwallet.modules.transactions.PoolRepo poolRepo = null;
    private final app.odapplications.bitstashwallet.modules.transactions.TransactionItemDataSource itemsDataSource = null;
    private final app.odapplications.bitstashwallet.modules.transactions.TransactionItemFactory factory = null;
    private final int limit = 0;
    
    public final int getItemsCount() {
        return 0;
    }
    
    public final boolean getAllShown() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<app.odapplications.bitstashwallet.entities.Wallet, java.util.List<app.odapplications.bitstashwallet.entities.TransactionRecord>> getAllRecords() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.entities.TransactionItem itemForIndex(int index) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> itemIndexesForTimestamp(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Coin coin, long timestamp) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> itemIndexesForPending(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Wallet wallet, int thresholdBlockHeight) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<app.odapplications.bitstashwallet.modules.transactions.TransactionsModule.FetchData> getFetchDataList() {
        return null;
    }
    
    public final void handleNextRecords(@org.jetbrains.annotations.NotNull()
    java.util.Map<app.odapplications.bitstashwallet.entities.Wallet, ? extends java.util.List<app.odapplications.bitstashwallet.entities.TransactionRecord>> records) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.recyclerview.widget.DiffUtil.DiffResult handleUpdatedRecords(@org.jetbrains.annotations.NotNull()
    java.util.List<app.odapplications.bitstashwallet.entities.TransactionRecord> records, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Wallet wallet) {
        return null;
    }
    
    public final int increasePage() {
        return 0;
    }
    
    public final void setWallets(@org.jetbrains.annotations.NotNull()
    java.util.List<app.odapplications.bitstashwallet.entities.Wallet> wallets) {
    }
    
    public final void handleUpdatedWallets(@org.jetbrains.annotations.NotNull()
    java.util.List<app.odapplications.bitstashwallet.entities.Wallet> wallets) {
    }
    
    public TransactionRecordDataSource(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.transactions.PoolRepo poolRepo, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.transactions.TransactionItemDataSource itemsDataSource, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.transactions.TransactionItemFactory factory, int limit) {
        super();
    }
}
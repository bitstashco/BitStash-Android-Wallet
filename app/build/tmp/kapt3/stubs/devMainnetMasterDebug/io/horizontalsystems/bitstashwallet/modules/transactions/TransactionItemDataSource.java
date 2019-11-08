package io.horizontalsystems.bitstashwallet.modules.transactions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\n\u001a\u00020\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\fJ\u0006\u0010\r\u001a\u00020\u000bJ\"\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\fJ\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0004J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0004J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionItemDataSource;", "", "()V", "count", "", "getCount", "()I", "items", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lio/horizontalsystems/bitstashwallet/entities/TransactionItem;", "add", "", "", "clear", "handleModifiedItems", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "updatedItems", "insertedItems", "itemForIndex", "index", "itemIndexesForPending", "wallet", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "thresholdBlockHeight", "itemIndexesForTimestamp", "coin", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "timestamp", "", "shouldInsertRecord", "", "record", "Lio/horizontalsystems/bitstashwallet/entities/TransactionRecord;", "app_devMainnetMasterDebug"})
public final class TransactionItemDataSource {
    private final java.util.concurrent.CopyOnWriteArrayList<io.horizontalsystems.bitstashwallet.entities.TransactionItem> items = null;
    
    public final int getCount() {
        return 0;
    }
    
    public final void clear() {
    }
    
    public final void add(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.entities.TransactionItem> items) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.entities.TransactionItem itemForIndex(int index) {
        return null;
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
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.DiffUtil.DiffResult handleModifiedItems(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.entities.TransactionItem> updatedItems, @org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.entities.TransactionItem> insertedItems) {
        return null;
    }
    
    public final boolean shouldInsertRecord(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.TransactionRecord record) {
        return false;
    }
    
    public TransactionItemDataSource() {
        super();
    }
}
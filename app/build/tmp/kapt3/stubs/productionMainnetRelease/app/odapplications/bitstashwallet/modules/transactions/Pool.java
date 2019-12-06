package app.odapplications.bitstashwallet.modules.transactions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002#$B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000bJ\u0006\u0010!\u001a\u00020\u0018J\u0006\u0010\"\u001a\u00020\u0018R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0013\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006%"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/transactions/Pool;", "", "state", "Lapp/odapplications/bitstashwallet/modules/transactions/Pool$State;", "(Lapp/odapplications/bitstashwallet/modules/transactions/Pool$State;)V", "allShown", "", "getAllShown", "()Z", "records", "", "Lapp/odapplications/bitstashwallet/entities/TransactionRecord;", "getRecords", "()Ljava/util/List;", "getState", "()Lapp/odapplications/bitstashwallet/modules/transactions/Pool$State;", "unusedRecords", "", "getUnusedRecords", "wallet", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "getWallet", "()Lapp/odapplications/bitstashwallet/entities/Wallet;", "add", "", "transactionRecords", "getFetchData", "Lapp/odapplications/bitstashwallet/modules/transactions/TransactionsModule$FetchData;", "limit", "", "handleUpdatedRecord", "Lapp/odapplications/bitstashwallet/modules/transactions/Pool$HandleResult;", "record", "increaseFirstUnusedIndex", "resetFirstUnusedIndex", "HandleResult", "State", "app_productionMainnetRelease"})
public final class Pool {
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.modules.transactions.Pool.State state = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<app.odapplications.bitstashwallet.entities.TransactionRecord> getRecords() {
        return null;
    }
    
    public final boolean getAllShown() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<app.odapplications.bitstashwallet.entities.TransactionRecord> getUnusedRecords() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.entities.Wallet getWallet() {
        return null;
    }
    
    public final void increaseFirstUnusedIndex() {
    }
    
    public final void resetFirstUnusedIndex() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.transactions.TransactionsModule.FetchData getFetchData(int limit) {
        return null;
    }
    
    public final void add(@org.jetbrains.annotations.NotNull()
    java.util.List<app.odapplications.bitstashwallet.entities.TransactionRecord> transactionRecords) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.modules.transactions.Pool.HandleResult handleUpdatedRecord(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.TransactionRecord record) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.modules.transactions.Pool.State getState() {
        return null;
    }
    
    public Pool(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.transactions.Pool.State state) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u001b\u001a\u00020\u001c2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017J\u000e\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0013J\u000e\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0013J\u0016\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0013J\u0016\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0013R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006$"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/transactions/Pool$State;", "", "wallet", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "(Lapp/odapplications/bitstashwallet/entities/Wallet;)V", "allLoaded", "", "getAllLoaded", "()Z", "setAllLoaded", "(Z)V", "firstUnusedIndex", "", "getFirstUnusedIndex", "()I", "setFirstUnusedIndex", "(I)V", "records", "", "Lapp/odapplications/bitstashwallet/entities/TransactionRecord;", "getRecords", "()Ljava/util/List;", "unusedRecords", "", "getUnusedRecords", "getWallet", "()Lapp/odapplications/bitstashwallet/entities/Wallet;", "add", "", "indexOf", "record", "insertIndexOf", "insertRecord", "insertIndex", "setRecord", "index", "app_productionMainnetRelease"})
    public static final class State {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<app.odapplications.bitstashwallet.entities.TransactionRecord> records = null;
        private int firstUnusedIndex;
        private boolean allLoaded;
        @org.jetbrains.annotations.NotNull()
        private final app.odapplications.bitstashwallet.entities.Wallet wallet = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<app.odapplications.bitstashwallet.entities.TransactionRecord> getRecords() {
            return null;
        }
        
        public final int getFirstUnusedIndex() {
            return 0;
        }
        
        public final void setFirstUnusedIndex(int p0) {
        }
        
        public final boolean getAllLoaded() {
            return false;
        }
        
        public final void setAllLoaded(boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<app.odapplications.bitstashwallet.entities.TransactionRecord> getUnusedRecords() {
            return null;
        }
        
        public final void add(@org.jetbrains.annotations.NotNull()
        java.util.List<app.odapplications.bitstashwallet.entities.TransactionRecord> records) {
        }
        
        public final int indexOf(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.TransactionRecord record) {
            return 0;
        }
        
        public final int insertIndexOf(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.TransactionRecord record) {
            return 0;
        }
        
        public final void setRecord(int index, @org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.TransactionRecord record) {
        }
        
        public final void insertRecord(int insertIndex, @org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.TransactionRecord record) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final app.odapplications.bitstashwallet.entities.Wallet getWallet() {
            return null;
        }
        
        public State(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Wallet wallet) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/transactions/Pool$HandleResult;", "", "(Ljava/lang/String;I)V", "UPDATED", "INSERTED", "IGNORED", "NEW_DATA", "app_productionMainnetRelease"})
    public static enum HandleResult {
        /*public static final*/ UPDATED /* = new UPDATED() */,
        /*public static final*/ INSERTED /* = new INSERTED() */,
        /*public static final*/ IGNORED /* = new IGNORED() */,
        /*public static final*/ NEW_DATA /* = new NEW_DATA() */;
        
        HandleResult() {
        }
    }
}
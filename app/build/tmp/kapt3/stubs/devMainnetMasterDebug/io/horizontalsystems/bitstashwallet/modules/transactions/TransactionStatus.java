package io.horizontalsystems.bitstashwallet.modules.transactions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionStatus;", "", "()V", "Completed", "Pending", "Processing", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionStatus$Pending;", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionStatus$Processing;", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionStatus$Completed;", "app_devMainnetMasterDebug"})
public abstract class TransactionStatus {
    
    private TransactionStatus() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionStatus$Pending;", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionStatus;", "()V", "app_devMainnetMasterDebug"})
    public static final class Pending extends io.horizontalsystems.bitstashwallet.modules.transactions.TransactionStatus {
        public static final io.horizontalsystems.bitstashwallet.modules.transactions.TransactionStatus.Pending INSTANCE = null;
        
        private Pending() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionStatus$Processing;", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionStatus;", "progress", "", "(D)V", "getProgress", "()D", "app_devMainnetMasterDebug"})
    public static final class Processing extends io.horizontalsystems.bitstashwallet.modules.transactions.TransactionStatus {
        private final double progress = 0.0;
        
        public final double getProgress() {
            return 0.0;
        }
        
        public Processing(double progress) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionStatus$Completed;", "Lio/horizontalsystems/bitstashwallet/modules/transactions/TransactionStatus;", "()V", "app_devMainnetMasterDebug"})
    public static final class Completed extends io.horizontalsystems.bitstashwallet.modules.transactions.TransactionStatus {
        public static final io.horizontalsystems.bitstashwallet.modules.transactions.TransactionStatus.Completed INSTANCE = null;
        
        private Completed() {
            super();
        }
    }
}
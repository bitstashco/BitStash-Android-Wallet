package io.horizontalsystems.bitstashwallet.core.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 +2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001+B\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ2\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00132\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0016J\u0016\u0010%\u001a\u00020\u001c2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00180\u0014H\u0016J$\u0010\'\u001a\u00020\u001c2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u00142\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0014H\u0016R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006,"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/adapters/BitcoinCashAdapter;", "Lio/horizontalsystems/bitstashwallet/core/adapters/BitcoinBaseAdapter;", "Lio/horizontalsystems/bitcoincash/BitcoinCashKit$Listener;", "Lio/horizontalsystems/bitstashwallet/core/ISendBitcoinAdapter;", "wallet", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "testMode", "", "(Lio/horizontalsystems/bitstashwallet/entities/Wallet;Z)V", "kit", "Lio/horizontalsystems/bitcoincash/BitcoinCashKit;", "(Lio/horizontalsystems/bitcoincash/BitcoinCashKit;)V", "getKit", "()Lio/horizontalsystems/bitcoincash/BitcoinCashKit;", "satoshisInBitcoin", "Ljava/math/BigDecimal;", "getSatoshisInBitcoin", "()Ljava/math/BigDecimal;", "getTransactions", "Lio/reactivex/Single;", "", "Lio/horizontalsystems/bitstashwallet/entities/TransactionRecord;", "from", "Lkotlin/Pair;", "", "", "limit", "onBalanceUpdate", "", "balance", "", "onKitStateUpdate", "state", "Lio/horizontalsystems/bitcoincore/BitcoinCore$KitState;", "onLastBlockInfoUpdate", "blockInfo", "Lio/horizontalsystems/bitcoincore/models/BlockInfo;", "onTransactionsDelete", "hashes", "onTransactionsUpdate", "inserted", "Lio/horizontalsystems/bitcoincore/models/TransactionInfo;", "updated", "Companion", "app_productionMainnetRelease"})
public final class BitcoinCashAdapter extends io.horizontalsystems.bitstashwallet.core.adapters.BitcoinBaseAdapter implements io.horizontalsystems.bitcoincash.BitcoinCashKit.Listener, io.horizontalsystems.bitstashwallet.core.ISendBitcoinAdapter {
    @org.jetbrains.annotations.NotNull()
    private final java.math.BigDecimal satoshisInBitcoin = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitcoincash.BitcoinCashKit kit = null;
    public static final io.horizontalsystems.bitstashwallet.core.adapters.BitcoinCashAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getSatoshisInBitcoin() {
        return null;
    }
    
    @java.lang.Override()
    public void onBalanceUpdate(long balance) {
    }
    
    @java.lang.Override()
    public void onLastBlockInfoUpdate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitcoincore.models.BlockInfo blockInfo) {
    }
    
    @java.lang.Override()
    public void onKitStateUpdate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitcoincore.BitcoinCore.KitState state) {
    }
    
    @java.lang.Override()
    public void onTransactionsUpdate(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bitcoincore.models.TransactionInfo> inserted, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bitcoincore.models.TransactionInfo> updated) {
    }
    
    @java.lang.Override()
    public void onTransactionsDelete(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> hashes) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<io.horizontalsystems.bitstashwallet.entities.TransactionRecord>> getTransactions(@org.jetbrains.annotations.Nullable()
    kotlin.Pair<java.lang.String, java.lang.Integer> from, int limit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitcoincash.BitcoinCashKit getKit() {
        return null;
    }
    
    public BitcoinCashAdapter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitcoincash.BitcoinCashKit kit) {
        super(null);
    }
    
    public BitcoinCashAdapter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Wallet wallet, boolean testMode) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u00a8\u0006\u000f"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/adapters/BitcoinCashAdapter$Companion;", "", "()V", "clear", "", "walletId", "", "testMode", "", "createKit", "Lio/horizontalsystems/bitcoincash/BitcoinCashKit;", "wallet", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "getNetworkType", "Lio/horizontalsystems/bitcoincash/BitcoinCashKit$NetworkType;", "app_productionMainnetRelease"})
    public static final class Companion {
        
        private final io.horizontalsystems.bitcoincash.BitcoinCashKit.NetworkType getNetworkType(boolean testMode) {
            return null;
        }
        
        private final io.horizontalsystems.bitcoincash.BitcoinCashKit createKit(io.horizontalsystems.bitstashwallet.entities.Wallet wallet, boolean testMode) {
            return null;
        }
        
        public final void clear(@org.jetbrains.annotations.NotNull()
        java.lang.String walletId, boolean testMode) {
        }
        
        private Companion() {
            super();
        }
    }
}
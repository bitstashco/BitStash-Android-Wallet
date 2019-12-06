package app.odapplications.bitstashwallet.core.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 02\u00020\u00012\u00020\u00022\u00020\u0003:\u00010B\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J2\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00182\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020 2\u0006\u0010\'\u001a\u00020(H\u0016J\u0016\u0010)\u001a\u00020 2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00140\u0019H\u0016J$\u0010+\u001a\u00020 2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00192\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u0019H\u0016J\u001e\u0010/\u001a\b\u0012\u0004\u0012\u00020 0\u00182\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u00061"}, d2 = {"Lapp/odapplications/bitstashwallet/core/adapters/DashAdapter;", "Lapp/odapplications/bitstashwallet/core/adapters/BitcoinBaseAdapter;", "Lio/horizontalsystems/dashkit/DashKit$Listener;", "Lapp/odapplications/bitstashwallet/core/ISendDashAdapter;", "wallet", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "testMode", "", "(Lapp/odapplications/bitstashwallet/entities/Wallet;Z)V", "kit", "Lio/horizontalsystems/dashkit/DashKit;", "(Lio/horizontalsystems/dashkit/DashKit;)V", "getKit", "()Lio/horizontalsystems/dashkit/DashKit;", "satoshisInBitcoin", "Ljava/math/BigDecimal;", "getSatoshisInBitcoin", "()Ljava/math/BigDecimal;", "availableBalance", "address", "", "fee", "amount", "getTransactions", "Lio/reactivex/Single;", "", "Lapp/odapplications/bitstashwallet/entities/TransactionRecord;", "from", "Lkotlin/Pair;", "", "limit", "onBalanceUpdate", "", "balance", "", "onKitStateUpdate", "state", "Lio/horizontalsystems/bitcoincore/BitcoinCore$KitState;", "onLastBlockInfoUpdate", "blockInfo", "Lio/horizontalsystems/bitcoincore/models/BlockInfo;", "onTransactionsDelete", "hashes", "onTransactionsUpdate", "inserted", "Lio/horizontalsystems/dashkit/models/DashTransactionInfo;", "updated", "send", "Companion", "app_productionMainnetRelease"})
public final class DashAdapter extends app.odapplications.bitstashwallet.core.adapters.BitcoinBaseAdapter implements io.horizontalsystems.dashkit.DashKit.Listener, app.odapplications.bitstashwallet.core.ISendDashAdapter {
    @org.jetbrains.annotations.NotNull()
    private final java.math.BigDecimal satoshisInBitcoin = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.dashkit.DashKit kit = null;
    private static final long feeRate = 1L;
    public static final app.odapplications.bitstashwallet.core.adapters.DashAdapter.Companion Companion = null;
    
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
    java.util.List<io.horizontalsystems.dashkit.models.DashTransactionInfo> inserted, @org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.dashkit.models.DashTransactionInfo> updated) {
    }
    
    @java.lang.Override()
    public void onTransactionsDelete(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> hashes) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<app.odapplications.bitstashwallet.entities.TransactionRecord>> getTransactions(@org.jetbrains.annotations.Nullable()
    kotlin.Pair<java.lang.String, java.lang.Integer> from, int limit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal availableBalance(@org.jetbrains.annotations.Nullable()
    java.lang.String address) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal fee(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, @org.jetbrains.annotations.Nullable()
    java.lang.String address) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<kotlin.Unit> send(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.dashkit.DashKit getKit() {
        return null;
    }
    
    public DashAdapter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.dashkit.DashKit kit) {
        super(null);
    }
    
    public DashAdapter(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Wallet wallet, boolean testMode) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lapp/odapplications/bitstashwallet/core/adapters/DashAdapter$Companion;", "", "()V", "feeRate", "", "clear", "", "walletId", "", "testMode", "", "createKit", "Lio/horizontalsystems/dashkit/DashKit;", "wallet", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "getNetworkType", "Lio/horizontalsystems/dashkit/DashKit$NetworkType;", "app_productionMainnetRelease"})
    public static final class Companion {
        
        private final io.horizontalsystems.dashkit.DashKit.NetworkType getNetworkType(boolean testMode) {
            return null;
        }
        
        private final io.horizontalsystems.dashkit.DashKit createKit(app.odapplications.bitstashwallet.entities.Wallet wallet, boolean testMode) {
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
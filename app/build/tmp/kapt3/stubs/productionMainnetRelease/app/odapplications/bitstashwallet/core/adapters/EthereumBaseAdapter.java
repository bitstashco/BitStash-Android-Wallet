package app.odapplications.bitstashwallet.core.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0015\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001a\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010\b\u001a\u00020\tH\u0004J\b\u0010#\u001a\u00020\u001aH\u0016J&\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0%2\u0006\u0010&\u001a\u00020 2\u0006\u0010\'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020)H\u0016J&\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001a0%2\u0006\u0010\'\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010+\u001a\u00020\u001aH\u0016J\b\u0010,\u001a\u00020\u001aH\u0016J\u0010\u0010-\u001a\u00020\u001a2\u0006\u0010\'\u001a\u00020\u000fH\u0016R\u0014\u0010\u000b\u001a\u00020\tX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u0011\u00a8\u0006."}, d2 = {"Lapp/odapplications/bitstashwallet/core/adapters/EthereumBaseAdapter;", "Lapp/odapplications/bitstashwallet/core/IAdapter;", "Lapp/odapplications/bitstashwallet/core/ISendEthereumAdapter;", "Lapp/odapplications/bitstashwallet/core/ITransactionsAdapter;", "Lapp/odapplications/bitstashwallet/core/IBalanceAdapter;", "Lapp/odapplications/bitstashwallet/core/IReceiveAdapter;", "ethereumKit", "Lio/horizontalsystems/ethereumkit/core/EthereumKit;", "decimal", "", "(Lio/horizontalsystems/ethereumkit/core/EthereumKit;I)V", "confirmationsThreshold", "getConfirmationsThreshold", "()I", "debugInfo", "", "getDebugInfo", "()Ljava/lang/String;", "getDecimal", "getEthereumKit", "()Lio/horizontalsystems/ethereumkit/core/EthereumKit;", "lastBlockHeight", "getLastBlockHeight", "()Ljava/lang/Integer;", "lastBlockHeightUpdatedFlowable", "Lio/reactivex/Flowable;", "", "getLastBlockHeightUpdatedFlowable", "()Lio/reactivex/Flowable;", "receiveAddress", "getReceiveAddress", "balanceInBigDecimal", "Ljava/math/BigDecimal;", "balance", "Ljava/math/BigInteger;", "refresh", "send", "Lio/reactivex/Single;", "amount", "address", "gasPrice", "", "sendSingle", "start", "stop", "validate", "app_productionMainnetRelease"})
public abstract class EthereumBaseAdapter implements app.odapplications.bitstashwallet.core.IAdapter, app.odapplications.bitstashwallet.core.ISendEthereumAdapter, app.odapplications.bitstashwallet.core.ITransactionsAdapter, app.odapplications.bitstashwallet.core.IBalanceAdapter, app.odapplications.bitstashwallet.core.IReceiveAdapter {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String debugInfo = null;
    private final int confirmationsThreshold = 12;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.ethereumkit.core.EthereumKit ethereumKit = null;
    private final int decimal = 0;
    
    @java.lang.Override()
    public void start() {
    }
    
    @java.lang.Override()
    public void stop() {
    }
    
    @java.lang.Override()
    public void refresh() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getDebugInfo() {
        return null;
    }
    
    @java.lang.Override()
    public int getConfirmationsThreshold() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Integer getLastBlockHeight() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<kotlin.Unit> getLastBlockHeightUpdatedFlowable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<kotlin.Unit> send(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
    java.lang.String address, long gasPrice) {
        return null;
    }
    
    @java.lang.Override()
    public void validate(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getReceiveAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.math.BigDecimal balanceInBigDecimal(@org.jetbrains.annotations.Nullable()
    java.math.BigInteger balance, int decimal) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Single<kotlin.Unit> sendSingle(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String amount, long gasPrice) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final io.horizontalsystems.ethereumkit.core.EthereumKit getEthereumKit() {
        return null;
    }
    
    public final int getDecimal() {
        return 0;
    }
    
    public EthereumBaseAdapter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.ethereumkit.core.EthereumKit ethereumKit, int decimal) {
        super();
    }
}
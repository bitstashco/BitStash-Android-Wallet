package app.odapplications.bitstashwallet.modules.send.ethereum;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/ethereum/SendEthereumInteractor;", "Lapp/odapplications/bitstashwallet/modules/send/SendModule$ISendEthereumInteractor;", "adapter", "Lapp/odapplications/bitstashwallet/core/ISendEthereumAdapter;", "(Lapp/odapplications/bitstashwallet/core/ISendEthereumAdapter;)V", "ethereumBalance", "Ljava/math/BigDecimal;", "getEthereumBalance", "()Ljava/math/BigDecimal;", "availableBalance", "gasPrice", "", "fee", "send", "Lio/reactivex/Single;", "", "amount", "address", "", "validate", "app_productionMainnetRelease"})
public final class SendEthereumInteractor implements app.odapplications.bitstashwallet.modules.send.SendModule.ISendEthereumInteractor {
    private final app.odapplications.bitstashwallet.core.ISendEthereumAdapter adapter = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getEthereumBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal availableBalance(long gasPrice) {
        return null;
    }
    
    @java.lang.Override()
    public void validate(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal fee(long gasPrice) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<kotlin.Unit> send(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
    java.lang.String address, long gasPrice) {
        return null;
    }
    
    public SendEthereumInteractor(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.ISendEthereumAdapter adapter) {
        super();
    }
}
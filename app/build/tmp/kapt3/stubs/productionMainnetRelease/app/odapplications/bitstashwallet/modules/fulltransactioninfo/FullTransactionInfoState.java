package app.odapplications.bitstashwallet.modules.fulltransactioninfo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoState;", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$State;", "wallet", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "transactionHash", "", "(Lapp/odapplications/bitstashwallet/entities/Wallet;Ljava/lang/String;)V", "getTransactionHash", "()Ljava/lang/String;", "transactionRecord", "Lapp/odapplications/bitstashwallet/entities/FullTransactionRecord;", "getTransactionRecord", "()Lapp/odapplications/bitstashwallet/entities/FullTransactionRecord;", "setTransactionRecord", "(Lapp/odapplications/bitstashwallet/entities/FullTransactionRecord;)V", "getWallet", "()Lapp/odapplications/bitstashwallet/entities/Wallet;", "app_productionMainnetRelease"})
public final class FullTransactionInfoState implements app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.State {
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.entities.FullTransactionRecord transactionRecord;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.entities.Wallet wallet = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String transactionHash = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.entities.FullTransactionRecord getTransactionRecord() {
        return null;
    }
    
    @java.lang.Override()
    public void setTransactionRecord(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.entities.FullTransactionRecord p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.entities.Wallet getWallet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getTransactionHash() {
        return null;
    }
    
    public FullTransactionInfoState(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Wallet wallet, @org.jetbrains.annotations.NotNull()
    java.lang.String transactionHash) {
        super();
    }
}
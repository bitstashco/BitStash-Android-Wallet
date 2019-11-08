package io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\nH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0013"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoProvider;", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$FullProvider;", "networkManager", "Lio/horizontalsystems/bitstashwallet/core/INetworkManager;", "adapter", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Adapter;", "provider", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Provider;", "(Lio/horizontalsystems/bitstashwallet/core/INetworkManager;Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Adapter;Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Provider;)V", "providerName", "", "getProviderName", "()Ljava/lang/String;", "retrieveTransactionInfo", "Lio/reactivex/Flowable;", "Lio/horizontalsystems/bitstashwallet/entities/FullTransactionRecord;", "transactionHash", "url", "hash", "app_productionMainnetRelease"})
public final class FullTransactionInfoProvider implements io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.FullProvider {
    private final io.horizontalsystems.bitstashwallet.core.INetworkManager networkManager = null;
    private final io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.Adapter adapter = null;
    private final io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.Provider provider = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getProviderName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String url(@org.jetbrains.annotations.NotNull()
    java.lang.String hash) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<io.horizontalsystems.bitstashwallet.entities.FullTransactionRecord> retrieveTransactionInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String transactionHash) {
        return null;
    }
    
    public FullTransactionInfoProvider(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.INetworkManager networkManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.Adapter adapter, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.Provider provider) {
        super();
    }
}
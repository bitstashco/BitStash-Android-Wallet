package io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BlockdozerBitcoinCashProvider;", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$BitcoinForksProvider;", "testMode", "", "(Z)V", "baseUrl", "", "name", "getName", "()Ljava/lang/String;", "apiRequest", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Request;", "hash", "convert", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/BitcoinResponse;", "json", "Lcom/google/gson/JsonObject;", "url", "app_devMainnetMasterDebug"})
public final class BlockdozerBitcoinCashProvider implements io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.BitcoinForksProvider {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = "Blockdozer.com";
    private final java.lang.String baseUrl = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String url(@org.jetbrains.annotations.NotNull()
    java.lang.String hash) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.Request apiRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String hash) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.BitcoinResponse convert(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject json) {
        return null;
    }
    
    public BlockdozerBitcoinCashProvider(boolean testMode) {
        super();
    }
}
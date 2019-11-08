package io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/adapters/FullTransactionBitcoinAdapter;", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Adapter;", "provider", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$BitcoinForksProvider;", "coin", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "unitName", "", "(Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$BitcoinForksProvider;Lio/horizontalsystems/bitstashwallet/entities/Coin;Ljava/lang/String;)V", "getCoin", "()Lio/horizontalsystems/bitstashwallet/entities/Coin;", "getProvider", "()Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$BitcoinForksProvider;", "getUnitName", "()Ljava/lang/String;", "convert", "Lio/horizontalsystems/bitstashwallet/entities/FullTransactionRecord;", "json", "Lcom/google/gson/JsonObject;", "app_productionMainnetRelease"})
public final class FullTransactionBitcoinAdapter implements io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.Adapter {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.BitcoinForksProvider provider = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.entities.Coin coin = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String unitName = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.entities.FullTransactionRecord convert(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject json) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.BitcoinForksProvider getProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.entities.Coin getCoin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUnitName() {
        return null;
    }
    
    public FullTransactionBitcoinAdapter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.BitcoinForksProvider provider, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Coin coin, @org.jetbrains.annotations.NotNull()
    java.lang.String unitName) {
        super();
    }
}
package io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u0014X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000eR\u0014\u0010\u001d\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000e\u00a8\u0006\u001f"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/EosProviderResponse;", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/EosResponse;", "json", "Lcom/google/gson/JsonObject;", "eosAccount", "", "(Lcom/google/gson/JsonObject;Ljava/lang/String;)V", "actions", "", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/providers/EosAction;", "getActions", "()Ljava/util/List;", "blockNumber", "getBlockNumber", "()Ljava/lang/String;", "blockTimeStamp", "", "getBlockTimeStamp", "()J", "cpuUsage", "", "getCpuUsage", "()I", "dateFormat", "Ljava/text/SimpleDateFormat;", "netUsage", "getNetUsage", "status", "getStatus", "txId", "getTxId", "app_devMainnetMasterDebug"})
public final class EosProviderResponse extends io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.EosResponse {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String txId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String status = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String blockNumber = null;
    private final long blockTimeStamp = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.EosAction> actions = null;
    private final int cpuUsage = 0;
    private final int netUsage = 0;
    private final java.text.SimpleDateFormat dateFormat = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getTxId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getBlockNumber() {
        return null;
    }
    
    @java.lang.Override()
    public long getBlockTimeStamp() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.providers.EosAction> getActions() {
        return null;
    }
    
    @java.lang.Override()
    public int getCpuUsage() {
        return 0;
    }
    
    @java.lang.Override()
    public int getNetUsage() {
        return 0;
    }
    
    public EosProviderResponse(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject json, @org.jetbrains.annotations.NotNull()
    java.lang.String eosAccount) {
        super();
    }
}
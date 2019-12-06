package app.odapplications.bitstashwallet.modules.fulltransactioninfo.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0011X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0012\u0010\u0016\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u000bR\u0012\u0010\u0018\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u000b\u00a8\u0006\u001a"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/providers/EosResponse;", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/providers/FullTransactionResponse;", "()V", "actions", "", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/providers/EosAction;", "getActions", "()Ljava/util/List;", "blockNumber", "", "getBlockNumber", "()Ljava/lang/String;", "blockTimeStamp", "", "getBlockTimeStamp", "()J", "cpuUsage", "", "getCpuUsage", "()I", "netUsage", "getNetUsage", "status", "getStatus", "txId", "getTxId", "app_productionMainnetRelease"})
public abstract class EosResponse implements app.odapplications.bitstashwallet.modules.fulltransactioninfo.providers.FullTransactionResponse {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getTxId();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getStatus();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getBlockNumber();
    
    public abstract long getBlockTimeStamp();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<app.odapplications.bitstashwallet.modules.fulltransactioninfo.providers.EosAction> getActions();
    
    public abstract int getCpuUsage();
    
    public abstract int getNetUsage();
    
    public EosResponse() {
        super();
    }
}
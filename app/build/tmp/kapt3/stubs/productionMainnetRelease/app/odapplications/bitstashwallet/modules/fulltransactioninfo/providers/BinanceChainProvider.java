package app.odapplications.bitstashwallet.modules.fulltransactioninfo.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/providers/BinanceChainProvider;", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$BinanceProvider;", "testMode", "", "(Z)V", "apiUrl", "", "name", "getName", "()Ljava/lang/String;", "getTestMode", "()Z", "url", "apiRequest", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Request;", "hash", "convert", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/providers/BinanceResponse;", "json", "Lcom/google/gson/JsonObject;", "app_productionMainnetRelease"})
public final class BinanceChainProvider implements app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.BinanceProvider {
    private final java.lang.String url = null;
    private final java.lang.String apiUrl = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = "Binance.org";
    private final boolean testMode = false;
    
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
    public app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.Request apiRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String hash) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.modules.fulltransactioninfo.providers.BinanceResponse convert(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject json) {
        return null;
    }
    
    public final boolean getTestMode() {
        return false;
    }
    
    public BinanceChainProvider(boolean testMode) {
        super();
    }
}
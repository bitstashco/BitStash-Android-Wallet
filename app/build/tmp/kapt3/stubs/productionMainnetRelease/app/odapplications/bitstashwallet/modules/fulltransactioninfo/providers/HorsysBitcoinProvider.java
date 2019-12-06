package app.odapplications.bitstashwallet.modules.fulltransactioninfo.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/providers/HorsysBitcoinProvider;", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$BitcoinForksProvider;", "testMode", "", "(Z)V", "name", "", "getName", "()Ljava/lang/String;", "getTestMode", "()Z", "apiRequest", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Request;", "hash", "convert", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/providers/BitcoinResponse;", "json", "Lcom/google/gson/JsonObject;", "url", "app_productionMainnetRelease"})
public final class HorsysBitcoinProvider implements app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.BitcoinForksProvider {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = "HorizontalSystems.xyz";
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
    public app.odapplications.bitstashwallet.modules.fulltransactioninfo.providers.BitcoinResponse convert(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject json) {
        return null;
    }
    
    public final boolean getTestMode() {
        return false;
    }
    
    public HorsysBitcoinProvider(boolean testMode) {
        super();
    }
}
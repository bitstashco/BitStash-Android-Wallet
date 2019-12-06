package app.odapplications.bitstashwallet.modules.fulltransactioninfo.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/adapters/FullTransactionEthereumAdapter;", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Adapter;", "provider", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$EthereumForksProvider;", "feeCoinProvider", "Lapp/odapplications/bitstashwallet/core/factories/FeeCoinProvider;", "coin", "Lapp/odapplications/bitstashwallet/entities/Coin;", "(Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$EthereumForksProvider;Lapp/odapplications/bitstashwallet/core/factories/FeeCoinProvider;Lapp/odapplications/bitstashwallet/entities/Coin;)V", "convert", "Lapp/odapplications/bitstashwallet/entities/FullTransactionRecord;", "json", "Lcom/google/gson/JsonObject;", "app_productionMainnetRelease"})
public final class FullTransactionEthereumAdapter implements app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.Adapter {
    private final app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.EthereumForksProvider provider = null;
    private final app.odapplications.bitstashwallet.core.factories.FeeCoinProvider feeCoinProvider = null;
    private final app.odapplications.bitstashwallet.entities.Coin coin = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.entities.FullTransactionRecord convert(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject json) {
        return null;
    }
    
    public FullTransactionEthereumAdapter(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.EthereumForksProvider provider, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.factories.FeeCoinProvider feeCoinProvider, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Coin coin) {
        super();
    }
}
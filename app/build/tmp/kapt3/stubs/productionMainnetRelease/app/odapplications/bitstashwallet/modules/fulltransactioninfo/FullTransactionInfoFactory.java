package app.odapplications.bitstashwallet.modules.fulltransactioninfo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoFactory;", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$ProviderFactory;", "networkManager", "Lapp/odapplications/bitstashwallet/core/INetworkManager;", "dataProviderManager", "Lapp/odapplications/bitstashwallet/core/ITransactionDataProviderManager;", "(Lapp/odapplications/bitstashwallet/core/INetworkManager;Lapp/odapplications/bitstashwallet/core/ITransactionDataProviderManager;)V", "providerFor", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$FullProvider;", "wallet", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "app_productionMainnetRelease"})
public final class FullTransactionInfoFactory implements app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.ProviderFactory {
    private final app.odapplications.bitstashwallet.core.INetworkManager networkManager = null;
    private final app.odapplications.bitstashwallet.core.ITransactionDataProviderManager dataProviderManager = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.FullProvider providerFor(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Wallet wallet) {
        return null;
    }
    
    public FullTransactionInfoFactory(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.INetworkManager networkManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.ITransactionDataProviderManager dataProviderManager) {
        super();
    }
}
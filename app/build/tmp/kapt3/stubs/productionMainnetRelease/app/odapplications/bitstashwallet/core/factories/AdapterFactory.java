package app.odapplications.bitstashwallet.core.factories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lapp/odapplications/bitstashwallet/core/factories/AdapterFactory;", "", "context", "Landroid/content/Context;", "appConfigProvider", "Lapp/odapplications/bitstashwallet/core/IAppConfigProvider;", "ethereumKitManager", "Lapp/odapplications/bitstashwallet/core/IEthereumKitManager;", "eosKitManager", "Lapp/odapplications/bitstashwallet/core/IEosKitManager;", "binanceKitManager", "Lapp/odapplications/bitstashwallet/core/managers/BinanceKitManager;", "(Landroid/content/Context;Lapp/odapplications/bitstashwallet/core/IAppConfigProvider;Lapp/odapplications/bitstashwallet/core/IEthereumKitManager;Lapp/odapplications/bitstashwallet/core/IEosKitManager;Lapp/odapplications/bitstashwallet/core/managers/BinanceKitManager;)V", "adapter", "Lapp/odapplications/bitstashwallet/core/IAdapter;", "wallet", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "unlinkAdapter", "", "app_productionMainnetRelease"})
public final class AdapterFactory {
    private final android.content.Context context = null;
    private final app.odapplications.bitstashwallet.core.IAppConfigProvider appConfigProvider = null;
    private final app.odapplications.bitstashwallet.core.IEthereumKitManager ethereumKitManager = null;
    private final app.odapplications.bitstashwallet.core.IEosKitManager eosKitManager = null;
    private final app.odapplications.bitstashwallet.core.managers.BinanceKitManager binanceKitManager = null;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.core.IAdapter adapter(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Wallet wallet) {
        return null;
    }
    
    public final void unlinkAdapter(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IAdapter adapter) {
    }
    
    public AdapterFactory(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IAppConfigProvider appConfigProvider, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IEthereumKitManager ethereumKitManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IEosKitManager eosKitManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.managers.BinanceKitManager binanceKitManager) {
        super();
    }
}
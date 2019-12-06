package app.odapplications.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\n"}, d2 = {"Lapp/odapplications/bitstashwallet/core/IEthereumKitManager;", "", "ethereumKit", "Lio/horizontalsystems/ethereumkit/core/EthereumKit;", "getEthereumKit", "()Lio/horizontalsystems/ethereumkit/core/EthereumKit;", "wallet", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "unlink", "", "app_productionMainnetRelease"})
public abstract interface IEthereumKitManager {
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.horizontalsystems.ethereumkit.core.EthereumKit getEthereumKit();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.ethereumkit.core.EthereumKit ethereumKit(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Wallet wallet);
    
    public abstract void unlink();
}
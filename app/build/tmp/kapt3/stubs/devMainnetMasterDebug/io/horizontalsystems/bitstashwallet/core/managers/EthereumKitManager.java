package io.horizontalsystems.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/managers/EthereumKitManager;", "Lio/horizontalsystems/bitstashwallet/core/IEthereumKitManager;", "appConfig", "Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;", "(Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;)V", "ethereumKit", "Lio/horizontalsystems/ethereumkit/core/EthereumKit;", "getEthereumKit", "()Lio/horizontalsystems/ethereumkit/core/EthereumKit;", "etherscanKey", "", "kotlin.jvm.PlatformType", "infuraProjectId", "infuraSecretKey", "kit", "testMode", "", "useCount", "", "wallet", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "unlink", "", "app_devMainnetMasterDebug"})
public final class EthereumKitManager implements io.horizontalsystems.bitstashwallet.core.IEthereumKitManager {
    private io.horizontalsystems.ethereumkit.core.EthereumKit kit;
    private int useCount;
    private final boolean testMode = false;
    private final java.lang.String infuraProjectId = null;
    private final java.lang.String infuraSecretKey = null;
    private final java.lang.String etherscanKey = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.ethereumkit.core.EthereumKit getEthereumKit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.ethereumkit.core.EthereumKit ethereumKit(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Wallet wallet) {
        return null;
    }
    
    @java.lang.Override()
    public void unlink() {
    }
    
    public EthereumKitManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IAppConfigProvider appConfig) {
        super();
    }
}
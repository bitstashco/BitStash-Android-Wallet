package io.horizontalsystems.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/managers/EosKitManager;", "Lio/horizontalsystems/bitstashwallet/core/IEosKitManager;", "appConfig", "Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;", "(Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;)V", "eosKit", "Lio/horizontalsystems/eoskit/EosKit;", "getEosKit", "()Lio/horizontalsystems/eoskit/EosKit;", "kit", "testMode", "", "useCount", "", "wallet", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "unlink", "", "app_devMainnetMasterDebug"})
public final class EosKitManager implements io.horizontalsystems.bitstashwallet.core.IEosKitManager {
    private io.horizontalsystems.eoskit.EosKit kit;
    private int useCount;
    private final boolean testMode = false;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.eoskit.EosKit getEosKit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.eoskit.EosKit eosKit(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Wallet wallet) {
        return null;
    }
    
    @java.lang.Override()
    public void unlink() {
    }
    
    public EosKitManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IAppConfigProvider appConfig) {
        super();
    }
}
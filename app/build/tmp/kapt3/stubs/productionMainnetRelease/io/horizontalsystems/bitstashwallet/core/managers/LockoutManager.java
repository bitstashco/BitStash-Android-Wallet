package io.horizontalsystems.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/managers/LockoutManager;", "Lio/horizontalsystems/bitstashwallet/core/ILockoutManager;", "localStorage", "Lio/horizontalsystems/bitstashwallet/core/ILocalStorage;", "uptimeProvider", "Lio/horizontalsystems/bitstashwallet/core/IUptimeProvider;", "lockoutUntilDateFactory", "Lio/horizontalsystems/bitstashwallet/core/ILockoutUntilDateFactory;", "(Lio/horizontalsystems/bitstashwallet/core/ILocalStorage;Lio/horizontalsystems/bitstashwallet/core/IUptimeProvider;Lio/horizontalsystems/bitstashwallet/core/ILockoutUntilDateFactory;)V", "currentState", "Lio/horizontalsystems/bitstashwallet/entities/LockoutState;", "getCurrentState", "()Lio/horizontalsystems/bitstashwallet/entities/LockoutState;", "lockoutThreshold", "", "didFailUnlock", "", "dropFailedAttempts", "app_productionMainnetRelease"})
public final class LockoutManager implements io.horizontalsystems.bitstashwallet.core.ILockoutManager {
    private final int lockoutThreshold = 5;
    private final io.horizontalsystems.bitstashwallet.core.ILocalStorage localStorage = null;
    private final io.horizontalsystems.bitstashwallet.core.IUptimeProvider uptimeProvider = null;
    private final io.horizontalsystems.bitstashwallet.core.ILockoutUntilDateFactory lockoutUntilDateFactory = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.entities.LockoutState getCurrentState() {
        return null;
    }
    
    @java.lang.Override()
    public void didFailUnlock() {
    }
    
    @java.lang.Override()
    public void dropFailedAttempts() {
    }
    
    public LockoutManager(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.ILocalStorage localStorage, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IUptimeProvider uptimeProvider, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.ILockoutUntilDateFactory lockoutUntilDateFactory) {
        super();
    }
}
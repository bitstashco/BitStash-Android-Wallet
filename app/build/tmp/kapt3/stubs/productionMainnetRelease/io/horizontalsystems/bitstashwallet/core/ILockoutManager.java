package io.horizontalsystems.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/ILockoutManager;", "", "currentState", "Lio/horizontalsystems/bitstashwallet/entities/LockoutState;", "getCurrentState", "()Lio/horizontalsystems/bitstashwallet/entities/LockoutState;", "didFailUnlock", "", "dropFailedAttempts", "app_productionMainnetRelease"})
public abstract interface ILockoutManager {
    
    public abstract void didFailUnlock();
    
    public abstract void dropFailedAttempts();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.bitstashwallet.entities.LockoutState getCurrentState();
}
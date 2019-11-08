package io.horizontalsystems.bitstashwallet.core.factories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/factories/LockoutUntilDateFactory;", "Lio/horizontalsystems/bitstashwallet/core/ILockoutUntilDateFactory;", "currentDateProvider", "Lio/horizontalsystems/bitstashwallet/core/ICurrentDateProvider;", "(Lio/horizontalsystems/bitstashwallet/core/ICurrentDateProvider;)V", "lockoutUntilDate", "Ljava/util/Date;", "failedAttempts", "", "lockoutTimestamp", "", "uptime", "app_productionMainnetRelease"})
public final class LockoutUntilDateFactory implements io.horizontalsystems.bitstashwallet.core.ILockoutUntilDateFactory {
    private final io.horizontalsystems.bitstashwallet.core.ICurrentDateProvider currentDateProvider = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.util.Date lockoutUntilDate(int failedAttempts, long lockoutTimestamp, long uptime) {
        return null;
    }
    
    public LockoutUntilDateFactory(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.ICurrentDateProvider currentDateProvider) {
        super();
    }
}
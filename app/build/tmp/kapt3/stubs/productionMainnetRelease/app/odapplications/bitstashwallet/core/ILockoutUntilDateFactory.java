package app.odapplications.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lapp/odapplications/bitstashwallet/core/ILockoutUntilDateFactory;", "", "lockoutUntilDate", "Ljava/util/Date;", "failedAttempts", "", "lockoutTimestamp", "", "uptime", "app_productionMainnetRelease"})
public abstract interface ILockoutUntilDateFactory {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.util.Date lockoutUntilDate(int failedAttempts, long lockoutTimestamp, long uptime);
}
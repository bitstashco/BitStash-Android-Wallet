package io.horizontalsystems.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\n"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/IEmojiHelper;", "", "multiAlerts", "", "getMultiAlerts", "()Ljava/lang/String;", "body", "signedState", "", "title", "app_devMainnetMasterDebug"})
public abstract interface IEmojiHelper {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getMultiAlerts();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String title(int signedState);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String body(int signedState);
}
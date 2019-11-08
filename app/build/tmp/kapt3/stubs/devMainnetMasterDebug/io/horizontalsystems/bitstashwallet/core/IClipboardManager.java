package io.horizontalsystems.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/IClipboardManager;", "", "hasPrimaryClip", "", "getHasPrimaryClip", "()Z", "copyText", "", "text", "", "getCopiedText", "app_devMainnetMasterDebug"})
public abstract interface IClipboardManager {
    
    public abstract void copyText(@org.jetbrains.annotations.NotNull()
    java.lang.String text);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getCopiedText();
    
    public abstract boolean getHasPrimaryClip();
}
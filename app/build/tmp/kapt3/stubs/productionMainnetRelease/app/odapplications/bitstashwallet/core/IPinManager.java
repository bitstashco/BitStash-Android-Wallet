package app.odapplications.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0004\u00a8\u0006\u000e"}, d2 = {"Lapp/odapplications/bitstashwallet/core/IPinManager;", "", "isFingerprintEnabled", "", "()Z", "setFingerprintEnabled", "(Z)V", "isPinSet", "clear", "", "store", "pin", "", "validate", "app_productionMainnetRelease"})
public abstract interface IPinManager {
    
    public abstract boolean isFingerprintEnabled();
    
    public abstract void setFingerprintEnabled(boolean p0);
    
    public abstract boolean isPinSet();
    
    public abstract void store(@org.jetbrains.annotations.NotNull()
    java.lang.String pin);
    
    public abstract boolean validate(@org.jetbrains.annotations.NotNull()
    java.lang.String pin);
    
    public abstract void clear();
}
package app.odapplications.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0007H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0010"}, d2 = {"Lapp/odapplications/bitstashwallet/core/ISecuredStorage;", "", "authData", "Lapp/odapplications/bitstashwallet/entities/AuthData;", "getAuthData", "()Lapp/odapplications/bitstashwallet/entities/AuthData;", "savedPin", "", "getSavedPin", "()Ljava/lang/String;", "pinIsEmpty", "", "removePin", "", "savePin", "pin", "app_productionMainnetRelease"})
public abstract interface ISecuredStorage {
    
    @org.jetbrains.annotations.Nullable()
    public abstract app.odapplications.bitstashwallet.entities.AuthData getAuthData();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getSavedPin();
    
    public abstract void savePin(@org.jetbrains.annotations.NotNull()
    java.lang.String pin);
    
    public abstract void removePin();
    
    public abstract boolean pinIsEmpty();
}
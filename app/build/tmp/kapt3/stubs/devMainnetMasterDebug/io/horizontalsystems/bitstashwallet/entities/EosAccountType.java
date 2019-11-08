package io.horizontalsystems.bitstashwallet.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bitstashwallet/entities/EosAccountType;", "Lio/horizontalsystems/bitstashwallet/core/IPredefinedAccountType;", "()V", "coinCodes", "", "getCoinCodes", "()I", "defaultAccountType", "Lio/horizontalsystems/bitstashwallet/core/DefaultAccountType;", "getDefaultAccountType", "()Lio/horizontalsystems/bitstashwallet/core/DefaultAccountType;", "title", "getTitle", "supports", "", "accountType", "Lio/horizontalsystems/bitstashwallet/entities/AccountType;", "app_devMainnetMasterDebug"})
public final class EosAccountType implements io.horizontalsystems.bitstashwallet.core.IPredefinedAccountType {
    private final int title = io.horizontalsystems.bitstashwallet.R.string.AccountType_Eos;
    private final int coinCodes = io.horizontalsystems.bitstashwallet.R.string.AccountType_Eos_Text;
    
    @java.lang.Override()
    public int getTitle() {
        return 0;
    }
    
    @java.lang.Override()
    public int getCoinCodes() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.core.DefaultAccountType getDefaultAccountType() {
        return null;
    }
    
    @java.lang.Override()
    public boolean supports(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.AccountType accountType) {
        return false;
    }
    
    public EosAccountType() {
        super();
    }
}
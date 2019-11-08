package io.horizontalsystems.bitstashwallet.core.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/utils/AddressParser;", "Lio/horizontalsystems/bitstashwallet/core/IAddressParser;", "validScheme", "", "removeScheme", "", "(Ljava/lang/String;Z)V", "parameterAmount", "parameterLabel", "parameterMessage", "parameterVersion", "parse", "Lio/horizontalsystems/bitstashwallet/entities/AddressData;", "paymentAddress", "app_productionMainnetRelease"})
public final class AddressParser implements io.horizontalsystems.bitstashwallet.core.IAddressParser {
    private final java.lang.String parameterVersion = "version";
    private final java.lang.String parameterAmount = "amount";
    private final java.lang.String parameterLabel = "label";
    private final java.lang.String parameterMessage = "message";
    private final java.lang.String validScheme = null;
    private final boolean removeScheme = false;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.entities.AddressData parse(@org.jetbrains.annotations.NotNull()
    java.lang.String paymentAddress) {
        return null;
    }
    
    public AddressParser(@org.jetbrains.annotations.NotNull()
    java.lang.String validScheme, boolean removeScheme) {
        super();
    }
}
package io.horizontalsystems.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/IAddressParser;", "", "parse", "Lio/horizontalsystems/bitstashwallet/entities/AddressData;", "paymentAddress", "", "app_devMainnetMasterDebug"})
public abstract interface IAddressParser {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.horizontalsystems.bitstashwallet.entities.AddressData parse(@org.jetbrains.annotations.NotNull()
    java.lang.String paymentAddress);
}
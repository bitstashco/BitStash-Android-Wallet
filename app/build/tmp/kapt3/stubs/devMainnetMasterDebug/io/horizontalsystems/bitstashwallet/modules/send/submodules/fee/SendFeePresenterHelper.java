package io.horizontalsystems.bitstashwallet.modules.send.submodules.fee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ&\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/submodules/fee/SendFeePresenterHelper;", "", "numberFormatter", "Lio/horizontalsystems/bitstashwallet/core/IAppNumberFormatter;", "coin", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "baseCurrency", "Lio/horizontalsystems/bitstashwallet/entities/Currency;", "(Lio/horizontalsystems/bitstashwallet/core/IAppNumberFormatter;Lio/horizontalsystems/bitstashwallet/entities/Coin;Lio/horizontalsystems/bitstashwallet/entities/Currency;)V", "feeAmount", "", "coinAmount", "Ljava/math/BigDecimal;", "inputType", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$InputType;", "rate", "Lio/horizontalsystems/bitstashwallet/entities/Rate;", "app_devMainnetMasterDebug"})
public final class SendFeePresenterHelper {
    private final io.horizontalsystems.bitstashwallet.core.IAppNumberFormatter numberFormatter = null;
    private final io.horizontalsystems.bitstashwallet.entities.Coin coin = null;
    private final io.horizontalsystems.bitstashwallet.entities.Currency baseCurrency = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String feeAmount(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal coinAmount, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.send.SendModule.InputType inputType, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.entities.Rate rate) {
        return null;
    }
    
    public SendFeePresenterHelper(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IAppNumberFormatter numberFormatter, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Coin coin, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Currency baseCurrency) {
        super();
    }
}
package io.horizontalsystems.bitstashwallet.modules.send.submodules.amount;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eJ\"\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J$\u0010\u0016\u001a\u0004\u0018\u00010\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J&\u0010\u0018\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/submodules/amount/SendAmountPresenterHelper;", "", "numberFormatter", "Lio/horizontalsystems/bitstashwallet/core/IAppNumberFormatter;", "coin", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "baseCurrency", "Lio/horizontalsystems/bitstashwallet/entities/Currency;", "coinDecimal", "", "currencyDecimal", "(Lio/horizontalsystems/bitstashwallet/core/IAppNumberFormatter;Lio/horizontalsystems/bitstashwallet/entities/Coin;Lio/horizontalsystems/bitstashwallet/entities/Currency;II)V", "decimal", "inputType", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$InputType;", "getAmount", "", "coinAmount", "Ljava/math/BigDecimal;", "rate", "Lio/horizontalsystems/bitstashwallet/entities/Rate;", "getAmountPrefix", "getCoinAmount", "amount", "getHint", "app_productionMainnetRelease"})
public final class SendAmountPresenterHelper {
    private final io.horizontalsystems.bitstashwallet.core.IAppNumberFormatter numberFormatter = null;
    private final io.horizontalsystems.bitstashwallet.entities.Coin coin = null;
    private final io.horizontalsystems.bitstashwallet.entities.Currency baseCurrency = null;
    private final int coinDecimal = 0;
    private final int currencyDecimal = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAmount(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal coinAmount, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.send.SendModule.InputType inputType, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.entities.Rate rate) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHint(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal coinAmount, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.send.SendModule.InputType inputType, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.entities.Rate rate) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAmountPrefix(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.send.SendModule.InputType inputType, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.entities.Rate rate) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.math.BigDecimal getCoinAmount(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.send.SendModule.InputType inputType, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.entities.Rate rate) {
        return null;
    }
    
    public final int decimal(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.send.SendModule.InputType inputType) {
        return 0;
    }
    
    public SendAmountPresenterHelper(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IAppNumberFormatter numberFormatter, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Coin coin, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Currency baseCurrency, int coinDecimal, int currencyDecimal) {
        super();
    }
}
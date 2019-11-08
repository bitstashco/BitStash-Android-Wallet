package io.horizontalsystems.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H&J:\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u0007H&J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u0013H&J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0007H&\u00a8\u0006\u0017"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/IAppNumberFormatter;", "", "format", "", "coinValue", "Lio/horizontalsystems/bitstashwallet/entities/CoinValue;", "explicitSign", "", "realNumber", "currencyValue", "Lio/horizontalsystems/bitstashwallet/entities/CurrencyValue;", "showNegativeSign", "trimmable", "canUseLessSymbol", "shorten", "value", "", "showSign", "precision", "", "formatForTransactions", "Landroid/text/SpannableString;", "isIncoming", "app_devMainnetMasterDebug"})
public abstract interface IAppNumberFormatter {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String format(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.CoinValue coinValue, boolean explicitSign, boolean realNumber);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String format(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.CurrencyValue currencyValue, boolean showNegativeSign, boolean trimmable, boolean canUseLessSymbol, boolean shorten);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String formatForTransactions(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.CoinValue coinValue);
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.text.SpannableString formatForTransactions(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.CurrencyValue currencyValue, boolean isIncoming);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String format(double value, boolean showSign, int precision);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}
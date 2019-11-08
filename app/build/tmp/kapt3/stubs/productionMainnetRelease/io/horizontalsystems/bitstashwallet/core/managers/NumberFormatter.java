package io.horizontalsystems.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J2\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0012H\u0016J \u0010\u000e\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0012H\u0016J\u0012\u0010\"\u001a\u0004\u0018\u00010\r2\u0006\u0010#\u001a\u00020$H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/managers/NumberFormatter;", "Lio/horizontalsystems/bitstashwallet/core/IAppNumberFormatter;", "languageManager", "Lio/horizontalsystems/bitstashwallet/core/ILanguageManager;", "(Lio/horizontalsystems/bitstashwallet/core/ILanguageManager;)V", "COIN_BIG_NUMBER_EDGE", "Ljava/math/BigDecimal;", "FIAT_BIG_NUMBER_EDGE", "FIAT_SMALL_NUMBER_EDGE", "FIAT_TEN_CENT_EDGE", "formatters", "", "", "Ljava/text/NumberFormat;", "format", "coinValue", "Lio/horizontalsystems/bitstashwallet/entities/CoinValue;", "explicitSign", "", "realNumber", "currencyValue", "Lio/horizontalsystems/bitstashwallet/entities/CurrencyValue;", "showNegativeSign", "trimmable", "canUseLessSymbol", "shorten", "value", "", "showSign", "precision", "", "formatForTransactions", "Landroid/text/SpannableString;", "isIncoming", "getFormatter", "locale", "Ljava/util/Locale;", "app_productionMainnetRelease"})
public final class NumberFormatter implements io.horizontalsystems.bitstashwallet.core.IAppNumberFormatter {
    private final java.math.BigDecimal COIN_BIG_NUMBER_EDGE = null;
    private final java.math.BigDecimal FIAT_BIG_NUMBER_EDGE = null;
    private final java.math.BigDecimal FIAT_SMALL_NUMBER_EDGE = null;
    private final java.math.BigDecimal FIAT_TEN_CENT_EDGE = null;
    private java.util.Map<java.lang.String, java.text.NumberFormat> formatters;
    private final io.horizontalsystems.bitstashwallet.core.ILanguageManager languageManager = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String format(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.CoinValue coinValue, boolean explicitSign, boolean realNumber) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String formatForTransactions(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.CoinValue coinValue) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String format(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.CurrencyValue currencyValue, boolean showNegativeSign, boolean trimmable, boolean canUseLessSymbol, boolean shorten) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.text.SpannableString formatForTransactions(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.CurrencyValue currencyValue, boolean isIncoming) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String format(double value, boolean showSign, int precision) {
        return null;
    }
    
    private final java.text.NumberFormat getFormatter(java.util.Locale locale) {
        return null;
    }
    
    public NumberFormatter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.ILanguageManager languageManager) {
        super();
    }
}
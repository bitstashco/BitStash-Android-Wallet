package io.horizontalsystems.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0016\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\nH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/managers/FeeRateProvider;", "Lio/horizontalsystems/feeratekit/FeeRateKit$Listener;", "context", "Landroid/content/Context;", "appConfig", "Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;", "(Landroid/content/Context;Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;)V", "feeRateKit", "Lio/horizontalsystems/feeratekit/FeeRateKit;", "bitcoinCashFeeRates", "", "Lio/horizontalsystems/bitstashwallet/entities/FeeRateInfo;", "bitcoinFeeRates", "dashFeeRates", "ethereumFeeRates", "feeRates", "feeRate", "Lio/horizontalsystems/feeratekit/FeeRate;", "onRefresh", "", "rates", "app_productionMainnetRelease"})
public final class FeeRateProvider implements io.horizontalsystems.feeratekit.FeeRateKit.Listener {
    private final io.horizontalsystems.feeratekit.FeeRateKit feeRateKit = null;
    
    @java.lang.Override()
    public void onRefresh(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.feeratekit.FeeRate> rates) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bitstashwallet.entities.FeeRateInfo> bitcoinFeeRates() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bitstashwallet.entities.FeeRateInfo> bitcoinCashFeeRates() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bitstashwallet.entities.FeeRateInfo> ethereumFeeRates() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.horizontalsystems.bitstashwallet.entities.FeeRateInfo> dashFeeRates() {
        return null;
    }
    
    private final java.util.List<io.horizontalsystems.bitstashwallet.entities.FeeRateInfo> feeRates(io.horizontalsystems.feeratekit.FeeRate feeRate) {
        return null;
    }
    
    public FeeRateProvider(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IAppConfigProvider appConfig) {
        super();
    }
}
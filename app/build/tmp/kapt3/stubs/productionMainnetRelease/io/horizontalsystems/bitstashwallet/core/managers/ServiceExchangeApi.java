package io.horizontalsystems.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/managers/ServiceExchangeApi;", "", "()V", "HostType", "IExchangeRate", "app_productionMainnetRelease"})
public final class ServiceExchangeApi {
    public static final io.horizontalsystems.bitstashwallet.core.managers.ServiceExchangeApi INSTANCE = null;
    
    private ServiceExchangeApi() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/managers/ServiceExchangeApi$HostType;", "", "(Ljava/lang/String;I)V", "MAIN", "FALLBACK", "app_productionMainnetRelease"})
    public static enum HostType {
        /*public static final*/ MAIN /* = new MAIN() */,
        /*public static final*/ FALLBACK /* = new FALLBACK() */;
        
        HostType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006H\'J8\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000b0\u00032\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006H\'J\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H\'\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/managers/ServiceExchangeApi$IExchangeRate;", "", "getLatestRate", "Lio/reactivex/Single;", "Lio/horizontalsystems/bitstashwallet/entities/LatestRateData;", "currency", "", "getRateByDay", "coinCode", "datePath", "getRateByHour", "", "getRateStats", "Lio/horizontalsystems/bitstashwallet/entities/RateStatData;", "app_productionMainnetRelease"})
    public static abstract interface IExchangeRate {
        
        @org.jetbrains.annotations.NotNull()
        @retrofit2.http.GET(value = "xrates/historical/{coin}/{fiat}/{datePath}/index.json")
        public abstract io.reactivex.Single<java.lang.String> getRateByDay(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Path(value = "coin")
        java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
        @retrofit2.http.Path(value = "fiat")
        java.lang.String currency, @org.jetbrains.annotations.NotNull()
        @retrofit2.http.Path(value = "datePath")
        java.lang.String datePath);
        
        @org.jetbrains.annotations.NotNull()
        @retrofit2.http.GET(value = "xrates/historical/{coin}/{fiat}/{datePath}/index.json")
        public abstract io.reactivex.Single<java.util.Map<java.lang.String, java.lang.String>> getRateByHour(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Path(value = "coin")
        java.lang.String coinCode, @org.jetbrains.annotations.NotNull()
        @retrofit2.http.Path(value = "fiat")
        java.lang.String currency, @org.jetbrains.annotations.NotNull()
        @retrofit2.http.Path(value = "datePath")
        java.lang.String datePath);
        
        @org.jetbrains.annotations.NotNull()
        @retrofit2.http.GET(value = "xrates/latest/{fiat}/index.json")
        public abstract io.reactivex.Single<io.horizontalsystems.bitstashwallet.entities.LatestRateData> getLatestRate(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Path(value = "fiat")
        java.lang.String currency);
        
        @org.jetbrains.annotations.NotNull()
        @retrofit2.http.GET(value = "xrates/stats/{fiat}/{coin}/index.json")
        public abstract io.reactivex.Single<io.horizontalsystems.bitstashwallet.entities.RateStatData> getRateStats(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Path(value = "fiat")
        java.lang.String currency, @org.jetbrains.annotations.NotNull()
        @retrofit2.http.Path(value = "coin")
        java.lang.String coinCode);
    }
}
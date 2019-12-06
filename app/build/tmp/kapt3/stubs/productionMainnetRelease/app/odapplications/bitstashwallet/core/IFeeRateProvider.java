package app.odapplications.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lapp/odapplications/bitstashwallet/core/IFeeRateProvider;", "", "feeRates", "", "Lapp/odapplications/bitstashwallet/entities/FeeRateInfo;", "app_productionMainnetRelease"})
public abstract interface IFeeRateProvider {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<app.odapplications.bitstashwallet.entities.FeeRateInfo> feeRates();
}
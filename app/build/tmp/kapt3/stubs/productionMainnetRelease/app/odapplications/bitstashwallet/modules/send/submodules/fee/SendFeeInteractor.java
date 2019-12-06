package app.odapplications.bitstashwallet.modules.send.submodules.fee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeeInteractor;", "Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IInteractor;", "rateStorage", "Lapp/odapplications/bitstashwallet/core/IRateStorage;", "feeRateProvider", "Lapp/odapplications/bitstashwallet/core/IFeeRateProvider;", "currencyManager", "Lapp/odapplications/bitstashwallet/core/ICurrencyManager;", "(Lapp/odapplications/bitstashwallet/core/IRateStorage;Lapp/odapplications/bitstashwallet/core/IFeeRateProvider;Lapp/odapplications/bitstashwallet/core/ICurrencyManager;)V", "delegate", "Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IInteractorDelegate;", "getDelegate", "()Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IInteractorDelegate;", "setDelegate", "(Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IInteractorDelegate;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "clear", "", "getFeeRates", "", "Lapp/odapplications/bitstashwallet/entities/FeeRateInfo;", "getRate", "coinCode", "", "app_productionMainnetRelease"})
public final class SendFeeInteractor implements app.odapplications.bitstashwallet.modules.send.submodules.fee.SendFeeModule.IInteractor {
    private io.reactivex.disposables.Disposable disposable;
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.send.submodules.fee.SendFeeModule.IInteractorDelegate delegate;
    private final app.odapplications.bitstashwallet.core.IRateStorage rateStorage = null;
    private final app.odapplications.bitstashwallet.core.IFeeRateProvider feeRateProvider = null;
    private final app.odapplications.bitstashwallet.core.ICurrencyManager currencyManager = null;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.send.submodules.fee.SendFeeModule.IInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.send.submodules.fee.SendFeeModule.IInteractorDelegate p0) {
    }
    
    @java.lang.Override()
    public void getRate(@org.jetbrains.annotations.NotNull()
    java.lang.String coinCode) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.util.List<app.odapplications.bitstashwallet.entities.FeeRateInfo> getFeeRates() {
        return null;
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    public SendFeeInteractor(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IRateStorage rateStorage, @org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.core.IFeeRateProvider feeRateProvider, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.ICurrencyManager currencyManager) {
        super();
    }
}
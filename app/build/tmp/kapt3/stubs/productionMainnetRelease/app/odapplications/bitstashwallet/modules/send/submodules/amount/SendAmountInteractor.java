package app.odapplications.bitstashwallet.modules.send.submodules.amount;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountInteractor;", "Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IInteractor;", "baseCurrency", "Lapp/odapplications/bitstashwallet/entities/Currency;", "rateStorage", "Lapp/odapplications/bitstashwallet/core/IRateStorage;", "localStorage", "Lapp/odapplications/bitstashwallet/core/ILocalStorage;", "coin", "Lapp/odapplications/bitstashwallet/entities/Coin;", "(Lapp/odapplications/bitstashwallet/entities/Currency;Lapp/odapplications/bitstashwallet/core/IRateStorage;Lapp/odapplications/bitstashwallet/core/ILocalStorage;Lapp/odapplications/bitstashwallet/entities/Coin;)V", "value", "Lapp/odapplications/bitstashwallet/modules/send/SendModule$InputType;", "defaultInputType", "getDefaultInputType", "()Lapp/odapplications/bitstashwallet/modules/send/SendModule$InputType;", "setDefaultInputType", "(Lapp/odapplications/bitstashwallet/modules/send/SendModule$InputType;)V", "delegate", "Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IInteractorDelegate;", "getDelegate", "()Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IInteractorDelegate;", "setDelegate", "(Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IInteractorDelegate;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "exchangeRate", "Lapp/odapplications/bitstashwallet/entities/Rate;", "retrieveRate", "", "app_productionMainnetRelease"})
public final class SendAmountInteractor implements app.odapplications.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IInteractor {
    private app.odapplications.bitstashwallet.entities.Rate exchangeRate;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IInteractorDelegate delegate;
    private final app.odapplications.bitstashwallet.entities.Currency baseCurrency = null;
    private final app.odapplications.bitstashwallet.core.IRateStorage rateStorage = null;
    private final app.odapplications.bitstashwallet.core.ILocalStorage localStorage = null;
    private final app.odapplications.bitstashwallet.entities.Coin coin = null;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IInteractorDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.modules.send.SendModule.InputType getDefaultInputType() {
        return null;
    }
    
    @java.lang.Override()
    public void setDefaultInputType(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.send.SendModule.InputType value) {
    }
    
    @java.lang.Override()
    public void retrieveRate() {
    }
    
    public SendAmountInteractor(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Currency baseCurrency, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IRateStorage rateStorage, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.ILocalStorage localStorage, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Coin coin) {
        super();
    }
}
package io.horizontalsystems.bitstashwallet.modules.send.submodules.amount;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/submodules/amount/SendAmountInteractor;", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IInteractor;", "baseCurrency", "Lio/horizontalsystems/bitstashwallet/entities/Currency;", "rateStorage", "Lio/horizontalsystems/bitstashwallet/core/IRateStorage;", "localStorage", "Lio/horizontalsystems/bitstashwallet/core/ILocalStorage;", "coin", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "(Lio/horizontalsystems/bitstashwallet/entities/Currency;Lio/horizontalsystems/bitstashwallet/core/IRateStorage;Lio/horizontalsystems/bitstashwallet/core/ILocalStorage;Lio/horizontalsystems/bitstashwallet/entities/Coin;)V", "value", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$InputType;", "defaultInputType", "getDefaultInputType", "()Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$InputType;", "setDefaultInputType", "(Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$InputType;)V", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IInteractorDelegate;", "getDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IInteractorDelegate;", "setDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IInteractorDelegate;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "exchangeRate", "Lio/horizontalsystems/bitstashwallet/entities/Rate;", "retrieveRate", "", "app_devMainnetMasterDebug"})
public final class SendAmountInteractor implements io.horizontalsystems.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IInteractor {
    private io.horizontalsystems.bitstashwallet.entities.Rate exchangeRate;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IInteractorDelegate delegate;
    private final io.horizontalsystems.bitstashwallet.entities.Currency baseCurrency = null;
    private final io.horizontalsystems.bitstashwallet.core.IRateStorage rateStorage = null;
    private final io.horizontalsystems.bitstashwallet.core.ILocalStorage localStorage = null;
    private final io.horizontalsystems.bitstashwallet.entities.Coin coin = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IInteractorDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.modules.send.SendModule.InputType getDefaultInputType() {
        return null;
    }
    
    @java.lang.Override()
    public void setDefaultInputType(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.send.SendModule.InputType value) {
    }
    
    @java.lang.Override()
    public void retrieveRate() {
    }
    
    public SendAmountInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Currency baseCurrency, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IRateStorage rateStorage, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.ILocalStorage localStorage, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Coin coin) {
        super();
    }
}
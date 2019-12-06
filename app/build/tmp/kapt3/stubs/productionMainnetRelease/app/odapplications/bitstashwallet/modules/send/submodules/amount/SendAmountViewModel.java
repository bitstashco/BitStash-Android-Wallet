package app.odapplications.bitstashwallet.modules.send.submodules.amount;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0006H\u0016J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(J\b\u0010\u001d\u001a\u00020\u0006H\u0016J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u000bH\u0016J\u0010\u0010)\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u000bH\u0016J\u0012\u0010*\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010,\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010-\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u001bH\u0016J\u0010\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u001bH\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\rR\u0019\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\bR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\bR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\r\u00a8\u00062"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountViewModel;", "Landroidx/lifecycle/ViewModel;", "Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IView;", "()V", "addTextChangeListener", "Lapp/odapplications/bitstashwallet/SingleLiveEvent;", "", "getAddTextChangeListener", "()Lapp/odapplications/bitstashwallet/SingleLiveEvent;", "amount", "Landroidx/lifecycle/MutableLiveData;", "", "getAmount", "()Landroidx/lifecycle/MutableLiveData;", "amountInputPrefix", "getAmountInputPrefix", "delegate", "Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IViewDelegate;", "getDelegate", "()Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IViewDelegate;", "setDelegate", "(Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IViewDelegate;)V", "hint", "getHint", "hintErrorBalance", "getHintErrorBalance", "maxButtonVisibleValue", "", "getMaxButtonVisibleValue", "removeTextChangeListener", "getRemoveTextChangeListener", "revertAmount", "getRevertAmount", "switchButtonEnabled", "getSwitchButtonEnabled", "init", "Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountPresenter;", "wallet", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "moduleDelegate", "Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IAmountModuleDelegate;", "setAmount", "setAmountType", "prefix", "setHint", "setHintErrorBalance", "setMaxButtonVisible", "visible", "setSwitchButtonEnabled", "enabled", "app_productionMainnetRelease"})
public final class SendAmountViewModel extends androidx.lifecycle.ViewModel implements app.odapplications.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IView {
    @org.jetbrains.annotations.NotNull()
    public app.odapplications.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IViewDelegate delegate;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> amountInputPrefix = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> amount = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> hint = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> maxButtonVisibleValue = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<kotlin.Unit> addTextChangeListener = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<kotlin.Unit> removeTextChangeListener = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.String> revertAmount = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> hintErrorBalance = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> switchButtonEnabled = null;
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IViewDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IViewDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAmountInputPrefix() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getHint() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getMaxButtonVisibleValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<kotlin.Unit> getAddTextChangeListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<kotlin.Unit> getRemoveTextChangeListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.String> getRevertAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getHintErrorBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSwitchButtonEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.modules.send.submodules.amount.SendAmountPresenter init(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Wallet wallet, @org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IAmountModuleDelegate moduleDelegate) {
        return null;
    }
    
    @java.lang.Override()
    public void setAmountType(@org.jetbrains.annotations.Nullable()
    java.lang.String prefix) {
    }
    
    @java.lang.Override()
    public void setAmount(@org.jetbrains.annotations.NotNull()
    java.lang.String amount) {
    }
    
    @java.lang.Override()
    public void setHint(@org.jetbrains.annotations.Nullable()
    java.lang.String hint) {
    }
    
    @java.lang.Override()
    public void setMaxButtonVisible(boolean visible) {
    }
    
    @java.lang.Override()
    public void addTextChangeListener() {
    }
    
    @java.lang.Override()
    public void removeTextChangeListener() {
    }
    
    @java.lang.Override()
    public void revertAmount(@org.jetbrains.annotations.NotNull()
    java.lang.String amount) {
    }
    
    @java.lang.Override()
    public void setHintErrorBalance(@org.jetbrains.annotations.Nullable()
    java.lang.String hintErrorBalance) {
    }
    
    @java.lang.Override()
    public void setSwitchButtonEnabled(boolean enabled) {
    }
    
    public SendAmountViewModel() {
        super();
    }
}
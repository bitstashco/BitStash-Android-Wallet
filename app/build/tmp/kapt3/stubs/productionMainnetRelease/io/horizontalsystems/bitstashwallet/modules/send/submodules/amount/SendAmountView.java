package io.horizontalsystems.bitstashwallet.modules.send.submodules.amount;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fB\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0012\u0010\u001e\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u001cH\u0002J\u0012\u0010 \u001a\u00020\u00152\b\u0010!\u001a\u0004\u0018\u00010\u001cH\u0002J\u0010\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0018H\u0002J\u0012\u0010$\u001a\u00020\u00152\b\u0010%\u001a\u0004\u0018\u00010\u001cH\u0002R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/submodules/amount/SendAmountView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "sendAmountViewModel", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/amount/SendAmountViewModel;", "(Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;Lio/horizontalsystems/bitstashwallet/modules/send/submodules/amount/SendAmountViewModel;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IViewDelegate;", "textChangeListener", "Landroid/text/TextWatcher;", "enableAmountChangeListener", "", "enableCurrencySwitch", "enabled", "", "removeAmountChangeListener", "revertAmount", "amount", "", "setAmount", "setBalanceError", "balanceError", "setHint", "hint", "setMaxButtonVisibility", "visible", "setPrefix", "prefix", "app_productionMainnetRelease"})
public final class SendAmountView extends androidx.constraintlayout.widget.ConstraintLayout {
    private io.horizontalsystems.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IViewDelegate delegate;
    private final android.text.TextWatcher textChangeListener = null;
    private java.util.HashMap _$_findViewCache;
    
    private final void setPrefix(java.lang.String prefix) {
    }
    
    private final void setAmount(java.lang.String amount) {
    }
    
    private final void setHint(java.lang.String hint) {
    }
    
    private final void setMaxButtonVisibility(boolean visible) {
    }
    
    private final void enableAmountChangeListener() {
    }
    
    private final void removeAmountChangeListener() {
    }
    
    private final void revertAmount(java.lang.String amount) {
    }
    
    private final void setBalanceError(java.lang.String balanceError) {
    }
    
    private final void enableCurrencySwitch(boolean enabled) {
    }
    
    public SendAmountView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public SendAmountView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.send.submodules.amount.SendAmountViewModel sendAmountViewModel) {
        super(null);
    }
    
    public SendAmountView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public SendAmountView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
}
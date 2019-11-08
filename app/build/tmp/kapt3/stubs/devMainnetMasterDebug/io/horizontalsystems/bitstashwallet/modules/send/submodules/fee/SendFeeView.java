package io.horizontalsystems.bitstashwallet.modules.send.submodules.fee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bB\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bB/\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/submodules/fee/SendFeeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/fee/FeeRatePrioritySelector$Listener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "sendFeeViewModel", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/fee/SendFeeViewModel;", "feeIsAdjustable", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;Lio/horizontalsystems/bitstashwallet/modules/send/submodules/fee/SendFeeViewModel;ZLandroidx/fragment/app/FragmentManager;)V", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IViewDelegate;", "onSelectFeeRate", "", "feeRate", "Lio/horizontalsystems/bitstashwallet/entities/FeeRateInfo;", "app_devMainnetMasterDebug"})
public final class SendFeeView extends androidx.constraintlayout.widget.ConstraintLayout implements io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.FeeRatePrioritySelector.Listener {
    private io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.SendFeeModule.IViewDelegate delegate;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onSelectFeeRate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.FeeRateInfo feeRate) {
    }
    
    public SendFeeView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public SendFeeView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public SendFeeView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public SendFeeView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.SendFeeViewModel sendFeeViewModel, boolean feeIsAdjustable, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager) {
        super(null);
    }
}
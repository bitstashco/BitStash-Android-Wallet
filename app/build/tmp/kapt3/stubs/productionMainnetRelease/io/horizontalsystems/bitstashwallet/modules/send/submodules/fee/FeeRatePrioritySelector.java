package io.horizontalsystems.bitstashwallet.modules.send.submodules.fee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0002\u001a\u001bB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\nH\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/submodules/fee/FeeRatePrioritySelector;", "Landroidx/fragment/app/DialogFragment;", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/fee/FeeRatesAdapter$Listener;", "()V", "feeRates", "", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/fee/SendFeeModule$FeeRateInfoViewItem;", "listener", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/fee/FeeRatePrioritySelector$Listener;", "hideKeyBoard", "", "onClick", "feeRate", "Lio/horizontalsystems/bitstashwallet/entities/FeeRateInfo;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "showKeyBoard", "Companion", "Listener", "app_productionMainnetRelease"})
public final class FeeRatePrioritySelector extends androidx.fragment.app.DialogFragment implements io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.FeeRatesAdapter.Listener {
    private io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.FeeRatePrioritySelector.Listener listener;
    private java.util.List<io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.SendFeeModule.FeeRateInfoViewItem> feeRates;
    public static final io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.FeeRatePrioritySelector.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDismiss(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialog) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.FeeRateInfo feeRate) {
    }
    
    private final void showKeyBoard() {
    }
    
    private final void hideKeyBoard() {
    }
    
    public FeeRatePrioritySelector() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/submodules/fee/FeeRatePrioritySelector$Listener;", "", "onSelectFeeRate", "", "feeRate", "Lio/horizontalsystems/bitstashwallet/entities/FeeRateInfo;", "app_productionMainnetRelease"})
    public static abstract interface Listener {
        
        public abstract void onSelectFeeRate(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.entities.FeeRateInfo feeRate);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a8\u0006\n"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/submodules/fee/FeeRatePrioritySelector$Companion;", "", "()V", "newInstance", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/fee/FeeRatePrioritySelector;", "listener", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/fee/FeeRatePrioritySelector$Listener;", "feeRates", "", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/fee/SendFeeModule$FeeRateInfoViewItem;", "app_productionMainnetRelease"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.FeeRatePrioritySelector newInstance(@org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.FeeRatePrioritySelector.Listener listener, @org.jetbrains.annotations.NotNull()
        java.util.List<io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.SendFeeModule.FeeRateInfoViewItem> feeRates) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
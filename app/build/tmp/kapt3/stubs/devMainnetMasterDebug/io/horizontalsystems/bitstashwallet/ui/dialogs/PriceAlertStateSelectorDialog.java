package io.horizontalsystems.bitstashwallet.ui.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lio/horizontalsystems/bitstashwallet/ui/dialogs/PriceAlertStateSelectorDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "items", "", "Lio/horizontalsystems/bitstashwallet/entities/PriceAlert$State;", "listener", "Lio/horizontalsystems/bitstashwallet/ui/dialogs/PriceAlertStateSelectorDialog$Listener;", "selectedState", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "Listener", "app_devMainnetMasterDebug"})
public final class PriceAlertStateSelectorDialog extends androidx.fragment.app.DialogFragment {
    private io.horizontalsystems.bitstashwallet.ui.dialogs.PriceAlertStateSelectorDialog.Listener listener;
    private java.util.List<? extends io.horizontalsystems.bitstashwallet.entities.PriceAlert.State> items;
    private io.horizontalsystems.bitstashwallet.entities.PriceAlert.State selectedState;
    public static final io.horizontalsystems.bitstashwallet.ui.dialogs.PriceAlertStateSelectorDialog.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public PriceAlertStateSelectorDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bitstashwallet/ui/dialogs/PriceAlertStateSelectorDialog$Listener;", "", "onSelect", "", "position", "", "app_devMainnetMasterDebug"})
    public static abstract interface Listener {
        
        public abstract void onSelect(int position);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\t\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/ui/dialogs/PriceAlertStateSelectorDialog$Companion;", "", "()V", "newInstance", "Lio/horizontalsystems/bitstashwallet/ui/dialogs/PriceAlertStateSelectorDialog;", "listener", "Lio/horizontalsystems/bitstashwallet/ui/dialogs/PriceAlertStateSelectorDialog$Listener;", "items", "", "Lio/horizontalsystems/bitstashwallet/entities/PriceAlert$State;", "selectedState", "app_devMainnetMasterDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.ui.dialogs.PriceAlertStateSelectorDialog newInstance(@org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bitstashwallet.ui.dialogs.PriceAlertStateSelectorDialog.Listener listener, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends io.horizontalsystems.bitstashwallet.entities.PriceAlert.State> items, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.entities.PriceAlert.State selectedState) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
package io.horizontalsystems.bitstashwallet.modules.receive;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001cB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u001b\u001a\u00020\u0016H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/receive/ReceiveView;", "Lio/horizontalsystems/bitstashwallet/ui/extensions/ConstraintLayoutWithHeader;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "listener", "Lio/horizontalsystems/bitstashwallet/modules/receive/ReceiveView$Listener;", "setHintTextObserver", "Landroidx/lifecycle/Observer;", "shareAddressObserver", "", "showAddressObserver", "Lio/horizontalsystems/bitstashwallet/modules/receive/viewitems/AddressItem;", "showCopiedObserver", "", "showErrorObserver", "viewModel", "Lio/horizontalsystems/bitstashwallet/modules/receive/ReceiveViewModel;", "bind", "setObservers", "Listener", "app_productionMainnetRelease"})
public final class ReceiveView extends io.horizontalsystems.bitstashwallet.ui.extensions.ConstraintLayoutWithHeader {
    private io.horizontalsystems.bitstashwallet.modules.receive.ReceiveViewModel viewModel;
    private androidx.lifecycle.LifecycleOwner lifecycleOwner;
    private io.horizontalsystems.bitstashwallet.modules.receive.ReceiveView.Listener listener;
    private final androidx.lifecycle.Observer<io.horizontalsystems.bitstashwallet.modules.receive.viewitems.AddressItem> showAddressObserver = null;
    private final androidx.lifecycle.Observer<java.lang.Integer> showErrorObserver = null;
    private final androidx.lifecycle.Observer<kotlin.Unit> showCopiedObserver = null;
    private final androidx.lifecycle.Observer<java.lang.Integer> setHintTextObserver = null;
    private final androidx.lifecycle.Observer<java.lang.String> shareAddressObserver = null;
    private java.util.HashMap _$_findViewCache;
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.receive.ReceiveViewModel viewModel, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.receive.ReceiveView.Listener listener) {
    }
    
    private final void setObservers() {
    }
    
    public ReceiveView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public ReceiveView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public ReceiveView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/receive/ReceiveView$Listener;", "", "closeReceiveDialog", "", "expandReceiveDialog", "shareReceiveAddress", "address", "", "app_productionMainnetRelease"})
    public static abstract interface Listener {
        
        public abstract void closeReceiveDialog();
        
        public abstract void shareReceiveAddress(@org.jetbrains.annotations.NotNull()
        java.lang.String address);
        
        public abstract void expandReceiveDialog();
    }
}
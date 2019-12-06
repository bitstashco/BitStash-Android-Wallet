package app.odapplications.bitstashwallet.modules.pin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J&\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010\'\u001a\u00020(H\u0016J\u001a\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lapp/odapplications/bitstashwallet/modules/pin/PinFragment;", "Landroidx/fragment/app/Fragment;", "Lapp/odapplications/bitstashwallet/ui/extensions/NumPadItemsAdapter$Listener;", "()V", "executor", "Ljava/util/concurrent/Executor;", "interactionType", "Lapp/odapplications/bitstashwallet/modules/pin/PinInteractionType;", "getInteractionType", "()Lapp/odapplications/bitstashwallet/modules/pin/PinInteractionType;", "interactionType$delegate", "Lkotlin/Lazy;", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "numpadAdapter", "Lapp/odapplications/bitstashwallet/ui/extensions/NumPadItemsAdapter;", "pinPagesAdapter", "Lapp/odapplications/bitstashwallet/modules/pin/PinPagesAdapter;", "pinView", "Lapp/odapplications/bitstashwallet/modules/pin/PinView;", "showCancelButton", "", "getShowCancelButton", "()Z", "showCancelButton$delegate", "viewDelegate", "Lapp/odapplications/bitstashwallet/modules/pin/PinModule$IViewDelegate;", "dismissWithSuccess", "", "observeData", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "item", "Lapp/odapplications/bitstashwallet/ui/extensions/NumPadItem;", "onViewCreated", "view", "showFingerprintDialog", "cryptoObject", "Landroidx/biometric/BiometricPrompt$CryptoObject;", "app_productionMainnetRelease"})
public final class PinFragment extends androidx.fragment.app.Fragment implements app.odapplications.bitstashwallet.ui.extensions.NumPadItemsAdapter.Listener {
    private final kotlin.Lazy interactionType$delegate = null;
    private final kotlin.Lazy showCancelButton$delegate = null;
    private app.odapplications.bitstashwallet.modules.pin.PinView pinView;
    private app.odapplications.bitstashwallet.modules.pin.PinModule.IViewDelegate viewDelegate;
    private androidx.recyclerview.widget.LinearLayoutManager layoutManager;
    private app.odapplications.bitstashwallet.modules.pin.PinPagesAdapter pinPagesAdapter;
    private app.odapplications.bitstashwallet.ui.extensions.NumPadItemsAdapter numpadAdapter;
    private final java.util.concurrent.Executor executor = null;
    private java.util.HashMap _$_findViewCache;
    
    private final app.odapplications.bitstashwallet.modules.pin.PinInteractionType getInteractionType() {
        return null;
    }
    
    private final boolean getShowCancelButton() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void dismissWithSuccess() {
    }
    
    private final void observeData() {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.ui.extensions.NumPadItem item) {
    }
    
    private final void showFingerprintDialog(androidx.biometric.BiometricPrompt.CryptoObject cryptoObject) {
    }
    
    public PinFragment() {
        super();
    }
}
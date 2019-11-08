package io.horizontalsystems.bitstashwallet.ui.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0002#$B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0018\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lio/horizontalsystems/bitstashwallet/ui/dialogs/ManageKeysDeleteAlert;", "Landroidx/fragment/app/DialogFragment;", "Lio/horizontalsystems/bitstashwallet/ui/dialogs/ConfirmationsAdapter$Listener;", "listener", "Lio/horizontalsystems/bitstashwallet/ui/dialogs/ManageKeysDeleteAlert$Listener;", "checkboxItems", "", "Lio/horizontalsystems/bitstashwallet/ui/dialogs/CheckBoxItem;", "subtitle", "", "(Lio/horizontalsystems/bitstashwallet/ui/dialogs/ManageKeysDeleteAlert$Listener;Ljava/util/List;Ljava/lang/String;)V", "adapter", "Lio/horizontalsystems/bitstashwallet/ui/dialogs/ConfirmationsAdapter;", "btnConfirm", "Landroid/widget/Button;", "closeBtn", "Landroid/widget/ImageView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "rootView", "Landroid/view/View;", "subtitleView", "Landroid/widget/TextView;", "checkConfirmations", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onItemCheckMarkClick", "position", "", "checked", "", "Companion", "Listener", "app_productionMainnetRelease"})
public final class ManageKeysDeleteAlert extends androidx.fragment.app.DialogFragment implements io.horizontalsystems.bitstashwallet.ui.dialogs.ConfirmationsAdapter.Listener {
    private io.horizontalsystems.bitstashwallet.ui.dialogs.ConfirmationsAdapter adapter;
    private android.widget.Button btnConfirm;
    private android.view.View rootView;
    private android.widget.ImageView closeBtn;
    private android.widget.TextView subtitleView;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private final io.horizontalsystems.bitstashwallet.ui.dialogs.ManageKeysDeleteAlert.Listener listener = null;
    private final java.util.List<io.horizontalsystems.bitstashwallet.ui.dialogs.CheckBoxItem> checkboxItems = null;
    private final java.lang.String subtitle = null;
    public static final io.horizontalsystems.bitstashwallet.ui.dialogs.ManageKeysDeleteAlert.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onItemCheckMarkClick(int position, boolean checked) {
    }
    
    private final void checkConfirmations() {
    }
    
    public ManageKeysDeleteAlert(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.ui.dialogs.ManageKeysDeleteAlert.Listener listener, @org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.ui.dialogs.CheckBoxItem> checkboxItems, @org.jetbrains.annotations.NotNull()
    java.lang.String subtitle) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lio/horizontalsystems/bitstashwallet/ui/dialogs/ManageKeysDeleteAlert$Listener;", "", "onConfirmationSuccess", "", "app_productionMainnetRelease"})
    public static abstract interface Listener {
        
        public abstract void onConfirmationSuccess();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000b\u001a\u00020\f\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bitstashwallet/ui/dialogs/ManageKeysDeleteAlert$Companion;", "", "()V", "show", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "subtitle", "", "checkboxItems", "", "listener", "Lio/horizontalsystems/bitstashwallet/ui/dialogs/ManageKeysDeleteAlert$Listener;", "app_productionMainnetRelease"})
    public static final class Companion {
        
        public final void show(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
        java.lang.String subtitle, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> checkboxItems, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.ui.dialogs.ManageKeysDeleteAlert.Listener listener) {
        }
        
        private Companion() {
            super();
        }
    }
}
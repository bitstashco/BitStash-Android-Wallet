package io.horizontalsystems.bitstashwallet.ui.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\r\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bitstashwallet/ui/dialogs/AlertDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "title", "", "description", "descriptionString", "", "buttonText", "canCancel", "", "listener", "Lio/horizontalsystems/bitstashwallet/ui/dialogs/AlertDialogFragment$Listener;", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;IZLio/horizontalsystems/bitstashwallet/ui/dialogs/AlertDialogFragment$Listener;)V", "Ljava/lang/Integer;", "onCreateDialog", "Landroid/app/Dialog;", "bundle", "Landroid/os/Bundle;", "Companion", "Listener", "app_devMainnetMasterDebug"})
public final class AlertDialogFragment extends androidx.fragment.app.DialogFragment {
    private java.lang.Integer title;
    private java.lang.Integer description;
    private java.lang.String descriptionString;
    private int buttonText;
    private boolean canCancel;
    private io.horizontalsystems.bitstashwallet.ui.dialogs.AlertDialogFragment.Listener listener;
    public static final io.horizontalsystems.bitstashwallet.ui.dialogs.AlertDialogFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle bundle) {
        return null;
    }
    
    public AlertDialogFragment(@org.jetbrains.annotations.Nullable()
    java.lang.Integer title, @org.jetbrains.annotations.Nullable()
    java.lang.Integer description, @org.jetbrains.annotations.Nullable()
    java.lang.String descriptionString, int buttonText, boolean canCancel, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.ui.dialogs.AlertDialogFragment.Listener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lio/horizontalsystems/bitstashwallet/ui/dialogs/AlertDialogFragment$Listener;", "", "onButtonClick", "", "app_devMainnetMasterDebug"})
    public static abstract interface Listener {
        
        public abstract void onButtonClick();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J=\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ?\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bitstashwallet/ui/dialogs/AlertDialogFragment$Companion;", "", "()V", "newInstance", "Lio/horizontalsystems/bitstashwallet/ui/dialogs/AlertDialogFragment;", "title", "", "description", "buttonText", "cancelable", "", "listener", "Lio/horizontalsystems/bitstashwallet/ui/dialogs/AlertDialogFragment$Listener;", "(Ljava/lang/Integer;IIZLio/horizontalsystems/bitstashwallet/ui/dialogs/AlertDialogFragment$Listener;)Lio/horizontalsystems/bitstashwallet/ui/dialogs/AlertDialogFragment;", "descriptionString", "", "(Ljava/lang/Integer;Ljava/lang/String;IZLio/horizontalsystems/bitstashwallet/ui/dialogs/AlertDialogFragment$Listener;)Lio/horizontalsystems/bitstashwallet/ui/dialogs/AlertDialogFragment;", "app_devMainnetMasterDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.ui.dialogs.AlertDialogFragment newInstance(@org.jetbrains.annotations.Nullable()
        java.lang.Integer title, int description, int buttonText, boolean cancelable, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bitstashwallet.ui.dialogs.AlertDialogFragment.Listener listener) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.ui.dialogs.AlertDialogFragment newInstance(@org.jetbrains.annotations.Nullable()
        java.lang.Integer title, @org.jetbrains.annotations.Nullable()
        java.lang.String descriptionString, int buttonText, boolean cancelable, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bitstashwallet.ui.dialogs.AlertDialogFragment.Listener listener) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
package io.horizontalsystems.bitstashwallet.ui.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000e\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lio/horizontalsystems/bitstashwallet/ui/dialogs/BackupAlertDialog;", "Landroidx/fragment/app/DialogFragment;", "listener", "Lio/horizontalsystems/bitstashwallet/ui/dialogs/BackupAlertDialog$Listener;", "(Lio/horizontalsystems/bitstashwallet/ui/dialogs/BackupAlertDialog$Listener;)V", "coinName", "", "walletName", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "Companion", "Listener", "app_productionMainnetRelease"})
public final class BackupAlertDialog extends androidx.fragment.app.DialogFragment {
    private java.lang.String walletName;
    private java.lang.String coinName;
    private final io.horizontalsystems.bitstashwallet.ui.dialogs.BackupAlertDialog.Listener listener = null;
    private static final java.lang.String walletNameKey = "walletNameKey";
    private static final java.lang.String coinNameKey = "coinNameKey";
    public static final io.horizontalsystems.bitstashwallet.ui.dialogs.BackupAlertDialog.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public BackupAlertDialog(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.ui.dialogs.BackupAlertDialog.Listener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"}, d2 = {"Lio/horizontalsystems/bitstashwallet/ui/dialogs/BackupAlertDialog$Listener;", "", "onBackupButtonClick", "", "app_productionMainnetRelease"})
    public static abstract interface Listener {
        
        public abstract void onBackupButtonClick();
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
            
            public static void onBackupButtonClick(io.horizontalsystems.bitstashwallet.ui.dialogs.BackupAlertDialog.Listener $this) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bitstashwallet/ui/dialogs/BackupAlertDialog$Companion;", "", "()V", "coinNameKey", "", "walletNameKey", "show", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "walletName", "coinName", "listener", "Lio/horizontalsystems/bitstashwallet/ui/dialogs/BackupAlertDialog$Listener;", "app_productionMainnetRelease"})
    public static final class Companion {
        
        public final void show(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
        java.lang.String walletName, @org.jetbrains.annotations.NotNull()
        java.lang.String coinName, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.ui.dialogs.BackupAlertDialog.Listener listener) {
        }
        
        private Companion() {
            super();
        }
    }
}
package io.horizontalsystems.bitstashwallet.ui.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001f2\u00020\u0001:\u0003\u001f !B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lio/horizontalsystems/bitstashwallet/ui/dialogs/ManageKeysDialog;", "Landroidx/fragment/app/DialogFragment;", "listener", "Lio/horizontalsystems/bitstashwallet/ui/dialogs/ManageKeysDialog$Listener;", "title", "", "subtitle", "content", "action", "Lio/horizontalsystems/bitstashwallet/ui/dialogs/ManageKeysDialog$ManageAction;", "(Lio/horizontalsystems/bitstashwallet/ui/dialogs/ManageKeysDialog$Listener;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/horizontalsystems/bitstashwallet/ui/dialogs/ManageKeysDialog$ManageAction;)V", "addCoinIcon", "Lio/horizontalsystems/bitstashwallet/ui/extensions/CoinIconView;", "addKeyInfo", "Landroid/widget/TextView;", "addKeySubtitle", "addKeyTitle", "btnClose", "Landroid/widget/ImageView;", "btnGrey", "Landroid/widget/Button;", "btnYellow", "rootView", "Landroid/view/View;", "bindActions", "", "bindContent", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "Listener", "ManageAction", "app_devMainnetMasterDebug"})
public final class ManageKeysDialog extends androidx.fragment.app.DialogFragment {
    private android.view.View rootView;
    private android.widget.TextView addKeyTitle;
    private android.widget.TextView addKeySubtitle;
    private android.widget.TextView addKeyInfo;
    private io.horizontalsystems.bitstashwallet.ui.extensions.CoinIconView addCoinIcon;
    private android.widget.Button btnYellow;
    private android.widget.Button btnGrey;
    private android.widget.ImageView btnClose;
    private final io.horizontalsystems.bitstashwallet.ui.dialogs.ManageKeysDialog.Listener listener = null;
    private final java.lang.String title = null;
    private final java.lang.String subtitle = null;
    private final java.lang.String content = null;
    private final io.horizontalsystems.bitstashwallet.ui.dialogs.ManageKeysDialog.ManageAction action = null;
    public static final io.horizontalsystems.bitstashwallet.ui.dialogs.ManageKeysDialog.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void bindContent() {
    }
    
    private final void bindActions() {
    }
    
    public ManageKeysDialog(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.ui.dialogs.ManageKeysDialog.Listener listener, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String subtitle, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.ui.dialogs.ManageKeysDialog.ManageAction action) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bitstashwallet/ui/dialogs/ManageKeysDialog$Listener;", "", "onClickBackupKey", "", "onClickCreateKey", "app_devMainnetMasterDebug"})
    public static abstract interface Listener {
        
        public abstract void onClickCreateKey();
        
        public abstract void onClickBackupKey();
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
            
            public static void onClickCreateKey(io.horizontalsystems.bitstashwallet.ui.dialogs.ManageKeysDialog.Listener $this) {
            }
            
            public static void onClickBackupKey(io.horizontalsystems.bitstashwallet.ui.dialogs.ManageKeysDialog.Listener $this) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bitstashwallet/ui/dialogs/ManageKeysDialog$ManageAction;", "", "(Ljava/lang/String;I)V", "CREATE", "BACKUP", "app_devMainnetMasterDebug"})
    public static enum ManageAction {
        /*public static final*/ CREATE /* = new CREATE() */,
        /*public static final*/ BACKUP /* = new BACKUP() */;
        
        ManageAction() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\u00a8\u0006\u000f"}, d2 = {"Lio/horizontalsystems/bitstashwallet/ui/dialogs/ManageKeysDialog$Companion;", "", "()V", "show", "", "title", "", "subtitle", "content", "activity", "Landroidx/fragment/app/FragmentActivity;", "listener", "Lio/horizontalsystems/bitstashwallet/ui/dialogs/ManageKeysDialog$Listener;", "action", "Lio/horizontalsystems/bitstashwallet/ui/dialogs/ManageKeysDialog$ManageAction;", "app_devMainnetMasterDebug"})
    public static final class Companion {
        
        public final void show(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String subtitle, @org.jetbrains.annotations.NotNull()
        java.lang.String content, @org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.ui.dialogs.ManageKeysDialog.Listener listener, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.ui.dialogs.ManageKeysDialog.ManageAction action) {
        }
        
        private Companion() {
            super();
        }
    }
}
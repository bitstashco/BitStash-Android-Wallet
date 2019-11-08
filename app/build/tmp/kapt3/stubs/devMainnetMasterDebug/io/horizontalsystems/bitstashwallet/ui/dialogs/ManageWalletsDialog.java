package io.horizontalsystems.bitstashwallet.ui.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000  2\u00020\u0001:\u0002 !B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lio/horizontalsystems/bitstashwallet/ui/dialogs/ManageWalletsDialog;", "Landroidx/fragment/app/DialogFragment;", "listener", "Lio/horizontalsystems/bitstashwallet/ui/dialogs/ManageWalletsDialog$Listener;", "coin", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "predefinedAccountType", "Lio/horizontalsystems/bitstashwallet/core/IPredefinedAccountType;", "(Lio/horizontalsystems/bitstashwallet/ui/dialogs/ManageWalletsDialog$Listener;Lio/horizontalsystems/bitstashwallet/entities/Coin;Lio/horizontalsystems/bitstashwallet/core/IPredefinedAccountType;)V", "addCoinIcon", "Lio/horizontalsystems/bitstashwallet/ui/extensions/CoinIconView;", "addKeyInfo", "Landroid/widget/TextView;", "addKeySubtitle", "addKeyTitle", "btnClose", "Landroid/widget/ImageView;", "btnCreateKey", "Landroid/widget/Button;", "btnRestoreKey", "rootView", "Landroid/view/View;", "bindActions", "", "bindContent", "onCancel", "dialog", "Landroid/content/DialogInterface;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "Listener", "app_devMainnetMasterDebug"})
public final class ManageWalletsDialog extends androidx.fragment.app.DialogFragment {
    private android.view.View rootView;
    private android.widget.TextView addKeyTitle;
    private android.widget.TextView addKeySubtitle;
    private android.widget.TextView addKeyInfo;
    private io.horizontalsystems.bitstashwallet.ui.extensions.CoinIconView addCoinIcon;
    private android.widget.Button btnCreateKey;
    private android.widget.Button btnRestoreKey;
    private android.widget.ImageView btnClose;
    private final io.horizontalsystems.bitstashwallet.ui.dialogs.ManageWalletsDialog.Listener listener = null;
    private final io.horizontalsystems.bitstashwallet.entities.Coin coin = null;
    private final io.horizontalsystems.bitstashwallet.core.IPredefinedAccountType predefinedAccountType = null;
    public static final io.horizontalsystems.bitstashwallet.ui.dialogs.ManageWalletsDialog.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onCancel(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialog) {
    }
    
    private final void bindContent() {
    }
    
    private final void bindActions() {
    }
    
    public ManageWalletsDialog(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.ui.dialogs.ManageWalletsDialog.Listener listener, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Coin coin, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IPredefinedAccountType predefinedAccountType) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H\u0016\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bitstashwallet/ui/dialogs/ManageWalletsDialog$Listener;", "", "onCancel", "", "onClickCreateKey", "onClickRestoreKey", "app_devMainnetMasterDebug"})
    public static abstract interface Listener {
        
        public abstract void onClickCreateKey();
        
        public abstract void onClickRestoreKey();
        
        public abstract void onCancel();
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
            
            public static void onClickRestoreKey(io.horizontalsystems.bitstashwallet.ui.dialogs.ManageWalletsDialog.Listener $this) {
            }
            
            public static void onCancel(io.horizontalsystems.bitstashwallet.ui.dialogs.ManageWalletsDialog.Listener $this) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bitstashwallet/ui/dialogs/ManageWalletsDialog$Companion;", "", "()V", "show", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "listener", "Lio/horizontalsystems/bitstashwallet/ui/dialogs/ManageWalletsDialog$Listener;", "coin", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "predefinedAccountType", "Lio/horizontalsystems/bitstashwallet/core/IPredefinedAccountType;", "app_devMainnetMasterDebug"})
    public static final class Companion {
        
        public final void show(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.ui.dialogs.ManageWalletsDialog.Listener listener, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.entities.Coin coin, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.IPredefinedAccountType predefinedAccountType) {
        }
        
        private Companion() {
            super();
        }
    }
}
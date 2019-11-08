package io.horizontalsystems.bitstashwallet.modules.backup.eos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/backup/eos/BackupEosActivity;", "Lio/horizontalsystems/bitstashwallet/BaseActivity;", "()V", "bind", "", "account", "", "privateKey", "onCopy", "text", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_devMainnetMasterDebug"})
public final class BackupEosActivity extends io.horizontalsystems.bitstashwallet.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACCOUNT = "account";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTIVE_PRIVATE_KEY = "active_private_key";
    public static final io.horizontalsystems.bitstashwallet.modules.backup.eos.BackupEosActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void bind(java.lang.String account, java.lang.String privateKey) {
    }
    
    private final void onCopy(java.lang.String text) {
    }
    
    public BackupEosActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/backup/eos/BackupEosActivity$Companion;", "", "()V", "ACCOUNT", "", "ACTIVE_PRIVATE_KEY", "start", "", "context", "Landroidx/appcompat/app/AppCompatActivity;", "account", "activePrivateKey", "app_devMainnetMasterDebug"})
    public static final class Companion {
        
        public final void start(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.app.AppCompatActivity context, @org.jetbrains.annotations.NotNull()
        java.lang.String account, @org.jetbrains.annotations.NotNull()
        java.lang.String activePrivateKey) {
        }
        
        private Companion() {
            super();
        }
    }
}
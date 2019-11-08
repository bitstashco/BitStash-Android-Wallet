package io.horizontalsystems.bitstashwallet.modules.backup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\f\u001a\u00020\u0006H\u0016J\u0012\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/backup/BackupActivity;", "Lio/horizontalsystems/bitstashwallet/BaseActivity;", "()V", "viewModel", "Lio/horizontalsystems/bitstashwallet/modules/backup/BackupViewModel;", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_productionMainnetRelease"})
public final class BackupActivity extends io.horizontalsystems.bitstashwallet.BaseActivity {
    private io.horizontalsystems.bitstashwallet.modules.backup.BackupViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACCOUNT_KEY = "account_key";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACCOUNT_COINS = "account_coins";
    public static final io.horizontalsystems.bitstashwallet.modules.backup.BackupActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public BackupActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/backup/BackupActivity$Companion;", "", "()V", "ACCOUNT_COINS", "", "ACCOUNT_KEY", "start", "", "context", "Landroid/content/Context;", "account", "Lio/horizontalsystems/bitstashwallet/entities/Account;", "coinCodes", "app_productionMainnetRelease"})
    public static final class Companion {
        
        public final void start(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.entities.Account account, @org.jetbrains.annotations.NotNull()
        java.lang.String coinCodes) {
        }
        
        private Companion() {
            super();
        }
    }
}
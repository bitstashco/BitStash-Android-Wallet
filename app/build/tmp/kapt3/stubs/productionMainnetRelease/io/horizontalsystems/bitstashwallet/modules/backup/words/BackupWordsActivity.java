package io.horizontalsystems.bitstashwallet.modules.backup.words;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/backup/words/BackupWordsActivity;", "Lio/horizontalsystems/bitstashwallet/BaseActivity;", "()V", "viewModel", "Lio/horizontalsystems/bitstashwallet/modules/backup/words/BackupWordsViewModel;", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_productionMainnetRelease"})
public final class BackupWordsActivity extends io.horizontalsystems.bitstashwallet.BaseActivity {
    private io.horizontalsystems.bitstashwallet.modules.backup.words.BackupWordsViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACCOUNT_BACKEDUP = "account_backedup";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WORDS_KEY = "words";
    public static final io.horizontalsystems.bitstashwallet.modules.backup.words.BackupWordsActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public BackupWordsActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/backup/words/BackupWordsActivity$Companion;", "", "()V", "ACCOUNT_BACKEDUP", "", "WORDS_KEY", "start", "", "context", "Landroidx/appcompat/app/AppCompatActivity;", "words", "", "backedUp", "", "app_productionMainnetRelease"})
    public static final class Companion {
        
        public final void start(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.app.AppCompatActivity context, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> words, boolean backedUp) {
        }
        
        private Companion() {
            super();
        }
    }
}
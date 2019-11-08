package io.horizontalsystems.bitstashwallet.modules.restore.words;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\tH\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/restore/words/RestoreWordsActivity;", "Lio/horizontalsystems/bitstashwallet/BaseActivity;", "Lio/horizontalsystems/bitstashwallet/modules/restore/words/RestoreWordsAdapter$Listener;", "()V", "viewModel", "Lio/horizontalsystems/bitstashwallet/modules/restore/words/RestoreWordsViewModel;", "isUsingNativeKeyboard", "", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onChange", "position", "word", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDone", "onSupportNavigateUp", "app_devMainnetMasterDebug"})
public final class RestoreWordsActivity extends io.horizontalsystems.bitstashwallet.BaseActivity implements io.horizontalsystems.bitstashwallet.modules.restore.words.RestoreWordsAdapter.Listener {
    private io.horizontalsystems.bitstashwallet.modules.restore.words.RestoreWordsViewModel viewModel;
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
    public void onChange(int position, @org.jetbrains.annotations.NotNull()
    java.lang.String word) {
    }
    
    @java.lang.Override()
    public void onDone() {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    private final boolean isUsingNativeKeyboard() {
        return false;
    }
    
    public RestoreWordsActivity() {
        super();
    }
}
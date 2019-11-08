package io.horizontalsystems.bitstashwallet.modules.restore.words;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\rJ\b\u0010\u0010\u001a\u00020\u0012H\u0016J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\rH\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014\u00a8\u0006\u001b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/restore/words/RestoreWordsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bitstashwallet/modules/restore/words/RestoreWordsModule$View;", "Lio/horizontalsystems/bitstashwallet/modules/restore/words/RestoreWordsModule$Router;", "()V", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/restore/words/RestoreWordsModule$ViewDelegate;", "getDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/restore/words/RestoreWordsModule$ViewDelegate;", "setDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/restore/words/RestoreWordsModule$ViewDelegate;)V", "errorLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getErrorLiveData", "()Landroidx/lifecycle/MutableLiveData;", "notifyRestored", "Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "", "getNotifyRestored", "()Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "startSyncModeModule", "getStartSyncModeModule", "init", "wordsCount", "showError", "error", "app_devMainnetMasterDebug"})
public final class RestoreWordsViewModel extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bitstashwallet.modules.restore.words.RestoreWordsModule.View, io.horizontalsystems.bitstashwallet.modules.restore.words.RestoreWordsModule.Router {
    @org.jetbrains.annotations.NotNull()
    public io.horizontalsystems.bitstashwallet.modules.restore.words.RestoreWordsModule.ViewDelegate delegate;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> errorLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> notifyRestored = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> startSyncModeModule = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.restore.words.RestoreWordsModule.ViewDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.restore.words.RestoreWordsModule.ViewDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getErrorLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> getNotifyRestored() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> getStartSyncModeModule() {
        return null;
    }
    
    public final void init(int wordsCount) {
    }
    
    @java.lang.Override()
    public void showError(int error) {
    }
    
    @java.lang.Override()
    public void notifyRestored() {
    }
    
    @java.lang.Override()
    public void startSyncModeModule() {
    }
    
    public RestoreWordsViewModel() {
        super();
    }
}
package io.horizontalsystems.bitstashwallet.modules.backup.words;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0012H\u0016J\u001c\u0010\u0017\u001a\u00020\u00122\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/backup/words/BackupWordsPresenter;", "Lio/horizontalsystems/bitstashwallet/modules/backup/words/BackupWordsModule$IPresenter;", "Lio/horizontalsystems/bitstashwallet/modules/backup/words/BackupWordsModule$IViewDelegate;", "Lio/horizontalsystems/bitstashwallet/modules/backup/words/BackupWordsModule$IInteractorDelegate;", "interactor", "Lio/horizontalsystems/bitstashwallet/modules/backup/words/BackupWordsModule$IInteractor;", "router", "Lio/horizontalsystems/bitstashwallet/modules/backup/words/BackupWordsModule$IRouter;", "state", "Lio/horizontalsystems/bitstashwallet/modules/backup/words/BackupWordsModule$State;", "(Lio/horizontalsystems/bitstashwallet/modules/backup/words/BackupWordsModule$IInteractor;Lio/horizontalsystems/bitstashwallet/modules/backup/words/BackupWordsModule$IRouter;Lio/horizontalsystems/bitstashwallet/modules/backup/words/BackupWordsModule$State;)V", "view", "Lio/horizontalsystems/bitstashwallet/modules/backup/words/BackupWordsModule$IView;", "getView", "()Lio/horizontalsystems/bitstashwallet/modules/backup/words/BackupWordsModule$IView;", "setView", "(Lio/horizontalsystems/bitstashwallet/modules/backup/words/BackupWordsModule$IView;)V", "loadCurrentPage", "", "onBackClick", "onNextClick", "onValidateFailure", "onValidateSuccess", "validateDidClick", "confirmationWords", "Ljava/util/HashMap;", "", "", "viewDidLoad", "app_devMainnetMasterDebug"})
public final class BackupWordsPresenter implements io.horizontalsystems.bitstashwallet.modules.backup.words.BackupWordsModule.IPresenter, io.horizontalsystems.bitstashwallet.modules.backup.words.BackupWordsModule.IViewDelegate, io.horizontalsystems.bitstashwallet.modules.backup.words.BackupWordsModule.IInteractorDelegate {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.modules.backup.words.BackupWordsModule.IView view;
    private final io.horizontalsystems.bitstashwallet.modules.backup.words.BackupWordsModule.IInteractor interactor = null;
    private final io.horizontalsystems.bitstashwallet.modules.backup.words.BackupWordsModule.IRouter router = null;
    private final io.horizontalsystems.bitstashwallet.modules.backup.words.BackupWordsModule.State state = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.modules.backup.words.BackupWordsModule.IView getView() {
        return null;
    }
    
    @java.lang.Override()
    public void setView(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.modules.backup.words.BackupWordsModule.IView p0) {
    }
    
    @java.lang.Override()
    public void viewDidLoad() {
    }
    
    @java.lang.Override()
    public void onNextClick() {
    }
    
    @java.lang.Override()
    public void onBackClick() {
    }
    
    @java.lang.Override()
    public void validateDidClick(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.Integer, java.lang.String> confirmationWords) {
    }
    
    @java.lang.Override()
    public void onValidateSuccess() {
    }
    
    @java.lang.Override()
    public void onValidateFailure() {
    }
    
    private final void loadCurrentPage() {
    }
    
    public BackupWordsPresenter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.backup.words.BackupWordsModule.IInteractor interactor, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.backup.words.BackupWordsModule.IRouter router, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.backup.words.BackupWordsModule.State state) {
        super();
    }
}
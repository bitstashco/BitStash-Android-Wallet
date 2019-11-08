package io.horizontalsystems.bitstashwallet.modules.backup.words;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0007\u0016\u0017\u0018\u0019\u001a\u001b\u001cB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J1\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J$\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00152\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/backup/words/BackupWordsModule;", "", "()V", "RESULT_BACKUP", "", "RESULT_SHOW", "init", "", "view", "Lio/horizontalsystems/bitstashwallet/modules/backup/words/BackupWordsViewModel;", "router", "Lio/horizontalsystems/bitstashwallet/modules/backup/words/BackupWordsModule$IRouter;", "words", "", "", "backedUp", "", "(Lio/horizontalsystems/bitstashwallet/modules/backup/words/BackupWordsViewModel;Lio/horizontalsystems/bitstashwallet/modules/backup/words/BackupWordsModule$IRouter;[Ljava/lang/String;Z)V", "start", "context", "Landroidx/appcompat/app/AppCompatActivity;", "", "IInteractor", "IInteractorDelegate", "IPresenter", "IRouter", "IView", "IViewDelegate", "State", "app_productionMainnetRelease"})
public final class BackupWordsModule {
    public static final int RESULT_BACKUP = 1;
    public static final int RESULT_SHOW = 2;
    public static final io.horizontalsystems.bitstashwallet.modules.backup.words.BackupWordsModule INSTANCE = null;
    
    public final void start(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity context, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> words, boolean backedUp) {
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.backup.words.BackupWordsViewModel view, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.backup.words.BackupWordsModule.IRouter router, @org.jetbrains.annotations.NotNull()
    java.lang.String[] words, boolean backedUp) {
    }
    
    private BackupWordsModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH&J\u001b\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH&\u00a2\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0003H&\u00a8\u0006\u0010"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/backup/words/BackupWordsModule$IView;", "", "loadPage", "", "page", "", "showConfirmationError", "showConfirmationWords", "indexes", "", "showWords", "words", "", "", "([Ljava/lang/String;)V", "validateWords", "app_productionMainnetRelease"})
    public static abstract interface IView {
        
        public abstract void showWords(@org.jetbrains.annotations.NotNull()
        java.lang.String[] words);
        
        public abstract void showConfirmationWords(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Integer> indexes);
        
        public abstract void showConfirmationError();
        
        public abstract void loadPage(int page);
        
        public abstract void validateWords();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u0002R\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/backup/words/BackupWordsModule$IPresenter;", "Lio/horizontalsystems/bitstashwallet/modules/backup/words/BackupWordsModule$IInteractorDelegate;", "Lio/horizontalsystems/bitstashwallet/modules/backup/words/BackupWordsModule$IViewDelegate;", "view", "Lio/horizontalsystems/bitstashwallet/modules/backup/words/BackupWordsModule$IView;", "getView", "()Lio/horizontalsystems/bitstashwallet/modules/backup/words/BackupWordsModule$IView;", "setView", "(Lio/horizontalsystems/bitstashwallet/modules/backup/words/BackupWordsModule$IView;)V", "app_productionMainnetRelease"})
    public static abstract interface IPresenter extends io.horizontalsystems.bitstashwallet.modules.backup.words.BackupWordsModule.IInteractorDelegate, io.horizontalsystems.bitstashwallet.modules.backup.words.BackupWordsModule.IViewDelegate {
        
        @org.jetbrains.annotations.Nullable()
        public abstract io.horizontalsystems.bitstashwallet.modules.backup.words.BackupWordsModule.IView getView();
        
        public abstract void setView(@org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bitstashwallet.modules.backup.words.BackupWordsModule.IView p0);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u001c\u0010\u0005\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H&J\b\u0010\n\u001a\u00020\u0003H&\u00a8\u0006\u000b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/backup/words/BackupWordsModule$IViewDelegate;", "", "onBackClick", "", "onNextClick", "validateDidClick", "confirmationWords", "Ljava/util/HashMap;", "", "", "viewDidLoad", "app_productionMainnetRelease"})
    public static abstract interface IViewDelegate {
        
        public abstract void viewDidLoad();
        
        public abstract void onNextClick();
        
        public abstract void onBackClick();
        
        public abstract void validateDidClick(@org.jetbrains.annotations.NotNull()
        java.util.HashMap<java.lang.Integer, java.lang.String> confirmationWords);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u001c\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bH&\u00a8\u0006\n"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/backup/words/BackupWordsModule$IInteractor;", "", "getConfirmationIndices", "", "", "validate", "", "confirmationWords", "Ljava/util/HashMap;", "", "app_productionMainnetRelease"})
    public static abstract interface IInteractor {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<java.lang.Integer> getConfirmationIndices();
        
        public abstract void validate(@org.jetbrains.annotations.NotNull()
        java.util.HashMap<java.lang.Integer, java.lang.String> confirmationWords);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/backup/words/BackupWordsModule$IInteractorDelegate;", "", "onValidateFailure", "", "onValidateSuccess", "app_productionMainnetRelease"})
    public static abstract interface IInteractorDelegate {
        
        public abstract void onValidateSuccess();
        
        public abstract void onValidateFailure();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/backup/words/BackupWordsModule$IRouter;", "", "close", "", "notifyBackedUp", "notifyClosed", "app_productionMainnetRelease"})
    public static abstract interface IRouter {
        
        public abstract void notifyBackedUp();
        
        public abstract void notifyClosed();
        
        public abstract void close();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\u0013\u001a\u00020\u0006J\u0006\u0010\u0014\u001a\u00020\u0006R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0015"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/backup/words/BackupWordsModule$State;", "", "words", "", "", "backedUp", "", "([Ljava/lang/String;Z)V", "getBackedUp", "()Z", "<set-?>", "", "currentPage", "getCurrentPage", "()I", "pagesCount", "getWords", "()[Ljava/lang/String;", "[Ljava/lang/String;", "canLoadNextPage", "canLoadPrevPage", "app_productionMainnetRelease"})
    public static final class State {
        private int currentPage;
        private final int pagesCount = 2;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String[] words = null;
        private final boolean backedUp = false;
        
        public final int getCurrentPage() {
            return 0;
        }
        
        public final boolean canLoadNextPage() {
            return false;
        }
        
        public final boolean canLoadPrevPage() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String[] getWords() {
            return null;
        }
        
        public final boolean getBackedUp() {
            return false;
        }
        
        public State(@org.jetbrains.annotations.NotNull()
        java.lang.String[] words, boolean backedUp) {
            super();
        }
    }
}
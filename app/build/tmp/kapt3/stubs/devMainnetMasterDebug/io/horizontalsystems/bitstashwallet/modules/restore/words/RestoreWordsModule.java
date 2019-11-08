package io.horizontalsystems.bitstashwallet.modules.restore.words;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0005\u000f\u0010\u0011\u0012\u0013B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/restore/words/RestoreWordsModule;", "", "()V", "init", "", "view", "Lio/horizontalsystems/bitstashwallet/modules/restore/words/RestoreWordsViewModel;", "router", "Lio/horizontalsystems/bitstashwallet/modules/restore/words/RestoreWordsModule$Router;", "wordsCount", "", "startForResult", "context", "Landroidx/appcompat/app/AppCompatActivity;", "requestCode", "Interactor", "InteractorDelegate", "Router", "View", "ViewDelegate", "app_devMainnetMasterDebug"})
public final class RestoreWordsModule {
    public static final io.horizontalsystems.bitstashwallet.modules.restore.words.RestoreWordsModule INSTANCE = null;
    
    public final void startForResult(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity context, int wordsCount, int requestCode) {
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.restore.words.RestoreWordsViewModel view, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.restore.words.RestoreWordsModule.Router router, int wordsCount) {
    }
    
    private RestoreWordsModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/restore/words/RestoreWordsModule$View;", "", "showError", "", "error", "", "app_devMainnetMasterDebug"})
    public static abstract interface View {
        
        public abstract void showError(int error);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H&J\b\u0010\f\u001a\u00020\bH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/restore/words/RestoreWordsModule$ViewDelegate;", "", "words", "", "", "getWords", "()Ljava/util/List;", "onChange", "", "position", "", "word", "onDone", "app_devMainnetMasterDebug"})
    public static abstract interface ViewDelegate {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<java.lang.String> getWords();
        
        public abstract void onChange(int position, @org.jetbrains.annotations.NotNull()
        java.lang.String word);
        
        public abstract void onDone();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/restore/words/RestoreWordsModule$Interactor;", "", "validate", "", "words", "", "", "app_devMainnetMasterDebug"})
    public static abstract interface Interactor {
        
        public abstract void validate(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> words);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/restore/words/RestoreWordsModule$InteractorDelegate;", "", "didFailToValidate", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "didValidate", "app_devMainnetMasterDebug"})
    public static abstract interface InteractorDelegate {
        
        public abstract void didValidate();
        
        public abstract void didFailToValidate(@org.jetbrains.annotations.NotNull()
        java.lang.Exception exception);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/restore/words/RestoreWordsModule$Router;", "", "notifyRestored", "", "startSyncModeModule", "app_devMainnetMasterDebug"})
    public static abstract interface Router {
        
        public abstract void notifyRestored();
        
        public abstract void startSyncModeModule();
    }
}
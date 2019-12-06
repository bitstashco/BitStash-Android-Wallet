package app.odapplications.bitstashwallet.modules.restore.words;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\u0017\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u001aj\u0002`\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0018H\u0016J\u0018\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0014H\u0016J\b\u0010 \u001a\u00020\u0018H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006!"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/restore/words/RestoreWordsPresenter;", "Lapp/odapplications/bitstashwallet/modules/restore/words/RestoreWordsModule$ViewDelegate;", "Lapp/odapplications/bitstashwallet/modules/restore/words/RestoreWordsModule$InteractorDelegate;", "wordsCount", "", "showSyncMode", "", "interactor", "Lapp/odapplications/bitstashwallet/modules/restore/words/RestoreWordsModule$Interactor;", "router", "Lapp/odapplications/bitstashwallet/modules/restore/words/RestoreWordsModule$Router;", "(IZLapp/odapplications/bitstashwallet/modules/restore/words/RestoreWordsModule$Interactor;Lapp/odapplications/bitstashwallet/modules/restore/words/RestoreWordsModule$Router;)V", "view", "Lapp/odapplications/bitstashwallet/modules/restore/words/RestoreWordsModule$View;", "getView", "()Lapp/odapplications/bitstashwallet/modules/restore/words/RestoreWordsModule$View;", "setView", "(Lapp/odapplications/bitstashwallet/modules/restore/words/RestoreWordsModule$View;)V", "words", "", "", "getWords", "()Ljava/util/List;", "didFailToValidate", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "didValidate", "onChange", "position", "word", "onDone", "app_productionMainnetRelease"})
public final class RestoreWordsPresenter implements app.odapplications.bitstashwallet.modules.restore.words.RestoreWordsModule.ViewDelegate, app.odapplications.bitstashwallet.modules.restore.words.RestoreWordsModule.InteractorDelegate {
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.restore.words.RestoreWordsModule.View view;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> words = null;
    private final boolean showSyncMode = false;
    private final app.odapplications.bitstashwallet.modules.restore.words.RestoreWordsModule.Interactor interactor = null;
    private final app.odapplications.bitstashwallet.modules.restore.words.RestoreWordsModule.Router router = null;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.restore.words.RestoreWordsModule.View getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.restore.words.RestoreWordsModule.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> getWords() {
        return null;
    }
    
    @java.lang.Override()
    public void onChange(int position, @org.jetbrains.annotations.NotNull()
    java.lang.String word) {
    }
    
    @java.lang.Override()
    public void onDone() {
    }
    
    @java.lang.Override()
    public void didValidate() {
    }
    
    @java.lang.Override()
    public void didFailToValidate(@org.jetbrains.annotations.NotNull()
    java.lang.Exception exception) {
    }
    
    public RestoreWordsPresenter(int wordsCount, boolean showSyncMode, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.restore.words.RestoreWordsModule.Interactor interactor, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.restore.words.RestoreWordsModule.Router router) {
        super();
    }
}
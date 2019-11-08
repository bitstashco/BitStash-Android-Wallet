package io.horizontalsystems.bitstashwallet.modules.restore.words;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/restore/words/RestoreWordsInteractor;", "Lio/horizontalsystems/bitstashwallet/modules/restore/words/RestoreWordsModule$Interactor;", "wordsManager", "Lio/horizontalsystems/bitstashwallet/core/managers/WordsManager;", "(Lio/horizontalsystems/bitstashwallet/core/managers/WordsManager;)V", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/restore/words/RestoreWordsModule$InteractorDelegate;", "getDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/restore/words/RestoreWordsModule$InteractorDelegate;", "setDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/restore/words/RestoreWordsModule$InteractorDelegate;)V", "validate", "", "words", "", "", "app_productionMainnetRelease"})
public final class RestoreWordsInteractor implements io.horizontalsystems.bitstashwallet.modules.restore.words.RestoreWordsModule.Interactor {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.modules.restore.words.RestoreWordsModule.InteractorDelegate delegate;
    private final io.horizontalsystems.bitstashwallet.core.managers.WordsManager wordsManager = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.modules.restore.words.RestoreWordsModule.InteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.modules.restore.words.RestoreWordsModule.InteractorDelegate p0) {
    }
    
    @java.lang.Override()
    public void validate(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> words) {
    }
    
    public RestoreWordsInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.managers.WordsManager wordsManager) {
        super();
    }
}
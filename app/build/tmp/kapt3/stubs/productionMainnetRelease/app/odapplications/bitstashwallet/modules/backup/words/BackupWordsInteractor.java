package app.odapplications.bitstashwallet.modules.backup.words;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u001c\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u0015H\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000e\u00a8\u0006\u0016"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/backup/words/BackupWordsInteractor;", "Lapp/odapplications/bitstashwallet/modules/backup/words/BackupWordsModule$IInteractor;", "indexesProvider", "Lapp/odapplications/bitstashwallet/core/IRandomProvider;", "words", "", "", "(Lapp/odapplications/bitstashwallet/core/IRandomProvider;[Ljava/lang/String;)V", "delegate", "Lapp/odapplications/bitstashwallet/modules/backup/words/BackupWordsModule$IInteractorDelegate;", "getDelegate", "()Lapp/odapplications/bitstashwallet/modules/backup/words/BackupWordsModule$IInteractorDelegate;", "setDelegate", "(Lapp/odapplications/bitstashwallet/modules/backup/words/BackupWordsModule$IInteractorDelegate;)V", "[Ljava/lang/String;", "getConfirmationIndices", "", "", "validate", "", "confirmationWords", "Ljava/util/HashMap;", "app_productionMainnetRelease"})
public final class BackupWordsInteractor implements app.odapplications.bitstashwallet.modules.backup.words.BackupWordsModule.IInteractor {
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.backup.words.BackupWordsModule.IInteractorDelegate delegate;
    private final app.odapplications.bitstashwallet.core.IRandomProvider indexesProvider = null;
    private final java.lang.String[] words = null;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.backup.words.BackupWordsModule.IInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.backup.words.BackupWordsModule.IInteractorDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.Integer> getConfirmationIndices() {
        return null;
    }
    
    @java.lang.Override()
    public void validate(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.Integer, java.lang.String> confirmationWords) {
    }
    
    public BackupWordsInteractor(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IRandomProvider indexesProvider, @org.jetbrains.annotations.NotNull()
    java.lang.String[] words) {
        super();
    }
}
package app.odapplications.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0016\u0010\u0018\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016R(\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lapp/odapplications/bitstashwallet/core/managers/WordsManager;", "Lapp/odapplications/bitstashwallet/core/IWordsManager;", "localStorage", "Lapp/odapplications/bitstashwallet/core/ILocalStorage;", "(Lapp/odapplications/bitstashwallet/core/ILocalStorage;)V", "backedUpSignal", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "getBackedUpSignal", "()Lio/reactivex/subjects/PublishSubject;", "setBackedUpSignal", "(Lio/reactivex/subjects/PublishSubject;)V", "value", "", "isBackedUp", "()Z", "setBackedUp", "(Z)V", "generateWords", "", "", "count", "", "validate", "words", "app_productionMainnetRelease"})
public final class WordsManager implements app.odapplications.bitstashwallet.core.IWordsManager {
    @org.jetbrains.annotations.NotNull()
    private io.reactivex.subjects.PublishSubject<kotlin.Unit> backedUpSignal;
    private final app.odapplications.bitstashwallet.core.ILocalStorage localStorage = null;
    
    @java.lang.Override()
    public boolean isBackedUp() {
        return false;
    }
    
    @java.lang.Override()
    public void setBackedUp(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.subjects.PublishSubject<kotlin.Unit> getBackedUpSignal() {
        return null;
    }
    
    @java.lang.Override()
    public void setBackedUpSignal(@org.jetbrains.annotations.NotNull()
    io.reactivex.subjects.PublishSubject<kotlin.Unit> p0) {
    }
    
    @java.lang.Override()
    public void validate(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> words) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> generateWords(int count) {
        return null;
    }
    
    public WordsManager(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.ILocalStorage localStorage) {
        super();
    }
}
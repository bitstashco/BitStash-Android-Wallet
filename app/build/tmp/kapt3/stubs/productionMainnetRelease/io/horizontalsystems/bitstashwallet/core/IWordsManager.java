package io.horizontalsystems.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H&J\u0016\u0010\u0013\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&R\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u00020\nX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0015"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/IWordsManager;", "", "backedUpSignal", "Lio/reactivex/subjects/PublishSubject;", "", "getBackedUpSignal", "()Lio/reactivex/subjects/PublishSubject;", "setBackedUpSignal", "(Lio/reactivex/subjects/PublishSubject;)V", "isBackedUp", "", "()Z", "setBackedUp", "(Z)V", "generateWords", "", "", "count", "", "validate", "words", "app_productionMainnetRelease"})
public abstract interface IWordsManager {
    
    public abstract boolean isBackedUp();
    
    public abstract void setBackedUp(boolean p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.subjects.PublishSubject<kotlin.Unit> getBackedUpSignal();
    
    public abstract void setBackedUpSignal(@org.jetbrains.annotations.NotNull()
    io.reactivex.subjects.PublishSubject<kotlin.Unit> p0);
    
    public abstract void validate(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> words);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> generateWords(int count);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}
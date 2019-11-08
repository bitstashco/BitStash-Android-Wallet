package io.horizontalsystems.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000n\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001a\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b\u001a,\u0010\t\u001a\u00020\u0004\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\n0\u000f\u001a-\u0010\u0010\u001a\u00020\u0004*\u00020\u00112!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00040\u0013\u001a4\u0010\u0017\u001a\u00020\u0018*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00040\u0013\u001ar\u0010\u0017\u001a\u00020\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0 2\u0006\u0010\u001a\u001a\u00020\u001b2\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00132\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001d2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001d\u001a2\u0010\u0017\u001a\u00020\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0#2\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00040\u0013\u001a\n\u0010$\u001a\u00020\u0002*\u00020\u0001\u00a8\u0006%"}, d2 = {"hexToByteArray", "", "", "putParcelableExtra", "", "Landroid/content/Intent;", "key", "value", "Landroid/os/Parcelable;", "reObserve", "T", "Landroidx/lifecycle/LiveData;", "owner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "setOnSingleClickListener", "Landroid/view/View;", "l", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "v", "subscribeAsync", "Lio/reactivex/disposables/Disposable;", "Lio/reactivex/Completable;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "onComplete", "Lkotlin/Function0;", "onError", "", "Lio/reactivex/Flowable;", "onNext", "onFinished", "Lio/reactivex/subjects/PublishSubject;", "toHexString", "app_devMainnetMasterDebug"})
public final class ExtensionsKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>io.reactivex.disposables.Disposable subscribeAsync(@org.jetbrains.annotations.NotNull()
    io.reactivex.Flowable<T> $this$subscribeAsync, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposables, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onNext, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onComplete, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onFinished) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>io.reactivex.disposables.Disposable subscribeAsync(@org.jetbrains.annotations.NotNull()
    io.reactivex.subjects.PublishSubject<T> $this$subscribeAsync, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposables, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onNext) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final io.reactivex.disposables.Disposable subscribeAsync(@org.jetbrains.annotations.NotNull()
    io.reactivex.Completable $this$subscribeAsync, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposables, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onComplete, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError) {
        return null;
    }
    
    public static final <T extends java.lang.Object>void reObserve(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> $this$reObserve, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Observer<T> observer) {
    }
    
    public static final void setOnSingleClickListener(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setOnSingleClickListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> l) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final byte[] hexToByteArray(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$hexToByteArray) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String toHexString(@org.jetbrains.annotations.NotNull()
    byte[] $this$toHexString) {
        return null;
    }
    
    public static final void putParcelableExtra(@org.jetbrains.annotations.NotNull()
    android.content.Intent $this$putParcelableExtra, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    android.os.Parcelable value) {
    }
}
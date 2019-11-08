package io.horizontalsystems.bitstashwallet.modules.pin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u000f2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0018\u0010(\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000fH\u0016J\u0010\u0010+\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u000bH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u000bH\u0016J\u0010\u0010-\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u0019H\u0016J\u0010\u0010/\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u001cH\u0016J\u0010\u00101\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u000bH\u0016J\b\u0010 \u001a\u00020\u000fH\u0016J\u0010\u00103\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u000bH\u0016J\u0018\u0010$\u001a\u00020\u000f2\u0006\u00104\u001a\u00020%2\u0006\u0010*\u001a\u00020\u000bH\u0016R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR#\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\bR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0011R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\bR#\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000b0\n0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\b\u00a8\u00065"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/pin/PinView;", "Lio/horizontalsystems/bitstashwallet/modules/pin/PinModule$IView;", "()V", "addPages", "Landroidx/lifecycle/MutableLiveData;", "", "Lio/horizontalsystems/bitstashwallet/modules/pin/PinPage;", "getAddPages", "()Landroidx/lifecycle/MutableLiveData;", "fillPinCircles", "Lkotlin/Pair;", "", "getFillPinCircles", "hideToolbar", "Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "", "getHideToolbar", "()Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "resetCirclesWithShakeAndDelayForPage", "getResetCirclesWithShakeAndDelayForPage", "showBackButton", "getShowBackButton", "showError", "getShowError", "showFingerprintInput", "Landroidx/biometric/BiometricPrompt$CryptoObject;", "getShowFingerprintInput", "showLockedView", "Ljava/util/Date;", "getShowLockedView", "showPageAtIndex", "getShowPageAtIndex", "showPinInput", "getShowPinInput", "title", "getTitle", "updateTopTextForPage", "Lio/horizontalsystems/bitstashwallet/modules/pin/TopText;", "getUpdateTopTextForPage", "pages", "fillCircles", "length", "pageIndex", "setTitle", "error", "showFingerprintDialog", "cryptoObject", "showLockView", "until", "showPage", "index", "showPinWrong", "text", "app_productionMainnetRelease"})
public final class PinView implements io.horizontalsystems.bitstashwallet.modules.pin.PinModule.IView {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> title = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bitstashwallet.modules.pin.PinPage>> addPages = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> showPageAtIndex = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> showError = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Pair<io.horizontalsystems.bitstashwallet.modules.pin.TopText, java.lang.Integer>> updateTopTextForPage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Pair<java.lang.Integer, java.lang.Integer>> fillPinCircles = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> hideToolbar = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> showBackButton = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<androidx.biometric.BiometricPrompt.CryptoObject> showFingerprintInput = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.Integer> resetCirclesWithShakeAndDelayForPage = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.util.Date> showLockedView = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> showPinInput = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bitstashwallet.modules.pin.PinPage>> getAddPages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getShowPageAtIndex() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getShowError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<kotlin.Pair<io.horizontalsystems.bitstashwallet.modules.pin.TopText, java.lang.Integer>> getUpdateTopTextForPage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<kotlin.Pair<java.lang.Integer, java.lang.Integer>> getFillPinCircles() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> getHideToolbar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> getShowBackButton() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<androidx.biometric.BiometricPrompt.CryptoObject> getShowFingerprintInput() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.Integer> getResetCirclesWithShakeAndDelayForPage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.util.Date> getShowLockedView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> getShowPinInput() {
        return null;
    }
    
    @java.lang.Override()
    public void setTitle(int title) {
    }
    
    @java.lang.Override()
    public void hideToolbar() {
    }
    
    @java.lang.Override()
    public void addPages(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.modules.pin.PinPage> pages) {
    }
    
    @java.lang.Override()
    public void showPage(int index) {
    }
    
    @java.lang.Override()
    public void updateTopTextForPage(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.pin.TopText text, int pageIndex) {
    }
    
    @java.lang.Override()
    public void showError(int error) {
    }
    
    @java.lang.Override()
    public void showPinWrong(int pageIndex) {
    }
    
    @java.lang.Override()
    public void showFingerprintDialog(@org.jetbrains.annotations.NotNull()
    androidx.biometric.BiometricPrompt.CryptoObject cryptoObject) {
    }
    
    @java.lang.Override()
    public void showBackButton() {
    }
    
    @java.lang.Override()
    public void fillCircles(int length, int pageIndex) {
    }
    
    @java.lang.Override()
    public void showLockView(@org.jetbrains.annotations.NotNull()
    java.util.Date until) {
    }
    
    @java.lang.Override()
    public void showPinInput() {
    }
    
    public PinView() {
        super();
    }
}
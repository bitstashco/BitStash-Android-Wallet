package io.horizontalsystems.bitstashwallet.modules.send.submodules.address;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00162\u0006\u0010\u0018\u001a\u00020\bH\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/submodules/address/SendAddressInteractor;", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/address/SendAddressModule$IInteractor;", "textHelper", "Lio/horizontalsystems/bitstashwallet/core/IClipboardManager;", "addressParser", "Lio/horizontalsystems/bitstashwallet/core/IAddressParser;", "(Lio/horizontalsystems/bitstashwallet/core/IClipboardManager;Lio/horizontalsystems/bitstashwallet/core/IAddressParser;)V", "addressFromClipboard", "", "getAddressFromClipboard", "()Ljava/lang/String;", "clipboardHasPrimaryClip", "", "getClipboardHasPrimaryClip", "()Z", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/address/SendAddressModule$IInteractorDelegate;", "getDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/send/submodules/address/SendAddressModule$IInteractorDelegate;", "setDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/send/submodules/address/SendAddressModule$IInteractorDelegate;)V", "parseAddress", "Lkotlin/Pair;", "Ljava/math/BigDecimal;", "address", "app_productionMainnetRelease"})
public final class SendAddressInteractor implements io.horizontalsystems.bitstashwallet.modules.send.submodules.address.SendAddressModule.IInteractor {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.modules.send.submodules.address.SendAddressModule.IInteractorDelegate delegate;
    private final io.horizontalsystems.bitstashwallet.core.IClipboardManager textHelper = null;
    private final io.horizontalsystems.bitstashwallet.core.IAddressParser addressParser = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.modules.send.submodules.address.SendAddressModule.IInteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.modules.send.submodules.address.SendAddressModule.IInteractorDelegate p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getAddressFromClipboard() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getClipboardHasPrimaryClip() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.Pair<java.lang.String, java.math.BigDecimal> parseAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    public SendAddressInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IClipboardManager textHelper, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IAddressParser addressParser) {
        super();
    }
}
package io.horizontalsystems.bitstashwallet.modules.reportproblem;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/reportproblem/ReportProblemInteractor;", "Lio/horizontalsystems/bitstashwallet/modules/reportproblem/ReportProblemModule$IInteractor;", "appConfigProvider", "Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;", "clipboardManager", "Lio/horizontalsystems/bitstashwallet/core/IClipboardManager;", "(Lio/horizontalsystems/bitstashwallet/core/IAppConfigProvider;Lio/horizontalsystems/bitstashwallet/core/IClipboardManager;)V", "email", "", "getEmail", "()Ljava/lang/String;", "telegramGroup", "getTelegramGroup", "copyToClipboard", "", "value", "app_devMainnetMasterDebug"})
public final class ReportProblemInteractor implements io.horizontalsystems.bitstashwallet.modules.reportproblem.ReportProblemModule.IInteractor {
    private final io.horizontalsystems.bitstashwallet.core.IAppConfigProvider appConfigProvider = null;
    private io.horizontalsystems.bitstashwallet.core.IClipboardManager clipboardManager;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getTelegramGroup() {
        return null;
    }
    
    @java.lang.Override()
    public void copyToClipboard(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public ReportProblemInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IAppConfigProvider appConfigProvider, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IClipboardManager clipboardManager) {
        super();
    }
}
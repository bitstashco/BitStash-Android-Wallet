package io.horizontalsystems.bitstashwallet.modules.reportproblem;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007\u00a8\u0006\u000f"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/reportproblem/ReportProblemRouter;", "Lio/horizontalsystems/bitstashwallet/modules/reportproblem/ReportProblemModule$IRouter;", "()V", "openTelegramGroupEvent", "Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "", "getOpenTelegramGroupEvent", "()Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "sendEmailLiveEvent", "getSendEmailLiveEvent", "openSendMail", "", "recipient", "openTelegram", "group", "app_devMainnetMasterDebug"})
public final class ReportProblemRouter implements io.horizontalsystems.bitstashwallet.modules.reportproblem.ReportProblemModule.IRouter {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.String> sendEmailLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.String> openTelegramGroupEvent = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.String> getSendEmailLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.String> getOpenTelegramGroupEvent() {
        return null;
    }
    
    @java.lang.Override()
    public void openSendMail(@org.jetbrains.annotations.NotNull()
    java.lang.String recipient) {
    }
    
    @java.lang.Override()
    public void openTelegram(@org.jetbrains.annotations.NotNull()
    java.lang.String group) {
    }
    
    public ReportProblemRouter() {
        super();
    }
}
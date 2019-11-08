package io.horizontalsystems.bitstashwallet.modules.reportproblem;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/reportproblem/ReportProblemView;", "Lio/horizontalsystems/bitstashwallet/modules/reportproblem/ReportProblemModule$IView;", "()V", "emailLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getEmailLiveData", "()Landroidx/lifecycle/MutableLiveData;", "showCopiedLiveEvent", "Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "", "getShowCopiedLiveEvent", "()Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "telegramGroupLiveData", "getTelegramGroupLiveData", "setEmail", "email", "setTelegramGroup", "group", "showCopied", "app_devMainnetMasterDebug"})
public final class ReportProblemView implements io.horizontalsystems.bitstashwallet.modules.reportproblem.ReportProblemModule.IView {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> emailLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> telegramGroupLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> showCopiedLiveEvent = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getEmailLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getTelegramGroupLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> getShowCopiedLiveEvent() {
        return null;
    }
    
    @java.lang.Override()
    public void setEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
    
    @java.lang.Override()
    public void setTelegramGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String group) {
    }
    
    @java.lang.Override()
    public void showCopied() {
    }
    
    public ReportProblemView() {
        super();
    }
}
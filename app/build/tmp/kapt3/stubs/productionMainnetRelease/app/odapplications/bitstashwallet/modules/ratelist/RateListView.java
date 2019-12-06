package app.odapplications.bitstashwallet.modules.ratelist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0005H\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0012"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/ratelist/RateListView;", "Lapp/odapplications/bitstashwallet/modules/ratelist/RateListModule$IView;", "()V", "currentDate", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/Date;", "getCurrentDate", "()Landroidx/lifecycle/MutableLiveData;", "setCurrentDate", "(Landroidx/lifecycle/MutableLiveData;)V", "reloadLiveEvent", "Lapp/odapplications/bitstashwallet/SingleLiveEvent;", "Ljava/lang/Void;", "getReloadLiveEvent", "()Lapp/odapplications/bitstashwallet/SingleLiveEvent;", "reload", "", "showCurrentDate", "app_productionMainnetRelease"})
public final class RateListView implements app.odapplications.bitstashwallet.modules.ratelist.RateListModule.IView {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.Date> currentDate;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Void> reloadLiveEvent = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.Date> getCurrentDate() {
        return null;
    }
    
    public final void setCurrentDate(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.Date> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.SingleLiveEvent<java.lang.Void> getReloadLiveEvent() {
        return null;
    }
    
    @java.lang.Override()
    public void showCurrentDate(@org.jetbrains.annotations.NotNull()
    java.util.Date currentDate) {
    }
    
    @java.lang.Override()
    public void reload() {
    }
    
    public RateListView() {
        super();
    }
}
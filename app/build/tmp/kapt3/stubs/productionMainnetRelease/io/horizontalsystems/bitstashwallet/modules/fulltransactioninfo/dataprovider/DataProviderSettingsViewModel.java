package io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.dataprovider;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\u0016\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001d"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/dataprovider/DataProviderSettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/dataprovider/DataProviderSettingsModule$View;", "()V", "closeLiveEvent", "Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "", "getCloseLiveEvent", "()Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/dataprovider/DataProviderSettingsModule$ViewDelegate;", "getDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/dataprovider/DataProviderSettingsModule$ViewDelegate;", "setDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/dataprovider/DataProviderSettingsModule$ViewDelegate;)V", "providerItems", "Landroidx/lifecycle/MutableLiveData;", "", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/dataprovider/DataProviderSettingsItem;", "getProviderItems", "()Landroidx/lifecycle/MutableLiveData;", "close", "init", "coin", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "transactionHash", "", "show", "items", "app_productionMainnetRelease"})
public final class DataProviderSettingsViewModel extends androidx.lifecycle.ViewModel implements io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.dataprovider.DataProviderSettingsModule.View {
    @org.jetbrains.annotations.NotNull()
    public io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.dataprovider.DataProviderSettingsModule.ViewDelegate delegate;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.dataprovider.DataProviderSettingsItem>> providerItems = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> closeLiveEvent = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.dataprovider.DataProviderSettingsModule.ViewDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.dataprovider.DataProviderSettingsModule.ViewDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.dataprovider.DataProviderSettingsItem>> getProviderItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> getCloseLiveEvent() {
        return null;
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Coin coin, @org.jetbrains.annotations.NotNull()
    java.lang.String transactionHash) {
    }
    
    @java.lang.Override()
    public void show(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.dataprovider.DataProviderSettingsItem> items) {
    }
    
    @java.lang.Override()
    public void close() {
    }
    
    public DataProviderSettingsViewModel() {
        super();
    }
}
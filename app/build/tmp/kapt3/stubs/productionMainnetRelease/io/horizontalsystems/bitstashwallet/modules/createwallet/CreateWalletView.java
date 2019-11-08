package io.horizontalsystems.bitstashwallet.modules.createwallet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0014\u0010\u0012\u001a\u00020\u00102\n\u0010\u0013\u001a\u00060\u0005j\u0002`\u0006H\u0016R\u001b\u0010\u0003\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/createwallet/CreateWalletView;", "Lio/horizontalsystems/bitstashwallet/modules/createwallet/CreateWalletModule$IView;", "()V", "errorLiveEvent", "Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getErrorLiveEvent", "()Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "itemsLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lio/horizontalsystems/bitstashwallet/modules/createwallet/CreateWalletModule$CoinViewItem;", "getItemsLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setItems", "", "items", "showError", "exception", "app_productionMainnetRelease"})
public final class CreateWalletView implements io.horizontalsystems.bitstashwallet.modules.createwallet.CreateWalletModule.IView {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bitstashwallet.modules.createwallet.CreateWalletModule.CoinViewItem>> itemsLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.Exception> errorLiveEvent = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<io.horizontalsystems.bitstashwallet.modules.createwallet.CreateWalletModule.CoinViewItem>> getItemsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<java.lang.Exception> getErrorLiveEvent() {
        return null;
    }
    
    @java.lang.Override()
    public void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.modules.createwallet.CreateWalletModule.CoinViewItem> items) {
    }
    
    @java.lang.Override()
    public void showError(@org.jetbrains.annotations.NotNull()
    java.lang.Exception exception) {
    }
    
    public CreateWalletView() {
        super();
    }
}
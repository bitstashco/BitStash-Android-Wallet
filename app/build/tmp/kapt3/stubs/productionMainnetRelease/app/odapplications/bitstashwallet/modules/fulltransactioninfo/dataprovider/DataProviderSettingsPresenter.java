package app.odapplications.bitstashwallet.modules.fulltransactioninfo.dataprovider;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0006H\u0016J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0006H\u0016J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u000eH\u0016J\b\u0010!\u001a\u00020\u001cH\u0016J\b\u0010\"\u001a\u00020\u001cH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006#"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/dataprovider/DataProviderSettingsPresenter;", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/dataprovider/DataProviderSettingsModule$ViewDelegate;", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/dataprovider/DataProviderSettingsModule$InteractorDelegate;", "coin", "Lapp/odapplications/bitstashwallet/entities/Coin;", "transactionHash", "", "interactor", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/dataprovider/DataProviderSettingsModule$Interactor;", "(Lapp/odapplications/bitstashwallet/entities/Coin;Ljava/lang/String;Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/dataprovider/DataProviderSettingsModule$Interactor;)V", "getCoin", "()Lapp/odapplications/bitstashwallet/entities/Coin;", "items", "", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/dataprovider/DataProviderSettingsItem;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getTransactionHash", "()Ljava/lang/String;", "view", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/dataprovider/DataProviderSettingsModule$View;", "getView", "()Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/dataprovider/DataProviderSettingsModule$View;", "setView", "(Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/dataprovider/DataProviderSettingsModule$View;)V", "onPingFailure", "", "name", "onPingSuccess", "onSelect", "item", "onSetDataProvider", "viewDidLoad", "app_productionMainnetRelease"})
public final class DataProviderSettingsPresenter implements app.odapplications.bitstashwallet.modules.fulltransactioninfo.dataprovider.DataProviderSettingsModule.ViewDelegate, app.odapplications.bitstashwallet.modules.fulltransactioninfo.dataprovider.DataProviderSettingsModule.InteractorDelegate {
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.fulltransactioninfo.dataprovider.DataProviderSettingsModule.View view;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<app.odapplications.bitstashwallet.modules.fulltransactioninfo.dataprovider.DataProviderSettingsItem> items;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.entities.Coin coin = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String transactionHash = null;
    private final app.odapplications.bitstashwallet.modules.fulltransactioninfo.dataprovider.DataProviderSettingsModule.Interactor interactor = null;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.fulltransactioninfo.dataprovider.DataProviderSettingsModule.View getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.fulltransactioninfo.dataprovider.DataProviderSettingsModule.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<app.odapplications.bitstashwallet.modules.fulltransactioninfo.dataprovider.DataProviderSettingsItem> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<app.odapplications.bitstashwallet.modules.fulltransactioninfo.dataprovider.DataProviderSettingsItem> p0) {
    }
    
    @java.lang.Override()
    public void viewDidLoad() {
    }
    
    @java.lang.Override()
    public void onPingSuccess(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    @java.lang.Override()
    public void onPingFailure(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    @java.lang.Override()
    public void onSelect(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.fulltransactioninfo.dataprovider.DataProviderSettingsItem item) {
    }
    
    @java.lang.Override()
    public void onSetDataProvider() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.entities.Coin getCoin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransactionHash() {
        return null;
    }
    
    public DataProviderSettingsPresenter(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Coin coin, @org.jetbrains.annotations.NotNull()
    java.lang.String transactionHash, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.fulltransactioninfo.dataprovider.DataProviderSettingsModule.Interactor interactor) {
        super();
    }
}
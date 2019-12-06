package app.odapplications.bitstashwallet.modules.fulltransactioninfo.dataprovider;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0004\u0010\u0011\u0012\u0013B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/dataprovider/DataProviderSettingsModule;", "", "()V", "COIN_STRING", "", "TRANSACTION_HASH", "init", "", "coin", "Lapp/odapplications/bitstashwallet/entities/Coin;", "transactionHash", "view", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/dataprovider/DataProviderSettingsViewModel;", "start", "context", "Landroid/content/Context;", "Interactor", "InteractorDelegate", "View", "ViewDelegate", "app_productionMainnetRelease"})
public final class DataProviderSettingsModule {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COIN_STRING = "coin";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TRANSACTION_HASH = "transaction_hash";
    public static final app.odapplications.bitstashwallet.modules.fulltransactioninfo.dataprovider.DataProviderSettingsModule INSTANCE = null;
    
    public final void init(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Coin coin, @org.jetbrains.annotations.NotNull()
    java.lang.String transactionHash, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.fulltransactioninfo.dataprovider.DataProviderSettingsViewModel view) {
    }
    
    public final void start(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Coin coin, @org.jetbrains.annotations.NotNull()
    java.lang.String transactionHash) {
    }
    
    private DataProviderSettingsModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&\u00a8\u0006\b"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/dataprovider/DataProviderSettingsModule$View;", "", "close", "", "show", "items", "", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/dataprovider/DataProviderSettingsItem;", "app_productionMainnetRelease"})
    public static abstract interface View {
        
        public abstract void show(@org.jetbrains.annotations.NotNull()
        java.util.List<app.odapplications.bitstashwallet.modules.fulltransactioninfo.dataprovider.DataProviderSettingsItem> items);
        
        public abstract void close();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/dataprovider/DataProviderSettingsModule$ViewDelegate;", "", "onSelect", "", "item", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/dataprovider/DataProviderSettingsItem;", "viewDidLoad", "app_productionMainnetRelease"})
    public static abstract interface ViewDelegate {
        
        public abstract void viewDidLoad();
        
        public abstract void onSelect(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.modules.fulltransactioninfo.dataprovider.DataProviderSettingsItem item);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u000e"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/dataprovider/DataProviderSettingsModule$Interactor;", "", "baseProvider", "Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Provider;", "coin", "Lapp/odapplications/bitstashwallet/entities/Coin;", "pingProvider", "", "name", "", "url", "providers", "", "setBaseProvider", "app_productionMainnetRelease"})
    public static abstract interface Interactor {
        
        public abstract void pingProvider(@org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String url);
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.Provider> providers(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Coin coin);
        
        @org.jetbrains.annotations.NotNull()
        public abstract app.odapplications.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.Provider baseProvider(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Coin coin);
        
        public abstract void setBaseProvider(@org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Coin coin);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/fulltransactioninfo/dataprovider/DataProviderSettingsModule$InteractorDelegate;", "", "onPingFailure", "", "name", "", "onPingSuccess", "onSetDataProvider", "app_productionMainnetRelease"})
    public static abstract interface InteractorDelegate {
        
        public abstract void onPingSuccess(@org.jetbrains.annotations.NotNull()
        java.lang.String name);
        
        public abstract void onPingFailure(@org.jetbrains.annotations.NotNull()
        java.lang.String name);
        
        public abstract void onSetDataProvider();
    }
}
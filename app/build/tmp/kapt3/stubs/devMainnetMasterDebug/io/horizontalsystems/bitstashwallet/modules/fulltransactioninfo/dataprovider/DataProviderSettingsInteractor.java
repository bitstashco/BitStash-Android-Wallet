package io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.dataprovider;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u001d2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/dataprovider/DataProviderSettingsInteractor;", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/dataprovider/DataProviderSettingsModule$Interactor;", "dataProviderManager", "Lio/horizontalsystems/bitstashwallet/core/ITransactionDataProviderManager;", "networkManager", "Lio/horizontalsystems/bitstashwallet/core/INetworkManager;", "(Lio/horizontalsystems/bitstashwallet/core/ITransactionDataProviderManager;Lio/horizontalsystems/bitstashwallet/core/INetworkManager;)V", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/dataprovider/DataProviderSettingsModule$InteractorDelegate;", "getDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/dataprovider/DataProviderSettingsModule$InteractorDelegate;", "setDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/dataprovider/DataProviderSettingsModule$InteractorDelegate;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposables", "()Lio/reactivex/disposables/CompositeDisposable;", "getNetworkManager", "()Lio/horizontalsystems/bitstashwallet/core/INetworkManager;", "baseProvider", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Provider;", "coin", "Lio/horizontalsystems/bitstashwallet/entities/Coin;", "pingProvider", "", "name", "", "url", "providers", "", "setBaseProvider", "app_devMainnetMasterDebug"})
public final class DataProviderSettingsInteractor implements io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.dataprovider.DataProviderSettingsModule.Interactor {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.dataprovider.DataProviderSettingsModule.InteractorDelegate delegate;
    private final io.horizontalsystems.bitstashwallet.core.ITransactionDataProviderManager dataProviderManager = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.core.INetworkManager networkManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.CompositeDisposable getDisposables() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.dataprovider.DataProviderSettingsModule.InteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.dataprovider.DataProviderSettingsModule.InteractorDelegate p0) {
    }
    
    @java.lang.Override()
    public void pingProvider(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.Provider> providers(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Coin coin) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.Provider baseProvider(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Coin coin) {
        return null;
    }
    
    @java.lang.Override()
    public void setBaseProvider(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Coin coin) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.core.INetworkManager getNetworkManager() {
        return null;
    }
    
    public DataProviderSettingsInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.ITransactionDataProviderManager dataProviderManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.INetworkManager networkManager) {
        super();
    }
}
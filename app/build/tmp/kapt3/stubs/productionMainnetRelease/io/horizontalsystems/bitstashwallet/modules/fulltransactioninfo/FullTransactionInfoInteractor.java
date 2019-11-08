package io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0016J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001aH\u0016J\u0010\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#H\u0016J\u0012\u0010$\u001a\u0004\u0018\u00010\u001a2\u0006\u0010%\u001a\u00020\u001aH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoInteractor;", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$Interactor;", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$ProviderDelegate;", "transactionInfoFactory", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoFactory;", "dataProviderManager", "Lio/horizontalsystems/bitstashwallet/core/managers/TransactionDataProviderManager;", "clipboardManager", "Lio/horizontalsystems/bitstashwallet/viewHelpers/TextHelper;", "(Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoFactory;Lio/horizontalsystems/bitstashwallet/core/managers/TransactionDataProviderManager;Lio/horizontalsystems/bitstashwallet/viewHelpers/TextHelper;)V", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$InteractorDelegate;", "getDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$InteractorDelegate;", "setDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$InteractorDelegate;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposables", "()Lio/reactivex/disposables/CompositeDisposable;", "provider", "Lio/horizontalsystems/bitstashwallet/modules/fulltransactioninfo/FullTransactionInfoModule$FullProvider;", "clear", "", "copyToClipboard", "value", "", "didLoad", "onReceiveTransactionInfo", "transactionRecord", "Lio/horizontalsystems/bitstashwallet/entities/FullTransactionRecord;", "retrieveTransactionInfo", "transactionHash", "updateProvider", "wallet", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "url", "hash", "app_productionMainnetRelease"})
public final class FullTransactionInfoInteractor implements io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.Interactor, io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.ProviderDelegate {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.InteractorDelegate delegate;
    private io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.FullProvider provider;
    private final io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoFactory transactionInfoFactory = null;
    private io.horizontalsystems.bitstashwallet.core.managers.TransactionDataProviderManager dataProviderManager;
    private final io.horizontalsystems.bitstashwallet.viewHelpers.TextHelper clipboardManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.CompositeDisposable getDisposables() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.InteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoModule.InteractorDelegate p0) {
    }
    
    @java.lang.Override()
    public void didLoad() {
    }
    
    @java.lang.Override()
    public void updateProvider(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Wallet wallet) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String url(@org.jetbrains.annotations.NotNull()
    java.lang.String hash) {
        return null;
    }
    
    @java.lang.Override()
    public void retrieveTransactionInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String transactionHash) {
    }
    
    @java.lang.Override()
    public void copyToClipboard(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    @java.lang.Override()
    public void onReceiveTransactionInfo(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.FullTransactionRecord transactionRecord) {
    }
    
    public FullTransactionInfoInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.fulltransactioninfo.FullTransactionInfoFactory transactionInfoFactory, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.managers.TransactionDataProviderManager dataProviderManager, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.viewHelpers.TextHelper clipboardManager) {
        super();
    }
}
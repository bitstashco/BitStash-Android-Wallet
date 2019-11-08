package io.horizontalsystems.bitstashwallet.modules.transactions.transactionInfo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0016"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoPresenter;", "Lio/horizontalsystems/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoModule$ViewDelegate;", "Lio/horizontalsystems/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoModule$InteractorDelegate;", "interactor", "Lio/horizontalsystems/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoModule$Interactor;", "router", "Lio/horizontalsystems/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoModule$Router;", "(Lio/horizontalsystems/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoModule$Interactor;Lio/horizontalsystems/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoModule$Router;)V", "view", "Lio/horizontalsystems/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoModule$View;", "getView", "()Lio/horizontalsystems/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoModule$View;", "setView", "(Lio/horizontalsystems/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoModule$View;)V", "onCopy", "", "value", "", "openFullInfo", "transactionHash", "wallet", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "app_devMainnetMasterDebug"})
public final class TransactionInfoPresenter implements io.horizontalsystems.bitstashwallet.modules.transactions.transactionInfo.TransactionInfoModule.ViewDelegate, io.horizontalsystems.bitstashwallet.modules.transactions.transactionInfo.TransactionInfoModule.InteractorDelegate {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.modules.transactions.transactionInfo.TransactionInfoModule.View view;
    private final io.horizontalsystems.bitstashwallet.modules.transactions.transactionInfo.TransactionInfoModule.Interactor interactor = null;
    private final io.horizontalsystems.bitstashwallet.modules.transactions.transactionInfo.TransactionInfoModule.Router router = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.modules.transactions.transactionInfo.TransactionInfoModule.View getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.modules.transactions.transactionInfo.TransactionInfoModule.View p0) {
    }
    
    @java.lang.Override()
    public void onCopy(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @java.lang.Override()
    public void openFullInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String transactionHash, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Wallet wallet) {
    }
    
    public TransactionInfoPresenter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.transactions.transactionInfo.TransactionInfoModule.Interactor interactor, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.transactions.transactionInfo.TransactionInfoModule.Router router) {
        super();
    }
}
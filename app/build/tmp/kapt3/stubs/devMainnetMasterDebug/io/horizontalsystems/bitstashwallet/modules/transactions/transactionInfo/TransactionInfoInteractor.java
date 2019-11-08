package io.horizontalsystems.bitstashwallet.modules.transactions.transactionInfo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoInteractor;", "Lio/horizontalsystems/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoModule$Interactor;", "clipboardManager", "Lio/horizontalsystems/bitstashwallet/core/IClipboardManager;", "(Lio/horizontalsystems/bitstashwallet/core/IClipboardManager;)V", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoModule$InteractorDelegate;", "getDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoModule$InteractorDelegate;", "setDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoModule$InteractorDelegate;)V", "onCopy", "", "value", "", "app_devMainnetMasterDebug"})
public final class TransactionInfoInteractor implements io.horizontalsystems.bitstashwallet.modules.transactions.transactionInfo.TransactionInfoModule.Interactor {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.modules.transactions.transactionInfo.TransactionInfoModule.InteractorDelegate delegate;
    private io.horizontalsystems.bitstashwallet.core.IClipboardManager clipboardManager;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.modules.transactions.transactionInfo.TransactionInfoModule.InteractorDelegate getDelegate() {
        return null;
    }
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.modules.transactions.transactionInfo.TransactionInfoModule.InteractorDelegate p0) {
    }
    
    @java.lang.Override()
    public void onCopy(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public TransactionInfoInteractor(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IClipboardManager clipboardManager) {
        super();
    }
}
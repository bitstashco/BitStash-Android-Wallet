package app.odapplications.bitstashwallet.modules.transactions.transactionInfo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0005\t\n\u000b\f\rB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\u000e"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoModule;", "", "()V", "init", "", "view", "Lapp/odapplications/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoViewModel;", "router", "Lapp/odapplications/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoModule$Router;", "Interactor", "InteractorDelegate", "Router", "View", "ViewDelegate", "app_productionMainnetRelease"})
public final class TransactionInfoModule {
    public static final app.odapplications.bitstashwallet.modules.transactions.transactionInfo.TransactionInfoModule INSTANCE = null;
    
    public final void init(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.transactions.transactionInfo.TransactionInfoViewModel view, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.transactions.transactionInfo.TransactionInfoModule.Router router) {
    }
    
    private TransactionInfoModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoModule$View;", "", "showCopied", "", "app_productionMainnetRelease"})
    public static abstract interface View {
        
        public abstract void showCopied();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoModule$ViewDelegate;", "", "onCopy", "", "value", "", "openFullInfo", "transactionHash", "coin", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "app_productionMainnetRelease"})
    public static abstract interface ViewDelegate {
        
        public abstract void onCopy(@org.jetbrains.annotations.NotNull()
        java.lang.String value);
        
        public abstract void openFullInfo(@org.jetbrains.annotations.NotNull()
        java.lang.String transactionHash, @org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Wallet coin);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoModule$Interactor;", "", "onCopy", "", "value", "", "app_productionMainnetRelease"})
    public static abstract interface Interactor {
        
        public abstract void onCopy(@org.jetbrains.annotations.NotNull()
        java.lang.String value);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoModule$InteractorDelegate;", "", "app_productionMainnetRelease"})
    public static abstract interface InteractorDelegate {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/transactions/transactionInfo/TransactionInfoModule$Router;", "", "openFullInfo", "", "transactionHash", "", "wallet", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "app_productionMainnetRelease"})
    public static abstract interface Router {
        
        public abstract void openFullInfo(@org.jetbrains.annotations.NotNull()
        java.lang.String transactionHash, @org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Wallet wallet);
    }
}
package io.horizontalsystems.bitstashwallet.modules.send;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0017\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006 "}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendModule;", "", "()V", "init", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$IViewDelegate;", "viewModel", "Lio/horizontalsystems/bitstashwallet/modules/send/SendViewModel;", "wallet", "Lio/horizontalsystems/bitstashwallet/entities/Wallet;", "AmountInfo", "IRouter", "ISendBinanceInteractor", "ISendBitcoinInteractor", "ISendBitcoinInteractorDelegate", "ISendDashInteractor", "ISendDashInteractorDelegate", "ISendEosInteractor", "ISendEthereumInteractor", "ISendHandler", "ISendHandlerDelegate", "ISendInteractor", "ISendInteractorDelegate", "IView", "IViewDelegate", "Input", "InputType", "SendConfirmationAmountViewItem", "SendConfirmationDurationViewItem", "SendConfirmationFeeViewItem", "SendConfirmationMemoViewItem", "SendConfirmationTotalViewItem", "SendConfirmationViewItem", "app_productionMainnetRelease"})
public final class SendModule {
    public static final io.horizontalsystems.bitstashwallet.modules.send.SendModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.modules.send.SendModule.IViewDelegate init(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.send.SendViewModel viewModel, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.Wallet wallet) {
        return null;
    }
    
    private SendModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0016\u0010\u0010\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH&J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018H&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0019"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$IView;", "", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$IViewDelegate;", "getDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$IViewDelegate;", "setDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$IViewDelegate;)V", "loadInputItems", "", "inputs", "", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$Input;", "setSendButtonEnabled", "enabled", "", "showConfirmation", "confirmationViewItems", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$SendConfirmationViewItem;", "showErrorInDialog", "coinException", "Lio/horizontalsystems/bitstashwallet/core/CoinException;", "showErrorInToast", "error", "", "app_productionMainnetRelease"})
    public static abstract interface IView {
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.bitstashwallet.modules.send.SendModule.IViewDelegate getDelegate();
        
        public abstract void setDelegate(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.send.SendModule.IViewDelegate p0);
        
        public abstract void loadInputItems(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends io.horizontalsystems.bitstashwallet.modules.send.SendModule.Input> inputs);
        
        public abstract void setSendButtonEnabled(boolean enabled);
        
        public abstract void showConfirmation(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends io.horizontalsystems.bitstashwallet.modules.send.SendModule.SendConfirmationViewItem> confirmationViewItems);
        
        public abstract void showErrorInToast(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable error);
        
        public abstract void showErrorInDialog(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.core.CoinException coinException);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\rH&J\b\u0010\u0011\u001a\u00020\rH&J\b\u0010\u0012\u001a\u00020\rH&J\b\u0010\u0013\u001a\u00020\rH&J\b\u0010\u0014\u001a\u00020\rH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u00020\u0007X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$IViewDelegate;", "", "handler", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendHandler;", "getHandler", "()Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendHandler;", "view", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$IView;", "getView", "()Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$IView;", "setView", "(Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$IView;)V", "onAddressScan", "", "address", "", "onClear", "onModulesDidLoad", "onProceedClicked", "onSendConfirmed", "onViewDidLoad", "app_productionMainnetRelease"})
    public static abstract interface IViewDelegate {
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.bitstashwallet.modules.send.SendModule.IView getView();
        
        public abstract void setView(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.send.SendModule.IView p0);
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.bitstashwallet.modules.send.SendModule.ISendHandler getHandler();
        
        public abstract void onViewDidLoad();
        
        public abstract void onModulesDidLoad();
        
        public abstract void onAddressScan(@org.jetbrains.annotations.NotNull()
        java.lang.String address);
        
        public abstract void onProceedClicked();
        
        public abstract void onSendConfirmed();
        
        public abstract void onClear();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001a\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\"\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\u000f"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendBitcoinInteractor;", "", "clear", "", "fetchAvailableBalance", "feeRate", "", "address", "", "fetchFee", "amount", "Ljava/math/BigDecimal;", "send", "Lio/reactivex/Single;", "validate", "app_productionMainnetRelease"})
    public static abstract interface ISendBitcoinInteractor {
        
        public abstract void fetchAvailableBalance(long feeRate, @org.jetbrains.annotations.Nullable()
        java.lang.String address);
        
        public abstract void fetchFee(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal amount, long feeRate, @org.jetbrains.annotations.Nullable()
        java.lang.String address);
        
        public abstract void validate(@org.jetbrains.annotations.NotNull()
        java.lang.String address);
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.reactivex.Single<kotlin.Unit> send(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
        java.lang.String address, long feeRate);
        
        public abstract void clear();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendBitcoinInteractorDelegate;", "", "didFetchAvailableBalance", "", "availableBalance", "Ljava/math/BigDecimal;", "didFetchFee", "fee", "app_productionMainnetRelease"})
    public static abstract interface ISendBitcoinInteractorDelegate {
        
        public abstract void didFetchAvailableBalance(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal availableBalance);
        
        public abstract void didFetchFee(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal fee);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u001a\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendDashInteractor;", "", "clear", "", "fetchAvailableBalance", "address", "", "fetchFee", "amount", "Ljava/math/BigDecimal;", "send", "Lio/reactivex/Single;", "validate", "app_productionMainnetRelease"})
    public static abstract interface ISendDashInteractor {
        
        public abstract void fetchAvailableBalance(@org.jetbrains.annotations.Nullable()
        java.lang.String address);
        
        public abstract void fetchFee(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal amount, @org.jetbrains.annotations.Nullable()
        java.lang.String address);
        
        public abstract void validate(@org.jetbrains.annotations.NotNull()
        java.lang.String address);
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.reactivex.Single<kotlin.Unit> send(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
        java.lang.String address);
        
        public abstract void clear();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendDashInteractorDelegate;", "", "didFetchAvailableBalance", "", "availableBalance", "Ljava/math/BigDecimal;", "didFetchFee", "fee", "app_productionMainnetRelease"})
    public static abstract interface ISendDashInteractorDelegate {
        
        public abstract void didFetchAvailableBalance(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal availableBalance);
        
        public abstract void didFetchFee(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal fee);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendEthereumInteractor;", "", "ethereumBalance", "Ljava/math/BigDecimal;", "getEthereumBalance", "()Ljava/math/BigDecimal;", "availableBalance", "gasPrice", "", "fee", "send", "Lio/reactivex/Single;", "", "amount", "address", "", "validate", "app_productionMainnetRelease"})
    public static abstract interface ISendEthereumInteractor {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.math.BigDecimal getEthereumBalance();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.math.BigDecimal availableBalance(long gasPrice);
        
        public abstract void validate(@org.jetbrains.annotations.NotNull()
        java.lang.String address);
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.math.BigDecimal fee(long gasPrice);
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.reactivex.Single<kotlin.Unit> send(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
        java.lang.String address, long gasPrice);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0005\u00a8\u0006\u0012"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendBinanceInteractor;", "", "availableBalance", "Ljava/math/BigDecimal;", "getAvailableBalance", "()Ljava/math/BigDecimal;", "availableBinanceBalance", "getAvailableBinanceBalance", "fee", "getFee", "send", "Lio/reactivex/Single;", "", "amount", "address", "", "memo", "validate", "app_productionMainnetRelease"})
    public static abstract interface ISendBinanceInteractor {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.math.BigDecimal getAvailableBalance();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.math.BigDecimal getAvailableBinanceBalance();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.math.BigDecimal getFee();
        
        public abstract void validate(@org.jetbrains.annotations.NotNull()
        java.lang.String address);
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.reactivex.Single<kotlin.Unit> send(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
        java.lang.String address, @org.jetbrains.annotations.Nullable()
        java.lang.String memo);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u000e"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendEosInteractor;", "", "availableBalance", "Ljava/math/BigDecimal;", "getAvailableBalance", "()Ljava/math/BigDecimal;", "send", "Lio/reactivex/Single;", "", "amount", "account", "", "memo", "validate", "app_productionMainnetRelease"})
    public static abstract interface ISendEosInteractor {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.math.BigDecimal getAvailableBalance();
        
        public abstract void validate(@org.jetbrains.annotations.NotNull()
        java.lang.String account);
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.reactivex.Single<kotlin.Unit> send(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
        java.lang.String account, @org.jetbrains.annotations.Nullable()
        java.lang.String memo);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$IRouter;", "", "closeWithSuccess", "", "scanQrCode", "app_productionMainnetRelease"})
    public static abstract interface IRouter {
        
        public abstract void scanQrCode();
        
        public abstract void closeWithSuccess();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH&J\u0016\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\fH&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendInteractor;", "", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendInteractorDelegate;", "getDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendInteractorDelegate;", "setDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendInteractorDelegate;)V", "clear", "", "send", "sendSingle", "Lio/reactivex/Single;", "app_productionMainnetRelease"})
    public static abstract interface ISendInteractor {
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.bitstashwallet.modules.send.SendModule.ISendInteractorDelegate getDelegate();
        
        public abstract void setDelegate(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.send.SendModule.ISendInteractorDelegate p0);
        
        public abstract void send(@org.jetbrains.annotations.NotNull()
        io.reactivex.Single<kotlin.Unit> sendSingle);
        
        public abstract void clear();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendInteractorDelegate;", "", "didFailToSend", "", "error", "", "didSend", "app_productionMainnetRelease"})
    public static abstract interface ISendInteractorDelegate {
        
        public abstract void didSend();
        
        public abstract void didFailToSend(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable error);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u001bH&J\u0010\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H&J\b\u0010+\u001a\u00020(H&J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020(0-H&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000fX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u00020\u0015X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u00020 X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u0006."}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendHandler;", "", "addressModule", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/address/SendAddressModule$IAddressModule;", "getAddressModule", "()Lio/horizontalsystems/bitstashwallet/modules/send/submodules/address/SendAddressModule$IAddressModule;", "setAddressModule", "(Lio/horizontalsystems/bitstashwallet/modules/send/submodules/address/SendAddressModule$IAddressModule;)V", "amountModule", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IAmountModule;", "getAmountModule", "()Lio/horizontalsystems/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IAmountModule;", "setAmountModule", "(Lio/horizontalsystems/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IAmountModule;)V", "delegate", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendHandlerDelegate;", "getDelegate", "()Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendHandlerDelegate;", "setDelegate", "(Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendHandlerDelegate;)V", "feeModule", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IFeeModule;", "getFeeModule", "()Lio/horizontalsystems/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IFeeModule;", "setFeeModule", "(Lio/horizontalsystems/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IFeeModule;)V", "inputItems", "", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$Input;", "getInputItems", "()Ljava/util/List;", "memoModule", "Lio/horizontalsystems/bitstashwallet/modules/send/submodules/memo/SendMemoModule$IMemoModule;", "getMemoModule", "()Lio/horizontalsystems/bitstashwallet/modules/send/submodules/memo/SendMemoModule$IMemoModule;", "setMemoModule", "(Lio/horizontalsystems/bitstashwallet/modules/send/submodules/memo/SendMemoModule$IMemoModule;)V", "confirmationViewItems", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$SendConfirmationViewItem;", "onAddressScan", "", "address", "", "onModulesDidLoad", "sendSingle", "Lio/reactivex/Single;", "app_productionMainnetRelease"})
    public static abstract interface ISendHandler {
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IAmountModule getAmountModule();
        
        public abstract void setAmountModule(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IAmountModule p0);
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.bitstashwallet.modules.send.submodules.address.SendAddressModule.IAddressModule getAddressModule();
        
        public abstract void setAddressModule(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.send.submodules.address.SendAddressModule.IAddressModule p0);
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.SendFeeModule.IFeeModule getFeeModule();
        
        public abstract void setFeeModule(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.send.submodules.fee.SendFeeModule.IFeeModule p0);
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.bitstashwallet.modules.send.submodules.memo.SendMemoModule.IMemoModule getMemoModule();
        
        public abstract void setMemoModule(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.send.submodules.memo.SendMemoModule.IMemoModule p0);
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<io.horizontalsystems.bitstashwallet.modules.send.SendModule.Input> getInputItems();
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.horizontalsystems.bitstashwallet.modules.send.SendModule.ISendHandlerDelegate getDelegate();
        
        public abstract void setDelegate(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.send.SendModule.ISendHandlerDelegate p0);
        
        public abstract void onModulesDidLoad();
        
        public abstract void onAddressScan(@org.jetbrains.annotations.NotNull()
        java.lang.String address);
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<io.horizontalsystems.bitstashwallet.modules.send.SendModule.SendConfirmationViewItem> confirmationViewItems();
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.reactivex.Single<kotlin.Unit> sendSingle();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$ISendHandlerDelegate;", "", "onChange", "", "isValid", "", "app_productionMainnetRelease"})
    public static abstract interface ISendHandlerDelegate {
        
        public abstract void onChange(boolean isValid);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$SendConfirmationViewItem;", "", "()V", "app_productionMainnetRelease"})
    public static abstract class SendConfirmationViewItem {
        
        public SendConfirmationViewItem() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$SendConfirmationAmountViewItem;", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$SendConfirmationViewItem;", "primaryInfo", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$AmountInfo;", "secondaryInfo", "receiver", "", "(Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$AmountInfo;Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$AmountInfo;Ljava/lang/String;)V", "getPrimaryInfo", "()Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$AmountInfo;", "getReceiver", "()Ljava/lang/String;", "getSecondaryInfo", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionMainnetRelease"})
    public static final class SendConfirmationAmountViewItem extends io.horizontalsystems.bitstashwallet.modules.send.SendModule.SendConfirmationViewItem {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo primaryInfo = null;
        @org.jetbrains.annotations.Nullable()
        private final io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo secondaryInfo = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String receiver = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo getPrimaryInfo() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo getSecondaryInfo() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReceiver() {
            return null;
        }
        
        public SendConfirmationAmountViewItem(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo primaryInfo, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo secondaryInfo, @org.jetbrains.annotations.NotNull()
        java.lang.String receiver) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.modules.send.SendModule.SendConfirmationAmountViewItem copy(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo primaryInfo, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo secondaryInfo, @org.jetbrains.annotations.NotNull()
        java.lang.String receiver) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$SendConfirmationFeeViewItem;", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$SendConfirmationViewItem;", "primaryInfo", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$AmountInfo;", "secondaryInfo", "(Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$AmountInfo;Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$AmountInfo;)V", "getPrimaryInfo", "()Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$AmountInfo;", "getSecondaryInfo", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionMainnetRelease"})
    public static final class SendConfirmationFeeViewItem extends io.horizontalsystems.bitstashwallet.modules.send.SendModule.SendConfirmationViewItem {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo primaryInfo = null;
        @org.jetbrains.annotations.Nullable()
        private final io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo secondaryInfo = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo getPrimaryInfo() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo getSecondaryInfo() {
            return null;
        }
        
        public SendConfirmationFeeViewItem(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo primaryInfo, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo secondaryInfo) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.modules.send.SendModule.SendConfirmationFeeViewItem copy(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo primaryInfo, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo secondaryInfo) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$SendConfirmationTotalViewItem;", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$SendConfirmationViewItem;", "primaryInfo", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$AmountInfo;", "secondaryInfo", "(Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$AmountInfo;Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$AmountInfo;)V", "getPrimaryInfo", "()Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$AmountInfo;", "getSecondaryInfo", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionMainnetRelease"})
    public static final class SendConfirmationTotalViewItem extends io.horizontalsystems.bitstashwallet.modules.send.SendModule.SendConfirmationViewItem {
        @org.jetbrains.annotations.NotNull()
        private final io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo primaryInfo = null;
        @org.jetbrains.annotations.Nullable()
        private final io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo secondaryInfo = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo getPrimaryInfo() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo getSecondaryInfo() {
            return null;
        }
        
        public SendConfirmationTotalViewItem(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo primaryInfo, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo secondaryInfo) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.modules.send.SendModule.SendConfirmationTotalViewItem copy(@org.jetbrains.annotations.NotNull()
        io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo primaryInfo, @org.jetbrains.annotations.Nullable()
        io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo secondaryInfo) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$SendConfirmationMemoViewItem;", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$SendConfirmationViewItem;", "memo", "", "(Ljava/lang/String;)V", "getMemo", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_productionMainnetRelease"})
    public static final class SendConfirmationMemoViewItem extends io.horizontalsystems.bitstashwallet.modules.send.SendModule.SendConfirmationViewItem {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String memo = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getMemo() {
            return null;
        }
        
        public SendConfirmationMemoViewItem(@org.jetbrains.annotations.Nullable()
        java.lang.String memo) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.modules.send.SendModule.SendConfirmationMemoViewItem copy(@org.jetbrains.annotations.Nullable()
        java.lang.String memo) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$SendConfirmationDurationViewItem;", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$SendConfirmationViewItem;", "duration", "", "(Ljava/lang/Long;)V", "getDuration", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "copy", "(Ljava/lang/Long;)Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$SendConfirmationDurationViewItem;", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionMainnetRelease"})
    public static final class SendConfirmationDurationViewItem extends io.horizontalsystems.bitstashwallet.modules.send.SendModule.SendConfirmationViewItem {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long duration = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getDuration() {
            return null;
        }
        
        public SendConfirmationDurationViewItem(@org.jetbrains.annotations.Nullable()
        java.lang.Long duration) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.modules.send.SendModule.SendConfirmationDurationViewItem copy(@org.jetbrains.annotations.Nullable()
        java.lang.Long duration) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0000j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$InputType;", "", "(Ljava/lang/String;I)V", "reversed", "COIN", "CURRENCY", "app_productionMainnetRelease"})
    public static enum InputType {
        /*public static final*/ COIN /* = new COIN() */,
        /*public static final*/ CURRENCY /* = new CURRENCY() */;
        
        @org.jetbrains.annotations.NotNull()
        public final io.horizontalsystems.bitstashwallet.modules.send.SendModule.InputType reversed() {
            return null;
        }
        
        InputType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$Input;", "", "()V", "Address", "Amount", "Fee", "Memo", "ProceedButton", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$Input$Amount;", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$Input$Address;", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$Input$Fee;", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$Input$Memo;", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$Input$ProceedButton;", "app_productionMainnetRelease"})
    public static abstract class Input {
        
        private Input() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$Input$Amount;", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$Input;", "()V", "app_productionMainnetRelease"})
        public static final class Amount extends io.horizontalsystems.bitstashwallet.modules.send.SendModule.Input {
            public static final io.horizontalsystems.bitstashwallet.modules.send.SendModule.Input.Amount INSTANCE = null;
            
            private Amount() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$Input$Address;", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$Input;", "()V", "app_productionMainnetRelease"})
        public static final class Address extends io.horizontalsystems.bitstashwallet.modules.send.SendModule.Input {
            public static final io.horizontalsystems.bitstashwallet.modules.send.SendModule.Input.Address INSTANCE = null;
            
            private Address() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$Input$Fee;", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$Input;", "isAdjustable", "", "(Z)V", "()Z", "app_productionMainnetRelease"})
        public static final class Fee extends io.horizontalsystems.bitstashwallet.modules.send.SendModule.Input {
            private final boolean isAdjustable = false;
            
            public final boolean isAdjustable() {
                return false;
            }
            
            public Fee(boolean isAdjustable) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$Input$Memo;", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$Input;", "maxLength", "", "(I)V", "getMaxLength", "()I", "app_productionMainnetRelease"})
        public static final class Memo extends io.horizontalsystems.bitstashwallet.modules.send.SendModule.Input {
            private final int maxLength = 0;
            
            public final int getMaxLength() {
                return 0;
            }
            
            public Memo(int maxLength) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$Input$ProceedButton;", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$Input;", "()V", "app_productionMainnetRelease"})
        public static final class ProceedButton extends io.horizontalsystems.bitstashwallet.modules.send.SendModule.Input {
            public static final io.horizontalsystems.bitstashwallet.modules.send.SendModule.Input.ProceedButton INSTANCE = null;
            
            private ProceedButton() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0082\u0001\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$AmountInfo;", "", "()V", "getAmountName", "", "getFormatted", "CoinValueInfo", "CurrencyValueInfo", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$AmountInfo$CoinValueInfo;", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$AmountInfo$CurrencyValueInfo;", "app_productionMainnetRelease"})
    public static abstract class AmountInfo {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAmountName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFormatted() {
            return null;
        }
        
        private AmountInfo() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$AmountInfo$CoinValueInfo;", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$AmountInfo;", "coinValue", "Lio/horizontalsystems/bitstashwallet/entities/CoinValue;", "(Lio/horizontalsystems/bitstashwallet/entities/CoinValue;)V", "getCoinValue", "()Lio/horizontalsystems/bitstashwallet/entities/CoinValue;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionMainnetRelease"})
        public static final class CoinValueInfo extends io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo {
            @org.jetbrains.annotations.NotNull()
            private final io.horizontalsystems.bitstashwallet.entities.CoinValue coinValue = null;
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bitstashwallet.entities.CoinValue getCoinValue() {
                return null;
            }
            
            public CoinValueInfo(@org.jetbrains.annotations.NotNull()
            io.horizontalsystems.bitstashwallet.entities.CoinValue coinValue) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bitstashwallet.entities.CoinValue component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo.CoinValueInfo copy(@org.jetbrains.annotations.NotNull()
            io.horizontalsystems.bitstashwallet.entities.CoinValue coinValue) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$AmountInfo$CurrencyValueInfo;", "Lio/horizontalsystems/bitstashwallet/modules/send/SendModule$AmountInfo;", "currencyValue", "Lio/horizontalsystems/bitstashwallet/entities/CurrencyValue;", "(Lio/horizontalsystems/bitstashwallet/entities/CurrencyValue;)V", "getCurrencyValue", "()Lio/horizontalsystems/bitstashwallet/entities/CurrencyValue;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionMainnetRelease"})
        public static final class CurrencyValueInfo extends io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo {
            @org.jetbrains.annotations.NotNull()
            private final io.horizontalsystems.bitstashwallet.entities.CurrencyValue currencyValue = null;
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bitstashwallet.entities.CurrencyValue getCurrencyValue() {
                return null;
            }
            
            public CurrencyValueInfo(@org.jetbrains.annotations.NotNull()
            io.horizontalsystems.bitstashwallet.entities.CurrencyValue currencyValue) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bitstashwallet.entities.CurrencyValue component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final io.horizontalsystems.bitstashwallet.modules.send.SendModule.AmountInfo.CurrencyValueInfo copy(@org.jetbrains.annotations.NotNull()
            io.horizontalsystems.bitstashwallet.entities.CurrencyValue currencyValue) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
    }
}
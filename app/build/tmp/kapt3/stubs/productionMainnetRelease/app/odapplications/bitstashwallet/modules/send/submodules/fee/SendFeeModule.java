package app.odapplications.bitstashwallet.modules.send.submodules.fee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001:\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a8\u0006\u0013"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeeModule;", "", "()V", "init", "Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IFeeModule;", "view", "Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeeViewModel;", "coin", "Lapp/odapplications/bitstashwallet/entities/Coin;", "moduleDelegate", "Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IFeeModuleDelegate;", "FeeRateInfoViewItem", "IFeeModule", "IFeeModuleDelegate", "IInteractor", "IInteractorDelegate", "IView", "IViewDelegate", "InsufficientFeeBalance", "app_productionMainnetRelease"})
public final class SendFeeModule {
    public static final app.odapplications.bitstashwallet.modules.send.submodules.fee.SendFeeModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.modules.send.submodules.fee.SendFeeModule.IFeeModule init(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.send.submodules.fee.SendFeeViewModel view, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Coin coin, @org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.send.submodules.fee.SendFeeModule.IFeeModuleDelegate moduleDelegate) {
        return null;
    }
    
    private SendFeeModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00060\u0001j\u0002`\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f\u00a8\u0006\u0012"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeeModule$InsufficientFeeBalance;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "coin", "Lapp/odapplications/bitstashwallet/entities/Coin;", "coinProtocol", "", "feeCoin", "fee", "Lapp/odapplications/bitstashwallet/entities/CoinValue;", "(Lapp/odapplications/bitstashwallet/entities/Coin;Ljava/lang/String;Lapp/odapplications/bitstashwallet/entities/Coin;Lapp/odapplications/bitstashwallet/entities/CoinValue;)V", "getCoin", "()Lapp/odapplications/bitstashwallet/entities/Coin;", "getCoinProtocol", "()Ljava/lang/String;", "getFee", "()Lapp/odapplications/bitstashwallet/entities/CoinValue;", "getFeeCoin", "app_productionMainnetRelease"})
    public static final class InsufficientFeeBalance extends java.lang.Exception {
        @org.jetbrains.annotations.NotNull()
        private final app.odapplications.bitstashwallet.entities.Coin coin = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String coinProtocol = null;
        @org.jetbrains.annotations.NotNull()
        private final app.odapplications.bitstashwallet.entities.Coin feeCoin = null;
        @org.jetbrains.annotations.NotNull()
        private final app.odapplications.bitstashwallet.entities.CoinValue fee = null;
        
        @org.jetbrains.annotations.NotNull()
        public final app.odapplications.bitstashwallet.entities.Coin getCoin() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCoinProtocol() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final app.odapplications.bitstashwallet.entities.Coin getFeeCoin() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final app.odapplications.bitstashwallet.entities.CoinValue getFee() {
            return null;
        }
        
        public InsufficientFeeBalance(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Coin coin, @org.jetbrains.annotations.NotNull()
        java.lang.String coinProtocol, @org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.Coin feeCoin, @org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.CoinValue fee) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0016\u0010\u0010\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H&\u00a8\u0006\u0014"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IView;", "", "setDuration", "", "duration", "", "setFeePriority", "priority", "Lapp/odapplications/bitstashwallet/core/FeeRatePriority;", "setInsufficientFeeBalanceError", "insufficientFeeBalance", "Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeeModule$InsufficientFeeBalance;", "setPrimaryFee", "feeAmount", "", "setSecondaryFee", "showFeeRatePrioritySelector", "feeRates", "", "Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeeModule$FeeRateInfoViewItem;", "app_productionMainnetRelease"})
    public static abstract interface IView {
        
        public abstract void setPrimaryFee(@org.jetbrains.annotations.Nullable()
        java.lang.String feeAmount);
        
        public abstract void setSecondaryFee(@org.jetbrains.annotations.Nullable()
        java.lang.String feeAmount);
        
        public abstract void setInsufficientFeeBalanceError(@org.jetbrains.annotations.Nullable()
        app.odapplications.bitstashwallet.modules.send.submodules.fee.SendFeeModule.InsufficientFeeBalance insufficientFeeBalance);
        
        public abstract void setDuration(long duration);
        
        public abstract void setFeePriority(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.core.FeeRatePriority priority);
        
        public abstract void showFeeRatePrioritySelector(@org.jetbrains.annotations.NotNull()
        java.util.List<app.odapplications.bitstashwallet.modules.send.submodules.fee.SendFeeModule.FeeRateInfoViewItem> feeRates);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&\u00a8\u0006\t"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IViewDelegate;", "", "onChangeFeeRate", "", "feeRateInfo", "Lapp/odapplications/bitstashwallet/entities/FeeRateInfo;", "onClear", "onClickFeeRatePriority", "onViewDidLoad", "app_productionMainnetRelease"})
    public static abstract interface IViewDelegate {
        
        public abstract void onViewDidLoad();
        
        public abstract void onChangeFeeRate(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.FeeRateInfo feeRateInfo);
        
        public abstract void onClickFeeRatePriority();
        
        public abstract void onClear();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IInteractor;", "", "clear", "", "getFeeRates", "", "Lapp/odapplications/bitstashwallet/entities/FeeRateInfo;", "getRate", "coinCode", "", "app_productionMainnetRelease"})
    public static abstract interface IInteractor {
        
        public abstract void getRate(@org.jetbrains.annotations.NotNull()
        java.lang.String coinCode);
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.util.List<app.odapplications.bitstashwallet.entities.FeeRateInfo> getFeeRates();
        
        public abstract void clear();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IInteractorDelegate;", "", "onRateFetched", "", "latestRate", "Lapp/odapplications/bitstashwallet/entities/Rate;", "app_productionMainnetRelease"})
    public static abstract interface IInteractorDelegate {
        
        public abstract void onRateFetched(@org.jetbrains.annotations.Nullable()
        app.odapplications.bitstashwallet.entities.Rate latestRate);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0015H&J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IFeeModule;", "", "duration", "", "getDuration", "()Ljava/lang/Long;", "feeRate", "getFeeRate", "()J", "isValid", "", "()Z", "primaryAmountInfo", "Lapp/odapplications/bitstashwallet/modules/send/SendModule$AmountInfo;", "getPrimaryAmountInfo", "()Lapp/odapplications/bitstashwallet/modules/send/SendModule$AmountInfo;", "secondaryAmountInfo", "getSecondaryAmountInfo", "setAvailableFeeBalance", "", "availableFeeBalance", "Ljava/math/BigDecimal;", "setFee", "fee", "setInputType", "inputType", "Lapp/odapplications/bitstashwallet/modules/send/SendModule$InputType;", "app_productionMainnetRelease"})
    public static abstract interface IFeeModule {
        
        public abstract boolean isValid();
        
        public abstract long getFeeRate();
        
        @org.jetbrains.annotations.NotNull()
        public abstract app.odapplications.bitstashwallet.modules.send.SendModule.AmountInfo getPrimaryAmountInfo();
        
        @org.jetbrains.annotations.Nullable()
        public abstract app.odapplications.bitstashwallet.modules.send.SendModule.AmountInfo getSecondaryAmountInfo();
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.Long getDuration();
        
        public abstract void setFee(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal fee);
        
        public abstract void setAvailableFeeBalance(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal availableFeeBalance);
        
        public abstract void setInputType(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.modules.send.SendModule.InputType inputType);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IFeeModuleDelegate;", "", "onUpdateFeeRate", "", "feeRate", "", "app_productionMainnetRelease"})
    public static abstract interface IFeeModuleDelegate {
        
        public abstract void onUpdateFeeRate(long feeRate);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeeModule$FeeRateInfoViewItem;", "", "feeRateInfo", "Lapp/odapplications/bitstashwallet/entities/FeeRateInfo;", "selected", "", "(Lapp/odapplications/bitstashwallet/entities/FeeRateInfo;Z)V", "getFeeRateInfo", "()Lapp/odapplications/bitstashwallet/entities/FeeRateInfo;", "getSelected", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_productionMainnetRelease"})
    public static final class FeeRateInfoViewItem {
        @org.jetbrains.annotations.NotNull()
        private final app.odapplications.bitstashwallet.entities.FeeRateInfo feeRateInfo = null;
        private final boolean selected = false;
        
        @org.jetbrains.annotations.NotNull()
        public final app.odapplications.bitstashwallet.entities.FeeRateInfo getFeeRateInfo() {
            return null;
        }
        
        public final boolean getSelected() {
            return false;
        }
        
        public FeeRateInfoViewItem(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.FeeRateInfo feeRateInfo, boolean selected) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final app.odapplications.bitstashwallet.entities.FeeRateInfo component1() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final app.odapplications.bitstashwallet.modules.send.submodules.fee.SendFeeModule.FeeRateInfoViewItem copy(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.FeeRateInfo feeRateInfo, boolean selected) {
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
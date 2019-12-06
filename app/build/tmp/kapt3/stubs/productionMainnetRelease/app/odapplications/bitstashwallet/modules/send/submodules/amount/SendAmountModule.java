package app.odapplications.bitstashwallet.modules.send.submodules.amount;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0007\u000b\f\r\u000e\u000f\u0010\u0011B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a8\u0006\u0012"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountModule;", "", "()V", "init", "Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountPresenter;", "view", "Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountViewModel;", "wallet", "Lapp/odapplications/bitstashwallet/entities/Wallet;", "moduleDelegate", "Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IAmountModuleDelegate;", "IAmountModule", "IAmountModuleDelegate", "IInteractor", "IInteractorDelegate", "IView", "IViewDelegate", "ValidationError", "app_productionMainnetRelease"})
public final class SendAmountModule {
    public static final app.odapplications.bitstashwallet.modules.send.submodules.amount.SendAmountModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.modules.send.submodules.amount.SendAmountPresenter init(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.send.submodules.amount.SendAmountViewModel view, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Wallet wallet, @org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IAmountModuleDelegate moduleDelegate) {
        return null;
    }
    
    private SendAmountModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0011H&\u00a8\u0006\u0014"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IView;", "", "addTextChangeListener", "", "removeTextChangeListener", "revertAmount", "amount", "", "setAmount", "setAmountType", "prefix", "setHint", "hint", "setHintErrorBalance", "hintErrorBalance", "setMaxButtonVisible", "visible", "", "setSwitchButtonEnabled", "enabled", "app_productionMainnetRelease"})
    public static abstract interface IView {
        
        public abstract void setAmountType(@org.jetbrains.annotations.Nullable()
        java.lang.String prefix);
        
        public abstract void setAmount(@org.jetbrains.annotations.NotNull()
        java.lang.String amount);
        
        public abstract void setHint(@org.jetbrains.annotations.Nullable()
        java.lang.String hint);
        
        public abstract void setHintErrorBalance(@org.jetbrains.annotations.Nullable()
        java.lang.String hintErrorBalance);
        
        public abstract void setSwitchButtonEnabled(boolean enabled);
        
        public abstract void setMaxButtonVisible(boolean visible);
        
        public abstract void addTextChangeListener();
        
        public abstract void removeTextChangeListener();
        
        public abstract void revertAmount(@org.jetbrains.annotations.NotNull()
        java.lang.String amount);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&\u00a8\u0006\t"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IViewDelegate;", "", "onAmountChange", "", "amountString", "", "onMaxClick", "onSwitchClick", "onViewDidLoad", "app_productionMainnetRelease"})
    public static abstract interface IViewDelegate {
        
        public abstract void onViewDidLoad();
        
        public abstract void onAmountChange(@org.jetbrains.annotations.NotNull()
        java.lang.String amountString);
        
        public abstract void onSwitchClick();
        
        public abstract void onMaxClick();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IInteractor;", "", "defaultInputType", "Lapp/odapplications/bitstashwallet/modules/send/SendModule$InputType;", "getDefaultInputType", "()Lapp/odapplications/bitstashwallet/modules/send/SendModule$InputType;", "setDefaultInputType", "(Lapp/odapplications/bitstashwallet/modules/send/SendModule$InputType;)V", "retrieveRate", "", "app_productionMainnetRelease"})
    public static abstract interface IInteractor {
        
        @org.jetbrains.annotations.NotNull()
        public abstract app.odapplications.bitstashwallet.modules.send.SendModule.InputType getDefaultInputType();
        
        public abstract void setDefaultInputType(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.modules.send.SendModule.InputType p0);
        
        public abstract void retrieveRate();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IInteractorDelegate;", "", "didRateRetrieve", "", "rate", "Lapp/odapplications/bitstashwallet/entities/Rate;", "app_productionMainnetRelease"})
    public static abstract interface IInteractorDelegate {
        
        public abstract void didRateRetrieve(@org.jetbrains.annotations.Nullable()
        app.odapplications.bitstashwallet.entities.Rate rate);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0012\u001a\u00020\u0013H&J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0007H&J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0007H&J\b\u0010\u001a\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001b"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IAmountModule;", "", "coinAmount", "Lapp/odapplications/bitstashwallet/entities/CoinValue;", "getCoinAmount", "()Lapp/odapplications/bitstashwallet/entities/CoinValue;", "currentAmount", "Ljava/math/BigDecimal;", "getCurrentAmount", "()Ljava/math/BigDecimal;", "fiatAmount", "Lapp/odapplications/bitstashwallet/entities/CurrencyValue;", "getFiatAmount", "()Lapp/odapplications/bitstashwallet/entities/CurrencyValue;", "inputType", "Lapp/odapplications/bitstashwallet/modules/send/SendModule$InputType;", "getInputType", "()Lapp/odapplications/bitstashwallet/modules/send/SendModule$InputType;", "primaryAmountInfo", "Lapp/odapplications/bitstashwallet/modules/send/SendModule$AmountInfo;", "secondaryAmountInfo", "setAmount", "", "amount", "setAvailableBalance", "availableBalance", "validAmount", "app_productionMainnetRelease"})
    public static abstract interface IAmountModule {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.math.BigDecimal getCurrentAmount();
        
        @org.jetbrains.annotations.NotNull()
        public abstract app.odapplications.bitstashwallet.modules.send.SendModule.InputType getInputType();
        
        @org.jetbrains.annotations.NotNull()
        public abstract app.odapplications.bitstashwallet.entities.CoinValue getCoinAmount();
        
        @org.jetbrains.annotations.Nullable()
        public abstract app.odapplications.bitstashwallet.entities.CurrencyValue getFiatAmount();
        
        @org.jetbrains.annotations.NotNull()
        public abstract app.odapplications.bitstashwallet.modules.send.SendModule.AmountInfo primaryAmountInfo();
        
        @org.jetbrains.annotations.Nullable()
        public abstract app.odapplications.bitstashwallet.modules.send.SendModule.AmountInfo secondaryAmountInfo();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.math.BigDecimal validAmount();
        
        public abstract void setAmount(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal amount);
        
        public abstract void setAvailableBalance(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal availableBalance);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IAmountModuleDelegate;", "", "onChangeAmount", "", "onChangeInputType", "inputType", "Lapp/odapplications/bitstashwallet/modules/send/SendModule$InputType;", "app_productionMainnetRelease"})
    public static abstract interface IAmountModuleDelegate {
        
        public abstract void onChangeAmount();
        
        public abstract void onChangeInputType(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.modules.send.SendModule.InputType inputType);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0004\u0005B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0006"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountModule$ValidationError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "EmptyValue", "InsufficientBalance", "app_productionMainnetRelease"})
    public static class ValidationError extends java.lang.Exception {
        
        public ValidationError() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountModule$ValidationError$EmptyValue;", "Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountModule$ValidationError;", "field", "", "(Ljava/lang/String;)V", "getField", "()Ljava/lang/String;", "app_productionMainnetRelease"})
        public static final class EmptyValue extends app.odapplications.bitstashwallet.modules.send.submodules.amount.SendAmountModule.ValidationError {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String field = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getField() {
                return null;
            }
            
            public EmptyValue(@org.jetbrains.annotations.NotNull()
            java.lang.String field) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountModule$ValidationError$InsufficientBalance;", "Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountModule$ValidationError;", "availableBalance", "Lapp/odapplications/bitstashwallet/modules/send/SendModule$AmountInfo;", "(Lapp/odapplications/bitstashwallet/modules/send/SendModule$AmountInfo;)V", "getAvailableBalance", "()Lapp/odapplications/bitstashwallet/modules/send/SendModule$AmountInfo;", "app_productionMainnetRelease"})
        public static final class InsufficientBalance extends app.odapplications.bitstashwallet.modules.send.submodules.amount.SendAmountModule.ValidationError {
            @org.jetbrains.annotations.Nullable()
            private final app.odapplications.bitstashwallet.modules.send.SendModule.AmountInfo availableBalance = null;
            
            @org.jetbrains.annotations.Nullable()
            public final app.odapplications.bitstashwallet.modules.send.SendModule.AmountInfo getAvailableBalance() {
                return null;
            }
            
            public InsufficientBalance(@org.jetbrains.annotations.Nullable()
            app.odapplications.bitstashwallet.modules.send.SendModule.AmountInfo availableBalance) {
                super();
            }
        }
    }
}
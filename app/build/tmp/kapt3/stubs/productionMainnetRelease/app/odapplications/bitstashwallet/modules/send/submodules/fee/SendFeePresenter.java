package app.odapplications.bitstashwallet.modules.send.submodules.fee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B;\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u001eH\u0002J\u0010\u0010=\u001a\u00020>2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010?\u001a\u00020>H\u0016J\b\u0010@\u001a\u00020>H\u0016J\u0012\u0010A\u001a\u00020>2\b\u0010B\u001a\u0004\u0018\u000109H\u0016J\b\u0010C\u001a\u00020>H\u0016J\u0010\u0010D\u001a\u00020>2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010E\u001a\u00020>2\u0006\u0010\u0019\u001a\u00020\u0011H\u0016J\u0010\u0010F\u001a\u00020>2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010G\u001a\u00020>H\u0002J\b\u0010H\u001a\u00020>H\u0002J\b\u0010I\u001a\u00020>H\u0002J\b\u0010J\u001a\u00020>H\u0002R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u00020$8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b#\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020-8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b.\u0010/R\u0016\u00100\u001a\u0004\u0018\u00010-8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b1\u0010/R\u001c\u00102\u001a\u0004\u0018\u000103X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0010\u00108\u001a\u0004\u0018\u000109X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006K"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeePresenter;", "Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IViewDelegate;", "Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IInteractorDelegate;", "Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IFeeModule;", "interactor", "Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IInteractor;", "helper", "Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeePresenterHelper;", "baseCoin", "Lapp/odapplications/bitstashwallet/entities/Coin;", "baseCurrency", "Lapp/odapplications/bitstashwallet/entities/Currency;", "feeCoinData", "Lkotlin/Pair;", "", "(Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IInteractor;Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeePresenterHelper;Lapp/odapplications/bitstashwallet/entities/Coin;Lapp/odapplications/bitstashwallet/entities/Currency;Lkotlin/Pair;)V", "availableFeeBalance", "Ljava/math/BigDecimal;", "coin", "getCoin", "()Lapp/odapplications/bitstashwallet/entities/Coin;", "duration", "", "getDuration", "()Ljava/lang/Long;", "fee", "feeRate", "getFeeRate", "()J", "feeRateInfo", "Lapp/odapplications/bitstashwallet/entities/FeeRateInfo;", "feeRates", "", "inputType", "Lapp/odapplications/bitstashwallet/modules/send/SendModule$InputType;", "isValid", "", "()Z", "moduleDelegate", "Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IFeeModuleDelegate;", "getModuleDelegate", "()Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IFeeModuleDelegate;", "setModuleDelegate", "(Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IFeeModuleDelegate;)V", "primaryAmountInfo", "Lapp/odapplications/bitstashwallet/modules/send/SendModule$AmountInfo;", "getPrimaryAmountInfo", "()Lapp/odapplications/bitstashwallet/modules/send/SendModule$AmountInfo;", "secondaryAmountInfo", "getSecondaryAmountInfo", "view", "Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IView;", "getView", "()Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IView;", "setView", "(Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeeModule$IView;)V", "xRate", "Lapp/odapplications/bitstashwallet/entities/Rate;", "feeRateInfoViewItem", "Lapp/odapplications/bitstashwallet/modules/send/submodules/fee/SendFeeModule$FeeRateInfoViewItem;", "rateInfo", "onChangeFeeRate", "", "onClear", "onClickFeeRatePriority", "onRateFetched", "latestRate", "onViewDidLoad", "setAvailableFeeBalance", "setFee", "setInputType", "syncError", "syncFeeLabels", "syncFeeRateLabels", "validate", "app_productionMainnetRelease"})
public final class SendFeePresenter implements app.odapplications.bitstashwallet.modules.send.submodules.fee.SendFeeModule.IViewDelegate, app.odapplications.bitstashwallet.modules.send.submodules.fee.SendFeeModule.IInteractorDelegate, app.odapplications.bitstashwallet.modules.send.submodules.fee.SendFeeModule.IFeeModule {
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.send.submodules.fee.SendFeeModule.IView view;
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.send.submodules.fee.SendFeeModule.IFeeModuleDelegate moduleDelegate;
    private app.odapplications.bitstashwallet.entities.Rate xRate;
    private app.odapplications.bitstashwallet.modules.send.SendModule.InputType inputType;
    private java.math.BigDecimal fee;
    private java.math.BigDecimal availableFeeBalance;
    private java.util.List<app.odapplications.bitstashwallet.entities.FeeRateInfo> feeRates;
    private app.odapplications.bitstashwallet.entities.FeeRateInfo feeRateInfo;
    private final app.odapplications.bitstashwallet.modules.send.submodules.fee.SendFeeModule.IInteractor interactor = null;
    private final app.odapplications.bitstashwallet.modules.send.submodules.fee.SendFeePresenterHelper helper = null;
    private final app.odapplications.bitstashwallet.entities.Coin baseCoin = null;
    private final app.odapplications.bitstashwallet.entities.Currency baseCurrency = null;
    private final kotlin.Pair<app.odapplications.bitstashwallet.entities.Coin, java.lang.String> feeCoinData = null;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.send.submodules.fee.SendFeeModule.IView getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.send.submodules.fee.SendFeeModule.IView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.send.submodules.fee.SendFeeModule.IFeeModuleDelegate getModuleDelegate() {
        return null;
    }
    
    public final void setModuleDelegate(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.send.submodules.fee.SendFeeModule.IFeeModuleDelegate p0) {
    }
    
    private final app.odapplications.bitstashwallet.entities.Coin getCoin() {
        return null;
    }
    
    private final void syncError() {
    }
    
    private final void syncFeeLabels() {
    }
    
    private final void syncFeeRateLabels() {
    }
    
    private final void validate() {
    }
    
    @java.lang.Override()
    public boolean isValid() {
        return false;
    }
    
    @java.lang.Override()
    public long getFeeRate() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.modules.send.SendModule.AmountInfo getPrimaryAmountInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.modules.send.SendModule.AmountInfo getSecondaryAmountInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Long getDuration() {
        return null;
    }
    
    @java.lang.Override()
    public void setFee(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal fee) {
    }
    
    @java.lang.Override()
    public void setAvailableFeeBalance(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal availableFeeBalance) {
    }
    
    @java.lang.Override()
    public void setInputType(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.send.SendModule.InputType inputType) {
    }
    
    @java.lang.Override()
    public void onViewDidLoad() {
    }
    
    @java.lang.Override()
    public void onClickFeeRatePriority() {
    }
    
    private final app.odapplications.bitstashwallet.modules.send.submodules.fee.SendFeeModule.FeeRateInfoViewItem feeRateInfoViewItem(app.odapplications.bitstashwallet.entities.FeeRateInfo rateInfo) {
        return null;
    }
    
    @java.lang.Override()
    public void onChangeFeeRate(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.FeeRateInfo feeRateInfo) {
    }
    
    @java.lang.Override()
    public void onClear() {
    }
    
    @java.lang.Override()
    public void onRateFetched(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.entities.Rate latestRate) {
    }
    
    public SendFeePresenter(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.send.submodules.fee.SendFeeModule.IInteractor interactor, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.send.submodules.fee.SendFeePresenterHelper helper, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Coin baseCoin, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Currency baseCurrency, @org.jetbrains.annotations.Nullable()
    kotlin.Pair<app.odapplications.bitstashwallet.entities.Coin, java.lang.String> feeCoinData) {
        super();
    }
}
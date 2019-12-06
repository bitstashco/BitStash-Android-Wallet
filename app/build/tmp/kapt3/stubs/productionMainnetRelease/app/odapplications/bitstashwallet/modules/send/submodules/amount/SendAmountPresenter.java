package app.odapplications.bitstashwallet.modules.send.submodules.amount;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0012\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010-H\u0016J\u0010\u00101\u001a\u00020/2\u0006\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u00020/H\u0016J\b\u00105\u001a\u00020/H\u0016J\b\u00106\u001a\u00020/H\u0016J\b\u00107\u001a\u000208H\u0016J\n\u00109\u001a\u0004\u0018\u000108H\u0016J\u0010\u0010:\u001a\u00020/2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010;\u001a\u00020/2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010<\u001a\u00020/H\u0002J\b\u0010=\u001a\u00020/H\u0002J\b\u0010>\u001a\u00020/H\u0002J\b\u0010?\u001a\u00020/H\u0002J\b\u0010@\u001a\u00020/H\u0002J\b\u0010A\u001a\u00020/H\u0002J\b\u0010B\u001a\u00020\u000eH\u0016J\b\u0010C\u001a\u00020/H\u0002R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c@RX\u0096\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010&\u001a\u0004\u0018\u00010\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006D"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountPresenter;", "Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IViewDelegate;", "Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IInteractorDelegate;", "Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IAmountModule;", "interactor", "Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IInteractor;", "presenterHelper", "Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountPresenterHelper;", "coin", "Lapp/odapplications/bitstashwallet/entities/Coin;", "baseCurrency", "Lapp/odapplications/bitstashwallet/entities/Currency;", "(Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IInteractor;Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountPresenterHelper;Lapp/odapplications/bitstashwallet/entities/Coin;Lapp/odapplications/bitstashwallet/entities/Currency;)V", "amount", "Ljava/math/BigDecimal;", "availableBalance", "coinAmount", "Lapp/odapplications/bitstashwallet/entities/CoinValue;", "getCoinAmount", "()Lapp/odapplications/bitstashwallet/entities/CoinValue;", "currentAmount", "getCurrentAmount", "()Ljava/math/BigDecimal;", "fiatAmount", "Lapp/odapplications/bitstashwallet/entities/CurrencyValue;", "getFiatAmount", "()Lapp/odapplications/bitstashwallet/entities/CurrencyValue;", "<set-?>", "Lapp/odapplications/bitstashwallet/modules/send/SendModule$InputType;", "inputType", "getInputType", "()Lapp/odapplications/bitstashwallet/modules/send/SendModule$InputType;", "moduleDelegate", "Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IAmountModuleDelegate;", "getModuleDelegate", "()Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IAmountModuleDelegate;", "setModuleDelegate", "(Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IAmountModuleDelegate;)V", "view", "Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IView;", "getView", "()Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IView;", "setView", "(Lapp/odapplications/bitstashwallet/modules/send/submodules/amount/SendAmountModule$IView;)V", "xRate", "Lapp/odapplications/bitstashwallet/entities/Rate;", "didRateRetrieve", "", "rate", "onAmountChange", "amountString", "", "onMaxClick", "onSwitchClick", "onViewDidLoad", "primaryAmountInfo", "Lapp/odapplications/bitstashwallet/modules/send/SendModule$AmountInfo;", "secondaryAmountInfo", "setAmount", "setAvailableBalance", "syncAmount", "syncAmountType", "syncError", "syncHint", "syncMaxButton", "syncSwitchButton", "validAmount", "validate", "app_productionMainnetRelease"})
public final class SendAmountPresenter implements app.odapplications.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IViewDelegate, app.odapplications.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IInteractorDelegate, app.odapplications.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IAmountModule {
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IView view;
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IAmountModuleDelegate moduleDelegate;
    private java.math.BigDecimal amount;
    private java.math.BigDecimal availableBalance;
    private app.odapplications.bitstashwallet.entities.Rate xRate;
    @org.jetbrains.annotations.NotNull()
    private app.odapplications.bitstashwallet.modules.send.SendModule.InputType inputType;
    private final app.odapplications.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IInteractor interactor = null;
    private final app.odapplications.bitstashwallet.modules.send.submodules.amount.SendAmountPresenterHelper presenterHelper = null;
    private final app.odapplications.bitstashwallet.entities.Coin coin = null;
    private final app.odapplications.bitstashwallet.entities.Currency baseCurrency = null;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IView getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IAmountModuleDelegate getModuleDelegate() {
        return null;
    }
    
    public final void setModuleDelegate(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IAmountModuleDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.modules.send.SendModule.InputType getInputType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.entities.CoinValue getCoinAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.entities.CurrencyValue getFiatAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal getCurrentAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.modules.send.SendModule.AmountInfo primaryAmountInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public app.odapplications.bitstashwallet.modules.send.SendModule.AmountInfo secondaryAmountInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.math.BigDecimal validAmount() {
        return null;
    }
    
    @java.lang.Override()
    public void setAmount(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount) {
    }
    
    @java.lang.Override()
    public void setAvailableBalance(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal availableBalance) {
    }
    
    @java.lang.Override()
    public void onViewDidLoad() {
    }
    
    @java.lang.Override()
    public void onSwitchClick() {
    }
    
    @java.lang.Override()
    public void onAmountChange(@org.jetbrains.annotations.NotNull()
    java.lang.String amountString) {
    }
    
    @java.lang.Override()
    public void onMaxClick() {
    }
    
    @java.lang.Override()
    public void didRateRetrieve(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.entities.Rate rate) {
    }
    
    private final void syncAmount() {
    }
    
    private final void syncAmountType() {
    }
    
    private final void syncHint() {
    }
    
    private final void syncMaxButton() {
    }
    
    private final void syncSwitchButton() {
    }
    
    private final void validate() {
    }
    
    private final void syncError() {
    }
    
    public SendAmountPresenter(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.send.submodules.amount.SendAmountModule.IInteractor interactor, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.send.submodules.amount.SendAmountPresenterHelper presenterHelper, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Coin coin, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.Currency baseCurrency) {
        super();
    }
}
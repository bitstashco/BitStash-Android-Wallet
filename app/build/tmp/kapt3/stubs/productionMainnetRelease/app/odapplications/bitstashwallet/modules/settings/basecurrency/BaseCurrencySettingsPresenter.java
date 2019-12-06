package app.odapplications.bitstashwallet.modules.settings.basecurrency;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0016R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001a"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/settings/basecurrency/BaseCurrencySettingsPresenter;", "Landroidx/lifecycle/ViewModel;", "Lapp/odapplications/bitstashwallet/modules/settings/basecurrency/BaseCurrencySettingsModule$IViewDelegate;", "view", "Lapp/odapplications/bitstashwallet/modules/settings/basecurrency/BaseCurrencySettingsModule$IView;", "router", "Lapp/odapplications/bitstashwallet/modules/settings/basecurrency/BaseCurrencySettingsModule$IRouter;", "interactor", "Lapp/odapplications/bitstashwallet/modules/settings/basecurrency/BaseCurrencySettingsModule$IInteractor;", "(Lapp/odapplications/bitstashwallet/modules/settings/basecurrency/BaseCurrencySettingsModule$IView;Lapp/odapplications/bitstashwallet/modules/settings/basecurrency/BaseCurrencySettingsModule$IRouter;Lapp/odapplications/bitstashwallet/modules/settings/basecurrency/BaseCurrencySettingsModule$IInteractor;)V", "currencies", "", "Lapp/odapplications/bitstashwallet/entities/Currency;", "getRouter", "()Lapp/odapplications/bitstashwallet/modules/settings/basecurrency/BaseCurrencySettingsModule$IRouter;", "setRouter", "(Lapp/odapplications/bitstashwallet/modules/settings/basecurrency/BaseCurrencySettingsModule$IRouter;)V", "getView", "()Lapp/odapplications/bitstashwallet/modules/settings/basecurrency/BaseCurrencySettingsModule$IView;", "setView", "(Lapp/odapplications/bitstashwallet/modules/settings/basecurrency/BaseCurrencySettingsModule$IView;)V", "didSelect", "", "position", "", "viewDidLoad", "app_productionMainnetRelease"})
public final class BaseCurrencySettingsPresenter extends androidx.lifecycle.ViewModel implements app.odapplications.bitstashwallet.modules.settings.basecurrency.BaseCurrencySettingsModule.IViewDelegate {
    private final java.util.List<app.odapplications.bitstashwallet.entities.Currency> currencies = null;
    @org.jetbrains.annotations.NotNull()
    private app.odapplications.bitstashwallet.modules.settings.basecurrency.BaseCurrencySettingsModule.IView view;
    @org.jetbrains.annotations.NotNull()
    private app.odapplications.bitstashwallet.modules.settings.basecurrency.BaseCurrencySettingsModule.IRouter router;
    private final app.odapplications.bitstashwallet.modules.settings.basecurrency.BaseCurrencySettingsModule.IInteractor interactor = null;
    
    @java.lang.Override()
    public void viewDidLoad() {
    }
    
    @java.lang.Override()
    public void didSelect(int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.modules.settings.basecurrency.BaseCurrencySettingsModule.IView getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.settings.basecurrency.BaseCurrencySettingsModule.IView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.modules.settings.basecurrency.BaseCurrencySettingsModule.IRouter getRouter() {
        return null;
    }
    
    public final void setRouter(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.settings.basecurrency.BaseCurrencySettingsModule.IRouter p0) {
    }
    
    public BaseCurrencySettingsPresenter(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.settings.basecurrency.BaseCurrencySettingsModule.IView view, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.settings.basecurrency.BaseCurrencySettingsModule.IRouter router, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.modules.settings.basecurrency.BaseCurrencySettingsModule.IInteractor interactor) {
        super();
    }
}
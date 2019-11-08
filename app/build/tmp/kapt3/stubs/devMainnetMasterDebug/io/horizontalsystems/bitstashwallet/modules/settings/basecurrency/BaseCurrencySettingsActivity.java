package io.horizontalsystems.bitstashwallet.modules.settings.basecurrency;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/settings/basecurrency/BaseCurrencySettingsActivity;", "Lio/horizontalsystems/bitstashwallet/BaseActivity;", "Lio/horizontalsystems/bitstashwallet/modules/settings/basecurrency/CurrencySwitcherAdapter$Listener;", "()V", "adapter", "Lio/horizontalsystems/bitstashwallet/modules/settings/basecurrency/CurrencySwitcherAdapter;", "presenter", "Lio/horizontalsystems/bitstashwallet/modules/settings/basecurrency/BaseCurrencySettingsPresenter;", "presenterRouter", "Lio/horizontalsystems/bitstashwallet/modules/settings/basecurrency/BaseCurrencySettingsRouter;", "presenterView", "Lio/horizontalsystems/bitstashwallet/modules/settings/basecurrency/BaseCurrencySettingsView;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "position", "", "app_devMainnetMasterDebug"})
public final class BaseCurrencySettingsActivity extends io.horizontalsystems.bitstashwallet.BaseActivity implements io.horizontalsystems.bitstashwallet.modules.settings.basecurrency.CurrencySwitcherAdapter.Listener {
    private io.horizontalsystems.bitstashwallet.modules.settings.basecurrency.BaseCurrencySettingsPresenter presenter;
    private io.horizontalsystems.bitstashwallet.modules.settings.basecurrency.BaseCurrencySettingsView presenterView;
    private io.horizontalsystems.bitstashwallet.modules.settings.basecurrency.BaseCurrencySettingsRouter presenterRouter;
    private io.horizontalsystems.bitstashwallet.modules.settings.basecurrency.CurrencySwitcherAdapter adapter;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onItemClick(int position) {
    }
    
    public BaseCurrencySettingsActivity() {
        super();
    }
}
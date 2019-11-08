package io.horizontalsystems.bitstashwallet.modules.settings.language;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007\u00a8\u0006\f"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/settings/language/LanguageSettingsRouter;", "Lio/horizontalsystems/bitstashwallet/modules/settings/language/LanguageSettingsModule$ILanguageSettingsRouter;", "()V", "closeLiveEvent", "Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "", "getCloseLiveEvent", "()Lio/horizontalsystems/bitstashwallet/SingleLiveEvent;", "reloadAppLiveEvent", "getReloadAppLiveEvent", "close", "reloadAppInterface", "app_productionMainnetRelease"})
public final class LanguageSettingsRouter implements io.horizontalsystems.bitstashwallet.modules.settings.language.LanguageSettingsModule.ILanguageSettingsRouter {
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> reloadAppLiveEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> closeLiveEvent = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> getReloadAppLiveEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.horizontalsystems.bitstashwallet.SingleLiveEvent<kotlin.Unit> getCloseLiveEvent() {
        return null;
    }
    
    @java.lang.Override()
    public void reloadAppInterface() {
    }
    
    @java.lang.Override()
    public void close() {
    }
    
    public LanguageSettingsRouter() {
        super();
    }
}
package app.odapplications.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lapp/odapplications/bitstashwallet/core/managers/KeyStoreChangeListener;", "Lapp/odapplications/bitstashwallet/core/managers/BackgroundManager$Listener;", "systemInfoManager", "Lapp/odapplications/bitstashwallet/core/ISystemInfoManager;", "keyStoreManager", "Lapp/odapplications/bitstashwallet/core/IKeyStoreManager;", "(Lapp/odapplications/bitstashwallet/core/ISystemInfoManager;Lapp/odapplications/bitstashwallet/core/IKeyStoreManager;)V", "willEnterForeground", "", "activity", "Landroid/app/Activity;", "app_productionMainnetRelease"})
public final class KeyStoreChangeListener implements app.odapplications.bitstashwallet.core.managers.BackgroundManager.Listener {
    private final app.odapplications.bitstashwallet.core.ISystemInfoManager systemInfoManager = null;
    private final app.odapplications.bitstashwallet.core.IKeyStoreManager keyStoreManager = null;
    
    @java.lang.Override()
    public void willEnterForeground(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public KeyStoreChangeListener(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.ISystemInfoManager systemInfoManager, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.core.IKeyStoreManager keyStoreManager) {
        super();
    }
    
    public void willEnterForeground() {
    }
    
    public void didEnterBackground() {
    }
}
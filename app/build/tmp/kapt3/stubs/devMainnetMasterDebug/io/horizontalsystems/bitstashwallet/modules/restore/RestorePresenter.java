package io.horizontalsystems.bitstashwallet.modules.restore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\u0017\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u001aj\u0002`\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0018H\u0016J\u001a\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\fH\u0016J\b\u0010#\u001a\u00020\u0018H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006$"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/restore/RestorePresenter;", "Lio/horizontalsystems/bitstashwallet/modules/restore/RestoreModule$ViewDelegate;", "Lio/horizontalsystems/bitstashwallet/modules/restore/RestoreModule$InteractorDelegate;", "router", "Lio/horizontalsystems/bitstashwallet/modules/restore/RestoreModule$Router;", "interactor", "Lio/horizontalsystems/bitstashwallet/modules/restore/RestoreModule$Interactor;", "predefinedAccountTypeManager", "Lio/horizontalsystems/bitstashwallet/core/IPredefinedAccountTypeManager;", "(Lio/horizontalsystems/bitstashwallet/modules/restore/RestoreModule$Router;Lio/horizontalsystems/bitstashwallet/modules/restore/RestoreModule$Interactor;Lio/horizontalsystems/bitstashwallet/core/IPredefinedAccountTypeManager;)V", "items", "", "Lio/horizontalsystems/bitstashwallet/core/IPredefinedAccountType;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "view", "Lio/horizontalsystems/bitstashwallet/modules/restore/RestoreModule$View;", "getView", "()Lio/horizontalsystems/bitstashwallet/modules/restore/RestoreModule$View;", "setView", "(Lio/horizontalsystems/bitstashwallet/modules/restore/RestoreModule$View;)V", "didFailRestore", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "didRestore", "onRestore", "accountType", "Lio/horizontalsystems/bitstashwallet/entities/AccountType;", "syncMode", "Lio/horizontalsystems/bitstashwallet/entities/SyncMode;", "onSelect", "viewDidLoad", "app_devMainnetMasterDebug"})
public final class RestorePresenter implements io.horizontalsystems.bitstashwallet.modules.restore.RestoreModule.ViewDelegate, io.horizontalsystems.bitstashwallet.modules.restore.RestoreModule.InteractorDelegate {
    @org.jetbrains.annotations.Nullable()
    private io.horizontalsystems.bitstashwallet.modules.restore.RestoreModule.View view;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends io.horizontalsystems.bitstashwallet.core.IPredefinedAccountType> items;
    private final io.horizontalsystems.bitstashwallet.modules.restore.RestoreModule.Router router = null;
    private final io.horizontalsystems.bitstashwallet.modules.restore.RestoreModule.Interactor interactor = null;
    private final io.horizontalsystems.bitstashwallet.core.IPredefinedAccountTypeManager predefinedAccountTypeManager = null;
    
    @org.jetbrains.annotations.Nullable()
    public final io.horizontalsystems.bitstashwallet.modules.restore.RestoreModule.View getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.modules.restore.RestoreModule.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bitstashwallet.core.IPredefinedAccountType> getItems() {
        return null;
    }
    
    public void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends io.horizontalsystems.bitstashwallet.core.IPredefinedAccountType> p0) {
    }
    
    @java.lang.Override()
    public void viewDidLoad() {
    }
    
    @java.lang.Override()
    public void onSelect(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IPredefinedAccountType accountType) {
    }
    
    @java.lang.Override()
    public void onRestore(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.entities.AccountType accountType, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.entities.SyncMode syncMode) {
    }
    
    @java.lang.Override()
    public void didRestore() {
    }
    
    @java.lang.Override()
    public void didFailRestore(@org.jetbrains.annotations.NotNull()
    java.lang.Exception e) {
    }
    
    public RestorePresenter(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.restore.RestoreModule.Router router, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.modules.restore.RestoreModule.Interactor interactor, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IPredefinedAccountTypeManager predefinedAccountTypeManager) {
        super();
    }
}
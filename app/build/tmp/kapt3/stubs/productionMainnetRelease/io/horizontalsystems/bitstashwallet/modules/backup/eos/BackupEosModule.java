package io.horizontalsystems.bitstashwallet.modules.backup.eos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0005\f\r\u000e\u000f\u0010B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/backup/eos/BackupEosModule;", "", "()V", "RESULT_SHOW", "", "start", "", "context", "Landroidx/appcompat/app/AppCompatActivity;", "account", "", "activePrivateKey", "Interactor", "InteractorDelegate", "Router", "View", "ViewDelegate", "app_productionMainnetRelease"})
public final class BackupEosModule {
    public static final int RESULT_SHOW = 1;
    public static final io.horizontalsystems.bitstashwallet.modules.backup.eos.BackupEosModule INSTANCE = null;
    
    public final void start(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity context, @org.jetbrains.annotations.NotNull()
    java.lang.String account, @org.jetbrains.annotations.NotNull()
    java.lang.String activePrivateKey) {
    }
    
    private BackupEosModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/backup/eos/BackupEosModule$View;", "", "app_productionMainnetRelease"})
    public static abstract interface View {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/backup/eos/BackupEosModule$ViewDelegate;", "", "app_productionMainnetRelease"})
    public static abstract interface ViewDelegate {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/backup/eos/BackupEosModule$Interactor;", "", "app_productionMainnetRelease"})
    public static abstract interface Interactor {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/backup/eos/BackupEosModule$InteractorDelegate;", "", "app_productionMainnetRelease"})
    public static abstract interface InteractorDelegate {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lio/horizontalsystems/bitstashwallet/modules/backup/eos/BackupEosModule$Router;", "", "close", "", "app_productionMainnetRelease"})
    public static abstract interface Router {
        
        public abstract void close();
    }
}
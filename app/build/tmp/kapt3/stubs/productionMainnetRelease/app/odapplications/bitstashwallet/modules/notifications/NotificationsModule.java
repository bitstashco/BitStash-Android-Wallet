package app.odapplications.bitstashwallet.modules.notifications;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0007\u0007\b\t\n\u000b\f\rB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u000e"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/notifications/NotificationsModule;", "", "()V", "start", "", "context", "Landroid/content/Context;", "Factory", "IInteractor", "IInteractorDelegate", "IRouter", "IView", "IViewDelegate", "PriceAlertViewItem", "app_productionMainnetRelease"})
public final class NotificationsModule {
    public static final app.odapplications.bitstashwallet.modules.notifications.NotificationsModule INSTANCE = null;
    
    public final void start(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private NotificationsModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0003H&\u00a8\u0006\u000e"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/notifications/NotificationsModule$IView;", "", "hideWarning", "", "setItems", "items", "", "Lapp/odapplications/bitstashwallet/modules/notifications/NotificationsModule$PriceAlertViewItem;", "showStateSelector", "itemPosition", "", "priceAlert", "Lapp/odapplications/bitstashwallet/entities/PriceAlert;", "showWarning", "app_productionMainnetRelease"})
    public static abstract interface IView {
        
        public abstract void setItems(@org.jetbrains.annotations.NotNull()
        java.util.List<app.odapplications.bitstashwallet.modules.notifications.NotificationsModule.PriceAlertViewItem> items);
        
        public abstract void showWarning();
        
        public abstract void hideWarning();
        
        public abstract void showStateSelector(int itemPosition, @org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.PriceAlert priceAlert);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/notifications/NotificationsModule$IRouter;", "", "openNotificationSettings", "", "app_productionMainnetRelease"})
    public static abstract interface IRouter {
        
        public abstract void openNotificationSettings();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\u0003H&\u00a8\u0006\f"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/notifications/NotificationsModule$IViewDelegate;", "", "didClickDeactivateAll", "", "didClickOpenSettings", "didSelectState", "itemPosition", "", "state", "Lapp/odapplications/bitstashwallet/entities/PriceAlert$State;", "didTapItem", "viewDidLoad", "app_productionMainnetRelease"})
    public static abstract interface IViewDelegate {
        
        public abstract void viewDidLoad();
        
        public abstract void didSelectState(int itemPosition, @org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.PriceAlert.State state);
        
        public abstract void didClickOpenSettings();
        
        public abstract void didClickDeactivateAll();
        
        public abstract void didTapItem(int itemPosition);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/notifications/NotificationsModule$IInteractor;", "", "priceAlerts", "", "Lapp/odapplications/bitstashwallet/entities/PriceAlert;", "getPriceAlerts", "()Ljava/util/List;", "priceAlertsEnabled", "", "getPriceAlertsEnabled", "()Z", "savePriceAlerts", "", "app_productionMainnetRelease"})
    public static abstract interface IInteractor {
        
        public abstract boolean getPriceAlertsEnabled();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<app.odapplications.bitstashwallet.entities.PriceAlert> getPriceAlerts();
        
        public abstract void savePriceAlerts(@org.jetbrains.annotations.NotNull()
        java.util.List<app.odapplications.bitstashwallet.entities.PriceAlert> priceAlerts);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/notifications/NotificationsModule$IInteractorDelegate;", "", "didEnterForeground", "", "app_productionMainnetRelease"})
    public static abstract interface IInteractorDelegate {
        
        public abstract void didEnterForeground();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/notifications/NotificationsModule$PriceAlertViewItem;", "", "title", "", "code", "state", "Lapp/odapplications/bitstashwallet/entities/PriceAlert$State;", "(Ljava/lang/String;Ljava/lang/String;Lapp/odapplications/bitstashwallet/entities/PriceAlert$State;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getState", "()Lapp/odapplications/bitstashwallet/entities/PriceAlert$State;", "setState", "(Lapp/odapplications/bitstashwallet/entities/PriceAlert$State;)V", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionMainnetRelease"})
    public static final class PriceAlertViewItem {
        @org.jetbrains.annotations.NotNull()
        public app.odapplications.bitstashwallet.entities.PriceAlert.State state;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String code = null;
        
        @org.jetbrains.annotations.NotNull()
        public final app.odapplications.bitstashwallet.entities.PriceAlert.State getState() {
            return null;
        }
        
        public final void setState(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.PriceAlert.State p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCode() {
            return null;
        }
        
        public PriceAlertViewItem(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String code) {
            super();
        }
        
        public PriceAlertViewItem(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String code, @org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.entities.PriceAlert.State state) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final app.odapplications.bitstashwallet.modules.notifications.NotificationsModule.PriceAlertViewItem copy(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String code) {
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
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u0002H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0007H\u0016\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/notifications/NotificationsModule$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_productionMainnetRelease"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        public Factory() {
            super();
        }
    }
}
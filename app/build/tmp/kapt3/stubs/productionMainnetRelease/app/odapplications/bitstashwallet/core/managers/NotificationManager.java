package app.odapplications.bitstashwallet.core.managers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0016\u0010\r\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007\u00a8\u0006\u0016"}, d2 = {"Lapp/odapplications/bitstashwallet/core/managers/NotificationManager;", "Lapp/odapplications/bitstashwallet/core/INotificationManager;", "androidNotificationManager", "Landroidx/core/app/NotificationManagerCompat;", "(Landroidx/core/app/NotificationManagerCompat;)V", "isEnabled", "", "()Z", "clear", "", "createNotificationChannel", "getPendingIntent", "Landroid/app/PendingIntent;", "show", "notifications", "", "Lapp/odapplications/bitstashwallet/entities/AlertNotification;", "showNotification", "notificationId", "", "notification", "Companion", "app_productionMainnetRelease"})
public final class NotificationManager implements app.odapplications.bitstashwallet.core.INotificationManager {
    private final androidx.core.app.NotificationManagerCompat androidNotificationManager = null;
    private static final java.lang.String channelId = "priceAlert";
    public static final app.odapplications.bitstashwallet.core.managers.NotificationManager.Companion Companion = null;
    
    @java.lang.Override()
    public boolean isEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public void show(@org.jetbrains.annotations.NotNull()
    java.util.List<app.odapplications.bitstashwallet.entities.AlertNotification> notifications) {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    private final void showNotification(int notificationId, app.odapplications.bitstashwallet.entities.AlertNotification notification) {
    }
    
    private final android.app.PendingIntent getPendingIntent() {
        return null;
    }
    
    private final void createNotificationChannel() {
    }
    
    public NotificationManager(@org.jetbrains.annotations.NotNull()
    androidx.core.app.NotificationManagerCompat androidNotificationManager) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lapp/odapplications/bitstashwallet/core/managers/NotificationManager$Companion;", "", "()V", "channelId", "", "app_productionMainnetRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
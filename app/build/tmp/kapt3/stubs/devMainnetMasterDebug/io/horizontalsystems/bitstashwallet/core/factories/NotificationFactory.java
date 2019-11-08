package io.horizontalsystems.bitstashwallet.core.factories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H\u0002J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/factories/NotificationFactory;", "Lio/horizontalsystems/bitstashwallet/core/INotificationFactory;", "emojiHelper", "Lio/horizontalsystems/bitstashwallet/core/IEmojiHelper;", "context", "Landroid/content/Context;", "(Lio/horizontalsystems/bitstashwallet/core/IEmojiHelper;Landroid/content/Context;)V", "separatedAlertCount", "", "bodyPart", "", "item", "Lio/horizontalsystems/bitstashwallet/core/factories/PriceAlertItem;", "multipleNotification", "Lio/horizontalsystems/bitstashwallet/entities/AlertNotification;", "items", "", "notifications", "alertItems", "singleNotification", "app_devMainnetMasterDebug"})
public final class NotificationFactory implements io.horizontalsystems.bitstashwallet.core.INotificationFactory {
    private final int separatedAlertCount = 2;
    private final io.horizontalsystems.bitstashwallet.core.IEmojiHelper emojiHelper = null;
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<io.horizontalsystems.bitstashwallet.entities.AlertNotification> notifications(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.core.factories.PriceAlertItem> alertItems) {
        return null;
    }
    
    private final io.horizontalsystems.bitstashwallet.entities.AlertNotification singleNotification(io.horizontalsystems.bitstashwallet.core.factories.PriceAlertItem item) {
        return null;
    }
    
    private final io.horizontalsystems.bitstashwallet.entities.AlertNotification multipleNotification(java.util.List<io.horizontalsystems.bitstashwallet.core.factories.PriceAlertItem> items) {
        return null;
    }
    
    private final java.lang.String bodyPart(io.horizontalsystems.bitstashwallet.core.factories.PriceAlertItem item) {
        return null;
    }
    
    public NotificationFactory(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.core.IEmojiHelper emojiHelper, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}
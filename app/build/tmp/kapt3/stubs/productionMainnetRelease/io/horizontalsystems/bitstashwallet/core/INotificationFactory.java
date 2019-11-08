package io.horizontalsystems.bitstashwallet.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bitstashwallet/core/INotificationFactory;", "", "notifications", "", "Lio/horizontalsystems/bitstashwallet/entities/AlertNotification;", "alertItems", "Lio/horizontalsystems/bitstashwallet/core/factories/PriceAlertItem;", "app_productionMainnetRelease"})
public abstract interface INotificationFactory {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<io.horizontalsystems.bitstashwallet.entities.AlertNotification> notifications(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.core.factories.PriceAlertItem> alertItems);
}
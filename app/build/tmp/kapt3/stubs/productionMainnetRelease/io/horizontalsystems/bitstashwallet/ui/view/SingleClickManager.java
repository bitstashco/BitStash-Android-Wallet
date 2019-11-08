package io.horizontalsystems.bitstashwallet.ui.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lio/horizontalsystems/bitstashwallet/ui/view/SingleClickManager;", "", "()V", "CLICK_TIME_DELTA", "", "lastClickTime", "canBeClicked", "", "app_productionMainnetRelease"})
public final class SingleClickManager {
    private static final long CLICK_TIME_DELTA = 500L;
    private static long lastClickTime;
    public static final io.horizontalsystems.bitstashwallet.ui.view.SingleClickManager INSTANCE = null;
    
    public final boolean canBeClicked() {
        return false;
    }
    
    private SingleClickManager() {
        super();
    }
}
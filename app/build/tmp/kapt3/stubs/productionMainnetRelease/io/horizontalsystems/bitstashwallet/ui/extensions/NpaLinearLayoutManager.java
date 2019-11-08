package io.horizontalsystems.bitstashwallet.ui.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bitstashwallet/ui/extensions/NpaLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "supportsPredictiveItemAnimations", "", "app_productionMainnetRelease"})
public final class NpaLinearLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {
    
    /**
     * Disable predictive animations. There is a bug in RecyclerView which causes views that
     * are being reloaded to pull invalid ViewHolders from the internal recycler stack if the
     * adapter size has decreased since the ViewHolder was recycled.
     */
    @java.lang.Override()
    public boolean supportsPredictiveItemAnimations() {
        return false;
    }
    
    public NpaLinearLayoutManager(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super(null);
    }
}
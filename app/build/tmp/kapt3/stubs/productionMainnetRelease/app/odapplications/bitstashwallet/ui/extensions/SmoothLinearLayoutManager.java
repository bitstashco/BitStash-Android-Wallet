package app.odapplications.bitstashwallet.ui.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lapp/odapplications/bitstashwallet/ui/extensions/SmoothLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "orientation", "", "reverseLayout", "", "(Landroid/content/Context;IZ)V", "millisecondsPreInch", "", "smoothScrollToPosition", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "position", "SmoothScroller", "app_productionMainnetRelease"})
public final class SmoothLinearLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {
    private final float millisecondsPreInch = 45.0F;
    
    @java.lang.Override()
    public void smoothScrollToPosition(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView.State state, int position) {
    }
    
    public SmoothLinearLayoutManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public SmoothLinearLayoutManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int orientation, boolean reverseLayout) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016\u00a8\u0006\r"}, d2 = {"Lapp/odapplications/bitstashwallet/ui/extensions/SmoothLinearLayoutManager$SmoothScroller;", "Landroidx/recyclerview/widget/LinearSmoothScroller;", "context", "Landroid/content/Context;", "(Lapp/odapplications/bitstashwallet/ui/extensions/SmoothLinearLayoutManager;Landroid/content/Context;)V", "calculateSpeedPerPixel", "", "displayMetrics", "Landroid/util/DisplayMetrics;", "computeScrollVectorForPosition", "Landroid/graphics/PointF;", "targetPosition", "", "app_productionMainnetRelease"})
    final class SmoothScroller extends androidx.recyclerview.widget.LinearSmoothScroller {
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public android.graphics.PointF computeScrollVectorForPosition(int targetPosition) {
            return null;
        }
        
        @java.lang.Override()
        protected float calculateSpeedPerPixel(@org.jetbrains.annotations.Nullable()
        android.util.DisplayMetrics displayMetrics) {
            return 0.0F;
        }
        
        public SmoothScroller(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super(null);
        }
    }
}
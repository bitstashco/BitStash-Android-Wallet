package app.odapplications.bitstashwallet.lib.chartview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u000256B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%H\u0014J\u0010\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0016J\u0016\u0010*\u001a\u00020\"2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,H\u0002J\u001c\u0010.\u001a\u00020\"2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010/\u001a\u000200J\u000e\u00101\u001a\u00020\"2\u0006\u00102\u001a\u00020\u0012J\u001e\u00103\u001a\u00020\"2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010/\u001a\u000200H\u0002J\b\u00104\u001a\u00020\'H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lapp/odapplications/bitstashwallet/lib/chartview/ChartView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animator", "Landroid/animation/ValueAnimator;", "chartCurve", "Lapp/odapplications/bitstashwallet/lib/chartview/ChartCurve;", "chartGrid", "Lapp/odapplications/bitstashwallet/lib/chartview/ChartGrid;", "chartIndicator", "Lapp/odapplications/bitstashwallet/lib/chartview/ChartIndicator;", "config", "Lapp/odapplications/bitstashwallet/lib/chartview/models/ChartConfig;", "helper", "Lapp/odapplications/bitstashwallet/lib/chartview/ScaleHelper;", "listener", "Lapp/odapplications/bitstashwallet/lib/chartview/ChartView$Listener;", "getListener", "()Lapp/odapplications/bitstashwallet/lib/chartview/ChartView$Listener;", "setListener", "(Lapp/odapplications/bitstashwallet/lib/chartview/ChartView$Listener;)V", "shape", "Landroid/graphics/RectF;", "viewHelper", "Lapp/odapplications/bitstashwallet/lib/chartview/ViewHelper;", "initialize", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "setColour", "points", "", "Lapp/odapplications/bitstashwallet/lib/chartview/models/ChartPoint;", "setData", "chartType", "Lapp/odapplications/bitstashwallet/lib/chartview/ChartView$ChartType;", "setIndicator", "indicator", "setPoints", "willNotDraw", "ChartType", "Listener", "app_productionMainnetRelease"})
public final class ChartView extends android.view.View {
    @org.jetbrains.annotations.Nullable()
    private app.odapplications.bitstashwallet.lib.chartview.ChartView.Listener listener;
    private final app.odapplications.bitstashwallet.lib.chartview.ViewHelper viewHelper = null;
    private final app.odapplications.bitstashwallet.lib.chartview.models.ChartConfig config = null;
    private final app.odapplications.bitstashwallet.lib.chartview.ScaleHelper helper = null;
    private final android.graphics.RectF shape = null;
    private final app.odapplications.bitstashwallet.lib.chartview.ChartCurve chartCurve = null;
    private final app.odapplications.bitstashwallet.lib.chartview.ChartGrid chartGrid = null;
    private app.odapplications.bitstashwallet.lib.chartview.ChartIndicator chartIndicator;
    private final android.animation.ValueAnimator animator = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.lib.chartview.ChartView.Listener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.lib.chartview.ChartView.Listener p0) {
    }
    
    private final void initialize(android.util.AttributeSet attrs) {
    }
    
    @java.lang.Override()
    public boolean willNotDraw() {
        return false;
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    @java.lang.Override()
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    public final void setIndicator(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.lib.chartview.ChartIndicator indicator) {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<app.odapplications.bitstashwallet.lib.chartview.models.ChartPoint> points, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.lib.chartview.ChartView.ChartType chartType) {
    }
    
    private final void setColour(java.util.List<app.odapplications.bitstashwallet.lib.chartview.models.ChartPoint> points) {
    }
    
    private final void setPoints(java.util.List<app.odapplications.bitstashwallet.lib.chartview.models.ChartPoint> points, app.odapplications.bitstashwallet.lib.chartview.ChartView.ChartType chartType) {
    }
    
    public ChartView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public ChartView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public ChartView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lapp/odapplications/bitstashwallet/lib/chartview/ChartView$Listener;", "", "onTouchDown", "", "onTouchSelect", "point", "Lapp/odapplications/bitstashwallet/lib/chartview/models/ChartPoint;", "onTouchUp", "app_productionMainnetRelease"})
    public static abstract interface Listener {
        
        public abstract void onTouchDown();
        
        public abstract void onTouchUp();
        
        public abstract void onTouchSelect(@org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.lib.chartview.models.ChartPoint point);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\t"}, d2 = {"Lapp/odapplications/bitstashwallet/lib/chartview/ChartView$ChartType;", "", "(Ljava/lang/String;I)V", "DAILY", "WEEKLY", "MONTHLY", "MONTHLY6", "MONTHLY18", "Companion", "app_productionMainnetRelease"})
    public static enum ChartType {
        /*public static final*/ DAILY /* = new DAILY() */,
        /*public static final*/ WEEKLY /* = new WEEKLY() */,
        /*public static final*/ MONTHLY /* = new MONTHLY() */,
        /*public static final*/ MONTHLY6 /* = new MONTHLY6() */,
        /*public static final*/ MONTHLY18 /* = new MONTHLY18() */;
        private static final int annualPoints = 53;
        @org.jetbrains.annotations.NotNull()
        private static final java.util.Map<java.lang.String, app.odapplications.bitstashwallet.lib.chartview.ChartView.ChartType> map = null;
        public static final app.odapplications.bitstashwallet.lib.chartview.ChartView.ChartType.Companion Companion = null;
        
        ChartType() {
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lapp/odapplications/bitstashwallet/lib/chartview/ChartView$ChartType$Companion;", "", "()V", "annualPoints", "", "getAnnualPoints", "()I", "map", "", "", "Lapp/odapplications/bitstashwallet/lib/chartview/ChartView$ChartType;", "getMap", "()Ljava/util/Map;", "fromString", "type", "app_productionMainnetRelease"})
        public static final class Companion {
            
            public final int getAnnualPoints() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.Map<java.lang.String, app.odapplications.bitstashwallet.lib.chartview.ChartView.ChartType> getMap() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final app.odapplications.bitstashwallet.lib.chartview.ChartView.ChartType fromString(@org.jetbrains.annotations.Nullable()
            java.lang.String type) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}
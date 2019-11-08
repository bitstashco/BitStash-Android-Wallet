package io.horizontalsystems.bitstashwallet.lib.chartview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J\u001a\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lio/horizontalsystems/bitstashwallet/lib/chartview/ChartIndicator;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "config", "Lio/horizontalsystems/bitstashwallet/lib/chartview/models/ChartConfig;", "indicatorPaint", "Landroid/graphics/Paint;", "touchPoint", "Lio/horizontalsystems/bitstashwallet/lib/chartview/ChartIndicator$TouchPoint;", "init", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onMove", "coordinate", "Lio/horizontalsystems/bitstashwallet/lib/chartview/ChartCurve$Coordinate;", "listener", "Lio/horizontalsystems/bitstashwallet/lib/chartview/ChartView$Listener;", "willNotDraw", "", "TouchPoint", "app_productionMainnetRelease"})
public final class ChartIndicator extends android.view.View {
    private final io.horizontalsystems.bitstashwallet.lib.chartview.ChartIndicator.TouchPoint touchPoint = null;
    private final android.graphics.Paint indicatorPaint = null;
    private io.horizontalsystems.bitstashwallet.lib.chartview.models.ChartConfig config;
    private java.util.HashMap _$_findViewCache;
    
    public final void init(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.lib.chartview.models.ChartConfig config) {
    }
    
    @java.lang.Override()
    public boolean willNotDraw() {
        return false;
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    public final void onMove(@org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.lib.chartview.ChartCurve.Coordinate coordinate, @org.jetbrains.annotations.Nullable()
    io.horizontalsystems.bitstashwallet.lib.chartview.ChartView.Listener listener) {
    }
    
    public ChartIndicator(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public ChartIndicator(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public ChartIndicator(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lio/horizontalsystems/bitstashwallet/lib/chartview/ChartIndicator$TouchPoint;", "", "x", "", "y", "last", "(FFF)V", "getLast", "()F", "setLast", "(F)V", "getX", "setX", "getY", "setY", "app_productionMainnetRelease"})
    public static final class TouchPoint {
        private float x;
        private float y;
        private float last;
        
        public final float getX() {
            return 0.0F;
        }
        
        public final void setX(float p0) {
        }
        
        public final float getY() {
            return 0.0F;
        }
        
        public final void setY(float p0) {
        }
        
        public final float getLast() {
            return 0.0F;
        }
        
        public final void setLast(float p0) {
        }
        
        public TouchPoint(float x, float y, float last) {
            super();
        }
    }
}
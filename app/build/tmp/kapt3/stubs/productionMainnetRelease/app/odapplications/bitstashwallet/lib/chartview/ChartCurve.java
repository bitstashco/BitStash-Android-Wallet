package app.odapplications.bitstashwallet.lib.chartview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001#B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0017\u001a\u00020\u0010J\u0014\u0010\u0018\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\nJ\u0006\u0010\u001b\u001a\u00020\u0013J\u0006\u0010\u001c\u001a\u00020\u0013J\u0018\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0002J\f\u0010!\u001a\u00020\u0013*\u00020\u0015H\u0002J\f\u0010\"\u001a\u00020\u0013*\u00020\u0015H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lapp/odapplications/bitstashwallet/lib/chartview/ChartCurve;", "", "shape", "Landroid/graphics/RectF;", "config", "Lapp/odapplications/bitstashwallet/lib/chartview/models/ChartConfig;", "(Landroid/graphics/RectF;Lapp/odapplications/bitstashwallet/lib/chartview/models/ChartConfig;)V", "chartHelper", "Lapp/odapplications/bitstashwallet/lib/chartview/ChartHelper;", "coordinates", "", "Lapp/odapplications/bitstashwallet/lib/chartview/ChartCurve$Coordinate;", "gradient", "Landroid/graphics/Paint;", "linePaint", "animatedY", "", "y", "draw", "", "canvas", "Landroid/graphics/Canvas;", "find", "value", "init", "points", "Lapp/odapplications/bitstashwallet/lib/chartview/models/ChartPoint;", "onTouchActive", "onTouchInactive", "setGradient", "colorStart", "", "colorEnd", "drawChart", "drawGradient", "Coordinate", "app_productionMainnetRelease"})
public final class ChartCurve {
    private final app.odapplications.bitstashwallet.lib.chartview.ChartHelper chartHelper = null;
    private java.util.List<app.odapplications.bitstashwallet.lib.chartview.ChartCurve.Coordinate> coordinates;
    private final android.graphics.Paint linePaint = null;
    private final android.graphics.Paint gradient = null;
    private final android.graphics.RectF shape = null;
    private final app.odapplications.bitstashwallet.lib.chartview.models.ChartConfig config = null;
    
    public final void init(@org.jetbrains.annotations.NotNull()
    java.util.List<app.odapplications.bitstashwallet.lib.chartview.models.ChartPoint> points) {
    }
    
    public final void onTouchActive() {
    }
    
    public final void onTouchInactive() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.lib.chartview.ChartCurve.Coordinate find(float value) {
        return null;
    }
    
    public final void draw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    private final void drawChart(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas $this$drawChart) {
    }
    
    private final void drawGradient(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas $this$drawGradient) {
    }
    
    private final float animatedY(float y) {
        return 0.0F;
    }
    
    private final void setGradient(int colorStart, int colorEnd) {
    }
    
    public ChartCurve(@org.jetbrains.annotations.NotNull()
    android.graphics.RectF shape, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.lib.chartview.models.ChartConfig config) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lapp/odapplications/bitstashwallet/lib/chartview/ChartCurve$Coordinate;", "", "x", "", "y", "point", "Lapp/odapplications/bitstashwallet/lib/chartview/models/ChartPoint;", "(FFLapp/odapplications/bitstashwallet/lib/chartview/models/ChartPoint;)V", "getPoint", "()Lapp/odapplications/bitstashwallet/lib/chartview/models/ChartPoint;", "getX", "()F", "getY", "app_productionMainnetRelease"})
    public static final class Coordinate {
        private final float x = 0.0F;
        private final float y = 0.0F;
        @org.jetbrains.annotations.NotNull()
        private final app.odapplications.bitstashwallet.lib.chartview.models.ChartPoint point = null;
        
        public final float getX() {
            return 0.0F;
        }
        
        public final float getY() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final app.odapplications.bitstashwallet.lib.chartview.models.ChartPoint getPoint() {
            return null;
        }
        
        public Coordinate(float x, float y, @org.jetbrains.annotations.NotNull()
        app.odapplications.bitstashwallet.lib.chartview.models.ChartPoint point) {
            super();
        }
    }
}
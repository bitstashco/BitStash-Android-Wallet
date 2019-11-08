package io.horizontalsystems.bitstashwallet.lib.chartview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001c\u0010\u0018\u001a\u00020\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lio/horizontalsystems/bitstashwallet/lib/chartview/ChartGrid;", "", "shape", "Landroid/graphics/RectF;", "config", "Lio/horizontalsystems/bitstashwallet/lib/chartview/models/ChartConfig;", "(Landroid/graphics/RectF;Lio/horizontalsystems/bitstashwallet/lib/chartview/models/ChartConfig;)V", "gridColumns", "", "Lio/horizontalsystems/bitstashwallet/lib/chartview/models/GridColumn;", "gridHelper", "Lio/horizontalsystems/bitstashwallet/lib/chartview/GridHelper;", "gridLines", "Lio/horizontalsystems/bitstashwallet/lib/chartview/models/GridLine;", "gridPaint", "Landroid/graphics/Paint;", "textPaint", "draw", "", "canvas", "Landroid/graphics/Canvas;", "drawColumns", "drawFrameLines", "drawLines", "init", "points", "Lio/horizontalsystems/bitstashwallet/lib/chartview/models/ChartPoint;", "chartType", "Lio/horizontalsystems/bitstashwallet/lib/chartview/ChartView$ChartType;", "app_devMainnetMasterDebug"})
public final class ChartGrid {
    private final io.horizontalsystems.bitstashwallet.lib.chartview.GridHelper gridHelper = null;
    private java.util.List<io.horizontalsystems.bitstashwallet.lib.chartview.models.GridColumn> gridColumns;
    private java.util.List<io.horizontalsystems.bitstashwallet.lib.chartview.models.GridLine> gridLines;
    private android.graphics.Paint gridPaint;
    private android.graphics.Paint textPaint;
    private final android.graphics.RectF shape = null;
    private final io.horizontalsystems.bitstashwallet.lib.chartview.models.ChartConfig config = null;
    
    public final void init(@org.jetbrains.annotations.NotNull()
    java.util.List<io.horizontalsystems.bitstashwallet.lib.chartview.models.ChartPoint> points, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.lib.chartview.ChartView.ChartType chartType) {
    }
    
    public final void draw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    private final void drawLines(android.graphics.Canvas canvas) {
    }
    
    private final void drawColumns(android.graphics.Canvas canvas) {
    }
    
    private final void drawFrameLines(android.graphics.Canvas canvas) {
    }
    
    public ChartGrid(@org.jetbrains.annotations.NotNull()
    android.graphics.RectF shape, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.lib.chartview.models.ChartConfig config) {
        super();
    }
}
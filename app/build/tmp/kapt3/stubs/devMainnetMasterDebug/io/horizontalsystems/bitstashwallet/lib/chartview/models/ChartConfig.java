package io.horizontalsystems.bitstashwallet.lib.chartview.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b;\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R\u001a\u0010\"\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u001a\u0010%\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0010\"\u0004\b\'\u0010\u0012R\u001a\u0010(\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u0018R\u001a\u0010+\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0010\"\u0004\b-\u0010\u0012R\u001a\u0010.\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0010\"\u0004\b0\u0010\u0012R\u001a\u00101\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\n\"\u0004\b3\u0010\fR\u001a\u00104\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0010\"\u0004\b6\u0010\u0012R\u001a\u00107\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0016\"\u0004\b9\u0010\u0018R\u001a\u0010:\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0010\"\u0004\b<\u0010\u0012R\u001a\u0010=\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0010\"\u0004\b?\u0010\u0012R\u001a\u0010@\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0016\"\u0004\bB\u0010\u0018R\u001a\u0010C\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0016\"\u0004\bE\u0010\u0018R\u001a\u0010F\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0010\"\u0004\bH\u0010\u0012R\u001a\u0010I\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u0010\"\u0004\bK\u0010\u0012R\u001a\u0010L\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0010\"\u0004\bN\u0010\u0012\u00a8\u0006O"}, d2 = {"Lio/horizontalsystems/bitstashwallet/lib/chartview/models/ChartConfig;", "", "context", "Landroid/content/Context;", "viewHelper", "Lio/horizontalsystems/bitstashwallet/lib/chartview/ViewHelper;", "(Landroid/content/Context;Lio/horizontalsystems/bitstashwallet/lib/chartview/ViewHelper;)V", "animated", "", "getAnimated", "()Z", "setAnimated", "(Z)V", "animatedFraction", "", "getAnimatedFraction", "()F", "setAnimatedFraction", "(F)V", "curveColor", "", "getCurveColor", "()I", "setCurveColor", "(I)V", "fallColor", "getFallColor", "setFallColor", "gridColor", "getGridColor", "setGridColor", "gridEdgeOffset", "getGridEdgeOffset", "setGridEdgeOffset", "growColor", "getGrowColor", "setGrowColor", "height", "getHeight", "setHeight", "indicatorColor", "getIndicatorColor", "setIndicatorColor", "offsetBottom", "getOffsetBottom", "setOffsetBottom", "offsetRight", "getOffsetRight", "setOffsetRight", "showGrid", "getShowGrid", "setShowGrid", "strokeWidth", "getStrokeWidth", "setStrokeWidth", "textColor", "getTextColor", "setTextColor", "textPadding", "getTextPadding", "setTextPadding", "textSize", "getTextSize", "setTextSize", "touchColor", "getTouchColor", "setTouchColor", "valuePrecision", "getValuePrecision", "setValuePrecision", "valueStep", "getValueStep", "setValueStep", "valueTop", "getValueTop", "setValueTop", "width", "getWidth", "setWidth", "app_devMainnetMasterDebug"})
public final class ChartConfig {
    private boolean showGrid;
    private boolean animated;
    private int curveColor;
    private int touchColor;
    private int gridColor;
    private int textColor;
    private int growColor;
    private int fallColor;
    private int indicatorColor;
    private float width;
    private float height;
    private float textSize;
    private float textPadding;
    private float strokeWidth;
    private float offsetRight;
    private float offsetBottom;
    private float gridEdgeOffset;
    private float valueTop;
    private float valueStep;
    private int valuePrecision;
    private float animatedFraction;
    
    public final boolean getShowGrid() {
        return false;
    }
    
    public final void setShowGrid(boolean p0) {
    }
    
    public final boolean getAnimated() {
        return false;
    }
    
    public final void setAnimated(boolean p0) {
    }
    
    public final int getCurveColor() {
        return 0;
    }
    
    public final void setCurveColor(int p0) {
    }
    
    public final int getTouchColor() {
        return 0;
    }
    
    public final void setTouchColor(int p0) {
    }
    
    public final int getGridColor() {
        return 0;
    }
    
    public final void setGridColor(int p0) {
    }
    
    public final int getTextColor() {
        return 0;
    }
    
    public final void setTextColor(int p0) {
    }
    
    public final int getGrowColor() {
        return 0;
    }
    
    public final void setGrowColor(int p0) {
    }
    
    public final int getFallColor() {
        return 0;
    }
    
    public final void setFallColor(int p0) {
    }
    
    public final int getIndicatorColor() {
        return 0;
    }
    
    public final void setIndicatorColor(int p0) {
    }
    
    public final float getWidth() {
        return 0.0F;
    }
    
    public final void setWidth(float p0) {
    }
    
    public final float getHeight() {
        return 0.0F;
    }
    
    public final void setHeight(float p0) {
    }
    
    public final float getTextSize() {
        return 0.0F;
    }
    
    public final void setTextSize(float p0) {
    }
    
    public final float getTextPadding() {
        return 0.0F;
    }
    
    public final void setTextPadding(float p0) {
    }
    
    public final float getStrokeWidth() {
        return 0.0F;
    }
    
    public final void setStrokeWidth(float p0) {
    }
    
    public final float getOffsetRight() {
        return 0.0F;
    }
    
    public final void setOffsetRight(float p0) {
    }
    
    public final float getOffsetBottom() {
        return 0.0F;
    }
    
    public final void setOffsetBottom(float p0) {
    }
    
    public final float getGridEdgeOffset() {
        return 0.0F;
    }
    
    public final void setGridEdgeOffset(float p0) {
    }
    
    public final float getValueTop() {
        return 0.0F;
    }
    
    public final void setValueTop(float p0) {
    }
    
    public final float getValueStep() {
        return 0.0F;
    }
    
    public final void setValueStep(float p0) {
    }
    
    public final int getValuePrecision() {
        return 0;
    }
    
    public final void setValuePrecision(int p0) {
    }
    
    public final float getAnimatedFraction() {
        return 0.0F;
    }
    
    public final void setAnimatedFraction(float p0) {
    }
    
    public ChartConfig(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bitstashwallet.lib.chartview.ViewHelper viewHelper) {
        super();
    }
}
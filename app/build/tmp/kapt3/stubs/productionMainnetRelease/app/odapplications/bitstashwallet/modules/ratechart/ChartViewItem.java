package app.odapplications.bitstashwallet.modules.ratechart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\nH\u00c6\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u00c6\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018Jh\u0010\'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001\u00a2\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010,\u001a\u00020-H\u00d6\u0001J\t\u0010.\u001a\u00020/H\u00d6\u0001R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e\u00a8\u00060"}, d2 = {"Lapp/odapplications/bitstashwallet/modules/ratechart/ChartViewItem;", "", "type", "Lapp/odapplications/bitstashwallet/lib/chartview/ChartView$ChartType;", "rateValue", "Lapp/odapplications/bitstashwallet/entities/CurrencyValue;", "marketCap", "lowValue", "highValue", "diffValue", "Ljava/math/BigDecimal;", "chartData", "", "Lapp/odapplications/bitstashwallet/lib/chartview/models/ChartPoint;", "lastUpdateTimestamp", "", "(Lapp/odapplications/bitstashwallet/lib/chartview/ChartView$ChartType;Lapp/odapplications/bitstashwallet/entities/CurrencyValue;Lapp/odapplications/bitstashwallet/entities/CurrencyValue;Lapp/odapplications/bitstashwallet/entities/CurrencyValue;Lapp/odapplications/bitstashwallet/entities/CurrencyValue;Ljava/math/BigDecimal;Ljava/util/List;Ljava/lang/Long;)V", "getChartData", "()Ljava/util/List;", "getDiffValue", "()Ljava/math/BigDecimal;", "getHighValue", "()Lapp/odapplications/bitstashwallet/entities/CurrencyValue;", "getLastUpdateTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLowValue", "getMarketCap", "getRateValue", "getType", "()Lapp/odapplications/bitstashwallet/lib/chartview/ChartView$ChartType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lapp/odapplications/bitstashwallet/lib/chartview/ChartView$ChartType;Lapp/odapplications/bitstashwallet/entities/CurrencyValue;Lapp/odapplications/bitstashwallet/entities/CurrencyValue;Lapp/odapplications/bitstashwallet/entities/CurrencyValue;Lapp/odapplications/bitstashwallet/entities/CurrencyValue;Ljava/math/BigDecimal;Ljava/util/List;Ljava/lang/Long;)Lapp/odapplications/bitstashwallet/modules/ratechart/ChartViewItem;", "equals", "", "other", "hashCode", "", "toString", "", "app_productionMainnetRelease"})
public final class ChartViewItem {
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.lib.chartview.ChartView.ChartType type = null;
    @org.jetbrains.annotations.Nullable()
    private final app.odapplications.bitstashwallet.entities.CurrencyValue rateValue = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.entities.CurrencyValue marketCap = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.entities.CurrencyValue lowValue = null;
    @org.jetbrains.annotations.NotNull()
    private final app.odapplications.bitstashwallet.entities.CurrencyValue highValue = null;
    @org.jetbrains.annotations.NotNull()
    private final java.math.BigDecimal diffValue = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<app.odapplications.bitstashwallet.lib.chartview.models.ChartPoint> chartData = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long lastUpdateTimestamp = null;
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.lib.chartview.ChartView.ChartType getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.entities.CurrencyValue getRateValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.entities.CurrencyValue getMarketCap() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.entities.CurrencyValue getLowValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.entities.CurrencyValue getHighValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getDiffValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<app.odapplications.bitstashwallet.lib.chartview.models.ChartPoint> getChartData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getLastUpdateTimestamp() {
        return null;
    }
    
    public ChartViewItem(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.lib.chartview.ChartView.ChartType type, @org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.entities.CurrencyValue rateValue, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.CurrencyValue marketCap, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.CurrencyValue lowValue, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.CurrencyValue highValue, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal diffValue, @org.jetbrains.annotations.NotNull()
    java.util.List<app.odapplications.bitstashwallet.lib.chartview.models.ChartPoint> chartData, @org.jetbrains.annotations.Nullable()
    java.lang.Long lastUpdateTimestamp) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.lib.chartview.ChartView.ChartType component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final app.odapplications.bitstashwallet.entities.CurrencyValue component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.entities.CurrencyValue component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.entities.CurrencyValue component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.entities.CurrencyValue component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<app.odapplications.bitstashwallet.lib.chartview.models.ChartPoint> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.odapplications.bitstashwallet.modules.ratechart.ChartViewItem copy(@org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.lib.chartview.ChartView.ChartType type, @org.jetbrains.annotations.Nullable()
    app.odapplications.bitstashwallet.entities.CurrencyValue rateValue, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.CurrencyValue marketCap, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.CurrencyValue lowValue, @org.jetbrains.annotations.NotNull()
    app.odapplications.bitstashwallet.entities.CurrencyValue highValue, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal diffValue, @org.jetbrains.annotations.NotNull()
    java.util.List<app.odapplications.bitstashwallet.lib.chartview.models.ChartPoint> chartData, @org.jetbrains.annotations.Nullable()
    java.lang.Long lastUpdateTimestamp) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}
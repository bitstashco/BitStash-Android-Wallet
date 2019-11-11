package app.odapplications.bitstashwallet.lib.chartview

import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.RectF
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import android.view.animation.AccelerateInterpolator
import app.odapplications.bitstashwallet.R
import app.odapplications.bitstashwallet.lib.chartview.models.ChartConfig
import app.odapplications.bitstashwallet.lib.chartview.models.ChartPoint

class ChartView : View {
    interface Listener {
        fun onTouchDown()
        fun onTouchUp()
        fun onTouchSelect(point: ChartPoint)
    }

    enum class ChartType {
        DAILY,
        WEEKLY,
        MONTHLY,
        MONTHLY6,
        MONTHLY18;

        companion object {
            val annualPoints = 53
            val map = values().associateBy(ChartType::name)
            fun fromString(type: String?): ChartType? = map[type]
        }
    }

    var listener: Listener? = null

    private val viewHelper = ViewHelper(context)
    private val config = ChartConfig(context, viewHelper)
    private val helper = ScaleHelper(config)

    private val shape = RectF()
    private val chartCurve = ChartCurve(shape, config)
    private val chartGrid = ChartGrid(shape, config)
    private var chartIndicator: ChartIndicator? = null

    // Animator
    private val animator = ValueAnimator().apply {
        interpolator = AccelerateInterpolator()
        duration = 300
        addUpdateListener { animator ->
            // Get our float from the animation. This method returns the Interpolated float.
            config.animatedFraction = animator.animatedFraction
            invalidate()
        }
    }

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        initialize(attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        initialize(attrs)
    }

    private fun initialize(attrs: AttributeSet) {
        val ta = context.obtainStyledAttributes(attrs, R.styleable.ChartView)
        try {
            ta.getBoolean(R.styleable.ChartView_showGrid, true).let { config.showGrid = it }
            ta.getBoolean(R.styleable.ChartView_animated, true).let { config.animated = it }
            ta.getDimension(R.styleable.ChartView_width, 0f).let { config.width = it }
            ta.getDimension(R.styleable.ChartView_height, 0f).let { config.height = it }
            ta.getInt(R.styleable.ChartView_growColor, context.getColor(R.color.green_d)).let { config.growColor = it }
            ta.getInt(R.styleable.ChartView_fallColor, context.getColor(R.color.red_d)).let { config.fallColor = it }
            ta.getInt(R.styleable.ChartView_textColor, context.getColor(R.color.grey)).let { config.textColor = it }
            ta.getInt(R.styleable.ChartView_gridColor, context.getColor(R.color.steel_20)).let { config.gridColor = it }
            ta.getInt(R.styleable.ChartView_touchColor, context.getColor(R.color.light)).let { config.touchColor = it }
            ta.getInt(R.styleable.ChartView_indicatorColor, context.getColor(R.color.light)).let { config.indicatorColor = it }
        } finally {
            ta.recycle()
        }
    }

    override fun willNotDraw(): Boolean {
        return false
    }

    override fun onDraw(canvas: Canvas) {
        chartCurve.draw(canvas)
        if (config.showGrid) {
            chartGrid.draw(canvas)
        }
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        val eventListener = listener ?: return false

        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                chartCurve.onTouchActive()
                eventListener.onTouchDown()
                chartIndicator?.onMove(chartCurve.find(event.rawX), eventListener)
                invalidate()
            }

            MotionEvent.ACTION_MOVE -> {
                chartIndicator?.onMove(chartCurve.find(event.rawX), eventListener)
            }

            MotionEvent.ACTION_UP,
            MotionEvent.ACTION_CANCEL -> {
                chartCurve.onTouchInactive()
                eventListener.onTouchUp()
                invalidate()
            }
        }

        return true
    }

    fun setIndicator(indicator: ChartIndicator) {
        chartIndicator = indicator
        chartIndicator?.init(config)
    }

    fun setData(points: List<ChartPoint>, chartType: ChartType) {
        setColour(points)
        setPoints(points, chartType)

        if (config.animated) {
            animator.setFloatValues(0f)
            animator.start()
        } else {
            invalidate()
        }
    }

    private fun setColour(points: List<ChartPoint>) {
        val startPoint = points.firstOrNull() ?: return
        val endPoint = points.lastOrNull() ?: return

        if (startPoint.value > endPoint.value) {
            config.curveColor = config.fallColor
        } else {
            config.curveColor = config.growColor
        }
    }

    private fun setPoints(points: List<ChartPoint>, chartType: ChartType) {
        helper.scale(points)

        var shapeWidth = width.toFloat()
        if (shapeWidth == 0f) {
            shapeWidth = config.width
        }

        var shapeHeight = height.toFloat()
        if (shapeHeight == 0f) {
            shapeHeight = config.height
        }

        if (config.showGrid) {
            config.offsetRight = viewHelper.measureWidth(config.valueTop, config.valuePrecision) + viewHelper.dp2px(20f)
            config.offsetBottom = viewHelper.dp2px(20f)
        }

        shape.set(0f, 0f, shapeWidth - config.offsetRight, shapeHeight - config.offsetBottom)

        chartCurve.init(points)

        if (config.showGrid) {
            chartGrid.init(points, chartType)
        }
    }
}

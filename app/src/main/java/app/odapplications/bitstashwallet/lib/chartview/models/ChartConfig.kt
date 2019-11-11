package app.odapplications.bitstashwallet.lib.chartview.models

import android.content.Context
import app.odapplications.bitstashwallet.R
import app.odapplications.bitstashwallet.lib.chartview.ViewHelper

class ChartConfig(context: Context, viewHelper: ViewHelper) {
    var showGrid = true
    var animated = true
    //  colors
    var curveColor = context.getColor(R.color.red_d)
    var touchColor = context.getColor(R.color.light)
    var gridColor = context.getColor(R.color.steel_20)
    var textColor = context.getColor(R.color.grey)
    var growColor = context.getColor(R.color.green_d)
    var fallColor = context.getColor(R.color.red_d)
    var indicatorColor = context.getColor(R.color.light)

    //  dimens
    var width = 0f
    var height = 0f
    var textSize = viewHelper.dp2px(12f)
    var textPadding = viewHelper.dp2px(4f)
    var strokeWidth = 1f
    var offsetRight = 0f
    var offsetBottom = 0f
    var gridEdgeOffset = viewHelper.dp2px(5f)

    //  grid dimens
    var valueTop = 0f
    var valueStep = 0f
    var valuePrecision = 0

    //  Animation
    var animatedFraction = 0f
}

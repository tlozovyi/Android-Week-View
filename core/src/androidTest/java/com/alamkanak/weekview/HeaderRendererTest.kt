package com.alamkanak.weekview

import android.content.res.Resources
import android.util.TypedValue
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.shopify.testify.ScreenshotRule
import com.shopify.testify.annotation.ScreenshotInstrumentation
import kotlin.math.roundToInt
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class HeaderRendererTest {

    // These tests need to be run on a Pixel 3a XL with API 30.
    // TODO More infos

    @get:Rule
    var rule = ScreenshotRule(RendererTestActivity::class.java)

    private val resources: Resources
        get() = rule.activity.baseContext.resources

    @ScreenshotInstrumentation
    @Test
    fun testDefault() {
        val viewState = createViewState(activity = rule.activity) {
            headerHeight = 200f
        }
        val eventChipsCache = EventChipsCache()
        val renderer = HeaderRenderer(viewState, eventChipsCache)
        rule.validate(renderer)
    }

    private val Int.dp: Int
        get() = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, toFloat(), resources.displayMetrics).roundToInt()
}

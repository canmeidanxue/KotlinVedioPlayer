package com.example.a037.eyepetizer.util

import android.content.Context
import android.util.DisplayMetrics

/**
 * Created on 2017/12/6.
 * @author:037
 */
object DisplayManager {
    init {

    }

    /**
     * 按矩阵呈现
     */
    private var displayMetrics: DisplayMetrics? = null
    /**
     * 屏幕宽度
     */
    private var screenWith: Int? = null
    /**
     * 屏幕高度
     */
    private var screenHeight: Int? = null
    /**
     * 屏幕dpi
     */
    private var screenDpi: Int? = null


    fun init(context: Context) {
        displayMetrics = context.resources.displayMetrics
        screenWith = displayMetrics?.widthPixels
        screenHeight = displayMetrics?.heightPixels
        screenDpi = displayMetrics?.densityDpi
    }

    //UI大小
    private val STANDERD_WIDTH = 1080

    private val STANDERD_HEIGHT = 1920


    fun getScreenWidth(): Int? {
        return screenWith
    }

    fun getScreenHeight(): Int? {
        return screenHeight
    }

    fun getPaintSize(size: Int): Int {
        return getRealHeight(size)
    }

    /**
     * 实际高度
     */
    fun getRealHeight(px: Int, parentHeight: Float): Int? {
        return (px / parentHeight * getScreenHeight()!!).toInt()
    }

    /**
     * 实际宽度
     */
    fun getRealWidth(px: Int, parentWidth: Float): Int {
        return (px / parentWidth * getScreenWidth()!!).toInt()
    }

    fun getWidth(px: Int): Int {
        return (px / STANDERD_WIDTH * getScreenWidth()!!).toInt()
    }


    /**
     * 获取实际高度
     */
    fun getRealHeight(px: Int): Int {
        return (px / STANDERD_HEIGHT * getScreenHeight()!!).toInt()
    }

    /**
     * 将dip转化为px
     */
    fun dip2px(dipValue: Float): Int? {
        val scale = displayMetrics?.density
        return (dipValue * scale!! + 0.5f).toInt()

    }


}
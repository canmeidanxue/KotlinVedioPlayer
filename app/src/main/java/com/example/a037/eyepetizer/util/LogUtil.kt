package com.example.a037.eyepetizer.util

import android.util.Log
import kotlin.experimental.and

/**
 * Created on 2017/12/7.
 * @author:037
 */
class LogUtil {
    private val LV: Byte = 0x20
    private val LI: Byte = 0x08
    private val LW: Byte = 0x04
    private val LE: Byte = 0x02
    private val LA: Byte = 0x01

    companion object {
        val MTAG: String = "Eyepetizer"
        private val LD: Byte = 0x10
        val isDisplayLog: Boolean = true
        val sLevel: Byte = 0x3f
        fun d(msg: String) {
            if ((LD and sLevel) > 0 && isDisplayLog) {
                Log.i(MTAG, msg)
            }
        }
    }
}

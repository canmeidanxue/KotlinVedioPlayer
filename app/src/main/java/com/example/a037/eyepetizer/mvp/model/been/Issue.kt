package com.example.a037.eyepetizer.mvp.model.been

/**
 * Created on 2017/12/12.
 * @author:037
 */
data class Issue(val releaseTime: Long, val type: String, val date: Long, val total: Int, val publishTime: Long, val itemList: ArrayList<Item>, var count: Int, val nextpageUrl: String) {
}
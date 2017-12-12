package com.example.a037.eyepetizer.mvp.model.been

/**
 * Created on 2017/12/12.
 * @author:037
 */
class HotCategory(val tabInfo: TabInfo) {
    data class TabInfo(val tabList: ArrayList<Tab>)
    data class Tab(val id: Long, val name: String, val apiUrl: String)
}
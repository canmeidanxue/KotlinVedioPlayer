package com.example.a037.eyepetizer.mvp.model.been

/**
 * Created on 2017/12/12.
 * @author:037
 */
data class HomeBean(val issueList: ArrayList<Issue>, val nextPageUrl: String, val nextPublishTime: Long, val newestIssueType: String, val dialog: Any) {
}
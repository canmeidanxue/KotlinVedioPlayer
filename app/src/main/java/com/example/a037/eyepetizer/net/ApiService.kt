package com.example.a037.eyepetizer.net

import com.example.a037.eyepetizer.mvp.model.been.Category
import com.example.a037.eyepetizer.mvp.model.been.HomeBean
import com.example.a037.eyepetizer.mvp.model.been.HotCategory
import com.example.a037.eyepetizer.mvp.model.been.Issue
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url


/**
 * Created on 2017/12/12.
 * @author:037
 */
interface ApiService {
    /**
     * banner+一页数据，num=1
     */
    @GET("v2/feed?&num=1")
    fun getFirstHomeData(@Query("date") date: Long): Observable<HomeBean>

    /**
     * 根据nextoageurl请求数据
     */
    @GET
    fun getMoreHomeData(@Url url: String): Observable<HomeBean>

    /**
     * issue里面包了itemlist 和nextpageurl
     */
    @GET
    fun getIssue(@Url url: String): Observable<Issue>

    /**
     * 热门类别
     */
    @GET
    fun getHotCategory(@Url url: String): Observable<HotCategory>

    /**
     * 获取回复
     */
    @GET("v2/replies/video?")
    fun getReply(@Query("videoId") videoId: Long): Observable<Issue>

    /**
     * 根据item id获取相关视频
     */
    @GET("v4/video/related?")
    fun getRelatedData(@Query("id") id: Long): Observable<Issue>

    /**
     * 获取分类
     */
    @GET("v4/categories")
    fun getCategory(): Observable<ArrayList<Category>>

    /**
     * 获取分类下的全部数据
     */
    @GET("v4/categories/videoList")
    fun getCategoryItemList(@Query("id") id: Long): Observable<Issue>

}
package com.example.a037.eyepetizer.mvp.contract

import com.example.a037.eyepetizer.mvp.base.BasePresenter
import com.example.a037.eyepetizer.mvp.base.BaseView
import com.example.a037.eyepetizer.mvp.model.been.Issue
import com.example.a037.eyepetizer.mvp.model.been.Item
import io.reactivex.disposables.Disposable

/**
 * 详情页面接口，统一管理view和presenter中的接口，使得二者的功能一目了然
 * Created by blue_sky on 2017/12/12.
 */
interface DetailContract {
    interface IView : BaseView<IPresent> {
        /**
         * 设置播放器
         */
        fun setPlayer(playerUrl:String)

        /**
         * 设置影片信息/作者信息
         */
        fun setMovieAuthorInfo(info:Item)

        /**
         * 设置相关视频
         */
        fun setRelated(item:ArrayList<Item>)

        fun setBackgound(url:String)
        /**
         * 设置相关推荐之类的全部的view的数据
         */
        fun setDropDownView(issue:Issue)

        /**
         * 设置相关推荐之类的全部的view的数据(底部加载更多)
         */
        fun setMoreDropDownView(issue: Issue)


    }
    interface IPresent : BasePresenter {
        /**
         * 请求视频相关数据
         */
        fun requestRelatedData(id: Long): Disposable?

        /**
         * 从内存中获取基础数据（影片信息、作者信息）
         */
        fun requestBasicDataFromMemory(itemData:Item):Disposable?

        /**
         * 请求相关推荐之类的数据
         */
        fun requestRelatedAllList(url:String,title:String):Disposable?

        /**
         * 请求相关推荐之类的数据的更多数据
         */
        fun requestRelatedAllMoreList():Disposable?

        /**
         * 请求评论数据
         */
        fun requestReplay(videoId:Long):Disposable?

        /**
         * 请求更多评论数据
         */
        fun requestMoreReplay():Disposable?


    }
}
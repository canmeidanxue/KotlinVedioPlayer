package com.example.a037.eyepetizer.mvp.contract

import com.example.a037.eyepetizer.mvp.base.BasePresenter
import com.example.a037.eyepetizer.mvp.base.BaseView
import com.example.a037.eyepetizer.mvp.model.been.HomeBean
import com.example.a037.eyepetizer.mvp.model.been.Item

/**
 * Created by blue_sky on 2017/12/14.
 */
interface HomeContract {

    interface IView : BaseView<IPresent> {
        fun setFirstData(homeBean: HomeBean)
        fun setMoreData(itemList: ArrayList<Item>)
        fun onError()
    }

    interface IPresent : BasePresenter {
        /**
         * 刷新数据、第一次请求你数据
         */
        fun requestFirstData()

        /**
         * 底部加载更多
         */
        fun requestMoreData()

    }
}
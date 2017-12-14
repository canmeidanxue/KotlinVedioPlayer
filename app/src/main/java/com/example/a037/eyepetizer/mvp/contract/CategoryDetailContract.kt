package com.example.a037.eyepetizer.mvp.contract

import com.example.a037.eyepetizer.mvp.base.BasePresenter
import com.example.a037.eyepetizer.mvp.base.BaseView
import com.example.a037.eyepetizer.mvp.model.been.Category
import com.example.a037.eyepetizer.mvp.model.been.Item

/**
 * Created by blue_sky on 2017/12/14.
 */
interface CategoryDetailContract {

    interface IView : BaseView<CategoryDetailContract.IPresent>{
        fun setHeader(category: Category)
        fun setListData(itemList:ArrayList<Item>)
        fun onError()
    }
    interface IPresent : BasePresenter {
        fun requestMoreData()
        fun start(category: Category)
    }
}
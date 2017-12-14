package com.example.a037.eyepetizer.mvp.contract

import com.example.a037.eyepetizer.mvp.base.BasePresenter
import com.example.a037.eyepetizer.mvp.base.BaseView
import com.example.a037.eyepetizer.mvp.model.been.HotCategory
import com.example.a037.eyepetizer.mvp.model.been.Item

/**
 * Created by blue_sky on 2017/12/14.
 */
interface HotContract {
    interface IHotFragmentView : BaseView<IHotFragmentPresenter> {
        fun setTabAndFragment(hotCategory: HotCategory)
        fun onError()
    }

    interface IHotCategoryView : BaseView<IHotCategoryPresenter> {
        fun setListData(itemList: ArrayList<Item>)
        fun onError()
    }

    interface IHotFragmentPresenter : BasePresenter {
        fun requestHotCategory()
    }

    interface IHotCategoryPresenter : BasePresenter {
        fun requestData(url: String)
    }
}
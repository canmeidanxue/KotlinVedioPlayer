package com.example.a037.eyepetizer.mvp.contract

import com.example.a037.eyepetizer.mvp.base.BasePresenter
import com.example.a037.eyepetizer.mvp.base.BaseView
import com.example.a037.eyepetizer.mvp.model.been.Category

/**
 * 分类的契约接口，统一管理view和presenter中的接口，使二者的功能一目了然
 * Created by blue_sky on 2017/12/14.
 */
interface CategoryContract {
    interface IView : BaseView<IPresent> {
        fun showCategory(categorys: ArrayList<Category>)
        fun onError()
    }

    interface IPresent : BasePresenter {
        fun requestData()
    }
}
package com.example.a037.eyepetizer.mvp.presenter

import com.example.a037.eyepetizer.mvp.contract.CategoryContract
import com.example.a037.eyepetizer.mvp.model.CategoryModel

/**
 * Created by blue_sky on 2017/12/14.
 */
class CategoryPresenter(view: CategoryContract.IView) : CategoryContract.IPresent {
    val categoryView: CategoryContract.IView
    val categoryModle: CategoryModel by lazy {
        CategoryModel()
    }

    init {
        categoryView = view
    }

    override fun requestData() {
        categoryModle.loadData().subscribe({ categoryView.showCategory(it) }, {
            it.printStackTrace()
            categoryView.onError()
        })
    }
}
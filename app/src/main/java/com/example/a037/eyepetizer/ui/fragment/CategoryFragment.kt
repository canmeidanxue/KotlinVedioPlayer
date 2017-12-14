package com.example.a037.eyepetizer.ui.fragment

import com.example.a037.eyepetizer.mvp.contract.CategoryContract
import com.example.a037.eyepetizer.mvp.model.been.Category
import com.example.a037.eyepetizer.ui.base.BaseFragment
import com.example.a037.eyepetizer.ui.base.tabIds

/**
 * Created by blue_sky on 2017/12/14.
 */
class CategoryFragment :BaseFragment(tabId = tabIds[1] ),CategoryContract.IView {
//    val categoryPresent:CategoryPresenter
    val adapter by lazy{

}
    override fun showCategory(categorys: ArrayList<Category>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
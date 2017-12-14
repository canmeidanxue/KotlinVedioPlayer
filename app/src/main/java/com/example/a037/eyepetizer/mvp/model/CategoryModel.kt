package com.example.a037.eyepetizer.mvp.model

import com.example.a037.eyepetizer.io_main
import com.example.a037.eyepetizer.mvp.model.been.Category
import com.example.a037.eyepetizer.net.Network
import io.reactivex.Observable

/**
 * Created on 2017/12/12.
 * @author:037
 */
class CategoryModel {
    fun loadData(): Observable<ArrayList<Category>> {
        return Network.service.getCategory().io_main()
    }
}
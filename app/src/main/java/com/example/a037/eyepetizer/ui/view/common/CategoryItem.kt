package com.example.a037.eyepetizer.ui.view.common

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import com.bumptech.glide.Glide
import com.example.a037.eyepetizer.R
import com.example.a037.eyepetizer.mvp.model.been.Category
import kotlinx.android.synthetic.main.layout_category_item.view.*

/**
 * Created by blue_sky on 2017/12/15.
 */
class CategoryItem:FrameLayout {
    constructor(context: Context?) : this(context, null)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        initView()
    }

    private fun initView() {
        inflate(context, R.layout.layout_category_item, this)
    }

    fun setData(category: Category) {
        tv_name.text = "#"+category.name
        Glide.with(context).load(category.bgPicture).centerCrop().into(iv_category)
    }
}
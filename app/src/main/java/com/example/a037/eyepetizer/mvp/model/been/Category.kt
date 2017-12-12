package com.example.a037.eyepetizer.mvp.model.been

import java.io.Serializable

/**
 * Created on 2017/12/12.
 * @author:037
 */
data class Category(val id: Long, val name: String, val description: String, val bgPicture: String, val bgColor: String, val headerImg: String) : Serializable {
}
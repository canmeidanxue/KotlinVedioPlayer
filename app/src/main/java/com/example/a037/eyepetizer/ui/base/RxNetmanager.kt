package com.example.a037.eyepetizer.ui.base

import io.reactivex.disposables.Disposable

/**
 * Created on 2017/12/12.
 * @author:037
 */
interface RxNetmanager {
    fun dispose(disposable:Disposable)
    fun addDisposable(disposable: Disposable)
}
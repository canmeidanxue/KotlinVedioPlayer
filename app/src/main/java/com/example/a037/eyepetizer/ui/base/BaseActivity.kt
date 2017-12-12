package com.example.a037.eyepetizer.ui.base

import android.support.v7.app.AppCompatActivity
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

/**
 * Created on 2017/12/12.
 * @author:037
 */
abstract class BaseActivity : AppCompatActivity(), RxNetmanager {
    protected val disposables = CompositeDisposable()

    override fun onDestroy() {
        super.onDestroy()
        disposables.clear()
    }

    override fun dispose(disposable: Disposable) {
        disposables.remove(disposable)
    }

    override fun addDisposable(disposable: Disposable) {

        disposables.add(disposable)
    }
}
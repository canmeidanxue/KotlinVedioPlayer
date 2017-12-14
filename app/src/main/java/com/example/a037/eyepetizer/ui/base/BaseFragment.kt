package com.example.a037.eyepetizer.ui.base

import android.app.Fragment
import com.example.a037.eyepetizer.R
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

/**
 * Created on 2017/12/12.
 * @author:037
 */
var currentFragment = R.id.rb_home
var tabIds = listOf(R.id.rb_home, R.id.rb_category, R.id.rb_hot)

abstract class BaseFragment(tabId: Int) : Fragment(), RxNetmanager {
    var tabId = 0

    init {
        this.tabId = tabId
    }

    protected val disposables = CompositeDisposable()
    override fun onDestroyView() {
        super.onDestroyView()
        disposables.clear()
    }

    override fun dispose(disposable: Disposable) {
        disposables.remove(disposable)
    }

    override fun addDisposable(disposable: Disposable) {
        disposables.add(disposable)
    }

    open fun setupToolbar(): Boolean {
        if (tabId != currentFragment) {//解决MainActivity fragment切换时，toolbar更新bug（homefragment中recyclerview滚动会更新toolbar，如果不控制，在滚动过程中切换了tab，toolbar会依旧被更新）
            return true
        }
        return false
    }
}

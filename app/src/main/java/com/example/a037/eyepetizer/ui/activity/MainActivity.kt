package com.example.a037.eyepetizer.ui.activity

import android.os.Bundle
import com.example.a037.eyepetizer.R
import com.example.a037.eyepetizer.ui.base.BaseActivity
import com.example.a037.eyepetizer.ui.base.currentFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setVedio()
    }

    private fun setVedio() {
        rb_home.isChecked = true
        chooseFragment(R.id.rb_home)
    }

    private fun chooseFragment(checkedId: Int) {
        currentFragment = checkedId

    }
}

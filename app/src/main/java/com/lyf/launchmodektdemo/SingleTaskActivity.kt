package com.lyf.launchmodektdemo

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_single_task.*

class SingleTaskActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_task)

        btn_self.setOnClickListener {
            toActivity<SingleTaskActivity>()
        }

        btn_other.setOnClickListener {
            toActivity<OtherTaskActivity>()
//            toActivity<MainActivity>()
        }
    }
}

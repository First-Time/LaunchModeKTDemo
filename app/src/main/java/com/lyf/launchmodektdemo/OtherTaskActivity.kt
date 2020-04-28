package com.lyf.launchmodektdemo

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other_task.*

class OtherTaskActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other_task)

        btn_task.setOnClickListener {
            toActivity<SingleTaskActivity>()
        }
    }
}

package com.lyf.launchmodektdemo

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other_task1.*

class OtherTask1Activity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other_task1)

        btn_task2.setOnClickListener {
            toActivity<OtherTask2Activity>()
        }
    }
}

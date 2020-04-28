package com.lyf.launchmodektdemo

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        actionBar?.setDisplayHomeAsUpEnabled(false)

        btn_standard.setOnClickListener {
            toActivity<StandardActivity>()
        }

        btn_top.setOnClickListener {
            toActivity<SingleTopActivity>()
        }

        btn_task.setOnClickListener {
            toActivity<SingleTaskActivity>()
        }

        btn_instance.setOnClickListener {
            toActivity<SingleInstanceActivity>()
        }
    }
}

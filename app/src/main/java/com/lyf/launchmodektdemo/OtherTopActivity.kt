package com.lyf.launchmodektdemo

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other_top.*

class OtherTopActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other_top)

        btn_top.setOnClickListener {
            toActivity<SingleTopActivity>()
        }
    }
}

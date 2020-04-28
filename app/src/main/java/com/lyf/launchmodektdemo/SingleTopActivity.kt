package com.lyf.launchmodektdemo

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_single_top.*

class SingleTopActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_top)

        btn_self.setOnClickListener {
            toActivity<SingleTopActivity>()
        }

        btn_other.setOnClickListener {
            toActivity<OtherTopActivity>()
//            toActivity<MainActivity>()
        }
    }
}

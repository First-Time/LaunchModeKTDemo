package com.lyf.launchmodektdemo

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_single_instance.*

class SingleInstanceActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_instance)

        btn_self.setOnClickListener {
            toActivity<SingleInstanceActivity>()
        }

        btn_instance.setOnClickListener {
            toActivity<OtherInstanceActivity>()
//            toActivity<MainActivity>()
        }
    }
}

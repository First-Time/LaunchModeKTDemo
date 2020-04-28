package com.lyf.launchmodektdemo

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other_instance.*

class OtherInstanceActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other_instance)

        btn_instance.setOnClickListener {
            toActivity<SingleInstanceActivity>()
        }
    }
}

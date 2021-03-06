package com.lyf.singletaskdemo

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        actionBar.setDisplayHomeAsUpEnabled(false)

        btn_jump.setOnClickListener {
            startActivity(Intent(this, SingleTaskActivity::class.java))
        }
    }
}

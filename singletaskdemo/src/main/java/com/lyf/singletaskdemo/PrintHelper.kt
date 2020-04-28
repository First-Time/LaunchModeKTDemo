package com.lyf.singletaskdemo

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

fun printTaskInfo(activity: BaseActivity, methodName: String) {
    log("$methodName: ${activity.localClassName} taskId: ${activity.taskId} hashCode: ${activity.hashCode()}")
}

fun log(message: String, tag: String = "LaunchMode") {
    Log.i(tag, message)
}

fun dumpTaskAffinity(activity: BaseActivity) {
    val info = activity.packageManager.getActivityInfo(
        activity.componentName,
        PackageManager.GET_META_DATA
    )
    log("taskAffinity: ${info.taskAffinity}")
}

/**
 * @param T 目标 Activity
 */
inline fun <reified T : AppCompatActivity> Context.toActivity() {
    startActivity(Intent(this, T::class.java))
}

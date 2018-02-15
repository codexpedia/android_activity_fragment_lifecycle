package com.example.activitycycle

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View

class SecondActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val sampleFragment = SampleFragment()
        fragmentManager
                .beginTransaction()
                .replace(R.id.fl_container, sampleFragment, "my_tag")
                .commit()
    }

    fun nextScreen(v: View) {
        val i = Intent(this@SecondActivity, ThirdActivity::class.java)
        startActivity(i)
    }
}

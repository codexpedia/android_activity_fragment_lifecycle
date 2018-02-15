package com.example.activitycycle

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : Activity() {
    // UI elements
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val greeting = if (savedInstanceState != null) savedInstanceState.getString("greeting") else "null"
        Log.i(this.localClassName, "Activity created. greeting from onSaveInstanceState: " + greeting!!)
    }


    override fun onStart() {
        super.onStart()
        Log.i(this.localClassName, "Activity started.")
    }

    override fun onResume() {
        super.onResume()
        Log.i(this.localClassName, "Activity resumed.")
    }

    override fun onPause() {
        super.onPause()
        Log.i(this.localClassName, "Activity paused.")
    }

    override fun onStop() {
        super.onStop()
        Log.i(this.localClassName, "Activity stopped.")
    }



    override fun onRestart() {
        super.onRestart()
        Log.i(this.localClassName, "Activity restarted.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(this.localClassName, "Activity destroyed.")
    }

    fun nextScreen(v: View) {
        val i = Intent(this@MainActivity, SecondActivity::class.java)
        startActivity(i)
        Log.i(this.localClassName, "Started next activity.")

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i(this.localClassName, "Restore instance.")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("greeting", "Hello")
        outState.putParcelable("parcelable", null)
        Log.i(this.localClassName, "Save instance.")
    }
}

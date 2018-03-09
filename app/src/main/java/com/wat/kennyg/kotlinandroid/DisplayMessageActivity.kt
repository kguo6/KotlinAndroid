package com.wat.kennyg.kotlinandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {
    companion object {var counter = 0}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // Get the Intent that started this activity and extract the string
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        // Capture the layout's TextView and set the string as its text
        val textView = findViewById<TextView>(R.id.textView)

        textView.apply {
            text = message
        }

        val textView3 = findViewById<TextView>(R.id.textView3)

        textView3.apply {
            text = counter.toString()
        }
    }

    fun count(view: View){
        counter++
        val textView = findViewById<TextView>(R.id.textView3)

        textView.apply{
            text = counter.toString()
        }

    }
}

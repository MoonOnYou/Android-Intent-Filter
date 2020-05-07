package com.onyou.android.aproject

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startMainOfB.setOnClickListener(clickListener)
        startSubOfB.setOnClickListener(clickListener)
        startMainOfBWithText.setOnClickListener(clickListener)
    }

    private val clickListener = View.OnClickListener { v ->
        when(v.id) {
            R.id.startMainOfB -> {
                startActivity(Intent(Intent.ACTION_VIEW,Uri.parse("b_project://main_activity")))
            }
            R.id.startSubOfB -> {
                startActivity(Intent(Intent.ACTION_VIEW,Uri.parse("b_project://sub_activity")))
            }
            R.id.startMainOfBWithText -> {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("b_project://main_activity"))
                intent.putExtra("TestKey", editText.text.toString())
                startActivity(intent)
            }
        }
    }
}

package com.example.trojmiastotohou

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        findViewById<TextView>(R.id.Danzig).setOnClickListener {
            val changeDanzig = Intent(this@MainActivity, DanzigActivity::class.java )
            startActivity(changeDanzig)
        }
        findViewById<TextView>(R.id.Gdingen).setOnClickListener{
            val changeGdingen = Intent(this@MainActivity, GdingenView::class.java)
            startActivity(changeGdingen)
        }

        findViewById<TextView>(R.id.Zoppot).setOnClickListener{
            val changeZoppot = Intent(this@MainActivity, ZoppotView::class.java)
            startActivity(changeZoppot)
        }
    }
}
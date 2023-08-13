package com.example.prozrenie

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getSupportActionBar()?.hide();

        var info_btn = findViewById<TextView>(R.id.inf_btn)
        info_btn.setOnClickListener {
            val intent = Intent(this, info::class.java)
            startActivity(intent)
        }

        var drawing_gam = findViewById<LinearLayout>(R.id.drawing_game)
        drawing_gam.setOnClickListener {
            val intent = Intent(this, paint_game::class.java)
            startActivity(intent)
        }

        var imgs_gam = findViewById<LinearLayout>(R.id.imgs_game)
        imgs_gam.setOnClickListener {
            val intent = Intent(this, imges_game_1::class.java)
            startActivity(intent)
        }

        var relax_gam = findViewById<LinearLayout>(R.id.relax_game)
        relax_gam.setOnClickListener {
            val intent = Intent(this, relax_game::class.java)
            startActivity(intent)
        }

        var flower_gam = findViewById<LinearLayout>(R.id.flower_game_l)
        flower_gam.setOnClickListener {
            val intent = Intent(this, flower_game::class.java)
            startActivity(intent)
        }

        var cross = findViewById<LinearLayout>(R.id.cross_game_l)
        cross.setOnClickListener {
            val intent = Intent(this, cross_game::class.java)
            startActivity(intent)
        }

    }
}
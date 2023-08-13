package com.example.prozrenie


import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        supportActionBar?.hide()

        val t = findViewById<TextView>(R.id.inf)
        t.movementMethod = LinkMovementMethod.getInstance()

        val s = findViewById<TextView>(R.id.s_inf)
        s.movementMethod = LinkMovementMethod.getInstance()
    }
    override fun onBackPressed() {
        setResult(RESULT_CANCELED)
        super.onBackPressed()
        finish()
        startActivity(Intent(this, MainActivity::class.java))
    }


    fun License_btn(view: View)
    {
        var dialog = Dialog(this)
        dialog.setContentView(R.layout.questtext)
        var txt = dialog.findViewById<TextView>(R.id.questtxt)
        txt.setText(R.string.LICENSE)
        var ok = dialog.findViewById<Button>(R.id.offthedial)
        ok.setOnClickListener { dialog.dismiss() }
        dialog.show()
    }
}
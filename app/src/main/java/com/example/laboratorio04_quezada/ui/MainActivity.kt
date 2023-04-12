package com.example.laboratorio04_quezada.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.laboratorio04_quezada.R
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private lateinit var  nameEditText: TextInputEditText
    private lateinit var  emailEditText: TextInputEditText
    private lateinit var  phoneEditText: TextInputEditText
    private lateinit var  actionNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameEditText = findViewById(R.id.name_value)
        emailEditText = findViewById(R.id.email_value)
        phoneEditText = findViewById(R.id.phone_value)
        actionNext = findViewById(R.id.action_share)

        actionNext.setOnClickListener {
            val intent = Intent(this, ShareActivity::class.java)
            intent.putExtra("name",nameEditText.text.toString())
            intent.putExtra("email", emailEditText.text.toString())
            intent.putExtra("phone", phoneEditText.text.toString())
            startActivity(intent)


        }

    }

    companion object {
        const val SHARE_NAME = "name"
    }
}
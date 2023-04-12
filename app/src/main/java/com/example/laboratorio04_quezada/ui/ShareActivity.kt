package com.example.laboratorio04_quezada.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.laboratorio04_quezada.R

class ShareActivity : AppCompatActivity() {
    private lateinit var  nameTextView: TextView
    private lateinit var  phoneTextView: TextView
    private lateinit var  emailTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share)

        nameTextView = findViewById(R.id.name_text_view)
        emailTextView = findViewById(R.id.email_text_view)
        phoneTextView = findViewById(R.id.phone_text_view)


        val nameShared = intent.getStringExtra("name").toString()
        nameTextView.text = "Nombre: ${nameShared}"

        val emailShared = intent.getStringExtra("email").toString()
        emailTextView.text = "Telefono: ${emailShared}"

        val phoneShared = intent.getStringExtra("phone").toString()
        phoneTextView.text = "Correo electronico: ${phoneShared}"
    }
}
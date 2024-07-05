package com.example.anabeatrizfrana

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class register_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)

        val emailEditText = findViewById<EditText>(R.id.emailRegister)
        val passwordEditText = findViewById<EditText>(R.id.passwordRegister)
        val btnRegister = findViewById<Button>(R.id.buttonRegister)
        val registerTt = findViewById<TextView>(R.id.createTitle)


    }
}
package com.example.anabeatrizfrana

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class login_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val emailLogin = findViewById<EditText>(R.id.emailLogin)
        val passwordLogin = findViewById<EditText>(R.id.passwordLogin)
        val btnLogin = findViewById<Button>(R.id.buttonLogin)
        val changeScreen = findViewById<Button>(R.id.changeToRegister)

        btnLogin.setOnClickListener {
            val email = emailLogin.text.toString()
            val password = passwordLogin.text.toString()

            if ( email == "user@gmail.com" && password == "password" ) {
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Invalid email or password" , Toast.LENGTH_SHORT).show()
            }
        }

        // para trocar para a tela de registro
        changeScreen.setOnClickListener {
            val intent = Intent(this, register_activity::class.java)
            startActivity(intent)
        }
    }
}
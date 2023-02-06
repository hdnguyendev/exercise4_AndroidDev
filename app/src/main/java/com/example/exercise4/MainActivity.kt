package com.example.exercise4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }



    fun checkLogin(view: View) {
        val username = findViewById<EditText>(R.id.username_edittext).text.toString()
        val password = findViewById<EditText>(R.id.password_edittext).text.toString()
        if (username.equals("admin") && password.equals("123456")) {
            Toast.makeText(this, "Login success", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this@MainActivity, HomeActivity::class.java))
        } else {

            Toast.makeText(this, "Login failed", Toast.LENGTH_SHORT).show()
            findViewById<EditText>(R.id.password_edittext).setText("")
        }


    }

}

package com.example.authenticationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email = findViewById<EditText>(R.id.email)
        val password = findViewById<EditText>(R.id.password)
        val submit = findViewById<Button>(R.id.submit)
        val img = findViewById<ImageView>(R.id.img)
        img.setVisibility(View.INVISIBLE)


        submit.setOnClickListener{
            if (email.text.toString().equals("muhammadnawaz@gmail.com") && password.text.toString().equals("k18sw06")){
                Toast.makeText(this,"Authentication Successful",Toast.LENGTH_LONG).show()
                img.setImageResource(R.drawable.happy)
                img.setVisibility(View.VISIBLE)

            }else{
                Toast.makeText(this,"Authentication Failed",Toast.LENGTH_LONG).show()
                img.setImageResource(R.drawable.sad)
                img.setVisibility(View.VISIBLE)

            }
        }

    }
}
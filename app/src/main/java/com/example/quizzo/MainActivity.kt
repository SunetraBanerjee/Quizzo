package com.example.quizzo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnstart: Button =findViewById(R.id.btnstart)
        val btnet:EditText=findViewById(R.id.btnet)

        btnstart.setOnClickListener{
            if(btnet.text.isEmpty())
            {
                Toast.makeText(this,"Please Enter Name",Toast.LENGTH_LONG).show()
            }
            else{
                val intent=Intent(this,questionActivity::class.java)
                intent.putExtra(Constants.USER_NAME,btnet.text.toString())
                startActivity(intent)
                finish()
            }
        }


    }
}
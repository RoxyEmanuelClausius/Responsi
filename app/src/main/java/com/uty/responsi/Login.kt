package com.uty.responsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Button;
import android.widget.EditText;
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.register_main.*



class Login : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val emaill=findViewById<EditText>(R.id.email_tx)
        var pasw=findViewById<EditText>(R.id.pss_tx)

            bt_register.setOnClickListener() {
                intent = Intent(this, Register::class.java)
                startActivity(intent)
            }

            bt_login.setOnClickListener(){
                    if (emaill.text.toString() == "Bimantara@yahoo.com" && pasw.text.toString()=="123"){
                        intent=Intent(this, AkunActivity::class.java)
                        startActivity(intent)
                    }else {
                        Toast.makeText(applicationContext, "Email atau Passwor Anda salah", Toast.LENGTH_SHORT).show();
                    }
                }
            }
            }





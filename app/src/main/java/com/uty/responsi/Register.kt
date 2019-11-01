package com.uty.responsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.register_main.*

class Register : AppCompatActivity() {

    val id:Int=10
    val language:String="kotlin"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_main)

        val name=findViewById<EditText>(R.id.tx_nama)
        val emaiil=findViewById<EditText>(R.id.tx_email)

        regis.setOnClickListener(){
            val nama=name.text.toString()
            val email=emaiil.text.toString()
            val intent=Intent(this, AkunActivity::class.java)

            intent.putExtra("nama",id)
            intent.putExtra("email",id)
        }

        kembali.setOnClickListener(){
            intent= Intent(this, Login::class.java)
            intent.putExtra("id_value",id)
            intent.putExtra("laguage_value", language)
            startActivity(intent)
        }
    }
}

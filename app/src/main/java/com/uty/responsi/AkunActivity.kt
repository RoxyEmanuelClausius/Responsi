package com.uty.responsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_akun.*
import kotlinx.android.synthetic.main.register_main.*

class AkunActivity : AppCompatActivity() {

    val id:Int=10
    val language:String="kotlin"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_akun)

        val bundle=intent.extras
        val nama=bundle?.get("nama")
        val email=bundle?.get("email")

        ak_nama.text=("Nama: "+ (nama))
        ak_email.text=("Eamil: "+ (email))

        back.setOnClickListener(){
            intent= Intent(this, Login::class.java)
            intent.putExtra("id_value",id)
            intent.putExtra("laguage_value", language)
            startActivity(intent)
        }
    }
}

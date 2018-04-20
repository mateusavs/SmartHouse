package com.example.masantos3.smarthouse.ip

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.masantos3.smarthouse.MainActivity
import com.example.masantos3.smarthouse.R
import kotlinx.android.synthetic.main.activity_new_ip.*

class NewIpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        btn_alterar.setOnClickListener { alterarIp() }
        setContentView(R.layout.activity_new_ip)

    }





    fun alterarIp(){
        var intent: Intent =  Intent(this, MainActivity::class.java)

        var newIp = newIp.text.toString()

        intent.putExtra("newIp", newIp)

        startActivity(intent)

    }
}

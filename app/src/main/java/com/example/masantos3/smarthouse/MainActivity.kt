package com.example.masantos3.smarthouse

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.masantos3.smarthouse.ip.NewIpActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.net.URL

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_ip.setOnClickListener { startActivity(Intent(this, NewIpActivity::class.java)) }

        var newip: String = intent.getStringExtra("newIp")
        ip.setText(newip)

        //status()
    }

    fun status(){
        val url = URL("http://casaandredavila1.no-ip.org:8090")
        url.openConnection()
        url    }
}


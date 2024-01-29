package com.mz.inafrag_ment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val TPFL = findViewById<Button>(R.id.fragmentMerah)
        val TO = findViewById<Button>(R.id.fragmentBiru)
        val pplg = findViewById<Button>(R.id.fragmentPPLG)
        val Kuliner = findViewById<Button>(R.id.fragmentkuliner)
        val Busana = findViewById<Button>(R.id.fragmentbusana)

        TPFL.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, BlankFragment())
            fragmentTransaction.commit()
        }

        TO.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, BlueFragment())
            fragmentTransaction.commit()
        }
        pplg.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, PplgFragment())
            fragmentTransaction.commit()
        }
        Kuliner.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, KulinerFragment())
            fragmentTransaction.commit()
        }
        Busana.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, BusanaFragment())
            fragmentTransaction.commit()
        }
    }
}
package com.example.dataintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dataintent.databinding.ActivityMain2Binding
import com.example.dataintent.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    companion object{
        val RESULT_CODE : Int = 999
    }
    private lateinit var binding : ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent //getIntent()
        val str = intent.getStringExtra("data")

        binding.et.setText(str)
        binding.btn2.setOnClickListener {
            val i = Intent()
            val s = binding.et.text.toString()
            i.putExtra("dulieu", s)

            setResult(RESULT_CODE, i)
            finish()
        }

    }
}
package com.example.dataintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.dataintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState : Bundle?){
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val button : Button = findViewById(R.id.btn1)
        binding.btn1.setOnClickListener{
            val s : String = binding.tv1.text.toString()
//            Toast.makeText(MainActivity@this, s, Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("data", s)
//            startActivity(intent)
            startActivityForResult(intent, MainActivity2.RESULT_CODE)
        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == MainActivity2.RESULT_CODE ){
            val string = data?.getStringExtra("dulieu")
            binding.tv1.text = string
        }
    }
}
package com.example.myapplication
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import but

open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val UP:TextView = findViewById(R.id.Up)
        val add:Button = findViewById(R.id.Add)
        val subtr:Button = findViewById(R.id.subtr)
        val mul:Button = findViewById(R.id.mul)
        val divide:Button = findViewById(R.id.divide)

        add.setOnClickListener { tViev.text = but(arg1(),arg2()).add() }
        subtr.setOnClickListener { tViev.text = but(arg1(),arg2()).add()}
        mul.setOnClickListener {tViev.text = but(arg1(),arg2()).add()}
        divide.setOnClickListener {tViev.text = but(arg1(),arg2()).add()}
        }

    fun arg1 ():Int {
        val Arg1:EditText = findViewById(R.id.editText1)
        val Arg1_ = Arg1.getText().toString().toInt()
        return Arg1_
    }

    fun arg2 ():Int {
        val Arg2:EditText = findViewById(R.id.editText2)
        val Arg2_ = Arg2.getText().toString().toInt()
        return Arg2_
    }
}


package com.example.myapplication
import Calkulate
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val UP:TextView = findViewById(R.id.Up)
        val Operation:TextView = findViewById(R.id.Operation)
        val DOWN:TextView = findViewById(R.id.DOWN)
        val result:TextView = findViewById(R.id.Result)

        val add:Button = findViewById(R.id.Add)
        val subtr:Button = findViewById(R.id.subtr)
        val mul:Button = findViewById(R.id.mul)
        val divide:Button = findViewById(R.id.divide)
        val C_UP:Button = findViewById(R.id.C_UP)
        val C_DOWN:Button = findViewById(R.id.C_DOWN)
        val CALK:Button = findViewById(R.id.CALK)

        val num1:Button = findViewById(R.id.number1)
        val num2:Button = findViewById(R.id.number2)
        val num3:Button = findViewById(R.id.number3)
        val num4:Button = findViewById(R.id.number4)
        val num5:Button = findViewById(R.id.number5)
        val num6:Button = findViewById(R.id.number6)
        val num7:Button = findViewById(R.id.number7)
        val num8:Button = findViewById(R.id.number8)
        val num9:Button = findViewById(R.id.number9)
        val num0:Button = findViewById(R.id.number0)

        var position:Boolean =true
        UP.setOnClickListener { position=true }
        DOWN.setOnClickListener { position=false }

        add.setOnClickListener { Operation.text = "+" }
        subtr.setOnClickListener { Operation.text = "-"}
        mul.setOnClickListener {Operation.text = "*"}
        divide.setOnClickListener {Operation.text = "/"}
        CALK.setOnClickListener {
            result.text = Calkulate(arg1(UP),arg2(DOWN),opred(Operation)).opred().toString()}

        C_UP.setOnClickListener {UP.text = ""}
        C_DOWN.setOnClickListener {DOWN.text = ""}
        }

    fun arg1 (UP:TextView):Int {
        val Arg1 = UP.getText().toString().toInt()
        return Arg1
    }

    fun arg2 (DOWN:TextView):Int {
        val Arg2 = DOWN.getText().toString().toInt()
        return Arg2
    }
    fun opred (Operation:TextView):String {
        val Arg2 = Operation.getText().toString()
        return Arg2
    }
}


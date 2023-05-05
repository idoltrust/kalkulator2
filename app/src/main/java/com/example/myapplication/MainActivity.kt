package com.example.myapplication
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

        var position =true
        UP.setOnClickListener { position=true }
        DOWN.setOnClickListener { position=false }

        add.setOnClickListener { Operation.text = "+" }
        subtr.setOnClickListener { Operation.text = "-"}
        mul.setOnClickListener {Operation.text = "*"}
        divide.setOnClickListener {Operation.text = "/"}
        CALK.setOnClickListener {
            if(UP.text.toString()=="" || DOWN.text.toString()==""){result.text = "Пустое поле"}
            else{result.text = Calculate(arg1(UP),arg2(DOWN),deist(Operation)).oped()}
            }


        num0.setOnClickListener {
            if (position){UP.text = pereopr_numb("0",UP)}
            else{DOWN.text = pereopr_numb("0",DOWN)}
        }
        num1.setOnClickListener {
            if (position){UP.text = pereopr_numb("1",UP)}
            else{DOWN.text = pereopr_numb("1",DOWN)}
        }
        num2.setOnClickListener {
            if (position){UP.text = pereopr_numb("2",UP)}
            else{DOWN.text = pereopr_numb("2",DOWN)}
        }
        num3.setOnClickListener {
            if (position){UP.text = pereopr_numb("3",UP)}
            else{DOWN.text = pereopr_numb("3",DOWN)}
        }
        num4.setOnClickListener {
            if (position){UP.text = pereopr_numb("4",UP)}
            else{DOWN.text = pereopr_numb("4",DOWN)}
        }
        num5.setOnClickListener {
            if (position){UP.text = pereopr_numb("5",UP)}
            else{DOWN.text = pereopr_numb("5",DOWN)}
        }
        num6.setOnClickListener {
            if (position){UP.text = pereopr_numb("6",UP)}
            else{DOWN.text = pereopr_numb("6",DOWN)}
        }
        num7.setOnClickListener {
            if (position){UP.text = pereopr_numb("7",UP)}
            else{DOWN.text = pereopr_numb("7",DOWN)}
        }
        num8.setOnClickListener {
            if (position){UP.text = pereopr_numb("8",UP)}
            else{DOWN.text = pereopr_numb("8",DOWN)}
        }
        num9.setOnClickListener {
            if (position){UP.text = pereopr_numb("9",UP)}
            else{DOWN.text = pereopr_numb("9",DOWN)}
        }



        C_UP.setOnClickListener {UP.text = ""}
        C_DOWN.setOnClickListener {DOWN.text = ""}
        }

    private fun arg1(UP: TextView): Int {
        return UP.text.toString().toInt()
    }

    private fun arg2(DOWN: TextView): Int {
        return DOWN.text.toString().toInt()
    }
    private fun deist(Operation: TextView): String {
        return Operation.text.toString()
    }
    private fun pereopr_numb(but:String, number:TextView):String{
        return number.text.toString()+but
    }//ertyukmnbv
}


package com.example.myapplication
import android.widget.EditText

class but(var Arg1_:Int = 0, var Arg2_ :Int = 0){
    fun add ():String{
        val otv:Int = Arg1_+Arg2_
        return "$otv"
    }
    fun subtr ():String{
        var otv:Int = Arg1_-Arg2_
        return "$otv"
    }
    fun mul ():String{
        var otv:Int = Arg1_*Arg2_
        return "$otv"
    }
    fun divide ():String{
        if(Arg2_ == 0){
            return "Div by zero"
        }
        else{val otv:Int = Arg1_/Arg2_
            return "$otv"
        }
        //1243567
    }
}
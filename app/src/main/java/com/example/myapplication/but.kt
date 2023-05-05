package com.example.myapplication

class Calculate(private val UP:Int, private val DOWN:Int, private val Operation:String): MainActivity(){
    fun oped():String{
        var rect = ""
        when(Operation){
            "+"->rect =add()
            "-"->rect =subtree()
            "*"->rect =mul()
            "/"->rect =divide()
        }
        return rect
    }
    private fun add ():String{
        val result = UP+DOWN
        return result.toString()
    }
    private fun subtree():String{
        val result = UP-DOWN
        return result.toString()
    }
    private fun mul():String{
        val result = UP*DOWN
        return result.toString()
    }
    private fun divide():String{
        return if (DOWN==0){
            "Нельзя делить на 0"
        } else{
            val result = UP/DOWN
            result.toString()
        }
    }
}
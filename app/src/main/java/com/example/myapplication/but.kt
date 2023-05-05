import com.example.myapplication.MainActivity

class Calkulate(val UP:Int, val DOWN:Int,val Operation:String): MainActivity(){
    fun opred(){
        when(Operation){
            "+"->add()
            "-"->subtr()
            "*"->mul()
            "/"->divide()
        }
    }
    fun add ():String{
        val result = UP+DOWN
        return result.toString()
    }
    fun subtr():String{
        val result = UP-DOWN
        return result.toString()
    }
    fun mul():String{
        val result = UP*DOWN
        return result.toString()
    }
    fun divide():String{
        if (DOWN.toInt()<0){
            return "Нельзя делить на 0"
        }
        else{
            val result = UP/DOWN
            return result.toString()
        }
    }
}
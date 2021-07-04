package subtask2

import java.util.*
import kotlin.math.sqrt


class SquareDecomposer {
    fun squre(x:Int):Int{
        return x*x
    }
    fun decomposeNumber(number: Int):  Array<Int>? {
        var ad= ArrayDeque<Int>()
        var map= mutableMapOf<Int,Int>()
        var value = number-1
        var squareValue = squre(number)
        for(i in value downTo 1){
            var ss = squareValue-squre(value)
            map.put(squareValue,value)
            ad.push(ss)
            while(!ad.isEmpty()){
                var xx = ad.peek()
                var b=0
                if(map.containsKey(xx)){
                    b= map[xx]!!-1
                    if(b<3){
                        ad.pop()
                        map.remove(xx)
                        continue
                    }
                }   else b= sqrt(xx.toDouble()).toInt()

                if(map.containsValue(b)){
                    ad.pop()

                }else
                    if(xx-b*b==0) {
                        map.put(xx,b)
                        return map.values.toTypedArray().sortedArray()
                    }
                     else{
                        map.put(xx,b)
                        ad.push(xx-b*b)}
            }
        }
        return null
    }
}



fun main(){
 // println(isInteger(4))
    var sq = SquareDecomposer()
    println( sq.decomposeNumber(2))
    sq.decomposeNumber(-50)?.forEach { println(it) }

}

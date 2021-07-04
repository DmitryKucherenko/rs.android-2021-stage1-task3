package subtask3

class TelephoneFinder {

    private val numbers:Array<Array<Int>> =  arrayOf(
        arrayOf(8),//0
        arrayOf(2,4),//1
        arrayOf(1,5,3),//2
        arrayOf(2,6),//3
        arrayOf(1,5,7),//4
        arrayOf(2,4,8,6),//5
        arrayOf(3,5,9),//6
        arrayOf(4,8),//7
        arrayOf(7,5,9,0),//8
        arrayOf(6,8)//9
    )
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
     if(number.toInt()<0)return null
      var result = mutableListOf<String>()
        var ml =number.toMutableList()

        for(i in 0..ml.size-1){
            var ml =number.toMutableList()
           for(arrN in numbers[ml[i].toString().toInt()]){
               ml[i]=arrN.toString()[0]
               result.add(ml.joinToString(separator = ""))
           }
       }
        return result.toTypedArray()
    }
}

fun main(){
    val tf = TelephoneFinder()
    tf.findAllNumbersFromGivenNumber("8675309")?.forEach { println(it) }
}


package subtask1


class Combinator {

    private fun factorial(n: Int): Double = if (n < 2) 1.0 else n * factorial(n - 1)
    private fun binominal(n:Int, x:Int):Double=factorial(n)/(factorial(x)*factorial(n-x))

    fun checkChooseFromArray(array: Array<Int>): Int? {
        val m=array[0]
        val n=array[1]
        if(m<n||n<=0||m<0)return null
        for(x in 1.. n){
            if(m-binominal(n,x)==0.0)
           return x
        }
        return null
    }
}



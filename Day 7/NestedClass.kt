class Outer(n:Int){
    val num = n.also(::println)

    class Inner(num:Double=0.0){
        val n:Double = num.also (::println)
        fun display(){
            "The inner num is $n".also(::println)
        }
    }


    fun display(){
        val str:String = "The outer n is $num".also(::println)
    }
}

fun main(){
    Outer(10).display()

    Outer.Inner().display()
}
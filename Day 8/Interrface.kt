interface MyInterface{
    fun area(): Int           // Abstract By Default
}

class Cuboid(private val n:Int=4):MyInterface{

    override fun area():Int{
        return n*n*n;
    }
}

fun main(){
    Cuboid().area().also(::println)
}
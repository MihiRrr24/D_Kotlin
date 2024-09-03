// Default return type of functions in Kotlin -> unit

/* SYNTAX
fun name(parameters):Return type
{
    return
}
 */

// BASIC FUNCTION
fun Print():String{
    var name = "Mihir"
    return "My name is $name"
}

// SUM OF TWO NOS
fun add(a:Int=9, b:Int =4){
    println("Sum of $a and $b is ${a+b}");
}

// CELSIUS FAHRENHEIT PROGRAMS
fun cToF(a:Int){
    print("Celsius: $a")
    var c2f = (a * (9/5)+32 )
    println()
    print("Fahrenheit: $c2f")
}

fun fToC(a: Int){
    print("Fahrenheit: $a")
    var f2c = ( (a-32)*5/9 )
    println()
    print("Celsius: $f2c")
}

/*  COUNT OF DIGITS
fun main(){
    var n = 7350.0
//    var cnt = 0;
//    while(n!=0){
//        n/=10
//        cnt++
//    }

//    println(n.toString().length)

    var a = (log10(n)+1).toInt()
    println(a)
}
    */


fun main(){
//    var str = Print()
//    println(str)

    add()                 // Default parameters are given
    add(5, 7)       // if default parameters not given


    cToF(0)
    println()
    fToC(36)
}

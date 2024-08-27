import java.math.BigDecimal

fun main(args:Array<String>){

    var x = 105
    val y = x.toDouble()     //  can use any data type name in the method as we want
    println(y)

    /* There are two types of TypeCasting */

    /* 1.  Unsafe Cast - (as) This operator forcibly casts a value to a specified type.
                            If the cast is successful, it returns the casted value.
                            If the cast fails, it throws a ClassCastException.           */
    val xy:Any = 10F
    val yx: Double = xy as Double
    println(yx)                          // Throws ClassCastException



    /* 2.  Safe Cast - (as?) This operator attempts to cast a value to a specified type.
                             If the cast is successful, it returns the casted value.
                             If the cast fails, it returns null.                    */
       val c:String = "Hi"
       val d = c as? Int
       if(d != null)
             println("Successful")
       else
            println("No man")
       println(d)

}
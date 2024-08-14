//create a program with two variables a and b and display the sum of variables
fun main(args:Array<String>){
    var x = 4
    var y:Int = 24
    println("Sum of "+x+" and "+y+" is "+(x+y))      // This is string concatenation

    // another way to print (also called String Interpolation)
    println("Sum of $x and $y is ${x+y}");
    /* To get the value of single variable we use $ before that (variable name)
       In case of any expression value we use $ symbol before that expression (in curly braces)
     */


}
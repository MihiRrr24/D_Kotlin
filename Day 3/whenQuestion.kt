// Print whether the entered no is even or odd

fun main(){

    /*          1st way
    val a = 27%2
    val result = when(a){
        0 -> println("Even")
        else -> println("Odd")
    }                         */

    /*          2nd way
    val b = 30
    val result = when(b%2){
        0 -> println("Even")
        else -> println("Odd")
    }                 */

    // 3rd way
    val a = 9
    when{
        a%2==0 -> println("Even");
        a%2!=0 -> println("Odd");
    }

    /* We see here that when value of when not stored in a variable it's not necessary to write the else condition
     and also the arguments with when     */

}
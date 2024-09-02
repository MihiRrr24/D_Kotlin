fun main(){

    // Declaration of Array   - 3 methods

    // 1. arrayOf() -> creates a simple array
    var arr1 = arrayOf(1, 2, 3, 4, 5)
    var arr2:Array<Int> = arrayOf(6, 7, 8, 9, 10)      // Just a more defined way
    var arr3 = arrayOf<Int>(4, 5, 6, 8, 9)

    // 2. arrayOfNulls() -> creates an array of a given size filled with null elements
    val arrayOfNulls: Array<Int?> = arrayOfNulls(3)
    println(arrayOfNulls.joinToString())

    // 3. emptyArray() -> creates an empty array
    val empty = emptyArray<String>()


    // Array using lambda function of a number's squares
    val squares = Array(5) {i->(i*i)}








    // Nested Arrays Or Multi dimensional arrays

    val twoDArray = Array(2) {Array<Int> (2) {0} }
    val threeDArray = Array(3) { Array(4) { Array<String?> (5) {null} } }
    /*Nested arrays don't have to be the same type or the same size.*/

    var multi = arrayOf<Array<Int>>(arr1, arr2, arr3)     // will review this topic later


}
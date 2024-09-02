fun main(){
    // Printing array elements
    val arr1 = arrayOf<Int>(1, 2, 3, 4, 5)

//    Iterating:
//    forEach { element -> /* do something with element */ }: Iterates through each element in the array.
    arr1.forEach { print("$it ") }
    println()
//    forEachIndexed { index, element -> /* do something with index and element */ }:
//    Iterates through each element with its corresponding index.
    arr1.forEachIndexed { index, element -> println("Index: $index, Element: $element")}
    println()


//    Converting:
    var arr2:Array<String> = arrayOf("Delhi", "Punjab", "Ludhiana", "Varanasi")
//    joinToString(separator = ", "): Joins the elements into a string, separated by the specified separator.
    println(arr2.joinToString(" : "))


//    Printing:
//    contentToString(): Returns a string representation of the array content. i.e in bracket with commas
    var arr3 = CharArray (5) {i -> 'A'+i}
    println(arr3.contentToString())
}
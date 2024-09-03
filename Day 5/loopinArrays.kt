fun main(){
    var arr1 = charArrayOf('M', 'I', 'H', 'I', 'R')
    for(i:Char in arr1) print("$i ")
    println()

    // Creating a list
    var lst = listOf("A", "B", "C", "D", "E", 100)
    for(a in lst){
        print("$a ")
    }
    println()




    // Create and print array with specific print statement
    var arr = Array(5) {i->i+2}
    println(arr.contentToString())

    // 1. Using indexOf function
    for(i in arr) println("Element at ${arr.indexOf(i)} is $i")
    println()
    println()

    // 2. When not taking user input
    for(i in 0..2) println("ELement at $i is ${arr[i]}")
    println()
    println()

    // 3. Using arr.indices property to iterate the index
    for(i in arr.indices) println("ELEMent at $i is ${arr[i]}")
    println()
    println()

    // 4.  withIndex() is a function that
   //      allows us to iterate over the elements of a collection along with their corresponding indices
    for((index, value) in arr.withIndex()){
        println("ELEMENT AT $index is $value")
    }

}
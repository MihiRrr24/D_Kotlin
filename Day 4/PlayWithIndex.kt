fun main(){
    var arr1 = arrayOf(1, 2, 3, 4, 5)
    var arr2 = Array<Int> (5) { i->(i*i) }


    // Accessing and Modifying Elements
    var one = arr1[2]        // Accessing an element
    println(one)

    arr1[2] = 7            // Modifying an element
    println(arr1[2])
}
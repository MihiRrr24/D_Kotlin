fun main(){

    val arr = IntArray (5) {i -> i*i}

    // Size of array
    val length = arr.size
    println(length)

    // Array is empty or not
    if(arr.isEmpty()) println("Empty")
    else println("Not Empty")

    // Accessing first and last element
    var start = arr.first()
    var end = arr.last()
    println(start)
    println(end)

    // Get the index
    var index = arr.indexOf(4)
    println(index)

    // Get the element
    var element = arr.get(4)       // or just arr[4]
    println(element)


    // TO BE CONTINUED......
}
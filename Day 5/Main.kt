fun main() {
// Basic for loop

    // printing nos from 1 to 5
    for(a in 1..5){
        print("$a ")
    }
    println()

    // Upper limit exclusion
    for(i:Int in  1..<5)   // or use just until keyword in between 1 and 5
        print("$i ")
    println()
    println()

    // Decrementing    // we use until keyword
    for(i in 6 downTo 1){
        print("$i ")
    }
    println()
    /* Decrement by 2 */        // we use step keyword
    for (i in 6 downTo 0 step 2) {
        print("$i ")
    }
    println()

    // Filter              // this statement can also be stored in another variable and then printed
    println((1..5).filter{it%2==0})
}
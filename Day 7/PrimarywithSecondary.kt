//class Introduction1(var city: String) {
//    var name: String = "Niks"
//    var age: Int = 27
//
//    // Secondary constructor with name and age
//    constructor(name: String, age: Int) : this("Unknown") {
//        this.name = name
//        this.age = age
//    }



//    fun intro() {
//        println("My name is $name, I am $age years old, and I live in $city.")
//    }
//}
//
//fun main() {
//    val obj = Introduction1("Mihir", 22)
//    val obj2 = Introduction1("Piggy")
//    val obj3 = Introduction1("Mumbai")
//
//    obj.intro()
//    obj2.intro()
//    obj3.intro()
//}




class Introduction2(var city: String, var name: String = "Niks", var age: Int = 27) {

    // Secondary constructor with name and age
    constructor(name: String, age: Int) : this("Unknown", name, age)

    // Secondary constructor with only name
    constructor(name: String) : this("Unknown", name, 0)

    fun intro() {
        println("My name is $name, I am $age years old and I live in $city.")
    }
}

fun main() {
    val obj = Introduction2("Mumbai", "Mihir", 22)
    val obj2 = Introduction2("Piggy")

    obj.intro()
    obj2.intro()
}

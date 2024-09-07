// Primary Constructor

/*If the primary constructor does not have any annotations or
//visibility modifiers, the constructor keyword can be omitted:
            class Introduce constructor(name:String){
//The primary constructor initializes a class instance and
//its properties in the class header.
//The class header can't contain any runnable code.
//If you want to run some code during object creation, use initializer blocks inside the class body.
//Initializer blocks are declared with the init keyword followed by curly braces.*/
//Primary constructor parameters can be used in the initializer blocks

class Introduce(name:String){
    var first = "Name: $name".also(::println)
    init {
        println("Initializer block")
    }
    init {
        println("Second initializer block that prints ${name.length}")
    }
}


/*Kotlin has a concise syntax for declaring properties and initializing them
//from the primary constructor can also include default values of the class properties
class Person(val firstName: String, val lastName: String, var isEmployed: Boolean = true)  */


/*   If the constructor has annotations or visibility modifiers,
the constructor keyword is required and the modifiers go before it:
class Customer public @Inject constructor(name: String) { /*...*/ }     */


fun main(){
    Introduce("Mihir")
}
// All classes in Kotlin have a common superclass, #Any

open class Rectangle(var l:Double, var b:Double){
    open fun area():Double{
        return l*b;
    }

    open fun display(){
        println("The area is ${area()}")
    }
}




// By default, Kotlin classes are final – they can't be inherited.
// To make a class inheritable, mark it with the open keyword
class Square(private var s:Double):Rectangle(s, s){
    override fun area():Double{
        return s*s;
    }

//    The override modifier is required for over riding a function of base class(i.e. open)
    override fun display(){
        println("Now the area is ${area()}")
    }
}
//A member marked override is itself open, so it may be overridden in subclasses.
//If you want to prohibit re-overriding, use final




fun main(){
    Rectangle(4.0, 4.0).display()
    Square(8.0).area().also(::println)
}
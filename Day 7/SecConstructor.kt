// SECONDARY CONSTRUCTOR

// create a class called introduction inside the class create
// two variable one for name and age and not initialize
// declare a constructor with two parameters

class Introduction{
    var name:String = ""
    var age:Int = 0

    constructor(s1:String, a1:Int){
        this.name = s1
        this.age = a1;
    }

    // constructor with single parameter
    constructor(s2:String){
        this.name = s2;
        age = 0
    }

    // constructor with initialized vars
    constructor(){
        this.name = "Niks"
        age = 27
    }

    fun intro(){
        println("My name is $name and age is $age")
    }
}

fun main(){
    var obj = Introduction("Mihir", 22)
    var obj2 = Introduction("Piggy")
    var obj3 = Introduction()
    obj.intro()
    obj2.intro();
    obj3.intro()
}
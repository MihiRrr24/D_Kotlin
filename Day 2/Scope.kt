fun main(){
    //    create a simple function with one variable and print the variable then try to acess it outside the function
    xyz()              // This function shows the concept of the scope of a variable
}


// var a:Char = 'M'           /* either declare the variable outside the function (Global Variable) */
fun xyz(){
    var a:Char = 'M'              /* or inside the function and access the function in main (Local Variable) */
    println(a)
}
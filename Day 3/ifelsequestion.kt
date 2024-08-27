// Print 20% discount if amount is greater than or equal to 1000 and is a member,else 10% discount
// If no conditions met then no discount

fun main(){
    val amount = 1000
    val member:Boolean = true

    if(amount>=1000){

        if(member) println("20% discount")
        else println("10% discount");
    }

    else println("No discount")
}
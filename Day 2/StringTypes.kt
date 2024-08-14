/* Strings are of two types :-
a) Multi line strings       (Raw String)
b) Single line strings      (Escape String)   */

// Print Lpu In three different lines with tabs

/* 1st way (Escape String)  */
fun main(args:Array<String>){
    var str = "Lovely \n\t Professional \n\t\t University"
    println(str);


    /* another way (Raw String) */
    var st = """Lovely 
     Professional
         University
    """
    print(st)
}
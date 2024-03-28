
fun main() {
    // Returning a value from a function
    val Age=  CatAge(age = 7) + 1
    println("This cat is $Age years old")
    println(checkAge(Age))
     
 }
 
 fun CatAge(age: Int): Int{ // declaring the value we want in return
 //     val catAge = age*7
 //     print("This cat is $catAge years old")
        return age * 7
 }
 // same function as above but less syntax
 // fun CatAge(age : Int): Int = age * 7
 
 // returning a bool
 fun checkAge(Age: Int): Boolean{
     return Age > 14
 }
 
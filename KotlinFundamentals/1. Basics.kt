
fun main() {
/**
 * var -> Mutable (can change)
 * val -> Immutable
 * best practice -> val is prefferd in general use
 */
//    var name = "World"
    var name = "Ayush"
    val myName = "Goyal"
    val name2: String = "explicit declaration"
    val anotherDec: String
    anotherDec = "Another way to declare val"
    val age:Int
    age = 20
    println("Hello, my name is $name $myName, I am $age years old!!!")
print("$name2 $anotherDec ")
/**
 * DataTypes in kotlin ->
 * byte = 8 bits
 * short = 16 bits
 * int = 32 bits (Default)
 * long = 64 bits
 * float = 32 bits
 * double = 64 bits (more presise than float)(default)
 */
    val number = 1      // int
    val oneLong = 1L    // long
    val pi = 3.14       // double
    val piFloat = 3.14F // float
print("$number $oneLong $pi $piFloat")
/**
 * Operators
 * (+,-,*,/,%) 
 */
    val a = 23
    val b = 12
    print(a/b)
    
    val c = 23.0
    val d = 12
    print(c/d)
}
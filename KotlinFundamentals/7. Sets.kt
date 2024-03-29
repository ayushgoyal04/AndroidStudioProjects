fun main() {
    // List
    val myListOfNames = listOf("Ayush", "Rajiv", "Dipika", "Rachit")
    val myMutableList = mutableListOf(4, 23, 17, 1, 4) // Repeating elements is allowed in lists
    print(myMutableList)
    println(myListOfNames)
    
    
    // Set
    val mySet = setOf("US", "Ind", "Au", "Eng") // immutable
    println(mySet)
    
    val myMutableSet  = mutableSetOf(1,2,3,4,5) // mutable
    myMutableSet.add(6)
    myMutableSet.add(4) // You cannot repeat values in set [Set of unique values]
    println(myMutableSet)
    
    
    
    
}
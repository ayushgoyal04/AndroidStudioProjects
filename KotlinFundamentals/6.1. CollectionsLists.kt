/* 
 * A collection usually contains a number of objecs / items in a certain order of the same type (Arrays)
 * (Lists, ArrayList, listOf())
 * 
 * */

 fun main(){
    
    val myListOfNames = listOf("Ayush", "Rajiv", "Goyal")
    println(myListOfNames) 
    /*
     *  ListOf -> 
     *  Saved as an array
     *  immutable
     * */
    
    // lambda
    myListOfNames.forEach {
        println(it)        
    }
    
    for (item in myListOfNames) {
        println("names : " +item)
    }
    
    /* MutableListOf ->
     * mutable 
     * */
     val myMutableList = mutableListOf(12, 34, 45, 123)
     
    myMutableList.add(25)
     // println(myMutableList)
     
    myMutableList.remove(123) // remove element
     
    myMutableList.removeAt(0) // remove index
    // println(myMutableList)
     
     // println("Number of elements ${myMutableList.size}")
     
    // get element at an index
    println("Second Element ${myMutableList.get(1)}")
     
     
     // get index of an element
     println("Index of element \"two\" ${myMutableList.indexOf(45)}")
     
     
     
     
        // Initializing lists explicitly
    val myNewList = mutableListOf<String> ()
    myNewList.add("Hey")
    myNewList.add("There")
    
    for (i in 1..10) {
        myNewList.add(i, "Hey $i")
    }
    println(myNewList)
    
    val myNewImmutableList = listOf<Int>(1, 4, 17, 23)
    println(myNewImmutableList)


    
    
        // initializing empty collections, 
    // can also do the same for mutable,
    // Must specify the dataType
    val emptyList = emptyList<String> ()
    
    val emptySet = emptySet<Int> ()
    
    val emptyMap = emptyMap<String, Int> ()
    println("$emptySet, $emptyList, $emptyMap")
     
     
}
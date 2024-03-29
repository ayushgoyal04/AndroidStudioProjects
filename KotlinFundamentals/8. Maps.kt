fun main (){
    // Map ->  contaibs pairs
    val secretMap = mapOf("Up" to 1, "Down" to 2, "Left" to 3, "Right" to 4) // immutable
    
    val myMutableSecretMap = mutableMapOf("One" to 1, "Two" to 2, "Three" to 3)
    myMutableSecretMap.put("Four", 4) // myMutableSecretMap["Four"] = 4 (Same Syntax)
    println(myMutableSecretMap)
    
    println(secretMap)
    println(secretMap.keys)
    println(secretMap.values)
    if("Up" in secretMap) println("Yes, it is in the map!")
    if(4 in secretMap.values) println("Yes") // need to mention the value
}
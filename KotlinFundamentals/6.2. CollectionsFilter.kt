fun main (){
    //collections filters
    val myListOfNames = listOf("Ayush", "Rajiv", "Goyal", "aLongString", "aSS", "AAA")
 	
    val found = myListOfNames.filter {it == "Goyal"}
    println(found)
    
    val found2 = myListOfNames.filter {it == "Goel"}
    println(found2) // creates empty string
    
    val found3 = myListOfNames.filter {it.length > 4}
    println(found3)
    
	val found4 = myListOfNames.filter {it.endsWith("sh")}
    println(found4)
    
    val found5 = myListOfNames.filter {it.startsWith("a")} // case sensitive, will not work for uppercase "A"
    println(found5)

	val found6 = myListOfNames.filter {it.startsWith("a", ignoreCase = true) && it.endsWith('H', ignoreCase = true)} 
    println(found6)
}
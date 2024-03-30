/*
 * Why we need Generics?
 * Problem with the code beelow -> 
 * we can only use 1 datatype in the list.
 * If we want to find numbers from a list of numbers, we wwill have to write the class finder all over again, for Int datatype.
 * This increases our work, the code length and redundancy in the code.
 * To solve this problem, we use Generics (In order to generalise our code for all datatypes, including custom datatypes.)
 * 
 * */

 fun main() {
    
    val listOfItems = listOf("Ayush", "Rajiv", "Rachit", "Goyal")
    val finder = Finder(list = listOfItems)
    finder.findItem(element = "Goyal") {
        println("Found $it in the list.")
    }
    
}


class Finder(private val list: List<String>) {
    fun findItem(element: String, foundItem: (element: String?) -> Unit) {
        val itemFoundList = list.filter {
            it == element
        }
        if (itemFoundList.isNullOrEmpty()) foundItem(null) else
        	foundItem(itemFoundList.first())
    }
}
// fun main() {
    
//     val listOfItems = listOf("Ayush", "Rajiv", "Rachit", "Goyal")
//     val listofNumbers = listOf(1, 4, 17, 23)
//     val finder = Finder(list = listofNumbers)
//     // finder.find(element = "Ayush"){ 
//     finder.findItem(element = 23) {
//         println("Found $it in the list.")
//     }
    
// }


// class Finder<T>(private val list: List<T>) {
//     fun findItem(element: T, foundItem: (element: T?) -> Unit) {
//         val itemFoundList = list.filter {
//             it == element
//         }
//         if (itemFoundList.isNullOrEmpty()) foundItem(null) else
//         	foundItem(itemFoundList.first())
//     }
// }
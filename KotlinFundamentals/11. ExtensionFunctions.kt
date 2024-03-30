fun main() {
    println("Hello Ayush, ".append("Sir"))
	
    print("this is fun".removeFirstAndLastChars())
}

// extending the library String->
// fun String.append(toAppend: String): String {
//     return this.plus(toAppend)
// }

fun String.append(toAppend: String): String = this.plus(toAppend)

// Removing 1st and last characters from a string
fun String.removeFirstAndLastChars(): String = this.substring(1, this.length - 1)

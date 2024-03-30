//Data class-> holds data
fun main() {
    val person1 = Person(name= "Ayush",
                       lastName = "Goyal",
                       age = 20)
    val person2 = Person(name= "Ishaan",
                        lastName = "Goyal",
                        age = 16)
    val listOfPeople = listOf(person1, Person(name = "Rachit",
                                             lastName = "Goyal",
                                             age = 16), person2)
    // println(listOfPeople)
    listOfPeople.forEach {
        item -> println(item.age)
    }
    
}

data class Person(val name: String, val lastName: String, val age: Int)
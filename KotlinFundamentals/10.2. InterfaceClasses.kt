/*
 * Interfaces-> contains some functions/ properties that can be implemented by any class regarding inheritance
 * */


// Define the interface first
interface ClickEvent {
    fun onClick(message: String) 
}

// Define the Button class
class Button(val label: String): ClickEvent { // We HAVE to implement all the functions in the ClickEvvent interface
    override fun onClick(message: String) {
        println("Clicked by $label and here is a message-> $message")
    }
}

class Character(val name: String): ClickEvent {
    override fun onClick(message: String) {
        println("Clicked by $name and here is a message-> $message")
    }
} 

fun main() {
    // Now you can create an instance of Button
    val button = Button(label = "Player 1")
    button.onClick(message = "\"Are you ready for the mission?!\"")
    
    val Mario = Character(name = "Mario")
    Mario.onClick(message = "Mariooooooo")
}

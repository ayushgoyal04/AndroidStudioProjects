fun main() {
    val car1 = Car(color = "Yellow", model = "GT") 
    val car2 = Car(color = "White", model = "Toyota") 
    
    car2.color = "Red"
    car2.model = "Lambo"
    
    println("Car color-> ${car1.color}...Car model-> ${car1.model}") 
    println("Car color-> ${car2.color}...Car model-> ${car2.model}") 
    
    
    
}



class Car(var color: String,
          var model: String) {
    
    init {  // initialize some values
//         color = "Grey"
//         model = "X"
        if (color == "Yellow") println("Dream car")
        else println("$color is not yellow")
    }
    
    fun drive() {
        println("The car is moving")
    }
    
}

 
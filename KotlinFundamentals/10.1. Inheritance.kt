// /* 
//  * Note-> Every class in kotlin has a super-class called "ANY"
//  * Note-> You first need to "open" a class or a function before inheriting it.
//  * 
//  * */

//  fun main() {
   
//     // Truck
//     val truck = Truck(color = "Magenta", model = "F-150")
//     truck.drive()
//     truck.speed(minSpeed = 100, maxSpeed = 200)
// }

// // Truck class is inheriting  from Car class
// class Truck(color: String, model: String) : Car(color, model) {
//     override fun speed(minSpeed:Int, maxSpeed: Int) {
//         val avgSpeed = (minSpeed + maxSpeed)/2
        
//         super.speed(minSpeed, maxSpeed) // calling speed function of the parent class's function
        
//         println("The avg speed is: $avgSpeed")
//     }
    
//     override fun drive() {
        
//         super.drive() // calls the parent class
        
//         println("The truck is moving")
//     }
// } 


// // Parent class
// open class Car(var color: String,
//           var model: String) {
    
    
//    open fun speed(minSpeed: Int, maxSpeed: Int) {
//         println("min speed-> $minSpeed ... max Speed -> $maxSpeed")
//     }
//    open fun drive() {
//         println("The car is moving")
//     }
    
// }

 
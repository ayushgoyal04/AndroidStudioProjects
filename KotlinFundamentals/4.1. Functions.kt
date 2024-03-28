fun sayHello(){
    println("Hello")
//    print("This is a function")
}

fun main() {
    sayHello()
//    calculator(22, 25, message = "is a multple of",5)
calculator(message = "is multiple of",multiple = 11)
}

fun calculator(first: Int = 11,  // this is a default value for the var first (In case we do not give the parameter).
               second: Int = 500, // We need to add named parametersfor these tho.
               message: String,
               multiple: Int){
    println(first + second)
    for(i in first..second) {
        if(i % multiple == 0){
            println("$i $message $multiple")
        }
    }  
}
/** 
 * Lambda(function/ expression) = A function without a name -> Shorter in length with less syntax
 * format->{  Variable: Type = Parameters -> Body  }  
 **/

 fun main() {
    // println(sum(12,12))
    // println(add(12,10))
    
    enhancedMessage(message = "Hello there,"){
        add(12,12)
    }    
}

// example 1
val add: (Int, Int ) -> Int = { a, b -> a + b }

fun sum(a: Int, b: Int): Int{
    return a+b
}

// example 2
// fun CatAge(age: Int): Int = age*7

// val cAge: (Int) -> Int = {Age -> Age*7}


// "it" parameter in lambda- Default val
val cAge: (Int) -> Int = { it * 7}


// lambda expression that return void
fun ShowNAme(name: String){
    print(name)
}
// unit in kotlin means nothing / void
val name: (String) -> Unit = { print("Hello, I am $it")}



/** 
 *  Trailing Lambda
 * passing functions as a parameters
 * The function must be the last parameter being passed 
 **/
 
 fun enhancedMessage(message: String, funAsParameter: () -> Int){
     println("$message ${funAsParameter()}")
    
    
}
 
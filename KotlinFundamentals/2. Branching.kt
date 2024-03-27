fun main() {
    val amount = 0
//     if(amount == 1000){
//         print("Rich")
//     }
//     else if(amount >= 1000){
//         println("v.v rich")
//     }
//     else{
//         println("not rich")
//     }
    
    // used to incude multiple test cases
    when (amount) {
        // can also include range and not in range
        in 1..100 -> print("Amount between 1 and 100")
        !in 10..90 -> println("amount is outside range")
        125 -> println("getting there")
        999 -> println("close")
        1000 -> println("Rich")
        1100 -> println("win")
        else -> {
            println("$amount condition is not included")
        }
    }
    
}
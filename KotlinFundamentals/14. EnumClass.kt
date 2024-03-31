// /*
//  * enum-> short for enumerate
//  * enumerate-> to list things one by one
//  * */

//  fun main() {
//     //     val input = Result.ERROR
//     //     getResult(result = input)
        
//         Repository.startFetch()
//         getResult(result = Repository.getCurrentState())
//         Repository.finishedFetch()
//         getResult(result = Repository.getCurrentState())
//         Repository.error()
//         getResult(result = Repository.getCurrentState())
        
//     }
    
    
//     fun getResult(result: Result) {
//         return when(result) {
            
//             Result.SUCCESS -> println("Success!")
//             Result.FAILURE -> println("Failure!")
//             Result.ERROR -> println("Error!")
//             Result.IDLE -> println("Idle!")
//             Result.LOADING -> println("Loading!")
//         }
//     }
    
//     /*
//      * object-> avoids the class to create too many instances of itself
//      * too many instances of a class may reduce the perfomance overtime, in the long run
//      * */
//     object Repository {
//         private var loadState: Result = Result.IDLE
//         private var dataFetched: String? = null
//         fun startFetch() {
//             loadState = Result.LOADING
//             dataFetched = "data"
//         }
        
//         fun finishedFetch() {
//             loadState = Result.SUCCESS
//             dataFetched = null
//         }
        
//         fun error() {
//             loadState = Result.ERROR
//         }
        
//         fun getCurrentState(): Result {
//             return loadState
//         }
        
//     }
    
//     enum class Result {
//         // BEST PRACTICE IS TO KEEP EVERYTHING UPPER CASE
//         SUCCESS,
//         FAILURE,
//         ERROR,
//         IDLE,
//         LOADING
//     }
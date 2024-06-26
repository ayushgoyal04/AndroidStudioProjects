import java.io.IOException
// Sealed Classes

fun main() {
    
    Repository.startFetch()
    getResult(result = Repository.getCurrentState())
    Repository.finishedFetch()
    getResult(result = Repository.getCurrentState())
    Repository.error()
    getResult(result = Repository.getCurrentState())
    Repository.anotherCustomFailure()
    getResult(result = Repository.getCurrentState())
    Repository.customFailure()
    getResult(result = Repository.getCurrentState())
}

fun getResult(result: Result) {
    return when (result) {
        is Error -> {
            println(result.exception.toString())
        }
        is Success -> {
            println(result.dataFetched ?: "Ensure you start again")
        }
        is Loading -> {
            println("Loading...")
        }
        is NotLoading -> {
            println("Idle.")
        }
        is Failure.AnotherCustomFailure -> {
            println(result.anotherCustomFailure.toString())
        }
        is Failure.CustomFailure -> {
            println(result.customFailure.toString())
        }
    }
}

object Repository {
    private var loadState: Result = NotLoading
    private var dataFetched: String? = null
     
    fun startFetch() {
        loadState = Loading
        dataFetched = "data"
    }
    
    fun finishedFetch() {
        loadState = Success(dataFetched)
        dataFetched = null
    }
    
    fun error() {
        loadState = Error(exception = Exception("Exception"))
    }
    
    fun getCurrentState(): Result {
        return loadState
    }
    
    fun anotherCustomFailure() {
        loadState = Failure.AnotherCustomFailure(anotherCustomFailure = NullPointerException("Something happened"))
    }
    
    fun customFailure() {
        loadState = Failure.CustomFailure(customFailure = IOException("Custom failure"))
    }
}

sealed class Result

data class Success(val dataFetched: String?) : Result()
data class Error(val exception: Exception) : Result()

object NotLoading : Result()
object Loading : Result()

sealed class Failure : Result() {
    data class AnotherCustomFailure(val anotherCustomFailure: NullPointerException) : Failure()
    data class CustomFailure(val customFailure: IOException) : Failure()
}

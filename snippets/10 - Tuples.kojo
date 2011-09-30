// 1    Define some supporting classes
class Status(val code: String)
class Result(val payload: String)

val OK = new Status("OK")
val FAIL = new Status("FAIL")

// 2    Define a function which returns a Tuple
def processRequest() = {
    val result = new Result("Scala is easy")
    var status = OK

    val errorCond = (System.currentTimeMillis % 2) == 0
    if (errorCond)
    	status = FAIL
    
    (status, result)
}

// 3    Unpack the Tuple the hard way
val statusAndResult = processRequest()

val status = statusAndResult._1
val result = statusAndResult._2

println("Status: " + status.code + " Result: " + result.payload)

//...

// 4    Unpack the easy way
//...
val (status, result) = processRequest()
println("(" + status.code + ", " + result.payload + ")")

//  The actual type of a Tuple
//...

val statusAndResult: Tuple2[Status, Result] = processRequest()
val (status, result) = statusAndResult
println("(" + status.code + ", " + result.payload + ")")
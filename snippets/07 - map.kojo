/* 1    Define a class and create a list of instances       */
case class Employee(val name: String, val salary: Double)

val empList = List(
    Employee("Craig", 1000000), 
    Employee("Amir", 50001),
    Employee("John", 40000)
)

/* 2    Gather all salaries note: the {}s                   */

val salaries = empList map { 
    (x) => x.salary  
}
println(salaries)
//OR

val salaries = empList map { _.salary }

//why wouldn't this work?
val employees = empList.map(_)

/* 2.1  Gather all the salaries greater than 50,000 (-Xprint:typer)      */

val salaries = empList filter(_.salary > 50000) map (_.salary)


/* 3    A more practical example using by-name parameters                */
class Connection(val dbName: String)

def transaction(code: => Boolean) = {
    println("Starting up a Tranasction")
    //connect to DB, grab a connection, start transaction
    val conn = new Connection("ORA_CORP_SID")
    println("Running code")
    //execute the code
    val ok = code
    Thread.sleep(2000)
    println("Code executed with a return value of " + ok)
    //check if things went ok, if so commit
    if (ok) 
        println("Committing Transaction")
    else
        println("Rolling back Transaction")
    
}

transaction {
    //execute("INSERT INTO ...")
    true
}

//Show Spring Transaction Template to contrast

/* even more practical, most likely your code will need access to a connection

transaction {
    (conn) => {
        //conn.execute("INSERT INTO ...")
        println("***** Executing against " + conn.dbName + " ******")
        true
    }
}

*/




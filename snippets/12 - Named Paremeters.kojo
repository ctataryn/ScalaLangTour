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


/*
transactionTemplate.execute(new TransactionCallbackWithoutResult() {

    protected void doInTransactionWithoutResult(TransactionStatus status) {
        try {
            updateOperation1();
            updateOperation2();
        } catch (SomeBusinessExeption ex) {
            status.setRollbackOnly();
        }
    }
});
*/

/* even more practical, most likely your code will need access to a connection

transaction {
    (conn) => {
        //conn.execute("INSERT INTO ...")
        println("***** Executing against " + conn.dbName + " ******")
        true
    }
}

*/


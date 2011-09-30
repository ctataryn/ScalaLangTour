// 1    define some supporting classes
class Employee(val id: Int, val salary: Double)
class Bracket(id: Int)
val taxBracketMap = Map(25000.0 -> new Bracket(1) /*,...*/)

// 2    define a lengthy operation
def reallySlowTaxCalc(emp: Employee, bracket: Bracket) = {
    println("\tin reallySlowTaxCalculator")
    println("\t\tabout to calculate for two seconds")
    Thread.sleep(2000) //pretend we calculated something...
    -1.0 //return a dummy value for now
}

// 3    define function which defines a closure over reallySlowCalc using
//      emp and bracket
def deferTaxCalc(emp: Employee): () => Double = {
        println("\tin deferTaxCalculate")
	val bracket = taxBracketMap(emp.salary)
	() => reallySlowTaxCalc(emp, bracket)
}

println("- assigning the closure to calcTax")
// 4    Assign the closure to calcTax
val calcTax = deferTaxCalc(new Employee(1234, 25000))
println("- done, we shouldn't have seen a message from reallySlowTaxCalc")
//time passes...
println("- executing calcTax, here's where we should see reallySlowTaxCalc run")
// 5    Were now ready to actually run the slow operation via the closure
println("- Employee's taxes are: " + calcTax())
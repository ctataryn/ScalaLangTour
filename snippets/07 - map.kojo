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






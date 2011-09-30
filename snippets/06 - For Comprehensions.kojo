/* 1    Define a class and create a list of instances       */
case class Employee(val name: String, val salary: Double)

val empList = List(
    Employee("Craig", 1000000), 
    Employee("Amir", 50001),
    Employee("John", 40000)
)

/* 2    Find all employees with a salary over 50,000        */

val layoffs = for (emp <- empList
    if (emp.salary > 50000)) yield emp

/* 3    Can them, using an alternative way to loop          */  
println("People to layoff: ")
layoffs foreach (println)   //a lot going on here, and no types

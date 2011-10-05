/* 1     delcare a Class                                        */
class Person(name: String)

/* 2.1   declare a variable, instantiating the class using new  */
//in Java:
Person p = new Person("Pip");

//In Scala:
val p = new Person("Provis")

/* 2.2   val vs var                                             */
p = new Person("Pip")

/* 3.1   read the name property                                 */
println("Name: " + p.name)


/* 3.2   write the name property                                */
p.name = "Estella"


/* 3.3   override the accessors (show slide)                    */

class Person(private var name0: String) {
    
    def name = name0
    
    def name_=(nm: String) = {
        name0 = nm
        println("The setter was called")
    }
}

val p = new Person("Homer")
p.name = "Provis"

/* 4.1   extend a class                                         */
class Human
class Person(name: String) extends Human

/* 4.2   being specific with types                              */
//Java:
Human p = new Person("Pip")
//Scala:
val p:Human = new Person("Pip")

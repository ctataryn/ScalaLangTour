
/* 1.1  Define a Class                  */
class Person(var name:String, var age: Int) {
  
  def vitalStats = "name: " + name + ", age:" + age
  
}

/* 1.2   Define a "Companion Object"    */
object Person {
  
  def vitalStats(p: Person) = "name: " + p.name + ", age:" + p.age
  
}

/* 2.1  class call                      */
val p = new Person("Pip", 22)
p.vitalStats

/* 2.2  object call                     */
Person.vitalStats(p)

/* 3.1  apply                           */
object Person {
    def apply(name: String, age: Int) = {
        println("apply method called")
        new Person(name, age)
    }
    def vitalStats(p: Person) = "name: " + p.name + ", age:" + p.age
}

val p = Person("Pip", 22)

/* 3.2  case class                      */
case class Person(name: String, age: Int)



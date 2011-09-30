/* 1.1  Define a class                                  */
class Person(fname: String, mname:String, lname: String) {
    def talk = "Hello"
}

/* 1.2  Define a Trait                                  */
trait Wolf {
    def howl = "Ooooooowwwwwooooooo!"
}

/* 2.1  Mixin a Trait                                   */
val wereWolf = new Person("Michael", "J", "Fox")
wereWolf.talk
wereWolf.howl

/* 2.2  Extend a Trait                                  */
class Person(fname: String, mname:String, lname: String) {
    def talk = "Hello"
}

val wereWolf = new Person("Michael", "J", "Fox")
wereWolf.talk
wereWolf.howl

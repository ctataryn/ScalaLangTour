// 1.1  Define some teams
val teams = List(
        "Toronto Raptors",
        "Los Angeles Kings",
        "Minneapolis Twins",
        "Winnipeg Blue Bombers",
        "Winnipeg Jets",
        "San Francisco 49ers",
        "Edmonton Eskimos")

val mixedBag = List(1, "two", 3.0, "four")


// 2 Match on Sequences
def checkList(list: List[Any]) = {
    list match {
        case List("Toronto Raptors", _, "Minneapolis Twins", _*) => println("Toronto 1st, Minneapolis 3rd")
        case List(_: Int, _: String, _: Double, _*) => println("An Int a String and a Double walk into a bar")
        case List(_, _, _, _) => println("Four Elements Only")
        case x :: xs => println("First element was: " + x)
        case _ => println("Unrecognized")
    }
}
println("-------\nTeams\n-------")
checkList(teams)
println("-------\nThree Ints\n-------")
checkList(List("1", "2", "3"))
println("-------\nMixed Bag\n-------")
checkList(mixedBag)

// 3    The real type match expects
val partFunc: PartialFunction[List[Any], Unit] = {
    case List("Toronto Raptors", _, "Minneapolis Twins", _*) => println("Toronto 1st, Minneapolis 3rd")
        case List(_: Int, _: String, _: Double, _*) => println("An Int a String and a Double walk into a bar")
        case List(_, _, _, _) => println("Four Elements Only")
        case x :: xs => println("First element was: " + x)
        case _ => println("Unrecognized")
}

println("-------\nTeams\n-------")
partFunc(teams)
println("-------\nMixed Bag\n-------")
partFunc(mixedBag)


//remember a case statement exits as soon as a case gets a match
//also remember there is no voodoo only basic building blocks (Partial functions, tuples, etc...)
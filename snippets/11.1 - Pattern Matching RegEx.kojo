// 1.1  Define some teams
val teams = List(
        "Toronto Raptors",
        "Los Angeles Kings",
        "Minneapolis Twins",
        "Winnipeg Blue Bombers",
        "Winnipeg Jets",
        "San Francisco 49ers",
        "Edmonton Eskimos")
    
// 1.2 Match on RegExp
def cheerTeam(teams: List[String]) = {
    val matchWpg = "^Winnipeg(.*$)".r
    for (team <- teams) {
        team match {
            case matchWpg(teamName) => println("Go " + teamName.trim + "!")
            case someOtherTeam => println("boo! " + someOtherTeam)
        }
    }
}

cheerTeam(teams)

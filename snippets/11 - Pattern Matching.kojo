// 1    Match on Strings
def welcome(searchType: String) = {
    println("Welcome to TSA, how would you like to be violated?")
    searchType match {
        case "Scanner" => println("are you alergic to XRays?")
        case "Pat Down" => println("is it ok if I don't use my hands?")
        case _ => println("Sid, get the 'extractor' and lube, we have a trouble maker")
    }
}

welcome("Scanner")
welcome("Pat Down")
welcome("No, I'm good")
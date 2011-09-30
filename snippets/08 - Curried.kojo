// 1    non-curried function
class Place(val name: String, val lat:Double, val lng: Double)
def geoLocate(lat: Double, long: Double): Place = {
    //find the place
    //...
    new Place("Winnipeg, Manitoba", lat, long)
}

// 2    Make it curried, _ replaces the entire parameter list

// 3    To Curry: Transform an N-arg function into N 1-arg functions
//      Great demonstration of closures and composition
def locate(lat: Double) = (long: Double) => {
    new Place("Winnipeg, Manitoba", lat, long)
}

println(locate(123)(456))
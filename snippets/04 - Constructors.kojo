/* 1.1  Create a "primary" constructor                              */
class Product(price: Double, qty: Int) {
	val totalPrice = price * qty
	
	def getTaxOnPrice(rate: Double) = {
		totalPrice * rate
        }
        
/* 1.2  Create an "auxilary" constructor, why won't this compile?   */
	def this(name: String) = {
		this.name = name
	}    
}

/* 1.3  Chaining to super classes                                   */
class Person(var name: String)
class Customer(var name:String) extends ...

//Note: there is no "super" in Scala, its all done through "extends""
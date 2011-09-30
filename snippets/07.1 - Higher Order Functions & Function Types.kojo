// 1    Define a class with methods that expects H-O function parameters
class Component (val name: String) {
    var listeners = List[Component=>Boolean]()
    
    def onClick(clickCode: (Component) => Boolean) = {
        this.listeners = clickCode :: this.listeners
    }
    
    def runListeners = {
        for (l <- this.listeners) yield l(this)
    }
}

// 2    Create a method compatible with onClick's param type
def doSomething(c: Component): Boolean = {
    println("I'm a function executing on component: " + c.name)
    true
}

// 3    Pass doSomething in to onClick

// 4    A more "natural" way: pass a code block in, remember c => { }
//      This is called a by-name parameter
// println("I'm an anonymous function executing on component: " + c.name)

// run the listeners
comp.runListeners

// 5    What's the actual type of Component => Boolean? Remember apply(...)?


object function_cheatsheet{
    def main(args: Array[String]): Unit = {
        // Declaration, functions can be overloaded
        def sq(x: Int) : Int = { return x*x }
        // Simpler syntax
        def sq(x: Double) = x*x
        //Arguments are considered val
        sq(3)
        //possible crazy function name
        def !(c: Int) = c
        def fun_!(c: Int) = c
        //no arguments functions
        def no1 = println("1"); //no1() gives error
        def no2() = println("2");
        //function can be assigned to val and var
        var f = !;
        val f2 = no2_ //to assign function w/o parameters
        //multiple arguments
        def func(i: Int, j: Int) : Int = i+j
        func(1, 2)
        def func(i: Int)(j: Int) = i+j
        func(2)(3)
        func(2)
        //possible to define default arguments
        def ff(i: Int = 0, y : Int) = i //all arguments required because y has no default
        ff(i=2, 2);
        //possible to define parameter dependent on other parameters
        def sod(x: Int)(y: Int = x + 1) = x+y //??
        //named parameter
        def f(y: => Int) = y
        //repeated arguments
        def printall(args: Int*) = for ( a <- args ) println(a) //no array accepted
        //anonymous functions (arrow)
        val k = () => {println("k")}
        //functions can be defined trough def or val ---> 
        // def creates inner functions every call
        // val creates inner functions when defined

        //Void functions are defined as :Unit --> side effects only
        
        //functions can avoid naming arguments when they do not need to be referred
        0 to 10 foreach( println(_))

        //possible to define nested functions
        def fff(g: => Double) = {
            def fa = println("2");
            fa
        }
        //its possible to define partial functions in order to create derived functions with less arguments
        def delim(x:String, len: Int) = { println(x*len) }
        def line(len:Int) = delim("-", len )
        def xline = delim("-", _ : Int) 
        def main(args: Array[String]) = {
            delim("-", 60)
            line(50)
            xline(40) 
        }

        //Functions with multiple arguments can be transfromed in multiple single arguments functions
        //function currying
        def add(x: Int) : Int => Int = { //Function that returns a function from Int to Int
            return (y: Int) => x+y 
        }
        //functions can be curried and uncurried using Function.curried &uncurried
        //same if you want to use tuples instead of single aruments (tupled / untupled)
        
        //higher order functions
        //functions that accept other functions as arguments

        def printfmt(tr: String => String, str: String* ) = {
            for ( a <- str) println(tr(a))
        }
        printfmt("--"+_+"--", "Hello", "there", "people" ); 

        //functions can return other functions too
        //A closure is a functions plus its surrounding scope
        def evalcount() = {
            var counter = 0
            return (x: String) => {counter+=1; " " + x + " " + counter}
        }
        @scala.annotaMon.tailrec //to force tail recursion
        //List.head
        //List.tail
        //List.isEmpty
    }
}


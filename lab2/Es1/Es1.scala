object Es1{
    def pi(x: Double) : Double = x*Math.PI
    def pi = Math.PI;
    def main(args: Array[String]): Unit = {
        def printarg(arg: => String = "-") = println(arg);
        def repN(n : Int, f: Int => Int, arg: Int) : Int = {if (n == 0) arg else repN(n-1, f, f(arg))}
        def appneg(f: (Int, Int) => Int, n: Int) : Int => Int = (x: Int) => f(n, -x);
    }
}
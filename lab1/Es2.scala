import scala.util.Random
object Es2{
    def main(args: Array[String]) = {
        val generator = new Random();
        val center = (0.0, 0.0)
        val n = 1000
        def point():(Double, Double) = (generator.nextDouble(), generator.nextDouble())
        def distance(point1:(Double, Double), point2:(Double, Double)): Double =  Math.sqrt(Math.pow(point1._1 - point2._1, 2) + Math.pow(point1._2 - point2._2, 2))
        val points = for{x <- 0 to n} yield point()
        val insideN: Double = points.filter(distance(_, center) < 1).length
        val PI = 4.0*(insideN / n)
        println(PI)
    }
}
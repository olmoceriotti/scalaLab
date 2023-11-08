import java.util.Random
object Es2{
    def main(args: Array[String]): Unit = {
        def pi(nPoints: Double) : Double = {
            val generator = new Random();
            val center = (0.0, 0.0)
            @scala.annotation.tailrec
            def piImpl(iter :Int, points: Int) : Double = {
                if(iter == 0){
                    return points
                }
                val point:(Double, Double) = (generator.nextDouble() *2 -1, generator.nextDouble() * 2 -1)
                def distance(point1:(Double, Double), point2:(Double, Double)): Double =  Math.sqrt(Math.pow(point1._1 - point2._1, 2) + Math.pow(point1._2 - point2._2, 2))
                return piImpl(iter -1, if(distance(point, center) < 1) points + 1 else points)
            }
            return 4.0 * (piImpl(nPoints.toInt, 0) / nPoints)
        }
        println(pi(1000))

        val lf = List((x :Int) => {x.toDouble}, (x :Int) => {x.toDouble}, (x :Int) => {x.toDouble}, (x :Int) => {x.toDouble});
        def transform(lf : List[Int => Double], arg :Int) : List[Double] = {
            @scala.annotation.tailrec
            def transformImpl(list : List[Int => Double], acc : List[Double] = List[Double]()) : List[Double] = {
                if(list.isEmpty){
                    return acc;
                }
                return transformImpl(list.tail, acc.concat(List(lf.head(arg))))
            }
            return transformImpl(lf) 
        }
        println(transform(lf, 2));
    }
}
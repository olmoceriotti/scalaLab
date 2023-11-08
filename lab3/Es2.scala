class MyDate(val date : (Int, Int, Int)) {
    def nextDay() = MyDate(date._1, date._2, date._3 + 1)
    override def toString(): String = date._1 + "-" + date._2 + "-" + date._3
     def <(d2:MyDate) : Boolean = {
        if(date._1 < d2.date._1) return true;
        if(date._1 > d2.date._1) return false;
        if(date._2 < d2.date._2) return true;
        if(date._2 > d2.date._2) return false;
        if(date._3 < d2.date._3) return true;
        if(date._3 > d2.date._3) return false;
        return false;
    }
    def -(d2:MyDate) : Int = {
        val years = Math.abs(date._1 - d2.date._1)
        val months = Math.abs(date._2 - d2.date._2)
        val days = Math.abs(date._3 - d2.date._3)
        return years *360 + months*30 + days;
    }
}
class MyPeriod(begin : => MyDate, end : => MyDate){
    val days = begin - end
    override def toString(): String = "< " + begin + " : " + end + " >"
}
object test extends App {
  val d1 = MyDate(2015, 10, 10)
  val d2 = MyDate(2015, 11, 10)
  val d3 = d2.nextDay()
  println( "" + d1 +" "+ d2 +" "+ d3 )
  println( "" + (d1 < d2) + " " + (d2 < d1) )
  val days: Int = d1 - d2
  println("d " + days + " " +(d2 - d1))
  val period = MyPeriod(begin=d1, end=d2  )
  println( " " + d1 +" "+ d2 + " " + period + " "+period.days)
}
  /* expected result
   2015-10-10 2015-11-10 2015-11-11
   true false
   d 32 32
    2015-10-10 2015-11-10 < 2015-10-10 : 2015-11-10 > 32*/
import scala.collection.immutable.Range;
object Es1 {
    def main(args: Array[String]) = {
        if(args.length > 0 && args.length < 4){
            val begin = if(args.length == 1) 0 else Integer.parseInt(args(0));
            val end = if(args.length ==  1) Integer.parseInt(args(0)) else Integer.parseInt(args(1));
            val step = if(args.length == 3) Integer.parseInt(args(2)) else 1;
            println(Range(begin, end, step).toList.mkString(" "));
        }else{
            println(0);
        }
    }
}
object Es2{
    def main(args: Array[String]): Unit = {
        def dup(s: String, n: Int) : String ={
            @scala.annotation.tailrec
            def dupImpl(s: String, n: Int, buffer:String): String = {
                if(n == 0) return buffer;
                if(n == 1) return buffer+s;
                dupImpl(s, n-1, buffer+s);
            }
            dupImpl(s, n, "");
        }
        println(dup("hello", 3));
        
    }
}
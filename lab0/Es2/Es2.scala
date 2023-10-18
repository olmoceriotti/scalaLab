object Es2 {
    def main(args: Array[String]) = {
        if(args.length == 1){
            var message = args(0);
            var result : String = "";
            for(char <- message){
                result = result + ((char - ('a' - 1) + 13) % 26 + ('a' -1)).toChar;
            }
            println(result);
        }
    }
}
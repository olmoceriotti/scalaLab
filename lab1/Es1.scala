object Es1 {
    def main(args: Array[String]) = {
         val inventory = List[(String, Int)](
            ("rose wild star", 12),
            ("sunflower", 3),
            ("orchid", 7),
            ("carnation white", 30),
            ("carnation red", 25)
        )

        println("1")
        for(item <- inventory){
            val space = 30 - item._1.length() - item._2.toString().length()
            println(item._1 + " "*space + item._2)
        }

        println("2")
        val order = for{item <- inventory if(item._2 < 10)} yield item
        for(item <- order){
            val space = 30 - item._1.length() - item._2.toString().length()
            println(item._1 + " "*space + item._2)
        }

        println("3")
        val originalItem = ("sunflower", 3)
        val updatedItem = ("sunflower", 4)
        val index = inventory.indexOf(originalItem)
        val newInventory = List.concat(inventory.slice(0, index), List(updatedItem), inventory.slice(index+1, inventory.length))
        for(item <- newInventory){
            val space = 30 - item._1.length() - item._2.toString().length()
            println(item._1 + " "*space + item._2)
        }
    }
}
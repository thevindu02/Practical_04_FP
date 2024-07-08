object q1 {

        def main( args:Array[String]):Unit = {

            var items:Array[String] = Array("Soap","rice","Sugar","Coconut","Oil")
            var quantity:Array[Int] = Array(25,50,10,50,100)
            var Inventory = (items,quantity)

            def displayInventory(t:(Array[String],Array[Int])):Unit = {

                for(i <- t._1.indices)
                {
                    println(t._1(i) + ":" + t._2(i))
                }
            }


            def restockItem(name:String,quant:Integer):Unit = {
                if(Inventory._1.contains(name))
                {
                    for(i <- Inventory._1.indices)
                    {
                        if(Inventory._1(i) == name)
                        {
                            Inventory._2(i) += quant
                        }
                    }
                }

                else
                {
                    println("item not found in stock")
                }
            }


            def sellItem(name:String,quant:Int):Unit = {
                if(Inventory._1.contains(name))
                {
                    for( i <- Inventory._1.indices)
                    {
                        if(Inventory._1(i)==name)
                        {
                            if(Inventory._2(i)>= quant)
                            {
                                Inventory._2(i) -= quant
                            }
                            else
                            {
                                println("stock insufficient")
                            }
                        }
                    }
                }
                else
                {
                    println("item not available")
                }
            }

            displayInventory(Inventory)
            restockItem("rice",10)
            println("\nafter restock")
            displayInventory(Inventory)
            sellItem("Oil",50)
            println("\nafter sales")
            displayInventory(Inventory)
        }


        
}
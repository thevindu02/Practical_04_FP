object integerInput {

    def main(args:Array[String]):Unit = {

        import scala.io.StdIn.readInt

        println("Enter a number")
        var num = readInt()

        def numType(n:Int):String = n match {

            case x if x < 0  => "Negative is input"
            case x if x == 0 => "Zero is input"
            case x if x % 2 == 0 => "Even input"
            case _ => "Odd input"

        }

        println(numType(num))
            
            
        
    }
}
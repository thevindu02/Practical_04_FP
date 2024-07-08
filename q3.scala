object conversions {

    def main(args: Array[String]) = {

        def toUpper(S1:String):String = {

            S1.toUpperCase()
        }

        def toLower(S2:String):String = {

            S2.toLowerCase()
        }

        def formatNames(name:String)(formatFunc: String => String):String = {

            formatFunc(name)
        }

        def tailUpper(name:String):String = {
            name.dropRight(1) + name.last.toUpper
        }

        def SecUpper(name:String):String = {
            name.substring(0,1) + name.charAt(1).toUpper + name.substring(2)
        }

        println(formatNames("Benny")(toUpper))
        println(formatNames("Niroshan")(SecUpper))
        println(formatNames("Saman")(toLower))
        println(formatNames("Kumara")(tailUpper))
    }
}
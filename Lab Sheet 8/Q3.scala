object solution3 extends App {
    val toUpper : String => String = (str : String) => {str.toUpperCase()} 
    val toLower : String => String = (str : String) => {str.toLowerCase()}

    def toUpperSpecific(str : String) : String = {
        print("Enter an index to format: ")
        val i = scala.io.StdIn.readInt()
        if(i < 0 || i >= str.length()) 
            return "Out of bound"
        else {
            return str.updated(i, if(str(i).isLower) str(i).toUpper else str(i))
        }
    }

    def formatNames(name : String, func : String => String) : String = {func(name)}

    println(formatNames("Benny", toUpper))
    println(formatNames("Niroshan", toUpperSpecific))
    println(formatNames("Saman", toLower))
    println(formatNames("Kumara", toUpperSpecific))
}
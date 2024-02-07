object solution extends App {
    def toUpper(str : String) : String = {
        return str.toUpperCase()
    }

    def toLower(str : String) : String = {
        return str.toLowerCase()
    }

    def toUpperSpecific(str : String) : String = {
        print("Enter an index to format: ")
        val i = scala.io.StdIn.readInt()
        if(i < 0 || i >= str.length()) 
            return "Out of bound"
        else {
            return str.updated(i, if(str(i).isLower) str(i).toUpper else str(i))
        }
    }

    def formatNames(name : String, f : (String) => String) : String = {
        return f(name)
    }

    println("Benny => " + formatNames("Benny", toUpper))
    println("Niroshan => " + formatNames("Niroshan", toUpperSpecific))
    println("Saman => " + formatNames("Saman",toLower))
    println("Kumara => " + formatNames("Kumara",toUpperSpecific))
}
object  Main {
    def main(args : Array[String]) : Unit = {
        println(convert(35))
    }
}

def convert(c : Double) : Double = {
    return c*1.8 + 32.00
}
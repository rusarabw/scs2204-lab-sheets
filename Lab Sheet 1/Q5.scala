object Main {
    def main(args : Array[String]) : Unit = {
        println(totalTime(4,3))
    }
}

def totalTime(easy : Double, tempo : Double) : Double = {
    return easy * 8 + tempo * 7
}
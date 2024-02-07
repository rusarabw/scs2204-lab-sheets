import math.Pi

object Main {
    def main(args : Array[String]) : Unit = {
        println(area(5))
    }
}

def area(r : Double) : Double = {
    return 4*math.Pi*r*r*r/3.0
}
import math.Pi

object Main {
  def main(args: Array[String]): Unit = {
    println(area(5))
  }
}

def area(r : Double) : Double = {
  return math.Pi*r*r
}
import scala.math.pow

object SolutionQ2 extends App {
    def calculateSquare(numbers : List[Int]) : List[Int] = {
        return numbers.map(num => pow(num, 2).toInt)
    }

    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    print(calculateSquare(list))
}
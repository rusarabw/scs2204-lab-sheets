import scala.io.StdIn

object solution2 extends App {
    val filterNum : Int => String = (num : Int) => num match{
        case num if num <= 0 => "Negative/Zero"
        case num if num%2 == 0 => "Even"
        case _ => "Odd"
    }

    print("Enter an integer: ")
    val n = scala.io.StdIn.readInt()
    print("The given integer is: " + filterNum(n))
}
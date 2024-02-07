import scala.io.StdIn

object solution1 extends App {
    val interestRate : Double => Double = (deposit : Double) => deposit match {
        case deposit if deposit <= 20000 => 0.02
        case deposit if deposit <= 200000 => 0.04
        case deposit if deposit <= 2000000 => 0.035
        case _ => 0.065
    }

    print("Enter the deposit amount: ")
    val dep = scala.io.StdIn.readDouble()
    print("Amount of interest per year: " + dep*interestRate(dep))
}
object solution extends App {
    print("Enter number 1: ")
    val num1 = scala.io.StdIn.readInt()
    print("Enter number 2: ")
    val num2 = scala.io.StdIn.readInt()

    def getMean(n1 :Int, n2 : Int) : Float = {
        return ("%.2f".format((n1.toFloat + n2.toFloat)/2).toFloat)
    }

    printf("Arithmetic mean of %d and %d is: %.2f",num1,num2,getMean(num1,num2))
}
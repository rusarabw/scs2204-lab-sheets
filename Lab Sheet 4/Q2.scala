object solution extends App {
    def matchfunc(num : Int) : String = num match {
        case num if num <= 0 => return "Negative/Zero"
        case num if num % 2 == 0 => return "Even"
        case _ => return "Odd" 
    }

    print("Enter number: ")
    val n = scala.io.StdIn.readInt()
    println(matchfunc(n))
}
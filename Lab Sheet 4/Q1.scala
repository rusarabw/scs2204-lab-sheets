object solution extends App {
    def interest(deposit : Float) : Float = deposit match{
        case deposit if deposit <= 20000f => return deposit * 0.02f
        case deposit if deposit <= 200000f => return deposit * 0.04f
        case deposit if deposit <= 2000000f => return deposit * 0.035f
        case _ => return deposit * 0.065f
    }

    print("Enter deposit amount: ");
    val deposit = scala.io.StdIn.readFloat()
    if (deposit < 0) println("Invalid input") else println("Interest is: " + interest(deposit));
}
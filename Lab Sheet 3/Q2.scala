object solution extends App {
    val arr = scala.io.StdIn.readLine("Enter strings space seperated: ").split(" ").toList

    def lenFilter(array : List[String]) : List[String] = {
        array.filter(_.length() > 5)
    }

    println(lenFilter(arr))
}
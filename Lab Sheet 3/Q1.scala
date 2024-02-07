object solution extends App {
    val strIn = scala.io.StdIn.readLine("Enter a string to reverse: ")

    def reverse(str : String) : String = {
        if(str.length() == 0) {
            return ""
        }
        reverse(str.takeRight(str.length() - 1)) + str.take(1)
    }

    println(reverse(strIn))
}
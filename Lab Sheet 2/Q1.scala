object Main {
    def main(args : Array[String]) : Unit = {
        var (k, i, j) = (2, 2, 2)
        var (m, n) = (5, 5)
        var f = 12.0f
        var g = 4.0f
        var c = 'X'

        println("k + 12 * m = " + (k + 12 * m))
        println("m / j = " + (m / j))
        println("n % j = " + (n % j))
        println("m / j * j = " + (m / j * j))
        println("f + 10*5 +g = " + (f + 10*5 +g))

        // ++ in not an operator in scala
        i = i + 1
        println("++i * n = " + (i * n)) 
    }
}
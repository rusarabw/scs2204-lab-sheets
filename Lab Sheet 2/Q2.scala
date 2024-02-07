object Main {
    def main(args : Array[String]) : Unit = {
        var (a, b, c, d) = (2, 3, 4, 5)
        var k = 4.3f
        // println(--b * a + c *d--);       -- is not an operator in scala
        // println(a++);                    ++ is not an operator in scala
        // println (-2 * ( g - k ) + c);    g is not a declared variable
        // println (c=c++);                 ++ is not an operator in scala
        // println (c=++c*a++);             ++ is not an operator in scala
    }
}
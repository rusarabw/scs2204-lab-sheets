import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Solution {
    def factorial(num : Int) : Int = {
        if(num == 1) {
            return 1;
        }
        num * factorial(num-1);
    }

    def exp(x : Double, count : Int) : Double = {
        if(count == 0) {
            return 1.toDouble;
        }
        exp(x, count-1) + Math.pow(x, count).toDouble/factorial(count).toDouble;
    }

    def main(args: Array[String]) : Unit = {
        val stdin = scala.io.StdIn

        val n = stdin.readLine.trim.toInt

        for (nItr <- 1 to n) {
            val x = stdin.readLine.trim.toDouble
            println(exp(x, 9));
        }
    }
}

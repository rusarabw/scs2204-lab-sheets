// GCD calculation using Euclidean Algorithm
def gcd(p : Int, q : Int) : Int = p match{
    case x if (x < q) => gcd(q, x)
    case x if (x%q == 0) => q
    case x => gcd(q, x%q)
}

class Rational(var numerator : Int, var denominator : Int) {
    require(denominator != 0, "Denominator Can't be Zero")
    
    def neg : Rational = new Rational(-numerator, denominator)
    def getNum : Int = numerator
    def getDenom : Int = denominator
    def sub(y : Rational) : Rational = new Rational(numerator*y.getDenom - y.getNum*denominator, denominator*y.getDenom)
    def getRational : String = {
        var gcdiv = gcd(numerator.abs, denominator)
        numerator = numerator/gcdiv
        denominator = denominator/gcdiv
        return f"${numerator}/${denominator}"
    }
}

object Main1 extends App {
    var x : Rational = new Rational(3,4)
    var y : Rational = new Rational(5,8)
    var z : Rational = new Rational(2,7)

    println(f"x = ${x.getRational}, y = ${y.getRational}, z = ${z.getRational}")
    println(f"x.neg = ${x.neg.getRational}")
    println(f"x-y-z = ${x.sub(y).sub(z).getRational}")
}
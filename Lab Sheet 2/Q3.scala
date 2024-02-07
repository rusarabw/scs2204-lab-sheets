object Main {
    def main(args : Array[String]) : Unit = {
        val pay = normalPay(40) + otPay(30)
        println("Take home salary = Rs." + (pay - tax(pay)))
    }

    def normalPay(hours : Float) : Float = {
        return (hours * 250)
    } 

    def otPay(hours : Float) : Float = {
        return (hours * 85)
    }

    def tax(pay : Float) : Float = {
        return (pay * 0.12f)
    }
}
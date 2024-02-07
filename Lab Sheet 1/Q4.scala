object Main {
    def main(args : Array[String]) : Unit = {
        println(totalCost(60))
    }
}

def totalCost(copies : Int) : Double = {
    return 24.95 * copies - discount(24.95 * copies) + shippingCost(copies)
}

def discount(amount : Double) : Double = {
    return amount * 40.00 / 100.00
}

def shippingCost(copies : Int) : Double = {
    if (copies > 50) {
        return 3 + (copies - 50) * 0.75
    } else {
        return 3
    }
}
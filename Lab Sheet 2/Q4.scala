object  Main {
    def main(args : Array[String]) : Unit = {
        var maxWeight = -3
        var maxProfit = profit(maxWeight)
        for(i <- (-2) to 6) {
            if(maxProfit < profit(i)) {
                maxProfit = profit(i)
                maxWeight = i
            }
        }
        println("Best ticket price: Rs. " + (15 + 5*maxWeight))
    }

    def attendance(weight : Int) : Int = {
        return (120 - 20*weight)
    }

    def profit(weight : Int) : Int = {
        return (revenue(weight) - cost(weight))
    }

    def revenue(weight : Int) : Int = {
        return ((15 + 5*weight) * attendance(weight))
    }

    def cost(weight : Int) : Int = {
        return (500 + attendance(weight)*3)
    }

    /*
        profit = (15 + 5*n) * (120 - 20*n) - (500 + ((120 - 20*n)*3))
               = (12 + 5*n) * (120 - 20*n) - 500  
        
        n = -3 to n = 6
    */
}
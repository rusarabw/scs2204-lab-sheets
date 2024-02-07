object solution1 extends App{
    def calculateAverage(tempList : List[Int]) : Double = {
        tempList.map(cels => cels*9.0/5.0 + 32).reduce(_ + _)/tempList.size
    }

    var list : List[Int] = List(0, 10, 20, 30)
    println("Input: "+ list)
    println("Average Fahrenheit temperature: " + calculateAverage(list))
}   
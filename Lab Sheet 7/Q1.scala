object SolutionQ1 extends App {
    def filterEvenNumbers(numbers : List[Int]) : List[Int] = {
        return numbers.filter(num => num % 2 == 0)
    }

    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    print(filterEvenNumbers(list))
}
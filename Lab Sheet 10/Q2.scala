object solution2 extends App {
    def countLetterOccurences(wordList : List[String]) : Int = {
        wordList.map(str => str.length()).reduce(_ + _)
    }

    val fruit: List[String] = List("apple", "banana", "cherry", "date")
    println("Input: " + fruit)
    println("Total count of letter occurrences: " + countLetterOccurences(fruit))
}
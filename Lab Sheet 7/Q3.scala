object SolutionQ3 extends App {
    // GCD calculation using Euclidean Algorithm
    def gcd(p : Int, q : Int) : Int = p match{
        case x if (x < q) => gcd(q, x)
        case x if (x%q == 0) => q
        case x => gcd(q, x%q)
    }

    def isPrime(n : Int, i : Int = 2) : Boolean = n match{
        case x if (x == i) => true
        case x if (gcd(x, i) > 1) => false
        case x => isPrime(x, i+1)
    }

    def filterPrime(numbers : List[Int]) : List[Int] = {
        numbers.filter(num => isPrime(num))
    }

    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(_ > 1)
    print(filterPrime(list))
}
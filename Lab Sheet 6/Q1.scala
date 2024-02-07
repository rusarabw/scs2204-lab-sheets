import scala.io.StdIn

object Solution {
    val Letters = 26

    def main(args : Array[String]) : Unit = {
        print("Enter a string to ecnrypt : ")
        val str = scala.io.StdIn.readLine()
        print("Enter a key to be used in encrption : ")
        val key = scala.io.StdIn.readInt()
        if(key < 0 || key > 26) {
            println("Invalid Input!")
        } else {
            cipher(str, key);
        }
    }

    def encrypt(ch : Char, key : Int) : Char = {
        if(ch.isLower) {
            return ((ch - 'a' + (Letters - key)) % Letters + 'a').toChar
        } else {
            return ((ch - 'A' + (Letters - key)) % Letters + 'A').toChar
        }
    }

    def decrypt(ch : Char, key : Int) : Char = {
        if(ch.isLower) {
            return ((ch - 'a' + key) % Letters + 'a').toChar
        } else {
            return ((ch - 'A' + key) % Letters + 'A').toChar
        }
    }

    def cipher(str : String, key : Int) : Unit = {
        var encrypted = str.map(ch => if(ch.isLetter) encrypt(ch, key) else ch)
        println("Encrypted text : " + encrypted)
        println("Decrypted text : " + encrypted.map(ch => if(ch.isLetter) decrypt(ch, key) else ch))
    }
}
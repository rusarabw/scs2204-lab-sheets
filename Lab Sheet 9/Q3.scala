class account(accNo : String, var amount : Double = 0.0) {
    def getAccNo : String = accNo
    def getAmount : Double = amount

    def transfer(acc : account, amnt : Double) : Unit = {
        require(amount > amnt, "Not enough Balance")
        withdarw(amnt)
        acc.deposit(amnt)
        println("Transfer Completed")
    }

    def withdarw(amnt : Double) : Unit = {
        amount = amount - amnt
        println(f"Rs. ${amnt} withdrawed from the account ${accNo}, The balance is Rs. ${amnt}")
    }

    def deposit(amnt : Double) : Unit = {
        amount = amount + amnt
        println(f"Rs. ${amnt} deposited to the account ${accNo}, The balance is Rs. ${amnt}")
    }
}

object Main2 extends App {
    var acc1 = new account("2021cs224", 400000)
    var acc2 = new account("2021cs241")

    acc2.deposit(100000)
    acc1.withdarw(200000)
    acc1.transfer(acc2, 100000)
}
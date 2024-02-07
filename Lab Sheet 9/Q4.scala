class Account(accNo : String, var amount : Double = 0.0) {
    def getAccNo : String = accNo
    def getAmount : Double = amount
    def setAmount(amnt : Double) : Unit = {amount = amnt}

    def transfer(acc : Account, amnt : Double) : Unit = {
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

class Bank(accounts : List[Account]) {
    var sum : Double = 0.0
    def negativeAccounts() : List[Account] = {
        accounts.filter(_.amount < 0)
    }

    def sumBalances() : Unit = {
        accounts.foreach(acc => sum = sum + acc.getAmount)
        println(f"Sum of all account balances is ${sum}")
    }

    def applyInterest() : Unit = {
        accounts.foreach(acc => if(acc.getAmount > 0) acc.setAmount(acc.getAmount*1.05) else acc.setAmount(acc.getAmount*1.1))
        accounts.foreach(acc => println(f"Account No = ${acc.getAccNo}, Balance = ${acc.getAmount}"))
    }
}

object Main extends App {
    var acc1 = new Account("2021cs220", 400000)
    var acc2 = new Account("2021cs221", 200000)
    var acc3 = new Account("2021cs222", -4000)
    var acc4 = new Account("2021cs223", -2000)
    var acc5 = new Account("2021cs224", -10)
    var acc6 = new Account("2021cs225")

    var bank = new Bank(List(acc1, acc2, acc3, acc4, acc5, acc6))

    print("Negative Balance Accounts := ")
    bank.negativeAccounts().foreach(acc => print(f"${acc.getAccNo} "))
    println()
    bank.sumBalances()
    bank.applyInterest()
}

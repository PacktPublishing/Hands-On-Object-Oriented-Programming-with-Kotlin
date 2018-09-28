package Chapter3

class BankAcc(private val acc_id : Int, private var balance : Double){

    fun withdraw(remove : Double) {

        if(balance >= remove){
            balance -= remove

            println("$remove money has withdrawn, current balance is $balance")
        } else {
            println("Not enough balance, current balance is $balance")
        }
    }

    fun deposit(add : Double){

        if(add > 0){
            balance += add

            println("$add money has deposited, current balance is $balance")
        } else {
            println("Cannot process....")
        }

    }
}

fun main(args: Array<String>) {

    var account = BankAcc(123, 500.0)

    account.withdraw(600.0)

    account.withdraw(100.0)

    account.deposit(600.0)

}
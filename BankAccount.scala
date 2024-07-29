import scala.io.StdIn

class Account(val accountNum:String, var balance: Double){
  def deposit(amount: Double): Unit = {
    if (amount>0){
      balance+=amount
      println(s"The added amount is $amount and the updated balance is $balance")
    }
    else{
      println(s"Enter a amount greater than zero")
    }

  }
  def withdraw(amount: Double): Unit = {
    if(amount<=balance & amount>0){
      balance-=amount
      println(s"Withdrawn Amount is $amount and updated Balance is $balance")
    }
    else{
      println("Insufficient fund or Invalid Amount")
    }
  }
  def getBalance: Double =balance

}
object bank extends App{
  println("Enter the name of the account you wish to start")
  var aname=StdIn.readLine()
  var account1=new Account(aname,2500)
  var account2=new Account("Start",3000)
  println("Enter the amount to be deposited")
  var n=StdIn.readDouble()
  account1.deposit(n)
  println("Enter the amount to be withdrawn")
  var m=StdIn.readDouble()
  account1.withdraw(m)
  account1.getBalance
  account2.deposit(59.99)
  account2.withdraw(89.01)
  println("The final balance is "+account2.getBalance)
}
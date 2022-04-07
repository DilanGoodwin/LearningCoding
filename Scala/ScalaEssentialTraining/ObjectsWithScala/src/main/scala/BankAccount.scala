
class BankAccount(name:String, balance:Double, accountType:String){
  def getName: String=name
  def getBalance: Double=balance
  def getAccountType: String=accountType
  def getAccountNumber: Int=BankAccount.newAccountNumber()
}

object BankAccount{
  var accountNumber: Int=4999
  def newAccountNumber(): Int={
    accountNumber+=1
    return accountNumber
  }
}
object BankAccountUsed{
  def main(args:Array[String]): Unit={
    var John=new BankAccount("John Smith",500.50,"Saving")
    println("Name: "+John.getName+"\nBalance: "+John.getBalance)
  }
}

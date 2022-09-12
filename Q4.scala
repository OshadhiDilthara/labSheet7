class Account(id:String,no:Int, b:Double){

    val nic:String= id
    val accountNo:Int = no
    var balance:Double = b

    def transfer(a:Account, b:Double) ={
           this.balance= this.balance-b 
           a.balance = a.balance + b
    } 


    override def toString = "["+nic+":"+ accountNo+ ":"+ balance+"]"
 }



object Q4 extends App{

 var bank:List[Account] = List()

def CreateAcc(id:String,no:Int, b:Double):Unit={
    val Account = new Account(id,no,b)
    bank = bank ::: Account :: Nil
    

}
 
 CreateAcc("10001",202201,500)
 CreateAcc("10002",202202,-10)
 println(bank)
 val overdraft = (b:List[Account]) => b.filter(account => account.balance < 0.0)
 val totalBalance = (b:List[Account]) => b.foldLeft(0.0)((x, y) => x + y.balance)
 val interest = (b:List[Account]) => b.map(account => if(account.balance > 0) account.balance*0.05 else account.balance*0.1)
 
 println("\nNegative Balances : ")
 println(overdraft(bank))

 println("\nSum of all Account Balances : ")
 println(totalBalance(bank))

 println("\nTnterest for accounts : ") 
 println(interest(bank))

 /*Account1.transfer(Account2,500)

 println(Account1)
 println(Account2)*/


}
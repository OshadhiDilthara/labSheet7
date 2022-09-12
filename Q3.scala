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



object Q3 extends App{


 val account1 = new Account("1",202201,500)
 val account2 = new Account("2",202202,200)

 account1.transfer(account2,500)

 println(account1)
 println(account2)


}
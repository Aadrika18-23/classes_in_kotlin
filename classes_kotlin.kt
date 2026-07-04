class User{
    val app_name : String
    val spend_limit : Double
    var money_spend : Double
        constructor(app_name : String ,spend_limit : Double , money_spend : Double){
            this.app_name = app_name 
            this.spend_limit =  spend_limit
            this.money_spend = money_spend
        }
        fun display(){
            println("Name : $app_name \nAmount set  : $spend_limit \nMoney Spend  : $money_spend")
        }
        fun remain() : Double{
            return spend_limit - money_spend
        }
        fun app_status() {
            if(money_spend >= spend_limit){
                println("App blocked ! you have reached upto setted limit")
            }else{
                println("You can use continue spend ! ")
            }
        }
}
fun main() {
    val user = User("Nykaa",5000.00,10000.0)
    user.display()
    println("Remaining amount to be spend in ${user.app_name} : ${user.remain()}")
    user.app_status()
    // new app 
    val user1 = User("Myntra",3000.0,2000.0)
    user1.display()
    println("Remaining amount to be spend in ${user1.app_name} : ${user1.remain()}")
    user1.app_status()
    
}
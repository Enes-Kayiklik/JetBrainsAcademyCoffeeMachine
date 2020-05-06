import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var money = scanner.nextInt()

    while(scanner.hasNext()){
        val thatMoney = scanner.nextInt()

        if(money - thatMoney < 0)
            print("Error, insufficient funds for the purchase. You have $money, but you need $thatMoney.")

        money -= thatMoney
    }
    if(money >= 0)
        print("Thank you for choosing us to manage your account! You have $money money.")
}
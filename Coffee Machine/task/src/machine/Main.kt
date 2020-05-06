package machine

import java.util.*

fun main() {
    val scan=Scanner(System.`in`)
    print("Write how many cups of coffee you will need: > ")
    val cup=scan.nextInt()
    println("\nFor 125 cups of coffee you will need:" +
            "\n${cup*200} ml of water\n" +
            "${cup * 50} ml of milk\n" +
            "${cup * 15} g of coffee beans")

}

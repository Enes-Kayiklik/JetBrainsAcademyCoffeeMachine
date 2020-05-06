import java.util.*

// write your function here

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val number1 = scanner.nextInt()
    val number2 = scanner.nextInt()
    val number3 = scanner.nextInt()
    val number4 = scanner.nextInt()

    println(isGreater(number1, number2, number3, number4))
}
fun isGreater(num1:Int,num2:Int,num3:Int,num4:Int) = (num1 + num2) > (num3 + num4)
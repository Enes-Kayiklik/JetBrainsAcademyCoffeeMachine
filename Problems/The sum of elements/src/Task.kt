import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var sum = 0

    do{
        val num = scanner.nextInt()
        sum += num
    }while (num != 0)
    print(sum)
}
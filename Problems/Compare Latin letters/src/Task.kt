import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val firs = scanner.next().first().toLowerCase()
    val second = scanner.next().first().toLowerCase()

    print(firs == second)
}
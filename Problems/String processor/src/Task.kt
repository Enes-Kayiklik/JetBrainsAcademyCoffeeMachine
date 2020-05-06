import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val first = scanner.nextLine()
    val chose = scanner.nextLine()
    val second = scanner.nextLine()

    when(chose)
    {
        "equals" -> print(first.equals(second))
        "plus" -> print(first+second)
        "endsWith" -> print(first.endsWith(second))
        else -> print("Unknown operation")
    }
}
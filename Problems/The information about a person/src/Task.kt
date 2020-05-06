import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val fName = scanner.next().first()
    val lName = scanner.next()
    val age = scanner.nextInt()

    print("$fName. $lName, $age years old")
}
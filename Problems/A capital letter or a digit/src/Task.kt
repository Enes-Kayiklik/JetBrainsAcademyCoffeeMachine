import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val char = scanner.next().first()
    val isDigit = char in '\u0031'..'\u0039'
    if (isDigit || char.isUpperCase()) {
        println(true)
    } else {
        println(false)
    }
}
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    print((num/10)%10)
}
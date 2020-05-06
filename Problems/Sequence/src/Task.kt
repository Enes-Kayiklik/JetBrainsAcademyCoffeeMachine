import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val first=scanner.next().first()
    val second=scanner.next().first()
    val third=scanner.next().first()

    print(first+1==second && first+2==third)
}
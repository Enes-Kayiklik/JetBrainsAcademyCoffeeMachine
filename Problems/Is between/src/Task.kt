import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val firstNum=scanner.nextInt()
    val secondNum=scanner.nextInt()
    val thirdNum=scanner.nextInt()

    print((secondNum<=firstNum && firstNum<=thirdNum) || (secondNum>=firstNum && firstNum>=thirdNum))
}
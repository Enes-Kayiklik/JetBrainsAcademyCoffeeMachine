import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val firstNum=scanner.nextInt()
    val secondNum=scanner.nextInt()
    val thirdNum=scanner.nextInt()

    print(!(firstNum>0 && secondNum>0) xor
            !(firstNum>0 && thirdNum>0) xor !(secondNum>0 && thirdNum>0))
}
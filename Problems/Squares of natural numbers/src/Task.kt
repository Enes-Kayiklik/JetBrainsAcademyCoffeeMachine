import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val maxNum = scanner.nextInt()
    var numSquare = 1
    var num = 1
    while(numSquare <= maxNum){
        println(numSquare)
        num++
        numSquare = num*num
    }
}
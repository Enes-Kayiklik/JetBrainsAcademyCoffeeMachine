import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var repeatTimes = scanner.nextInt()
    var num = 1
    while (repeatTimes>=0){
        if(repeatTimes - num >=0)
            repeat(num){
                print("$num ")
            }
        else
            repeat(repeatTimes){
                print("$num ")
            }
        repeatTimes -= num
        num++
    }
}
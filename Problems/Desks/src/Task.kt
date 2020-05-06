import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var sumOfDesk = 0
    repeat(3){
        var num = scanner.nextInt()
        if (num % 2 ==0){
            sumOfDesk += num/2
        }
        else{
            sumOfDesk += (num+1)/2
        }
    }
    print(sumOfDesk)
}
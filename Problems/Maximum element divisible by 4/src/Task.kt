import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var output=0

    repeat(scanner.nextInt()){
        val num = scanner.nextInt()
        if(num % 4 == 0 && num > output){
            output = num
        }
    }
    print(output)
}
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var zero = 0
    var one = 0
    var minusOne = 0

    repeat(scanner.nextInt()){
        when(scanner.nextInt()){
            0 -> zero++
            1 -> one++
            -1 -> minusOne++
        }
    }
    print("$zero $one $minusOne")
}
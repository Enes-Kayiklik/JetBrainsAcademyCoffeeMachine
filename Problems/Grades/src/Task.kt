import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val repeat=scanner.nextInt()

    var D=0
    var A=0
    var B=0
    var C=0
    repeat(repeat){
        val num=scanner.nextInt()
        when(num){
            2->D++
            3->C++
            4->B++
            5->A++
        }
    }
    print("$D $C $B $A")
}
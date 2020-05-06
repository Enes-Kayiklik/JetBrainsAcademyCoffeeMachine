import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val peanut=scanner.nextInt()
    val isWeekend=scanner.nextBoolean()

    print((peanut>=10&&peanut<=20)&&!isWeekend || (peanut>=15&&peanut<=25)&&isWeekend)
}
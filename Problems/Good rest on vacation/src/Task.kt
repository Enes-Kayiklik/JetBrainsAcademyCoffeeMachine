import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val day=scanner.nextInt()
    val foodCost=scanner.nextInt()
    val flightCost=scanner.nextInt()
    val hotelCost=scanner.nextInt()

    print(day*foodCost + 2*flightCost + (day- 1)* hotelCost)
}
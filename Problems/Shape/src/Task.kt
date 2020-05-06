import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val chose = scanner.nextInt()

    when(chose)
    {
        1-> print("You have chosen a square")
        2->print("You have chosen a circle")
        3->print("You have chosen a triangle")
        4->print("You have chosen a rhombus")
        else -> print("There is no such shape!")
    }
}
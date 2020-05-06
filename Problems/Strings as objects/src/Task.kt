fun main() {
    val input = readLine()!!
    when {
        input.isNullOrEmpty() -> {
            println()
        }
        input.first() == 'i' -> {
            var removed = input.drop(1)
            print(removed.toInt() +1)
        }
        input.first() == 's' -> {
            var removed = input.drop(1)
            print(removed.reversed())
        }
        else -> print(input)
    }
}
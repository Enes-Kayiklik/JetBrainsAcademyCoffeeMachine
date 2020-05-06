import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val year = scanner.nextInt()

    if(year % 4 == 0)
    {
        if (year % 100 == 0)
        {
            if(year % 400 == 0)
            {
                print("Leap")
            }
            else
            {
                print("Regular")
            }
        }
        else
        {
            print("Leap")
        }

    }
    else
    {
        print("Regular")
    }
}
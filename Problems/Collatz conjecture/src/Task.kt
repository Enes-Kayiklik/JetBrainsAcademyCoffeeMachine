import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var num = scanner.nextInt()
    if(num != 1)
    {
        do {
            print("$num ")
            if(num % 2 == 0){
                num /=2
            }else{
                num =  num * 3 + 1
            }
        }while (num > 1)

        print(1)
    }

    else
        print(1)
}
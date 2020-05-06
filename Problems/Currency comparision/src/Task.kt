import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val firstCountry = input.next()
    val secondCountry = input.next()

    print(Currency.getCurrency(firstCountry) == Currency.getCurrency(secondCountry))
}
enum class Currency(val explain:String){
    Germany("Euro"),
    Mali("CFA franc"),
    Dominica("Eastern Caribbean dollar"),
    Canada("Canadian dollar"),
    Spain("Euro"),
    Australia("Australian dollar"),
    Brazil("Brazilian real"),
    Senegal("CFA franc"),
    France("Euro"),
    Grenada("Eastern Caribbean dollar"),
    Kiribati("Australian dollar");

    companion object{
        fun getCurrency(city:String):String{
            for(enum in Currency.values()){
                if(city == enum.name) return enum.explain
            }
            return ""
        }
    }
}
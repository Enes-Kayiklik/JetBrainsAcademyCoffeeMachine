class City(val name: String) {
    var degrees: Int = 0
}        

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = if (first > -92 && first < 57) first else 30
    val secondCity = City("Moscow")
    secondCity.degrees = if (second > -92 && second < 57) second else 5
    val thirdCity = City("Hanoi")
    thirdCity.degrees = if (third > -92 && third < 57) third else 20

    if (firstCity.degrees != secondCity.degrees && firstCity.degrees != thirdCity.degrees && secondCity.degrees != thirdCity.degrees)
        print(findMin(firstCity,secondCity,thirdCity).name)
    else
        print("neither")
}
fun findMin(a:City,b:City,c:City):City{
    if(a.degrees < b.degrees && a.degrees < c.degrees)
        return a
    else if(c.degrees < a.degrees && c.degrees < b.degrees)
        return c
    else
        return b
}
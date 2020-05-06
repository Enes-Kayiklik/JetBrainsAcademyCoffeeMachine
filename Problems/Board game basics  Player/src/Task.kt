class Player(val id: Int, val name: String, val hp: Int){
    companion object Play{
        var uniqeID = 0
        fun create(name : String): Player{
            uniqeID++
            return Player(uniqeID,name,100)
        }
    }
}
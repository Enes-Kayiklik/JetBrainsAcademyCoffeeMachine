class Application(val name: String) {

    fun run(arr:Array<String>){
        println(this.name)
        repeat(arr.size){
            println(arr[it])
        }
    }
}
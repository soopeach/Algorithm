fun main(){

    val n = readln().toInt()
    var volume = 1
    repeat(3){
        volume *= n
    }
    println(volume)
}
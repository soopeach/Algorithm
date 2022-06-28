fun main(){

    val t = readln().toInt()
    var i = 1
    repeat(t){

        val dice = readln().split(" ").map { it.toInt() }

        println("Case ${i++}: ${dice.sum()}")
    }
}
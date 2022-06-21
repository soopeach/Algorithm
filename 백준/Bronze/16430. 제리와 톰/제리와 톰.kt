fun main(){
    val aAndB = readln().split(" ").map { it.toInt() }
    println("${aAndB[1] - aAndB[0]} ${aAndB[1]}")
}
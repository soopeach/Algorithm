fun main(){
    val s = readln().split(" ").map { it.toInt() }.sum()
    val t = readln().split(" ").map { it.toInt() }.sum()
    println(if (s >= t) s else t)
}
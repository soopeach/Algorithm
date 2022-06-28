fun main(){
    val (k, n, m) = readln().split(" ").map { it.toInt() }
    val ans = k * n - m
    println(if (ans > 0) ans else 0)
}
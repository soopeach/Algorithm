import kotlin.math.abs

fun main() {

    val players = readln().split(" ").map { it.toInt() }
    val ans = abs(players.sum() - 2 * (players.minOf { it } + players.maxOf { it }))
    println(ans)
    
}
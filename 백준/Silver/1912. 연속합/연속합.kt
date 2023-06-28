import kotlin.math.max

fun main() {

    val n = readln().toInt()
    val sequence = listOf(0) + readln().split(" ").map { it.toInt() }

    val dp = IntArray(n + 1)
    dp[1] = sequence[1]

    for (i in 2..n) {
        dp[i] = max(sequence[i] + dp[i - 1], sequence[i])
    }

    println(dp.drop(1).maxOf { it })
}
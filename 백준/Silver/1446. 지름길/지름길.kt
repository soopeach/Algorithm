package `4week`.hyunsoo

import java.lang.Math.min

data class Data(val start: Int, val distance: Int)

fun main() {

    val (shortCutCnt, highWayLength) = readln().split(" ").map { it.toInt() }
    val dp = Array(10001) { i -> i }
    val shortCutGraph = Array(10001) {
        mutableListOf<Data>()
    }

    repeat(shortCutCnt) {
        val (start, end, shortCutDistance) = readln().split(" ").map { it.toInt() }
        // 도착지점이 고속도로의 길이를 넘거나 지름길이 도로보다 길지 않은 경우에만 지름길 생성
        if ((end > highWayLength).not() &&
            (end - start <= shortCutDistance).not()
        ) shortCutGraph[end].add(Data(start, shortCutDistance))

    }

    for (end in 1..highWayLength) {
        dp[end] = dp[end - 1] + 1
        if (shortCutGraph[end].isNotEmpty()) {
            shortCutGraph[end].forEach { shortCutData ->
                dp[end] = min(dp[end], dp[shortCutData.start] + shortCutData.distance)
            }
        }
    }

    println(dp[highWayLength])
}
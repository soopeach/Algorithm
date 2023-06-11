package hyunsoo.`39week`

import kotlin.math.max

/**
 *
 * <문제>
 * [가장 긴 증가하는 부분 수열](https://www.acmicpc.net/problem/11053)
 *
 * - 아이디어
 *
 * - 트러블 슈팅
 *
 */
class `전현수_가장_긴_증가하는_부분수열` {

    fun solution() {

        val cnt = readln().toInt()
        val sequence = listOf(0) + readln().split(" ").map { it.toInt() }

        val dp = IntArray(cnt + 1)
        dp[0] = 0

        for (i in 1..cnt) {

            val curNum = sequence[i]

            // 나보다 작은 수들 중 LIS가 가장 큰 친구 바로 뒤에 붙기

            var maxLisIndex = 0
            for (j in i downTo 0) {

                val preNum = sequence[j]

                if(preNum < curNum) {
                    if (dp[maxLisIndex] < dp[j]) maxLisIndex = j
                }
            }

            dp[i] = dp[maxLisIndex] + 1
        }

        println(dp.maxOf { it })
    }
}

fun main() {
    전현수_가장_긴_증가하는_부분수열().solution()
}
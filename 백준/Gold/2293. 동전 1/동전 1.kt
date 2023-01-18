package hyunsoo.`19week`

/**
 *
 * <문제>
 * [동전 1](https://www.acmicpc.net/problem/2293)
 *
 * n가지 종류의 동전이 있고, 가치의 합이 K원이 되도록 하는 경우의 수를 구해라.
 *
 * - 아이디어
 *
 *
 * - 트러블 슈팅
 *
 */
class `전현수_동전_1` {

    fun solution() {

        val (coinCnt, target) = readln().split(" ").map { it.toInt() }
        val dp = IntArray(target + 1)
        val coinList = Array(coinCnt) {
            readln().toInt()
        }.sorted()

        dp[0] = 1

        coinList.forEach { coin ->
            for (j in coin..target) {
                dp[j] += dp[j - coin]
            }
        }

        println(dp[target])

    }
}

fun main() {
    전현수_동전_1().solution()
}
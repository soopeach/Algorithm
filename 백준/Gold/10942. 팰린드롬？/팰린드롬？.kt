package hyunsoo.`27week`

import java.io.BufferedWriter
import java.io.OutputStreamWriter

/**
 *
 * <문제>
 * [팰린드롬?](https://www.acmicpc.net/problem/10942)
 *
 * - 아이디어
 *
 * - 트러블 슈팅
 *
 */
class `전현수_펠린드롬` {

    fun solution() {

        val bw = BufferedWriter(OutputStreamWriter(System.out))

        val sequenceSize = readln().toInt()
        val sequence = listOf(0) + readln().split(" ").map { it.toInt() }
        val qCnt = readln().toInt()

        val dp = Array(sequenceSize + 1) {
            IntArray(sequenceSize + 1) { NO }
        }

        for (i in 0..sequenceSize) {
            dp[i][i] = YES
        }

        for (i in 1 until sequenceSize) {
            if (sequence[i] == sequence[i + 1]) dp[i][i + 1] = YES
        }

        for (i in sequenceSize downTo 1) {
            for (j in sequenceSize downTo i + 1) {
                if (dp[i + 1][j - 1] == YES && sequence[i] == sequence[j]) dp[i][j] = YES
            }
        }

        repeat(qCnt) {
            val (s, e) = readln().split(" ").map { it.toInt() }
            bw.write("${dp[s][e]}\n")
        }

        bw.flush()
        bw.close()

    }

    companion object {
        const val YES = 1
        const val NO = 0
    }
}

fun main() {
    전현수_펠린드롬().solution()
}
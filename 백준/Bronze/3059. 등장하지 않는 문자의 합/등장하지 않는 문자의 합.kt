package hyunsoo.`21week`

/**
 *
 * <문제>
 * [등장하지 않는 문자의 합](https://www.acmicpc.net/problem/3059)
 *
 * - 아이디어
 *
 * - 트러블 슈팅
 *
 */
class `전현수_등장하지_않는_문자의_합` {

    private lateinit var alphabetCounter: IntArray

    fun solution() {
        val testcase = readln().toInt()

        repeat(testcase) {

            alphabetCounter = IntArray(26)

            readln().forEach {
                alphabetCounter[it.toIndex()]++
            }

            val neverSeenAlphabetsCode = mutableListOf<Int>()
            alphabetCounter.forEachIndexed { index, count ->
                if (count == 0) neverSeenAlphabetsCode.add(index + 65)
            }
            println(neverSeenAlphabetsCode.sum())
        }

    }

    private fun Char.toIndex(): Int = this.code - 65
}

fun main() {
    전현수_등장하지_않는_문자의_합().solution()
}
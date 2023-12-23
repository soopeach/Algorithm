package hyunsoo.after

/**
 *
 * <문제>
 * [베스트셀러](https://www.acmicpc.net/problem/1302)
 *
 * - 아이디어
 *
 * - 트러블 슈팅
 *
 */
class `전현수_베스트셀러` {

    fun solution() {

        val dictionary = mutableMapOf<String, Int>()

        val cnt = readln().toInt()

        repeat(cnt) {
            val bookName = readln()

            if (dictionary.containsKey(bookName)) {
                dictionary[bookName] = dictionary[bookName]!! + 1
            } else {
                dictionary[bookName] = 1
            }
        }

        dictionary.map {
            (it.key to it.value)
        }.sortedWith(
            (compareByDescending<Pair<String, Int>> {
                it.second
            }
                .thenBy { it.first })
        )
            .first().apply {
                println(first)
            }

    }
}

fun main() {
    전현수_베스트셀러().solution()
}
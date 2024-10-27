/**
 *
 * <문제>
 * []()
 *
 * - 아이디어
 *
 * - 트러블 슈팅
 *
 */
class `전현수_과제_안_내신_분` {

    val list = BooleanArray(31)

    fun solution() {

        repeat(28) {

            val num = readln().toInt()

            list[num] = true
        }

        var firstEmpty = -1

        for (i in 1..30) {
            if (list[i].not()) {
                println(i)
                firstEmpty = i
                break
            }
        }

        for (i in firstEmpty + 1..30) {
            if (list[i].not()) {
                println(i)
                break
            }
        }


    }
}

fun main() {
    전현수_과제_안_내신_분().solution()
}
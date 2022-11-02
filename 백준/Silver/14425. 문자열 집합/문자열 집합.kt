package hyunsoo.`8week`

/**
 * <문제>
 * [문자열 집합](https://www.acmicpc.net/problem/14425)\
 *
 * n개의 문자열로 이루어진 집합 S가 주어짐
 * 입력으로 들어오는 M개의 문자열 중에서 집합 Sㅇ에 포함되어있는 것이 총 몇 개인지 구해라
 */
fun main() {

    val (setCnt, stringCnt) = readln().split(" ").map { it.toInt() }
    val stringSet = mutableSetOf<String>()
    var ans = 0

    repeat(setCnt) {
        stringSet.add(readln())
    }
    repeat(stringCnt) {
        stringSet.contains(readln()).apply {
            if (this) ans++
        }
    }
    println(ans)
}

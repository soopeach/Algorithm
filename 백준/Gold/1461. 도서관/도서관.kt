package hyunsoo.`24week`

import kotlin.math.absoluteValue
import kotlin.math.max

/**
 *
 * <문제>
 * [도서관](https://www.acmicpc.net/problem/1461)
 *
 * - 아이디어
 *
 * - 트러블 슈팅
 * 책이 하나만 있을 때 해당 책이 음수 경로에 있을 때 인덱스 에러 발생
 *
 */
class `전현수_도서관` {

    val packagedPositions = mutableListOf<List<Int>>()
    val tempPackage = mutableListOf<Int>()

    fun solution() {

        var answer = 0
        val (bookCnt, maxCarryCnt) = readln().split(" ").map { it.toInt() }
        val bookPositions = readln()
            .split(" ")
            .map { it.toInt() }
            .sorted()

        // 최초로 음수 -> 양수가 바뀌는 인덱스
        val pivot = bookPositions.count { it < 0 }

        // 음수
        for (index in bookPositions.lastIndex downTo pivot step maxCarryCnt) {
            answer += bookPositions[index].absoluteValue * 2
        }

        // 양수
        for (index in 0 until pivot step maxCarryCnt) {
            answer += bookPositions[index].absoluteValue * 2
        }

        answer -= max(bookPositions.first().absoluteValue, bookPositions.last().absoluteValue)

        println(answer)

    }


}

fun main() {
    전현수_도서관().solution()
}
package hyunsoo.`47week`

import java.util.*

/**
 *
 * <문제>
 * [회장뽑기](https://www.acmicpc.net/problem/2660)
 *
 * - 아이디어
 *
 * - 트러블 슈팅
 *
 */
class `전현수_회장뽑기` {

    fun solution() {

        val peopleCnt = readln().toInt()

        val graph = Array(peopleCnt + 1) {
            mutableListOf<Int>()
        }

        val connected = Array(peopleCnt + 1) {
            BooleanArray(peopleCnt + 1)
        }

        val scoreList = IntArray(peopleCnt + 1)

        while (true) {

            val (a, b) = readln().split(" ").map { it.toInt() }
            if (a == -1 && b == -1) break

            graph[a].add(b)
            graph[b].add(a)

        }

        for (myIndex in 1..peopleCnt) {
            val visited = BooleanArray(peopleCnt + 1).apply {
                this[0] = true
                this[myIndex] = true
            }
            val queue: Queue<Pair<Int, Int>> = LinkedList()

            queue.addAllWithAction(graph[myIndex] to 1) { elements ->
                elements.forEach { friend ->
                    connected[myIndex][friend] = true
                }
            }

            while (queue.isNotEmpty()) {

                if (connected[myIndex].drop(1).all { it }) break

                val (friendIndex, cost) = queue.poll()

                if (visited[friendIndex]) continue

                scoreList[myIndex] = cost
                visited[friendIndex] = true

                queue.addAllWithAction(graph[friendIndex].filter {
                    visited[it].not()
                } as MutableList to cost + 1) { elements ->
                    elements.forEach { friend ->
                        connected[myIndex][friend] = true
                    }
                }

            }
        }

        val candidateScore = scoreList.drop(1).minOf { it }
        println("$candidateScore ${scoreList.count { it == candidateScore }}")
        scoreList.forEachIndexed { index, score ->
            if (score == candidateScore) print("$index ")
        }

    }

    private fun Queue<Pair<Int, Int>>.addAllWithAction(
        pairElement: Pair<MutableList<Int>, Int>,
        action: (Collection<Int>) -> Unit,
    ) {
        pairElement.first.forEach {
            this.add(it to pairElement.second)
        }
        action(pairElement.first)
    }

}

fun main() {
    전현수_회장뽑기().solution()
}
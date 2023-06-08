package hyunsoo.`39week`

import java.util.LinkedList
import java.util.Queue

/**
 *
 * <문제>
 * [봄버맨](https://www.acmicpc.net/problem/16918)
 *
 * - 아이디어
 * 폭탄이 설치된 후를 0부터 세서 정수를 배열에 저장.
 *   - 2가 되면 폭발
 * 빈 곳은 -1로 관리해야징
 *
 * - 트러블 슈팅
 *
 */
class `전현수_봄버맨` {

    private data class Position(val x: Int, val y: Int)

    private val dirs = listOf(
        Position(-1, 0),
        Position(1, 0),
        Position(0, -1),
        Position(0, 1),
    )

    fun solution() {
        val board = mutableListOf<MutableList<Int>>()

        var (row, column, cnt) = readln().split(" ").map { it.toInt() }

        repeat(row) {
            val rowData = readln().chunked(1).map {
                if (it == INIT_EMPTY) -1
                else 1
            } as MutableList

            board.add(rowData)
        }
        var timer = 1
        while (timer < cnt) {

            // 폭탄이 설치되지 않은 곳에 폭탄 설치
            board.tick()
            board.plantBomb()
            timer++
            if (timer == cnt) break

            // 폭발
            board.tick()
            board.bomb()
            timer++
            if (timer == cnt) break

        }

        board.forEach { rowData ->
            rowData.map {
                if (it == EMPTY) "." else "O"
            }.run { println(this.joinToString("")) }
        }

    }

    private fun MutableList<MutableList<Int>>.plantBomb() {
        for (i in 0 until this.size) {
            for (j in 0 until this.first().size) {
                val curInfo = this[i][j]
                if (curInfo == EMPTY) this[i][j] = INIT_BOMB
            }
        }
    }

    private fun MutableList<MutableList<Int>>.tick() {
        for (i in 0 until this.size) {
            for (j in 0 until this.first().size) {
                val curInfo = this[i][j]
                if (curInfo != EMPTY) this[i][j]++
            }
        }
    }

    private fun MutableList<MutableList<Int>>.bomb() {

        val queue: Queue<Pair<Int, Int>> = LinkedList()

        for (i in 0 until this.size) {
            for (j in 0 until this.first().size) {
                val curInfo = this[i][j]
                if (curInfo == READY_BOMB) {
                    queue.add(Pair(i, j))
                    this[i][j] = EMPTY
                }
            }
        }

        while (queue.isNotEmpty()) {
            val (x, y) = queue.poll()
            dirs.forEach { dir ->

                val nx = x + dir.x
                val ny = y + dir.y

                // 범위 초과
                if (nx !in 0 until this.size ||
                    ny !in 0 until this.first().size
                ) {
                    return@forEach
                }

                this[nx][ny] = EMPTY
            }
        }
    }

    companion object {
        private const val EMPTY = -1
        private const val INIT_EMPTY = "."
        private const val INIT_BOMB = 0
        private const val READY_BOMB = 3
    }
}

fun main() {
    전현수_봄버맨().solution()
}
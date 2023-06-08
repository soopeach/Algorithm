package hyunsoo.`39week`

import kotlin.system.exitProcess

/**
 *
 * <문제>
 * [오목](https://www.acmicpc.net/problem/2615)
 *
 * - 아이디어
 *
 * - 트러블 슈팅
 *
 */
class `전현수_오목` {

    private data class Position(val x: Int, val y: Int) {

        fun reversed(): Position {
            return Position(-this.x, -this.y)
        }
    }

    private val dirs = listOf(
        Position(1, 0), // 하
        Position(0, 1), // 우
        Position(1, 1),// 하 우
        Position(1, -1),// 하 좌
    )

    private val board = mutableListOf<MutableList<Int>>()

    fun solution() {

        repeat(19) {
            val row = readln().split(" ").map { it.toInt() } as MutableList
            board.add(row)
        }

        for (i in 0 until 19) {
            for (j in 0 until 19) {
                dirs.forEach { dir ->

                    val curColor = board[i][j]

                    if (curColor == BLACK || curColor == WHITE) {
                        val sequenceCnt = dfs(curColor, i, j, dir)

                        if (5 == sequenceCnt) {

                            val (rx, ry) = dir.reversed().run {
                                Pair(i + this.x, j + this.y)
                            }

                            if (
                                rx in 0 until 19 &&
                                ry in 0 until 19
                            ) {
                                if (curColor == board[rx][ry]) return@forEach
                            }

                            println(curColor)
                            if (dir == Position(1, -1)) println("${i + 5} ${j - 3}")
                            else println("${i + 1} ${j + 1}")

                            exitProcess(0)
                        }
                    }
                }

            }
        }

        println(EMPTY)
    }

    private fun dfs(color: Int, startX: Int, startY: Int, dir: Position, cnt: Int = 1): Int {

        val nx = startX + dir.x
        val ny = startY + dir.y

        if (nx in 0 until 19 && ny in 0 until 19) {
            if (board[nx][ny] == color) {
                return dfs(color, nx, ny, dir, cnt = cnt + 1)
            }
        }

        return cnt
    }

    companion object {
        private const val EMPTY = 0
        private const val BLACK = 1
        private const val WHITE = 2
    }
}

fun main() {
    전현수_오목().solution()
}
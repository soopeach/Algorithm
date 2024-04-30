import java.util.*

class Solution {
    private data class Position(val x: Int, val y: Int)

    private val dirs = listOf(
        Position(-1, 0),
        Position(1, 0),
        Position(0, -1),
        Position(0, 1),
    )

    fun solution(maps: Array<String>): List<Int> {
        val answer = mutableListOf<Int>()

        val validMap = maps.map { row ->
            row.chunked(1).map {
                if (it == "X") -1 else it.toInt()
            } as MutableList
        }

        for (i in maps.indices) {
            for (j in maps.first().indices) {

                if (validMap[i][j] == -1) continue

                var curStayCnt = 0
                val queue: Queue<Position> = LinkedList()
                queue.add(Position(i, j))

                while (queue.isNotEmpty()) {
                    val curPos = queue.poll()

                    if (validMap[curPos.x][curPos.y] == -1) continue

                    curStayCnt += validMap[curPos.x][curPos.y]
                    validMap[curPos.x][curPos.y] = -1

                    dirs.forEach { dir ->
                        val nx = curPos.x + dir.x
                        val ny = curPos.y + dir.y

                        if (nx !in maps.indices ||
                            ny !in maps.first().indices ||
                            validMap[nx][ny] == -1
                        ) return@forEach

                        queue.add(Position(nx, ny))
                    }
                }

                if (curStayCnt != 0) {
                    answer.add(curStayCnt)
                }
            }

        }

        return if (answer.isEmpty()) listOf(-1) else answer.sortedBy { it }
    }
}
import java.util.*

class Solution {
    
    data class Position(val x: Int, val y: Int)
    data class Bundle(val pos: Position, val cost: Int)
    
    val dirs = listOf(
        Position(0, -1),
        Position(0, 1),
        Position(-1, 0),
        Position(1, 0),
    )
    
    fun solution(maps: Array<String>): Int {
        var answer: Int = Int.MAX_VALUE
        
        lateinit var startPosition: Position
        
        maps.forEachIndexed { rowIndex, row -> 
            row.forEachIndexed { colIndex, data ->
                if (data == 'S') startPosition = Position(rowIndex, colIndex)
            }
        }
        
        val queue: Queue<Bundle> = LinkedList()
        queue.add(Bundle(startPosition, 0))
        
        var visited = Array(maps.size) {
            BooleanArray(maps.first().length)
        }
        visited[startPosition.x][startPosition.y] = true
        
        var leverPosition: Position? = null
        var shortestCostToLever = 0
        
        while(queue.isNotEmpty()) {
            
            val (curPosition, curCost) = queue.poll()
            
            if (maps[curPosition.x][curPosition.y] == LEVER) {
                shortestCostToLever = curCost
                leverPosition = curPosition
                break
            }
            
            dirs.forEach { dir ->
                
                val nx = curPosition.x + dir.x
                val ny = curPosition.y + dir.y
                
                // 범위 체크
                if (nx !in 0 until maps.size || ny !in 0 until maps.first().length) 
                    return@forEach
                // 벽
                if (maps[nx][ny] == WALL) return@forEach
                // 방문한 곳이면
                if (visited[nx][ny]) return@forEach
                
                visited[nx][ny] = true
                queue.add(Bundle(Position(nx, ny), curCost + 1))
            }
        }
        
        if (leverPosition == null) return -1
        
        visited = Array(maps.size) {
            BooleanArray(maps.first().length)
        }
        visited[leverPosition.x][leverPosition.y] = true
        queue.clear()
        queue.add(Bundle(leverPosition, shortestCostToLever))
        
        while(queue.isNotEmpty()) {
            
            val (curPosition, curCost) = queue.poll()
            
            if (maps[curPosition.x][curPosition.y] == EXIT) {
                return curCost
            }
            
            dirs.forEach { dir ->
                
                val nx = curPosition.x + dir.x
                val ny = curPosition.y + dir.y
                
                // 범위 체크
                if (nx !in 0 until maps.size || ny !in 0 until maps.first().length) 
                    return@forEach
                // 벽
                if (maps[nx][ny] == WALL) return@forEach
                // 방문한 곳이면
                if (visited[nx][ny]) return@forEach
                
                visited[nx][ny] = true
                queue.add(Bundle(Position(nx, ny), curCost + 1))
            }
        }
        
        
        return -1
    }
    
    companion object {
        const val START = 'S'
        const val EXIT = 'E'
        const val LEVER = 'L'
        const val PATH = 'O'
        const val WALL = 'X'
    }
}
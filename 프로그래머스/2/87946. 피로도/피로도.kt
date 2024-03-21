class Solution {
    
    private data class Dungeon(val limit: Int, val cost: Int)
    private lateinit var updatedDungeons: List<Dungeon>
    private lateinit var visited: BooleanArray
    private val picked = mutableListOf<Dungeon>()
    
    var answer: Int = -1
    
    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        
        updatedDungeons = dungeons.map {
            Dungeon(it[0], it[1])
        }
        
        visited = BooleanArray(dungeons.size)
        
        bruteForce(k, 0)
        
        return answer
    }
    
    private fun bruteForce(
        leftHealth: Int,
        cnt: Int) {
        
        if (cnt == updatedDungeons.size) {
            if (answer < picked.size) answer = picked.size
            return
        }
        
        for (index in 0 until updatedDungeons.size) {
            
            if (visited[index]) continue
            
            val curDungeon = updatedDungeons[index]
            
            visited[index] = true
            
            if (curDungeon.limit <= leftHealth) {
                picked.add(curDungeon)
                
                bruteForce(leftHealth - curDungeon.cost, cnt + 1)
                
                picked.removeLast()
                visited[index] = false
            } else {
                bruteForce(leftHealth, cnt + 1)
                visited[index] = false
            }
               
        }
        
    }
}
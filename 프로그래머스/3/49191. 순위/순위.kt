class Solution {
    fun solution(n: Int, results: Array<IntArray>): Int {
        
        val resultTable = Array(n + 1) {
            IntArray(n + 1) { INIT }
        }
        
        results.forEach { result ->
            val (winPos, losePos) = result
            resultTable[winPos][losePos] = WIN
            resultTable[losePos][winPos] = LOSE
        }
        
        for (k in 1 .. n) {
            for (i in 1 .. n) {
                for (j in 1 .. n) {
                    if (resultTable[i][k] == WIN && resultTable[k][j] == WIN) {
                        resultTable[i][j] = WIN
                        resultTable[j][i] = LOSE
                    }
                }
            }
        }
        
        return resultTable.drop(1).count { row ->
            row.drop(1).count { it == INIT} <= 1
        }
    }
    
    companion object {
        const val WIN = 1
        const val LOSE = -1
        const val INIT = 0
    }
}
class Solution {
    fun solution(edges: Array<IntArray>): IntArray {
        
        val outNodesFromHere = Array(1000001) {
            mutableListOf<Int>()
        }
        
        val inNodesToHere = Array(1000001) {
            mutableListOf<Int>()
        }
        
        var answer: IntArray = intArrayOf(0, 0, 0, 0)
        var totalGraphCnt = 0
        
        edges.forEach {
            val (from, to) = it
            
            outNodesFromHere[from].add(to)
            inNodesToHere[to].add(from)
        }
        
        for (nodeIndex in 1 .. 1000000) {
            
            val outCnt = outNodesFromHere[nodeIndex].size
            val inCnt = inNodesToHere[nodeIndex].size
            
            // 정점
            if (outCnt >= 2 && inCnt == 0) {
                answer[0] = nodeIndex
                totalGraphCnt = outCnt
                // 막대
            } else if (outCnt == 0 && inCnt >= 1) {
                answer[2]++
                // 8자
            } else if (outCnt >= 2 && inCnt >= 2) {
                answer[3]++
            }
            
        }
        
        val curGraphCnt = answer[2] + answer[3] 
        
        if (totalGraphCnt > curGraphCnt) answer[1] = totalGraphCnt - curGraphCnt
        
        return answer
    }
}
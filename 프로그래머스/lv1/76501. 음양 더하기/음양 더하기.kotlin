class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer = 0
        
        absolutes.forEachIndexed{index, no ->
            if(signs[index]) answer += no
            else answer -= no
            
        }
        return answer
    }
}
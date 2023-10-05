class Solution {
    fun solution(n: Int, times: IntArray): Long {
        
        val sortedTimes = times.sortedBy { it }
        
        var answer: Long = 0
        
        var left = sortedTimes.first().toLong()
        var right = sortedTimes.last().toLong() * n
        
        while(left <= right) {
            
            val mid = (left + right) / 2
            var people: Long = 0
            
            sortedTimes.forEach { time ->
                people += mid / time
            }
            
            if (n <= people) {
                answer = mid
                right = mid - 1
            } else {
                left = mid + 1
            }
            
        }
        
        return answer
    }
}
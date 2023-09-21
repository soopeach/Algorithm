class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = Int.MIN_VALUE
        
        for (i in 0 until numbers.size) {
            for (j in i + 1 until numbers.size) {
                val curNum = numbers[i] * numbers[j]
                if(answer < curNum) answer = curNum
            }
        }
        return answer
    }
}
class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {

        val counter = mutableMapOf<Int, Int>()
        var targetCnt = k
        var answer: Int = 0

        tangerine.forEach {
            val pre = counter.getOrDefault(it, 0)
            counter[it] = pre + 1
        }

        val sortedCounter = counter.map {
            it.key to it.value
        }. sortedByDescending {
            it.second
        }

        for (index in sortedCounter.indices) {
            val (key, value) = sortedCounter[index]

            if (targetCnt <= value) {
                answer++
                break
            } else {
                targetCnt -= value
                answer++
            }
        }

        return answer
    }
}
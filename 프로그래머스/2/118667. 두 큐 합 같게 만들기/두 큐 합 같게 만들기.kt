import java.util.LinkedList
import java.util.Queue

class Solution {

    fun solution(queue1: IntArray, queue2: IntArray): Long {

        val firQueue: Queue<Long> = LinkedList()
        val secQueue: Queue<Long> = LinkedList()

        queue1.forEachIndexed { index, value ->
            firQueue.add(value.toLong())
            secQueue.add(queue2[index].toLong())
        }

        var firSum = queue1.sumOf { it }.toLong()
        var secSum = queue2.sumOf { it }.toLong()

        var answer: Long = 0
        var cnt = 0
        var canMake = false

        while (cnt <= queue1.size * 4) {

            if (firSum > secSum) {

                val firPopped = firQueue.poll()
                firSum -= firPopped
                secSum += firPopped
                secQueue.add(firPopped)
                answer++
                cnt++
            } else if (firSum < secSum) {
                val secPopped = secQueue.poll()
                secSum -= secPopped
                firSum += secPopped
                firQueue.add(secPopped)
                answer++
                cnt++
            } else {
                canMake = true
                break
            }
        }
        
        return if (canMake) answer else -1

    }
}
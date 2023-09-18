import java.util.PriorityQueue

class Solution {

    data class JobInfo(val requestTime: Int, val costTime: Int)

    fun solution(jobs: Array<IntArray>): Int {

        var answer = 0
        var currentTime = 0

        val waitingQueue = PriorityQueue<JobInfo>(
            compareBy { it.requestTime }
        )

        val readyQueue = PriorityQueue<JobInfo>(
            compareBy { it.costTime }
        )

        jobs.forEach {
            waitingQueue.add(JobInfo(it.first(), it.last()))
        }

        while (waitingQueue.isNotEmpty() || readyQueue.isNotEmpty()) {

            for (i in 0 until waitingQueue.size) {
                val currentTask = waitingQueue.poll()
                if (currentTime < currentTask.requestTime) {
                    waitingQueue.add(currentTask)
                    break
                } else {
                    readyQueue.add(currentTask)
                }
            }

            if (readyQueue.isEmpty()) {
                currentTime++
                continue
            }

            if (readyQueue.isNotEmpty()) {
                val currentTask = readyQueue.poll()
                currentTime += currentTask.costTime
                answer += currentTime - currentTask.requestTime

                while (readyQueue.isNotEmpty()) {
                    waitingQueue.add(readyQueue.poll())
                }
            }

        }

        return answer / jobs.size

    }
}
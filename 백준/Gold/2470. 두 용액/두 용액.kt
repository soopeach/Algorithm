package hyunsoo.`13week`

import kotlin.math.absoluteValue


data class Solution(val firSolution: Int, val secSolution: Int) {
    override fun toString(): String {
        return if (firSolution < secSolution) "$firSolution $secSolution" else "$secSolution $firSolution"
    }
}

fun main() {

    val solutionCnt = readln()
    val solutionList = readln().split(" ").map { it.toInt() }.sorted()

    var numThatCloseToZero = Int.MAX_VALUE
    var start = 0
    var end = solutionList.lastIndex
    var ans = Solution(0, 0)

    while (start < end) {

        val sumOfSolution = solutionList[start] + solutionList[end]

        if (sumOfSolution < 0) {
            if (sumOfSolution.absoluteValue < numThatCloseToZero.absoluteValue) {
                numThatCloseToZero = sumOfSolution
                ans = Solution(solutionList[start], solutionList[end])
            }
            start++
        } else if (sumOfSolution > 0) {
            if (sumOfSolution.absoluteValue < numThatCloseToZero.absoluteValue) {
                numThatCloseToZero = sumOfSolution
                ans = Solution(solutionList[start], solutionList[end])
            }
            end--
        } else {
            println(Solution(solutionList[start], solutionList[end]))
            return
        }

    }
    println(ans)

}
val sumOfSbSequenceSet = mutableSetOf<Int>()
lateinit var sequence: List<Int>
val subSequence = mutableListOf<Int>()
fun main() {

    val n = readln().toInt()
    sequence = readln().split(" ").map { it.toInt() }

    for (depth in 1..n) {
        dfs(0, depth, 0)
    }


    val sortedSumOfSubsequence = sumOfSbSequenceSet.sorted()
    
    for (no in 1..sortedSumOfSubsequence[sortedSumOfSubsequence.lastIndex]) {
        if (!sumOfSbSequenceSet.contains(no)) {
            println(no)
            return
        }
    }

    println(sumOfSbSequenceSet.maxOf { it } + 1)
}

fun dfs(cnt: Int, depth: Int, beginWith: Int) {
    if (cnt == depth) {
        sumOfSbSequenceSet.add(subSequence.sum())
        return
    }
    for (index in beginWith until sequence.size) {
        subSequence.add(sequence[index])
        dfs(cnt + 1, depth, index + 1)
        subSequence.removeAt(subSequence.lastIndex)
    }

}
